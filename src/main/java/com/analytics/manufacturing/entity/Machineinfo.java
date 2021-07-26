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
@Table(name = "analy_ma_machineinfo")
public class Machineinfo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Equipinfo equipinfo;
		
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Tag tag;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User machineinfo_createdBy;
	
	
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
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public Equipinfo getEquipinfo() {
		return equipinfo;
	}
	public void setEquipinfo(Equipinfo equipinfo) {
		this.equipinfo = equipinfo;
	}
	public User getMachineinfo_createdBy() {
		return machineinfo_createdBy;
	}
	public void setMachineinfo_createdBy(User machineinfo_createdBy) {
		this.machineinfo_createdBy = machineinfo_createdBy;
	}
	@Override
	public String toString() {
		return "Machineinfo [id=" + id + ", machineinfo_createdBy=" + machineinfo_createdBy + ", createdTime="
				+ createdTime + ", updatedTime=" + updatedTime + ", updatedBy=" + updatedBy + "]";
	}
	
	
	
	

	
	

}
