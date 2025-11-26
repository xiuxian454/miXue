package com.dfrz.mixue.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("goods")
public class Goods {
    private Integer id;
    private String icon;
    private String goodsList;
    private String name;
}
