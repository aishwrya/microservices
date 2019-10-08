package com.cts.payments.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_tb")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String txnType;
	private float amount;
	private String remarks;
	private Long mentorId;
	private String mentorName;
	private long trainingId;
	private String skillName;
	private float totalAmountToMentor;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(long id, String txnType, float amount, String remarks, Long mentorId, String mentorName,
			long trainingId, String skillName, float totalAmountToMentor) {
		super();
		this.id = id;
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.trainingId = trainingId;
		this.skillName = skillName;
		this.totalAmountToMentor = totalAmountToMentor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Long getMentorId() {
		return mentorId;
	}
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}
	public void setTotalAmountToMentor(float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
	

		
	
}