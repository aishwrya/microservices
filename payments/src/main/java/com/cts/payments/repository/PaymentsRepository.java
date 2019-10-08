package com.cts.payments.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.payments.model.Payment;

public interface PaymentsRepository extends CrudRepository<Payment,Long> {

}