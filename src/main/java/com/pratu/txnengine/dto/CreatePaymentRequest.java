package com.pratu.txnengine.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CreatePaymentRequest {
    private String userId;
    private BigDecimal amount;
}
