package com.fwq.gitgithub.config;

import com.fwq.gitgithub.entity.NewsDO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: NewsList
 * @Author: fanweiqiang
 * @Date: 2019/5/31 14:38
 * @Description: TODO
 */
//@Bean @Service @Controller @Configuration
@Repository //持久层的注解
public class NewsList {

    private List<NewsDO> list;

    public NewsList() {
        NewsDO news1 = new NewsDO(1, "aaa", "cccccccccc", new Date());
        NewsDO news2 = new NewsDO(2, "bbb", "dddddd",null);
        NewsDO news3 = new NewsDO(3, "rrr", "tttttttt", null);

        List<NewsDO> newsList = new ArrayList<>();
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);

        this.setList(newsList);
    }

    public List<NewsDO> getList() {
        return list;
    }

    public void setList(List<NewsDO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "NewsList{" +
                "list=" + list +
                '}';
    }
}
