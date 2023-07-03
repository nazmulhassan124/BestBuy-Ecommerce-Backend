package com.nazmul.bestbuy.Security.Jwt.repository;


import com.nazmul.bestbuy.Security.Jwt.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<User,String> {

    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

    @Query(value = "SELECT * FROM USER JOIN user_role ON user.user_name = user_role.user_id WHERE role_id =:role" , nativeQuery = true)
    public List<User> getFilteredListByRole(@Param("role") String role);


}
