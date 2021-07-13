package com.analytics.manufacturing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.analytics.manufacturing.entity.Tag;

@Repository
@RepositoryRestResource(path="tag")
public interface TagRepository extends JpaRepository<Tag, Long>{

	List<Tag> findByTagName(@RequestParam("tagName") String tagName);
	
}
