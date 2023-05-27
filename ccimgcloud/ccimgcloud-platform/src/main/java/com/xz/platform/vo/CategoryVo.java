package com.xz.platform.vo;

import com.xz.common.utils.TreeNode;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class CategoryVo extends TreeNode<CategoryVo> implements Serializable {
    /**
     *
     */

    private String name;

    private String description;

    private Long count;

    /**
     * 随便看看封面
     */
    private String cover;
    /**
     * 热门封面
     */
    private String hotCover;
}
