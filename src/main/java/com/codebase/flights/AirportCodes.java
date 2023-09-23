package com.codebase.flights;

public enum AirportCodes {

	EDINBURGH("EDI"),
	FUNAFUTI("FUN"),
	EEK("EEK"),
	LOVELOCK("LOL");

	private final String code;

	AirportCodes(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
