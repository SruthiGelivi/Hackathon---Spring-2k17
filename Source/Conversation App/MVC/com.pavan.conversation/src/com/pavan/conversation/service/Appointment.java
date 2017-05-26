package com.pavan.conversation.service;

public class Appointment {
	private String name;
	private String time;
	private Integer fees;
	private String experience;
	private String place;
	private String specialization;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(String name, String time, Integer fees, String experience, String place, String specialization) {
		super();
		this.name = name;
		this.time = time;
		this.fees = fees;
		this.experience = experience;
		this.place = place;
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
