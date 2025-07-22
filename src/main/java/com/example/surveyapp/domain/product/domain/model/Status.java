package com.example.surveyapp.domain.product.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum Status {
    On_SALE("판매중"),
    STOPED_SALE("판매 중단");

    private String status;

}
