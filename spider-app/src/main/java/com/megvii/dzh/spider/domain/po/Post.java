package com.megvii.dzh.spider.domain.po;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table
public class Post {
    @Id
    private Long id;

    private String userName;

    private String title;

    private String postUrl;

    private Integer replyNum;

    private Date time;

    private Integer year;
    
    private Integer month;
    
    private Integer day;
    
    private Integer hour;

    private Long lightTotal;

    private String content;
}
