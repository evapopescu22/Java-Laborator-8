package org.laboratoare.laborator8;

public class Artist {

	int id;
	static String name;
	static String country;
	
	Artist()
	{
		
	}
	
	Artist(String name, String country)
	{
		Artist.name=name;
		Artist.country=country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Artist.name = name;
	}

	public void setCountry(String country) {
		Artist.country = country;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return id + " " + name + " " + country

		;
	}

}
