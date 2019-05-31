package com.fwq.gitgithub.controller;

import com.alibaba.fastjson.JSONObject;
import com.fwq.gitgithub.config.NewsList;
import com.fwq.gitgithub.entity.NewsDO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Api(tags = "新闻系统-新闻管理模块Api")
public class NewsController {

    @Autowired
    private NewsList list;
    //@RequestParam: 将参数放在url中 GET
    //@RequestBodoy: POST请求(新增) put请求(修改) form表单
    //@PathVariable: 参数在路径上面
    @GetMapping(value ="getAll")
    @ApiOperation(value = "获取新闻列表")
    public List<NewsDO> getAll() {
        return list.getList();
    }

    @GetMapping(value = "detail/{id}")
    @ApiOperation(value = "获取新闻详情")
    @ApiImplicitParam(name = "id", value = "新闻编号"
    , required = true, dataType = "String")//name: 参数名 value：参数说明 dataType：数据类型
                       //paramType：参数类型
    public NewsDO getOne(@PathVariable(name = "id") String id){
        System.out.println(id);
        return list.getList().get(0);
    }

    //新增新闻
    @PostMapping(value = "insert")
    @ApiOperation(value = "新增新闻")
    public void addNews(@RequestBody @ApiParam(value = "新闻对象") NewsDO news){
        list.getList().add(news);
        System.out.println(list.getList());
    }

    //修改新闻
    @PutMapping(value = "update/{id}")
    @ApiOperation(value = "修改新闻")
    @ApiImplicitParams({@ApiImplicitParam(name = "newsDO", value = "新闻对象", dataType = "NewsDO"),
    @ApiImplicitParam(name = "id", value = "新闻编号", dataType = "String")})
    public void updateNews(@RequestBody NewsDO newsDO,
                           @PathVariable(name = "id") String id){
        list.getList().set(1, newsDO);
        System.out.println(list.getList());
    }

    @PostMapping(value = "json")
    public void getJson(@RequestBody JSONObject object) {
        System.out.println(object.getString("userid"));
        System.out.println(object.getInteger("age"));
        System.out.println(object.getObject("ids", List.class).get(0));
    }
}
