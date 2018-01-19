package com.boot.bootexercise;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nicole.heng
 * @description exercise
 * @date 2018/1/11
 **/
public class Exercise {

    @RequestMapping("/")
    @ResponseBody
    String homg(){
        return "Hello World!";
    }
    @RequestMapping("/hello/{myname}")
    String index(@PathVariable String myname){
        return "Hello"+myname+"!!!";
    }

}
