package com.analytics.manufacturing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.analytics.manufacturing.entity.User;

@Repository
@RepositoryRestResource(path="user")
public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByName(@RequestParam("name") String name);
	
}
