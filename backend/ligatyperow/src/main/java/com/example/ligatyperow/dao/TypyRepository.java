package com.example.ligatyperow.dao;

import com.example.ligatyperow.entity.Typy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "typy", path = "typy")
public interface TypyRepository extends JpaRepository<Typy, Long> {
}
