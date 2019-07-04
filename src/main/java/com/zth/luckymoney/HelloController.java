package com.zth.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by 3zz
 * @Controller + @ResponseBody = @RestController
 **/

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
    public String say(@RequestParam(value =  "id", required = false, defaultValue = "0") Integer id) {
//        return "说明: " + limitConfig.getDescription();
//        return "index";
        return "id:" + id;
    }
    @GetMapping("/hello2")
    public String say2() {
        return "index";
    }
}
