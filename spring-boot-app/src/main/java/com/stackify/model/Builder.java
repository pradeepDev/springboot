package com.stackify.model;

public class Builder {

	public static String AddrBuilder(String... strings) {
		StringBuilder addressBuilder = new StringBuilder();
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] != null && !strings[i].isEmpty() && i != strings.length - 1) {
				if (addressBuilder.length() == 0) {
					addressBuilder.append(strings[i]);
				} else {
					addressBuilder.append("\n").append(strings[i]);
				}
			} else if (strings[i] != null && !strings[i].isEmpty() && i == strings.length - 1) {
				if (addressBuilder.length() == 0) {
					addressBuilder.append(strings[i]);
				} else {
					addressBuilder.append("\n").append(strings[i]);
				}
			}
		}
		return addressBuilder.toString();
	}
}
