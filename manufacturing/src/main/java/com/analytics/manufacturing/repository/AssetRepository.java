package com.analytics.manufacturing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.analytics.manufacturing.entity.Asset;

@Repository
@RepositoryRestResource(path="area")
public interface AssetRepository extends JpaRepository<Asset, Long>{
	
	List<Asset> findByAssetNo(@RequestParam("assetNo") String assetNo);

}
