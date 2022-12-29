package com.masai.app;

public class Bike
{
	private int Bikeno;
	private String Bikename;
	
	public Bike() {}

	public Bike(int bikeno, String bikename) {
		super();
		Bikeno = bikeno;
		Bikename = bikename;
	}

	public int getBikeno() {
		return Bikeno;
	}

	public void setBikeno(int bikeno) {
		Bikeno = bikeno;
	}

	public String getBikename() {
		return Bikename;
	}

	public void setBikename(String bikename) {
		Bikename = bikename;
	}

	@Override
	public String toString() {
		return "Bike [Bikeno=" + Bikeno + ", Bikename=" + Bikename + "]";
	}
	
	
}
