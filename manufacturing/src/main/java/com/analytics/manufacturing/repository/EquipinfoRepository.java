package com.analytics.manufacturing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.analytics.manufacturing.entity.Equipinfo;

@Repository
@RepositoryRestResource(path="equipinfo")
public interface EquipinfoRepository extends JpaRepository<Equipinfo, Long>{
	
	List<Equipinfo> findByEquipmentNo(@RequestParam("equipmentNo") String equipmentNo);

}
