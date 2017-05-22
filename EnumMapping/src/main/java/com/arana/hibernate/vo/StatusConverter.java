package com.arana.hibernate.vo;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.arana.hibernate.enums.Status;

@Converter
public class StatusConverter implements AttributeConverter<Status, String>{

	@Override
	public String convertToDatabaseColumn(Status value) {
        if ( value == null ) {
            return null;
        }

        return value.getCode();
	}

	@Override
	public Status convertToEntityAttribute(String value) {
        if ( value == null ) {
            return null;
        }

        return Status.fromCode(value);
	}

}
