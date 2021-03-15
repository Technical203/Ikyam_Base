package com.research.research.outputadapters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.research.research.outputadapters.entity.EmployeeProjection;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeProjection, String> {

}