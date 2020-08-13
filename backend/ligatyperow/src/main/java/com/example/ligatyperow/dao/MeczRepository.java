package com.example.ligatyperow.dao;

import com.example.ligatyperow.entity.Mecz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mecz", path = "mecze")
public interface MeczRepository extends JpaRepository<Mecz, Long> {
}
