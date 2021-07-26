package com.analytics.manufacturing.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity

@Table(name = "analy_ma_tag")
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "tag")
	private List<Machineinfo> machineinfos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User tag_createdBy;	
	
	
	
	@Column(name="tag_name")
	private String tagName;
	
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
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
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
	
	public List<Machineinfo> getMachineinfos() {
		return machineinfos;
	}
	public void setMachineinfos(List<Machineinfo> machineinfos) {
		this.machineinfos = machineinfos;
	}
	public User getTag_createdBy() {
		return tag_createdBy;
	}
	public void setTag_createdBy(User tag_createdBy) {
		this.tag_createdBy = tag_createdBy;
	}
	@Override
	public String toString() {
		return "Tag [id=" + id + ", machineinfos=" + machineinfos + ", tag_createdBy=" + tag_createdBy + ", tagName="
				+ tagName + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", updatedBy=" + updatedBy
				+ "]";
	}
	

	
	
}
