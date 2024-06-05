package com.payment.gateway.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.gateway.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
