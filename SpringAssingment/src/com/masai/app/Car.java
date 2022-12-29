package com.masai.app;

public class Car 
{
	private int carno;
	private String carname;
	
	public Car() {}

	public Car(int carno, String carname) {
		super();
		this.carno = carno;
		this.carname = carname;
	}

	public int getCarno() {
		return carno;
	}

	public void setCarno(int carno) {
		this.carno = carno;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Override
	public String toString() {
		return "Car [carno=" + carno + ", carname=" + carname + "]";
	}
	
	
	

}
