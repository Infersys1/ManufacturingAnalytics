package com.analytics.manufacturing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.analytics.manufacturing.entity.Zone;

@Repository
@RepositoryRestResource(path="zone")
public interface ZoneRepository extends JpaRepository<Zone, Long>{
	
	List<Zone> findByZoneName(@RequestParam("zoneName") String zoneName);
	

}
