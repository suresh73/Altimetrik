package com.payment.gateway.dto;


import lombok.Data;

@Data

public class PaymentResponse {
    
    
    private String Id;
	
    private String name;

    
    private String number;

    
    private String email;

    
    private String address;

    
    private int billValue;

    
    private String cardNumber;

    
    private String cardHolder;

    
    private String dateValue;

    
    private String cvc;
}
