package com.payment.gateway.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.gateway.dto.PaymentCreateRequest;
import com.payment.gateway.dto.PaymentResponse;
import com.payment.gateway.dto.TestDTO;
import com.payment.gateway.service.PaymentService;

@RestController
@RequestMapping("v1/payment")
public class PaymentController {

	org.slf4j.Logger logger =  LoggerFactory.getLogger(PaymentController.class);
	@Autowired
	  private PaymentService paymentService;
	 /* 
	 * @Autowired public PaymentController(PaymentService paymentService) {
	 * this.paymentService = paymentService; }
	 */
    @PostMapping(path="/create",consumes = MediaType.APPLICATION_JSON_VALUE,
    		   produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PaymentResponse> createPayment(@RequestBody PaymentCreateRequest paymentRequestDTO) {
        PaymentResponse createdPayment = paymentService.createPayment(paymentRequestDTO);
        logger.info("createPayment------------"+paymentRequestDTO);
        return new ResponseEntity<>(createdPayment, HttpStatus.CREATED);
    	
    }
}
