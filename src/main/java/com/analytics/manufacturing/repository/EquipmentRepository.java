package com.analytics.manufacturing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.analytics.manufacturing.entity.Equipment;

@Repository
@RepositoryRestResource(path="equipment")
public interface EquipmentRepository extends JpaRepository<Equipment, Long>{

}
