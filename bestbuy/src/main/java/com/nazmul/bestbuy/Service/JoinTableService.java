package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Repository.JoinTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinTableService {

    @Autowired
    JoinTableRepository joinTableRepository;

    public List<Object[]> getAllProductAndPurchaseAndVendor(){
        return joinTableRepository.getAllProductAndPurchaseAndVendor();
    }
}
