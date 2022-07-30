package com.example.springtest.Risky.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseEntity implements Serializable {
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
}
