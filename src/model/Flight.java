package model;

import java.time.LocalDate;

import services.Booking;

public class Flight extends Booking{

	
	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	
	public Flight(int noOfPersons, int rates, String busType, LocalDate from,LocalDate to) {
	
		this.noOfPersons=noOfPersons;
		this.rates=rates;
		this.classType=busType;
		this.from=from;
		this.to=to;
	}

	
	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}



	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

}
