package com.nazmul.bestbuy.Security.Jwt.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class LoginRequest {
    private String userName;
    private String password;

}
