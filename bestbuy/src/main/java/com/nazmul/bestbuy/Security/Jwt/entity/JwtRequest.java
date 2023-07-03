package com.nazmul.bestbuy.Security.Jwt.entity;

import lombok.Data;

@Data
public class JwtRequest {
    private String userName;
    private String password;
}
