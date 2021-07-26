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
@Table(name = "analy_ma_asset")
public class Asset {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "asset")
	private List<User> users;
	
	@OneToMany(mappedBy = "asset")
	private List<Equipinfo> equipinfos;
	
	@OneToMany(mappedBy = "asset")
	private List<Plan> plans;
	
	@OneToMany(mappedBy = "asset")
	private List<Userassetmap> userassetmaps;
	
	@Column(name="asset_no")
	private String assetNo;
	@Column(name="asset_description")
	private String assetDescription;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Zone zone;
	
	
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
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getAssetDescription() {
		return assetDescription;
	}
	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
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
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Equipinfo> getEquipinfos() {
		return equipinfos;
	}
	public void setEquipinfos(List<Equipinfo> equipinfos) {
		this.equipinfos = equipinfos;
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
	@Override
	public String toString() {
		return "Asset [id=" + id + ", users=" + users + ", equipinfos=" + equipinfos + ", plans=" + plans
				+ ", userassetmaps=" + userassetmaps + ", assetNo=" + assetNo + ", assetDescription=" + assetDescription
				+ ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + "]";
	}
	
	
	
	
	
	
	
}
