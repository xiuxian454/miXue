package com.dfrz.mixue.service.impl;

import com.dfrz.mixue.mapper.GoodsMapper;
import com.dfrz.mixue.model.Goods;
import com.dfrz.mixue.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsList() {
        Map<String,Object> map = new HashMap<>();
        return goodsMapper.selectByMap(map);
    }
}
