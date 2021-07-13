package com.analytics.manufacturing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.analytics.manufacturing.entity.Plan;

@Repository
@RepositoryRestResource(path="plan")
public interface PlanRepository extends JpaRepository<Plan, Long>{

	List<Plan> findByStatus(@RequestParam("status") String status);
}
