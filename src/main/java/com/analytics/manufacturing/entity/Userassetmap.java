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
 
 @Table(name = "analy_ma_userassetmap")
public class Userassetmap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User userassetmap_createdBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Asset asset;
	
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
	public User getUserassetmap_createdBy() {
		return userassetmap_createdBy;
	}
	public void setUserassetmap_createdBy(User userassetmap_createdBy) {
		this.userassetmap_createdBy = userassetmap_createdBy;
	}
	
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	@Override
	public String toString() {
		return "Userassetmap [id=" + id + ", userassetmap_createdBy=" + userassetmap_createdBy + ", createdTime="
				+ createdTime + ", updatedTime=" + updatedTime + ", updatedBy=" + updatedBy + "]";
	}
	
	

	
	
	
	

}
