package com.fwq.gitgithub.config;

import com.fwq.gitgithub.entity.NewsTypeDO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: NewsTypeList
 * @Author: fanweiqiang
 * @Date: 2019/5/31 19:07
 * @Description: TODO
 */
@Repository
public class NewsTypeList {
    private List<NewsTypeDO> newsTypeDOList;

    public NewsTypeList() {
        NewsTypeDO typeDO1 = new NewsTypeDO(1, "economic");
        NewsTypeDO typeDO2 = new NewsTypeDO(2, "military");
        NewsTypeDO typeDO3 = new NewsTypeDO(3, "pet");

        newsTypeDOList = new ArrayList<>();

        newsTypeDOList.add(typeDO1);
        newsTypeDOList.add(typeDO2);
        newsTypeDOList.add(typeDO3);
    }

    public List<NewsTypeDO> getNewsTypeDOList() {
        return newsTypeDOList;
    }

    public void setNewsTypeDOList(List<NewsTypeDO> newsTypeDOList) {
        this.newsTypeDOList = newsTypeDOList;
    }
}
