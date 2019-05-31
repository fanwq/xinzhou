package com.fwq.gitgithub.entity;

/**
 * @ClassName: NewsDO
 * @Author: fanweiqiang
 * @Date: 2019/5/31 9:29
 * @Description: TODO
 */

public class NewsDO {

    private Integer id;
    private String title;
    private String content;

    public NewsDO() {
    }

    public NewsDO(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
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

    @Override
    public String toString() {
        return "NewsDO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
