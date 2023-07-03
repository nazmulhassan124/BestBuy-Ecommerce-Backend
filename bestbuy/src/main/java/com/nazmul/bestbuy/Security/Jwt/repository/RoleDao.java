package com.nazmul.bestbuy.Security.Jwt.repository;


import com.nazmul.bestbuy.Security.Jwt.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {
}
