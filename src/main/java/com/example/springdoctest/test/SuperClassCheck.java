package com.example.springdoctest.test;

import com.example.springdoctest.RecordObjectRequest;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.reflect.MethodUtils;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;
import java.util.stream.Stream;

public class SuperClassCheck {
  public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, IntrospectionException {
    String superClassName = RecordObjectRequest.class.getSuperclass().getName();
    System.out.println(superClassName);

    System.out.println("getMethods start");
    Arrays.stream(RecordObjectRequest.class.getMethods()).forEach(method -> {
      System.out.println(method);
    });

    System.out.println("getRecordComponents.getAccessor start");
    Stream.of(RecordObjectRequest.class.getRecordComponents())
        .map(recordComponent -> recordComponent.getAccessor())
        .forEach(method -> {
          System.out.println(method);
        });

    System.out.println("getRecordComponents reflection start");
    Method classGetRecordComponents = Class.class.getMethod("getRecordComponents");
    Method recordComponentGetAccessor = RecordComponent.class.getMethod("getAccessor");

    RecordComponent[] components = (RecordComponent[]) classGetRecordComponents.invoke(RecordObjectRequest.class);
    Arrays.stream(components).map(recordComponent -> {
          try {
            return (Method)recordComponentGetAccessor.invoke(recordComponent);
          } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
          } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
          }
        })
        .forEach(method -> {
          System.out.println(method);
        });

    // これだとRecordのサブクラスからgetRecordComponentsが取得出来ないためエラーになる
    /*
    System.out.println("getRecordComponents reflection using ApacheCommonsLang3 start");

    RecordComponent[] components2 = (RecordComponent[]) MethodUtils.invokeMethod(RecordComponent.class, "getRecordComponents");
    Arrays.stream(components2).map(recordComponent -> {
          try {
            return (Method)MethodUtils.invokeMethod(recordComponent, "getAccessor");
          } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
          } catch (InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
          }
        })
        .forEach(method -> {
          System.out.println(method);
        });
     */
  }
}
