package com.qust.entity;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private Integer parentId;
    private Integer type;
}
