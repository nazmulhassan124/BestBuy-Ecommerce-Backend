package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.PurchaseDetails;
import com.nazmul.bestbuy.Repository.PurchaseDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseDetailsService {

    @Autowired
    PurchaseDetailsRepository purchaseDetailsRepo;

    public PurchaseDetails post(PurchaseDetails purchaseDetails) {
        if(!purchaseDetails.equals(null)) {
            return purchaseDetailsRepo.save(purchaseDetails);
        }
        return null;
    }

    public PurchaseDetails getById(Long id) {
        Optional<PurchaseDetails> optional = purchaseDetailsRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public PurchaseDetails update(PurchaseDetails purchaseDetails) {
        return purchaseDetailsRepo.save(purchaseDetails);
    }

    public String delete(Long id) {
        Optional<PurchaseDetails> optional = purchaseDetailsRepo.findById(id);
        if(optional.isPresent()) {
            purchaseDetailsRepo.delete(optional.get());
            return null;
        }
        return "fail";
    }

    public List<PurchaseDetails> getAll() {
        return purchaseDetailsRepo.findAll();
    }



}
