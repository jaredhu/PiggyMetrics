package com.piggymetrics.account.domain;

public enum Currency {

	USD, EUR, RUB, CNY;

	public static Currency getDefault() {
		return USD;
	}
}
