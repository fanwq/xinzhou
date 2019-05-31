package com.fwq.gitgithub.controller;

import com.fwq.gitgithub.entity.NewsDO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: NewsController
 * @Author: fanweiqiang
 * @Date: 2019/5/31 9:04
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "news")
public class NewsController {
    @RequestMapping(value ="getAll")
    public List<NewsDO> getAll() {
        NewsDO news1 = new NewsDO(1, "aaa", "cccccccccc");
        NewsDO news2 = new NewsDO(2, "bbb", "dddddd");
        NewsDO news3 = new NewsDO(3, "rrr", "tttttttt");
        NewsDO news4 = new NewsDO(4, "ttt", "ddddddd");

        List<NewsDO> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;
    }
}
