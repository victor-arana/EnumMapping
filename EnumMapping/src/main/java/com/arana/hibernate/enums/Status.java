package com.arana.hibernate.enums;

public enum Status {
	PENDING("P"),
	ACTIVE("A"),
	INACTIVE("I"),
	DELETED("D");
	
	private String code;

    Status(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Status fromCode(String code) {
        for (Status status :Status.values()){
            if (status.getCode().equals(code)){
                return status;
            }
        }
        throw new UnsupportedOperationException(
                "The code " + code + " is not supported!");
    }
	
}
