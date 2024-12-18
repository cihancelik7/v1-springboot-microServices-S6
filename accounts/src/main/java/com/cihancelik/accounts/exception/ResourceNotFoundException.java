package com.cihancelik.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue){
        super(String.format("%s not found with the given input data %s : '%s'",resourceName,fieldName,fieldValue));
        // cikti ornegi: Customer not found with the given input data mobileNumber : '5335821616'
        /**
         * tam cikti soyle:
         *     "apiPath": "uri=/api/fetch",
         *     "errorCode": "NOT_FOUND",
         *     "errorMessage": "Customer not found with the given input data mobileNumber : '053358216161'",
         *     "errorTime": "2024-10-21T13:11:34.273035"
         */
    }

}
