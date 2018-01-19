package com.boot.bootexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration //EnableAutoConfiguration用于自动加载配置
@SpringBootApplication
public class BootExerciseApplication {

	@RequestMapping("/")
	@ResponseBody
	String homg(){
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception{

		//SpringApplication 用于从main方法启动spring应用的类
		SpringApplication.run(BootExerciseApplication.class, args);
		SpringApplication.run(Exercise.class,args);

	}
}
