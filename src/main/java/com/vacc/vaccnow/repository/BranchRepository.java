package com.vacc.vaccnow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vacc.vaccnow.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {

}
