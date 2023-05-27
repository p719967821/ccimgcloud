package com.xz.platform.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class TagVo implements Serializable {


    private Long count;

    private String name;
}
