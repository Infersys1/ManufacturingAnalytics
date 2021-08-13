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
@Table(name = "analy_ma_equipinfo")
public class Equipinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "equipinfo")
	private List<Machineinfo> machineinfos;
	
	@OneToMany(mappedBy = "equipinfo")
	private List<Equipment> equipments;
	
	@Column(name="equipment_no")
	private String equipmentNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User equipinfo_createdBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Asset asset;
		
	@Column(name="created_time", nullable=false, updatable=false)
	@CreationTimestamp
	private Date createdTime;
	@Column(name="updated_time")
	@UpdateTimestamp
	private Date updatedTime;
	
	public User getEquipinfo_createdBy() {
		return equipinfo_createdBy;
	}
	public void setEquipinfo_createdBy(User equipinfo_createdBy) {
		this.equipinfo_createdBy = equipinfo_createdBy;
	}
	@Column(name="updated_by")
	private String updatedBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
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
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public List<Machineinfo> getMachineinfos() {
		return machineinfos;
	}
	public void setMachineinfos(List<Machineinfo> machineinfos) {
		this.machineinfos = machineinfos;
	}
	public List<Equipment> getEquipments() {
		return equipments;
	}
	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	@Override
	public String toString() {
		return "Equipinfo [id=" + id + ", machineinfos=" + machineinfos + ", equipments=" + equipments
				+ ", equipmentNo=" + equipmentNo + ", equipinfo_createdBy=" + equipinfo_createdBy + ", createdTime="
				+ createdTime + ", updatedTime=" + updatedTime + ", updatedBy=" + updatedBy + "]";
	}
	
	

}
