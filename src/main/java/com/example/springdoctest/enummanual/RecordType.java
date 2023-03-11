package com.example.springdoctest.enummanual;

import lombok.Generated;

public enum RecordType {
	BILL("BILL", "ABC#"),
	LAW("LAW", "XYZ#");

	private String recordType;
	private String key;

	@Generated
	public String getRecordType() {return this.recordType; }

	@Generated
	public String getKey() { return this.key; }

	@Generated
	private RecordType(final String recordType, final String key) {
		this.recordType = recordType;
		this.key = key;
	}

	@Generated
	public String toString() {
		String alpha = this.name();
		return "RecordType:"+alpha+"(recordType="+this.getRecordType()+", key="+this.getKey()+")";
	}
}
