package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository  extends JpaRepository<SignUp,Long> {
    @Query(value = "SELECT * FROM sign_up where username =:usrname and password=:password limit 1", nativeQuery = true)
    SignUp getUser(@Param("usrname") String usrname, @Param("password") String password);


}
