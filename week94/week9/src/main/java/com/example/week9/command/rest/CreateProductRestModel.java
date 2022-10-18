package com.example.week9.command.rest;

import lombok.Data;

import javax.sql.rowset.spi.SyncResolver;
import java.math.BigDecimal;

@Data
public class CreateProductRestModel {
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
