package com.example.ligatyperow.dao;

import com.example.ligatyperow.entity.Kolejka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "kolejka", path = "kolejki")
public interface KolejkaRepository extends JpaRepository<Kolejka, Long> {
}
