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
@Table(name = "analy_ma_plan")
public class Plan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User plan_createdBy;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Asset asset;
	
	
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	@Column(name="status")
	private String status;
	
	@Column(name="created_time", nullable=false, updatable=false)
	@CreationTimestamp
	private Date createdTime;
	
	@Column(name="updated_time")
	@UpdateTimestamp
	private Date updatedTime;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="updated_by")
	private String updatedBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public User getPlan_createdBy() {
		return plan_createdBy;
	}
	public void setPlan_createdBy(User plan_createdBy) {
		this.plan_createdBy = plan_createdBy;
	}
	@Override
	public String toString() {
		return "Plan [id=" + id + ", plan_createdBy=" + plan_createdBy + ", startDate=" + startDate + ", endDate="
				+ endDate + ", status=" + status + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
	
	

	
	
	
}
