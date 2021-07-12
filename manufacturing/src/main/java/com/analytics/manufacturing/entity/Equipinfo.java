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
@Table(name = "analy_ma_equipinfo")
public class Equipinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(mappedBy = "equipinfo", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private Machineinfo machineinfo;
	@OneToOne(mappedBy = "equipinfo", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private Equipment equipment;
	
	
	@Column(name="equipment_no")
	private String equipmentNo;
	
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_id")
	private Asset asset;
	
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
	public Machineinfo getMachineinfo() {
		return machineinfo;
	}
	public void setMachineinfo(Machineinfo machineinfo) {
		this.machineinfo = machineinfo;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	@Override
	public String toString() {
		return "Equipinfo [id=" + id + ", machineinfo=" + machineinfo + ", equipment=" + equipment + ", equipmentNo="
				+ equipmentNo + ", asset=" + asset + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
	
	
	

}
