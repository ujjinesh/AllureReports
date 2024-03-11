package com.Fakedata;

public class Data {
	
	
		 // Main method for testing
	    public static void main(String[] args) {
	    	TestData testdata = new TestData();
	    
	        System.out.println("Generated GivenName: " + testdata.getGivenName());
	        System.out.println("Generated FamilyName: " + testdata.getFamilyName());
	        System.out.println("Generated Gender: " + testdata.getGender());
	        System.out.println("Generated Day: " + testdata.getDate());
	        System.out.println("Generated Month: " + GetterAndSetters.generateRandomMonth());
	        System.out.println("Generated Year: " +"19"+ testdata.getYear());
	        System.out.println("Generated Address1: " + testdata.getAddress1());
	        System.out.println("Generated Address2: " + testdata.getAddress2());
	        System.out.println("Generated Village: " + testdata.getVillage());
	        System.out.println("Generated State: " + testdata.getState());
	        System.out.println("Generated Country: " + testdata.getCountry());
	        System.out.println("Generated Postalcode: " + testdata.getPostalcode());
	        System.out.println("Generated Phonenumber: " + testdata.getPhonenumber());
	        System.out.println("Generated Relationship_type: " + testdata.getRelationship_type());
	        System.out.println("Generated PersonName: " + testdata.getPersonName());
	        
	        
	    }
	}

