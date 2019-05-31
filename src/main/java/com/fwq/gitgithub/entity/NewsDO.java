package com.fwq.gitgithub.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @ClassName: NewsDO
 * @Author: fanweiqiang
 * @Date: 2019/5/31 9:29
 * @Description: TODO
 */
@ApiModel(value = "NewsDO", description = "新闻实体")
public class NewsDO {

    private Integer id;
    @ApiModelProperty(value = "新闻标题", required = true)
    private String title;
    //@JsonProperty(value = "content1")
    private String content;

    //timezone 要与数据库链接字符串中的时区设置一致
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8", locale = "zh")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date inputDate;

    public NewsDO() {
    }

    public NewsDO(Integer id, String title, String content, Date inputDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.inputDate = inputDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    @Override
    public String toString() {
        return "NewsDO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", inputDate=" + inputDate +
                '}';
    }
}
