package com.peerlending.lendingengine.domain.repository;

import com.peerlending.lendingengine.domain.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRequestRepository extends JpaRepository<LoanApplication, Long> {
}
