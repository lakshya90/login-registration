/**
 * 
 */
package com.pradyothadavi.registration.utils;

import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author pradyot
 *
 */
public class DOB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String date;
	private String month;
	private String year;
	private int age;
	
	/**
	 * @param date
	 * @param month
	 * @param year
	 */
	public DOB(String date, String month, String year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
		calculateAge(this);
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DOB [date=" + date + ", month=" + month + ", year=" + year
				+ "]";
	}
	
	/**
	 * Calculates age from given data of birth.
	 * @param dob
	 */
	public void calculateAge(DOB dob){
		// TODO Calculation of age must be based on the current time zone of the user.
		Calendar now = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		int currentYear = now.get(Calendar.YEAR);
		setAge(currentYear-Integer.parseInt(dob.getYear()));
	}
}
