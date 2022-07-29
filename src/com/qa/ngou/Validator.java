package com.qa.ngou;

public interface Validator<T> {

	boolean isValid(T toValidate);
}
