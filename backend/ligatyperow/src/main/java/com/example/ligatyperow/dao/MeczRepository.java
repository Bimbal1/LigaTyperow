package com.example.ligatyperow.dao;

import com.example.ligatyperow.entity.Mecz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeczRepository extends JpaRepository<Mecz, Long> {
}
