package com.Fakedata;

import java.util.Locale;

import com.github.javafaker.Faker;

public class TestData {

	private String givenName;
	private String familyName;
	private int date;
	private int Month;
	private int year;
	private String address1;
	private String address2;
	private String village;
	private String state;
	private String country;
	private String postalcode;
	private String phonenumber;
	private String PersonName;
	private String Gender;
	private String relationship_type;

	

	// Constructor
	public TestData() {
		Faker faker = new Faker(new Locale("en-IND"));
		this.givenName = faker.name().firstName();
		this.familyName = faker.name().lastName();
		this.Gender=faker.options().option("Male", "Female");
		this.date = faker.date().birthday().getDate();
		//this.Month = faker.date().birthday().getMonth();
		this.year = faker.date().birthday().getYear();
		this.address1 = faker.address().streetName();
		this.address2 = faker.address().streetName();
		this.village = faker.address().streetName();
		this.state = faker.address().state();
		this.country = faker.address().country();
		this.postalcode = faker.address().zipCode();
		this.phonenumber = faker.phoneNumber().phoneNumber();
		 // Define an array of relationship statuses
        String[] relationshiptype = {"Doctor", "Sibling", "Parent", "Aunt/Uncle", "Supervisor", "Patient", "Child", "Niece/Nephew", "Supervisee"};
		this.relationship_type = faker.options().option(relationshiptype);
		this.PersonName = faker.name().name();

	}

	
	// Getter and Setter Methods
	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {

		Month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getRelationship_type() {
		return relationship_type;
	}


	public void setRelationship_type(String relationship_type) {
		this.relationship_type = relationship_type;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
		
	}


}
