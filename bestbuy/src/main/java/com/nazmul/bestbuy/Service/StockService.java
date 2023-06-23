package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {


    @Autowired
    StockRepository stockReopsitory;


    public List<Object[]> getAllStock(){
        return stockReopsitory.getAllStock();
    }

}
