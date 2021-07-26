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

@Table(name = "analy_ma_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "tag_createdBy")
	private List<Tag> tags;
	
	@OneToMany(mappedBy = "machineinfo_createdBy")
	private List<Machineinfo> machineinfos;
	
	@OneToMany(mappedBy = "plan_createdBy")
	private List<Plan> plans;
	
	@OneToMany(mappedBy = "userassetmap_createdBy")
	private List<Userassetmap> userassetmaps;
	
	@OneToMany(mappedBy = "equipment_createdBy")
	private List<Equipment> equipments;
	
	@Column(name="user_id")
	private Long userId;
	@Column(name="name")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Zone zone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Asset asset;
	
	
	
	@Column(name="created_time", nullable=false, updatable=false)
	@CreationTimestamp
	private Date createdTime;
	
	@Column(name="updated_time")
	@UpdateTimestamp
	private Date updatedTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public List<Machineinfo> getMachineinfos() {
		return machineinfos;
	}
	public void setMachineinfos(List<Machineinfo> machineinfos) {
		this.machineinfos = machineinfos;
	}
	public List<Plan> getPlans() {
		return plans;
	}
	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}
	public List<Userassetmap> getUserassetmaps() {
		return userassetmaps;
	}
	public void setUserassetmaps(List<Userassetmap> userassetmaps) {
		this.userassetmaps = userassetmaps;
	}
	public List<Equipment> getEquipments() {
		return equipments;
	}
	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", tags=" + tags + ", machineinfos=" + machineinfos + ", plans=" + plans
				+ ", userassetmaps=" + userassetmaps + ", equipments=" + equipments + ", userId=" + userId + ", name="
				+ name + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + "]";
	}
	

	
	
}
