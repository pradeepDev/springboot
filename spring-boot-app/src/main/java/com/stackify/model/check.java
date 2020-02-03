package com.stackify.model;

public class check extends Builder{

	
	public static void main(String[] args) {
		
	/*	StringBuilder addressBuilder = new StringBuilder();
		String MailingStreet = "Global Village";
		String MailingCity = "Bangalore";
		String MailingPostalCode = "560059";
		if (MailingStreet != null && !MailingStreet.isEmpty()) {
			addressBuilder.append(MailingStreet).append("\n");
		}
		if (MailingCity != null && !MailingCity.isEmpty()) {
			addressBuilder.append(MailingCity).append("\n");
		}	
		if (MailingPostalCode != null && !MailingPostalCode.isEmpty()) {
			addressBuilder.append(MailingPostalCode);
		}	
		String addressString = addressBuilder.toString();
		System.out.println(addressString);
*/
		check ck = new check();
		String sp = ck.AddrBuilder("s","","","","");
		System.out.println(sp);
		
	}

}
