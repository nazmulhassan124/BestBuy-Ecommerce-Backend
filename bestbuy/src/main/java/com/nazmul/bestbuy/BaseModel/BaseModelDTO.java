package com.nazmul.bestbuy.BaseModel;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseModelDTO {
    private long id;
    private LocalDateTime createdDateTime;
    private String createdBy;
    private LocalDateTime updatedDateTime;
    private String updatedBy;
}
