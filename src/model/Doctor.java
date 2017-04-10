package model;

import java.util.ArrayList;

public class Doctor {
	private String doctorName;
	private ArrayList<Appointment> appointmentList;
	private int[] color = new int[3];
	
	public Doctor(String doctorName, int red, int green, int blue) {
		this.doctorName = doctorName;
		appointmentList = new ArrayList<Appointment>();
		color[0] = red;
		color[1] = green;
		color[2] = blue;
	}
	
	public String getDoctorName()
	{
		return doctorName;
	}
	
	public void setDoctorName(String n)
	{
		doctorName = n;
	}
	
	public void setDoctorColor(int red, int green, int blue) {
		color[0] = red;
		color[1] = green;
		color[2] = blue;
	}
	
	public int[] getDoctorColor() {
		return color;
	}
}
