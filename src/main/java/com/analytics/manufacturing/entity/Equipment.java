package com.analytics.manufacturing.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity

@Table(name = "analy_tr_equipment")
public class Equipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User equipment_createdBy;
	
	
	
	@Column(name="event_start")
	private Date eventStart;
	@Column(name="event_end")
	private Date eventEnd;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Equipinfo equipinfo;
	
	
	
	
	@Column(name="created_time", nullable=false, updatable=false)
	@CreationTimestamp
	private Date createdTime;
	
	@Column(name="updated_time")
	@UpdateTimestamp
	private Date updatedTime;
	
	@Column(name="updated_by")
	private String updatedBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getEventStart() {
		return eventStart;
	}
	public void setEventStart(Date eventStart) {
		this.eventStart = eventStart;
	}
	public Date getEventEnd() {
		return eventEnd;
	}
	public void setEventEnd(Date eventEnd) {
		this.eventEnd = eventEnd;
	}
	
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Equipinfo getEquipinfo() {
		return equipinfo;
	}
	public void setEquipinfo(Equipinfo equipinfo) {
		this.equipinfo = equipinfo;
	}
	public User getEquipment_createdBy() {
		return equipment_createdBy;
	}
	public void setEquipment_createdBy(User equipment_createdBy) {
		this.equipment_createdBy = equipment_createdBy;
	}
	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipment_createdBy=" + equipment_createdBy + ", eventStart=" + eventStart
				+ ", eventEnd=" + eventEnd + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime
				+ ", updatedBy=" + updatedBy + "]";
	}
	
	
	


	
	
	
}


