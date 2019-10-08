package com.cts.payments.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.payments.model.Payment;
import com.cts.payments.repository.PaymentsRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentsRepository payRepo;
	
	@Transactional
	public List<Payment> getAllpayments(){
		return (List<Payment>) payRepo.findAll();
	}
	
	@Transactional
	public Optional<Payment> getpaymentById(Long id) {
		return payRepo.findById(id);
	}
	
	@Transactional
	public Payment addpayment(Payment user) {
		return payRepo.save(user);
	}
	
	@Transactional
	public Payment updatepayment(Payment user) {
		return payRepo.save(user);
	}
	
	@Transactional
	public void deletepayment(Long id) {
		payRepo.deleteById(id);
	}

}