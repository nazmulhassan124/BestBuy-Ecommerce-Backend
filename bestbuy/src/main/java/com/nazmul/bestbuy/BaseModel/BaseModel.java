package com.nazmul.bestbuy.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseModel implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @CreationTimestamp
    private LocalDateTime createdDateTime;
    private String createdBy;
    @LastModifiedDate
    private LocalDateTime updatedDateTime;
    @Nullable
    private String updatedBy;
    @Nullable
    private boolean isActive;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseModel baseModel = (BaseModel) o;
        return id == baseModel.id && isActive == baseModel.isActive && Objects.equals(createdDateTime, baseModel.createdDateTime) && Objects.equals(createdBy, baseModel.createdBy) && Objects.equals(updatedDateTime, baseModel.updatedDateTime) && Objects.equals(updatedBy, baseModel.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdDateTime, createdBy, updatedDateTime, updatedBy, isActive);
    }
}
