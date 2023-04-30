package com.example.mindjobcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mindjobcard.model.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long>{

}
