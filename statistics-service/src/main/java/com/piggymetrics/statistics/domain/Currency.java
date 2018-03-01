package com.piggymetrics.statistics.domain;

public enum Currency {

	USD, EUR, RUB, CNY;

	public static Currency getBase() {
		return USD;
	}
}
