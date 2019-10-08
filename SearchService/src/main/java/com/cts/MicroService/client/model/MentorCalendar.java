package com.cts.MicroService.client.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="mentor_calendar")
public class MentorCalendar {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@JsonFormat(pattern="dd-MM-yyyy")
private String startDate;
@JsonFormat(pattern="dd-MM-yyyy")
private String endDate;
@JsonFormat(pattern="HH:mm:ss")
private String startTime;
@JsonFormat(pattern="HH:mm:ss")
private String endTime;

private Long mentor_id;
public Long getMentor_id() {
	return mentor_id;
}
public void setMentor_id(Long mentor_id) {
	this.mentor_id = mentor_id;
}
@ManyToMany(mappedBy = "mentorcalendar")
private List<MentorSkill> skill;
public MentorCalendar(long id, String startDate, String endDate, String startTime, String endTime, Long mentor_id,
		List<MentorSkill> skill) {
	super();
	this.id = id;
	this.startDate = startDate;
	this.endDate = endDate;
	this.startTime = startTime;
	this.endTime = endTime;
	this.mentor_id = mentor_id;
	this.skill = skill;
}
public MentorCalendar() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public List<MentorSkill> getSkill() {
	return skill;
}
public void setSkill(List<MentorSkill> skill) {
	this.skill = skill;
}


}
