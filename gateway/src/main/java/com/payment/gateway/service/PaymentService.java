package com.payment.gateway.service;

import com.payment.gateway.dto.PaymentCreateRequest;
import com.payment.gateway.dto.PaymentResponse;

public interface PaymentService {
	PaymentResponse createPayment(PaymentCreateRequest paymentRequestDTO);
}
