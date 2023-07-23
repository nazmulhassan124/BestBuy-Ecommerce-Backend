package com.nazmul.bestbuy.Security.Jwt.service;


import com.nazmul.bestbuy.Security.Jwt.entity.Role;
import com.nazmul.bestbuy.Security.Jwt.entity.User;
import com.nazmul.bestbuy.Security.Jwt.repository.RoleDao;
import com.nazmul.bestbuy.Security.Jwt.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;


@Autowired
private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Super_Admin");
        adminRole.setRoleDescription("Super Admin role");
        roleDao.save(adminRole);

        Role roleAdmin = new Role();
        roleAdmin.setRoleName("Admin");
        roleAdmin.setRoleDescription("Admin Role For the BestBuy Management User");
        roleDao.save(roleAdmin);

        Role roleAManager = new Role();
        roleAManager.setRoleName("Manager");
        roleAManager.setRoleDescription("Manager Role For the BestBuy Management ");
        roleDao.save(roleAManager);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created user");
        roleDao.save(userRole);





        User adminUser = new User();
        adminUser.setName("Nazmul Hassan");
        adminUser.setPassword(getEncodedPassword("admin@pass"));
        adminUser.setUserName("admin123");

        adminUser.setEmail("topunazmulhassan@gmail.com");
        adminUser.setImage("assets/images/nazmul.jpg");

        Set<Role> adminRoles = new HashSet<>();

        adminRoles.add(roleAdmin);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);


    }

    public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();
String pass = user.getPassword();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);

        user.setRole(userRoles);
        user.setPassword(getEncodedPassword(pass));

        return userDao.save(user);
    }


// add existing user multiple role
    public User updateUser(User user) {
        Optional<User> optionalUser  = userDao.findById(user.getUsername());

        if (optionalUser.isPresent()){
            Set<Role> userRoles = new HashSet<>();
            userRoles.addAll(optionalUser.get().getRole());
            userRoles.addAll(user.getRole());
            optionalUser.get().setRole(userRoles);
            return userDao.save( optionalUser.get());

        }
        return null;
    }


    public Iterable<User> getAll() {


        return userDao.findAll();
    }
    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }



}
