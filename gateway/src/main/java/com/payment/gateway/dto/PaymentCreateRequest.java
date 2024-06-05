package com.payment.gateway.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentCreateRequest {
    
    
    @NotBlank(message = "Name is required")
    @Size(max = 255)
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
