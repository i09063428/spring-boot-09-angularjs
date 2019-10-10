package com.zxl;

import com.zxl.admain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxl
 * html5shiv：解决ie9以下浏览器对html5新增标签的不识别，并导致CSS不起作用的问题。
 * respond.min:让不支持css3 Media Query的浏览器包括IE6-IE8等其他浏览器支持查询
 */
@RestController
@SpringBootApplication
public class SpringBoot09AngularjsApplication {

	@RequestMapping(value = "/search",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName){
		return new Person(personName,32,"重庆");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot09AngularjsApplication.class, args);
	}

}
