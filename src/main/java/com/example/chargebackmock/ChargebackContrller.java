package com.example.chargebackmock;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1")
public class ChargebackContrller {

    @GetMapping("/chargeback")
    public Mono<ChargebackResponse> mercadoPagoInstantPaymentNotificationQueue() {
        return Mono.just(ChargebackResponse.builder()
                        .id(1L)
                        .payments(List.of(1L))
                        .amount(BigDecimal.TEN)
                        .coverageApplied(false)
                        .currency("BRL")
                        .dateCreated(LocalDate.now().toString())
                        .coverageElegible(false)
                        .dateLastUpdated(LocalDate.now().toString())
                        .documentation(List.of(ChargeBackDocumentationResponse.builder().description("teste").type("teste").url("teste").build()))
                        .documentationRequired(true)
                .build());
    }
}
