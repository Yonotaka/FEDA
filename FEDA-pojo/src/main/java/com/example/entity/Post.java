package com.example.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 发帖实体类
 */
@Data
public class Post {
    private Long id;

    private String title;

    private String content;

    private Long authorId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
