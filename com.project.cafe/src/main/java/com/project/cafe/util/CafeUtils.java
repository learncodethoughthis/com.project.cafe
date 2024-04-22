package com.project.cafe.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    private CafeUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String reponseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+reponseMessage+"\")", httpStatus);
    }
}
