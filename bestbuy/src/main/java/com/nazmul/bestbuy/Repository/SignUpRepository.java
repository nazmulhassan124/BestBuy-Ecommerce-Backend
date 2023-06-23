package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository  extends JpaRepository<SignUp,Long> {
}
