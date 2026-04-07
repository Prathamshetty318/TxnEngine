package com.pratu.txnengine.controller;

import com.pratu.txnengine.entity.Transaction;
import com.pratu.txnengine.dto.CreatePaymentRequest;
import com.pratu.txnengine.repository.TransactionRepository;
import com.pratu.txnengine.service.PaymentService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    @PostMapping
    public Transaction createPayment(@RequestBody CreatePaymentRequest request)
    {
        return paymentService.createPayment(
                request.getUserId(),
                request.getAmount()
        );

    }


}
