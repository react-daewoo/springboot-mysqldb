package com.groovy.mysqldb.vo;

import jakarta.persistence.Entity;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Board {
    private int boardId;

    private String title;

    private String content;

    private String name;

    private String counts;

}
