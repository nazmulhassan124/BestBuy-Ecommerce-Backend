package com.nazmul.bestbuy.Security.Jwt.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class SignupRequest {

    private String userName;
    private String password;
    private String email;
}
