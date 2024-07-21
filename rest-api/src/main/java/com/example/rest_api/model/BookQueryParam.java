package com.example.rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookQueryParam {
    private String category;
    private String issuedYear;
    private String issuedMonth;
    private String issuedDay;
}
