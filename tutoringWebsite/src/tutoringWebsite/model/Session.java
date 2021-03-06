package tutoringWebsite.model;

import java.time.LocalDate;

import java.time.LocalTime;
import tutoringWebsite.persist.*;


public class Session {
	
	private int sessionId;
	private LocalDate date;
	private String room;
	private LocalTime startTime;
	private LocalTime endTime;
	private int dayOfWeek;
	private int adminId;
	private int courseId;
	private int typeId;
	private String adminName;
	private String courseName;
	private String typeName;
	private String daysOfWeekString;
	private Tutor tutor;
	
	
	public Session() {
	}


	public int getSessionId() {
		return sessionId;
	}


	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	public LocalTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}


	public LocalTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}


	public int getDayOfWeek() {
		return dayOfWeek;
	}


	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public int getTypeId() {
		return typeId;
	}


	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


	public String getDaysOfWeekString() {
		return daysOfWeekString;
	}


	public void setDaysOfWeekString(String daysOfWeekString) {
		this.daysOfWeekString = daysOfWeekString;
	}


	public Tutor getTutor() {
		return tutor;
	}


	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	
		
}