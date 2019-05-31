package com.fwq.gitgithub.controller;

import com.fwq.gitgithub.config.NewsTypeList;
import com.fwq.gitgithub.entity.NewsTypeDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: NewsTypeController
 * @Author: fanweiqiang
 * @Date: 2019/5/31 19:06
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "type")
@Api(tags = "新闻系统-新闻类别管理模块Api")
public class NewsTypeController {
    @Autowired
    private NewsTypeList list;

    @ApiOperation(value="获取新闻种类列表")
    @GetMapping(value = "getAll")
    public List<NewsTypeDO> getAll(){
        return list.getNewsTypeDOList();
    }

    @ApiOperation(value="获取单个新闻种类")
    @ApiImplicitParam(name="id",value = "要获取新闻种类的id号", dataType = "Integer")
    @GetMapping(value = "get")
    public NewsTypeDO getOne(@RequestParam(name = "id")Integer id){
        return list.getNewsTypeDOList().get(id);
    }

    @ApiOperation(value = "增加新闻种类")
    @ApiImplicitParam(name = "newsTypeDO", value = "要增加的新闻种类", dataType = "NewsTypeDO")
    @PostMapping(value = "add")
    public void addNewsType(@RequestBody NewsTypeDO newsTypeDO){
        list.getNewsTypeDOList().add(newsTypeDO);
        System.out.println(list.getNewsTypeDOList());
    }

    @ApiOperation(value="更新新闻类别")
    @PutMapping(value = "update")
    public void updateNewsType(@RequestBody NewsTypeDO newsTypeDO) {
        List<NewsTypeDO> typeList = list.getNewsTypeDOList();
        for (int i = 0; i < typeList.size(); i++) {
            if (newsTypeDO.getId().equals(typeList.get(i).getId())) {
                typeList.set(i, newsTypeDO);
            }
        }
        System.out.println(list.getNewsTypeDOList());
    }

    @ApiOperation(value="删除一条新闻类别")
    @DeleteMapping(value = "delete")
    public void deleteNewsType(@RequestBody NewsTypeDO newsTypeDO){
        list.getNewsTypeDOList().remove(newsTypeDO);
        System.out.println(list.getNewsTypeDOList());
    }
}
