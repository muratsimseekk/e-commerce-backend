package com.ecommercebackend.javaspring.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryErrorResponse {
    private Integer status ;
    private String message ;
    private Long timestamp;
}
