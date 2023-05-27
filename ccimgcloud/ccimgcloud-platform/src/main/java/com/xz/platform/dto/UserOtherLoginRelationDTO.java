package com.xz.platform.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author xiaozhao sunlightcs@gmail.com
 * @since 1.0.0 2023-03-16
 */
@Data
@ApiModel(value = "")
public class UserOtherLoginRelationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "")
	private Long uid;

	@ApiModelProperty(value = "")
	private String otherUserId;

	@ApiModelProperty(value = "")
	private String otherUsername;

	@ApiModelProperty(value = "")
	private String otherAvatar;

	@ApiModelProperty(value = "")
	private String otherToken;

	@ApiModelProperty(value = "")
	private Long creator;

	@ApiModelProperty(value = "")
	private Date createDate;
}