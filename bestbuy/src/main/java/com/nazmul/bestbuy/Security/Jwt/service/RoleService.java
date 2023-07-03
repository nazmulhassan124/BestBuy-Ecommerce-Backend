package com.nazmul.bestbuy.Security.Jwt.service;


import com.nazmul.bestbuy.Security.Jwt.entity.Role;
import com.nazmul.bestbuy.Security.Jwt.repository.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
