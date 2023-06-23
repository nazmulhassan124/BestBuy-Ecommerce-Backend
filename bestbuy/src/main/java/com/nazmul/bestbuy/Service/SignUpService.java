package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.SignUp;
import com.nazmul.bestbuy.Repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {


    @Autowired
    SignUpRepository signUpRepository;

    public SignUp post(SignUp signUp) {
        if(!signUp.equals(null)) {

            return signUpRepository.save(signUp);
        }
        return null;
    }

    public SignUp getUser(String username ,String password) {
        return signUpRepository.getUser(username,password);
    }

}
