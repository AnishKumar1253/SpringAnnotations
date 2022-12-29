package com.masai.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Travel
{
	private int travelid;
	private String name;
	private Bike bike;
	private Car car;
	
	public Travel() {}

	public Travel(int travelid, String name, Bike bike, Car car) {
		super();
		this.travelid = travelid;
		this.name = name;
		this.bike = bike;
		this.car = car;
	}

	public int getTravelid() {
		return travelid;
	}

	public void setTravelid(int travelid) {
		this.travelid = travelid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "Travel [travelid=" + travelid + ", name=" + name + ", bike=" + bike + ", car=" + car + "]";
	}

	@PostConstruct
	public void setUp()
	{
		System.out.println("Some impt. operation to be performed after property set");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Any operation to be performed just before destrucion");
	}
	
	public void showDetails()
	{
		System.out.println("Travel Id is" +travelid);
		System.out.println("traveller name:" +name);
		System.out.println("traveller bike details" +bike);
		System.out.println("traveller car details" +car);
		
	}
}
