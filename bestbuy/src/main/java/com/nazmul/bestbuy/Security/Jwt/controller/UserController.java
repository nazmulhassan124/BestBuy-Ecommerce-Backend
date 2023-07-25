package com.nazmul.bestbuy.Security.Jwt.controller;


import com.nazmul.bestbuy.Security.Jwt.dto.MessageResponse;
import com.nazmul.bestbuy.Security.Jwt.dto.SignupRequest;
import com.nazmul.bestbuy.Security.Jwt.entity.User;
import com.nazmul.bestbuy.Security.Jwt.repository.RoleDao;
import com.nazmul.bestbuy.Security.Jwt.repository.UserDao;
import com.nazmul.bestbuy.Security.Jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }


    @PostMapping("/signup")      // atar kaj nei
    public ResponseEntity<?> registerNewUserNew(@RequestBody SignupRequest signupRequest) {
        Long getid = 1+ userDao.getNextSeriesId();

        User user = new User();
        user.setUserName(signupRequest.getUserName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setName(signupRequest.getName());
        user.setImage(signupRequest.getImage());

        user.setUserId( getid );
       // user.setCreatedDateTime();

//        BeanUtils.copyProperties(signupRequest,user,"username");
//        user.setRole((Set<Role>) new Role("User"));


        if (userDao.existsById(signupRequest.getUserName())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }
//
        if (userDao.existsById(signupRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }


        userService.registerNewUser(user);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));

    }


    @GetMapping({"/getUser"})
    public Iterable<User> getAll() {
        return userService.getAll();
    }


    @PostMapping("/registerNewUser")
    public User registerNewUser(@RequestBody User user) {

        return userService.registerNewUser(user);
    }


    @PutMapping({"/updateUser"})
    public User updateUserRole(@RequestBody User user) {
        return userService.updateUser(user);
    }



    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }




}
