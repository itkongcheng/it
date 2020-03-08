package com.duing.controller;

import com.duing.config.BeefConfig;
import com.duing.config.FoodConfig;
import com.duing.config.VegetablesConfig;
import com.duing.domain.Beef;
import com.duing.domain.Food;
import com.duing.domain.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 * 是@Controller AND @ResponseBody的组合
 * 返回的是json格式响应结果 而不是视图(jsp html)
 */
@RestController
public class JsonController {

    /**
     * food.rice=rice
     * food.meat=meat
     * @Value 通过${}这种结构 获得文件中的属性值
     */
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }

    @Autowired
    private BeefConfig beefConfig;

    @RequestMapping("/beef")
    public Beef beef(){
        Beef beef = new Beef();
        beef.setCelery(beefConfig.getCelery());
        beef.setCoriander(beefConfig.getCoriander());
        beef.setPepper(beefConfig.getPepper());
        return beef;
    }
}
