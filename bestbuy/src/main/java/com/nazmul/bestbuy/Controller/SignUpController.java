package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Entity.SignUp;
import com.nazmul.bestbuy.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signUp")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class SignUpController {

    @Autowired
    SignUpService signUpServece;

    @PostMapping("/post")
    public SignUp post(@RequestBody SignUp signUp) {

        return signUpServece.post(signUp);
    }

    @GetMapping("/getUser")
    public SignUp getUser(@RequestParam(value="username") String username ,@RequestParam(value="password") String password) {
        return signUpServece.getUser(username, password);
    }

}
