package com.analytics.manufacturing.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "analy_ma_asset")
public class Asset {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(mappedBy = "asset", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private Equipinfo equipinfo;
	@OneToOne(mappedBy = "asset", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private Plan plan;
	@OneToOne(mappedBy = "asset", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private User user;
	@OneToOne(mappedBy = "asset", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private Userassetmap userassetmap;
	@OneToOne(mappedBy = "asset", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private Equipment equipment;
	
	
	
	@Column(name="asset_no")
	private String assetNo;
	@Column(name="asset_description")
	private String assetDescription;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zone_id")
	private Zone zone;
	
	
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
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Equipinfo getEquipinfo() {
		return equipinfo;
	}
	public void setEquipinfo(Equipinfo equipinfo) {
		this.equipinfo = equipinfo;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Userassetmap getUserassetmap() {
		return userassetmap;
	}
	public void setUserassetmap(Userassetmap userassetmap) {
		this.userassetmap = userassetmap;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	@Override
	public String toString() {
		return "Asset [id=" + id + ", equipinfo=" + equipinfo + ", plan=" + plan + ", user=" + user + ", userassetmap="
				+ userassetmap + ", equipment=" + equipment + ", assetNo=" + assetNo + ", assetDescription="
				+ assetDescription + ", zone=" + zone + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
	
	
	
}
