package com.dfrz.mixue.controller;

import com.dfrz.mixue.model.Goods;
import com.dfrz.mixue.service.GoodsService;
import com.dfrz.mixue.utils.BaseResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @RequestMapping("/getGoodsList")
    public BaseResult getGoodsList(){
        List<Goods> goodsList = goodsService.getGoodsList();
        Map<String,Object> map = new HashMap<>();
        map.put("goodList",goodsList);
        String kkk = "kkk";
        return new BaseResult(true,999,"操作成功",map);
    }
}
