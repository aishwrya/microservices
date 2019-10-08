package com.cts.payments.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.payments.model.Payment;
import com.cts.payments.service.PaymentService;

@RestController

public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/list")
	public List<Payment> getAllpayments(){
		return paymentService.getAllpayments();
	}
	
	@GetMapping("/list/{id}")
	public Optional<Payment> getpaymentById(@PathVariable Long id) {
		return paymentService.getpaymentById(id);
	}
	
	@PostMapping("/add")
	public Payment addpayment(@RequestBody Payment user) {
		return paymentService.addpayment(user);	
	}
	
	@PutMapping("/update")
	public Payment updatepayment(@RequestBody Payment user) {
		return paymentService.updatepayment(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public String  deleteUser(@PathVariable Long id) {
		paymentService.deletepayment(id);
		 return "Deleted Sucessfully";
	}
	

}