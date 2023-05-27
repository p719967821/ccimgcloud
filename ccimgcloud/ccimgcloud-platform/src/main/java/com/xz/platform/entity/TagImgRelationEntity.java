package com.xz.platform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author xiaozhao sunlightcs@gmail.com
 * @since 1.0.0 2023-03-16
 */
@Data
@TableName("t_tag_img_relation")
public class TagImgRelationEntity {

    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Long mid;
    /**
     *
     */
    private String tagIds;
}