package com.nazmul.bestbuy.DTO;

import lombok.Data;

@Data
public class ResponsesMessage {


    String massage;

    public ResponsesMessage(String massage) {
        super();
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }


}
