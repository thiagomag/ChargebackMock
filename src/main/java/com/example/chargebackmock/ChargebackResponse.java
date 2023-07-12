package com.example.chargebackmock;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargebackResponse {
    private Long id;
    private List<Long> payments;
    private String currency;
    private BigDecimal amount;
    private Boolean coverageApplied;
    private Boolean coverageElegible;
    private Boolean documentationRequired;
    private String documentationStatus;
    private List<ChargeBackDocumentationResponse> documentation;
    private String dateDocumentationDeadline;
    private String dateCreated;
    private String dateLastUpdated;
    private Boolean liveMode;
}
