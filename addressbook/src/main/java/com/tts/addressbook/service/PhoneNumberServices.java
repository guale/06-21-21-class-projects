package com.tts.addressbook.service;

public class PhoneNumberServices {

	public static String convertToNumbers(String number){
		return (number.replaceAll("[^0-9]", ""));
	}

	public static String formatPhoneNumber(String number){
		if(number.length()>=10){
			return number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		} else{
			return number.replaceFirst("(\\d{3})(\\d+)", "$1-$2");
		}

	}

}
