package com.cts.MicroService.client.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mentor_skill")
public class MentorSkill {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private String toc;
private String prereq;
private Long mentor_id;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "Mentor_Calendar", 
  joinColumns = @JoinColumn(name = "cal_id", referencedColumnName = "id"), 
  inverseJoinColumns = @JoinColumn(name = "skill_id", 
  referencedColumnName = "id"))
private List<MentorCalendar> mentorcalendar;

public MentorSkill() {
	super();
	// TODO Auto-generated constructor stub
}

public MentorSkill(long id, String name, String toc, String prereq, List<MentorCalendar> mentorcalendar) {
	super();
	this.id = id;
	this.name = name;
	this.toc = toc;
	this.prereq = prereq;
	this.mentorcalendar = mentorcalendar;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public Long getMentor_id() {
	return mentor_id;
}

public void setMentor_id(Long mentor_id) {
	this.mentor_id = mentor_id;
}

public void setName(String name) {
	this.name = name;
}

public String getToc() {
	return toc;
}

public void setToc(String toc) {
	this.toc = toc;
}

public String getPrereq() {
	return prereq;
}

public void setPrereq(String prereq) {
	this.prereq = prereq;
}

public List<MentorCalendar> getMentorcalendar() {
	return mentorcalendar;
}

public void setMentorcalendar(List<MentorCalendar> mentorcalendar) {
	this.mentorcalendar = mentorcalendar;
}

}
