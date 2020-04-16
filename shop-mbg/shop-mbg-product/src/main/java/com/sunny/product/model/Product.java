package com.sunny.product.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;

    /**
     * 名字
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "名字")
    private String name;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户id")
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}