package com.nazmul.bestbuy.Security.Jwt.controller;


import com.nazmul.bestbuy.Security.Jwt.dto.LoginRequest;
import com.nazmul.bestbuy.Security.Jwt.entity.JwtRequest;
import com.nazmul.bestbuy.Security.Jwt.entity.JwtResponse;
import com.nazmul.bestbuy.Security.Jwt.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")

//@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/login"})
    public JwtResponse createJwtToken22(@RequestBody LoginRequest loginRequest) throws Exception {
        System.out.println("Test Action");
//        (@RequestBody JwtRequest jwtRequest)
        JwtRequest jwtRequest = new JwtRequest();

        jwtRequest.setUserName(loginRequest.getUserName());

        jwtRequest.setPassword(loginRequest.getPassword());


        return jwtService.createJwtToken(jwtRequest);
    }

}
