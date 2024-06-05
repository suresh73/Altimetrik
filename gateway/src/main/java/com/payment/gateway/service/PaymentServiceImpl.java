package com.payment.gateway.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.gateway.dto.PaymentCreateRequest;
import com.payment.gateway.dto.PaymentResponse;
import com.payment.gateway.entity.Payment;
import com.payment.gateway.repo.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
    private  PaymentRepository paymentRepository;
   
	@Override
    public PaymentResponse createPayment(PaymentCreateRequest paymentRequestDTO) {
        Payment payment = convertToEntity(paymentRequestDTO);
        Payment savedPayment = paymentRepository.save(payment);
        return convertToResponseDTO(savedPayment);
    }

    private Payment convertToEntity(PaymentCreateRequest paymentRequestDTO) {
        Payment payment = new Payment();
        BeanUtils.copyProperties(paymentRequestDTO, payment);
        return payment;
    }

    private PaymentResponse convertToResponseDTO(Payment payment) {
    	PaymentResponse response = new PaymentResponse();
        BeanUtils.copyProperties(payment, response);
        return response;
    }
}