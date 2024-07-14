package com.noBroker.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlanDto {
    private long id;
    private String planName;
    private double price;
    private boolean planValidity;
    private boolean relationshipManager;
    private boolean rentalAgreement;
    private boolean propertyPromotion;
    private boolean guaranteedTenants;
    private boolean showingProperty;
    private boolean facebookMarketingOfProperties;
}
