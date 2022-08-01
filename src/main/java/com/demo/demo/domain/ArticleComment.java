package com.demo.demo.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
