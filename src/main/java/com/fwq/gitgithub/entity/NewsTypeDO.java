package com.fwq.gitgithub.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: NewsTypeDO
 * @Author: fanweiqiang
 * @Date: 2019/5/31 19:04
 * @Description: TODO
 */
@ApiModel(description = "新闻种类实体类")
public class NewsTypeDO {

    private Integer id;
    @ApiModelProperty(value = "新闻种类", dataType = "String")
    private String newsType;

    public NewsTypeDO() {
    }

    public NewsTypeDO(Integer id, String newsType) {
        this.id = id;
        this.newsType = newsType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    @Override
    public String toString() {
        return "NewsTypeDO{" +
                "id=" + id +
                ", newsType='" + newsType + '\'' +
                '}';
    }
}
