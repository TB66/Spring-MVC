package com.tb.springmvc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * path = value 互为同义词 
 * method 定义响应的请求的类型，例如:GET， POST, DELETE... 
 * params 定义对参数的限定;
 * 例如: a= 108 (限定请求里面必须有a=108的参数) a(限定请求里面必须有a的参数) 
 * headers 限定请求头城中的字段值，例如:
 * Cookie consumes 消费:限定请求内容的类型
 *  produces 产品:限定返回内容的类型
 * 
 * @author tanben
 *
 */
@RestController
public class ProductAction {
	@RequestMapping(path = "product.do", params = "op=query")
	public String query() {
		return "query";
	}

	@GetMapping(path = "product.do", params = "op=add")
	public String add() {
		return "add";
	}

	@RequestMapping(path = "product.do", params = "op=mod", method = RequestMethod.POST)
	public String mod() {
		return "mod";
	}

	@GetMapping(path = "product.do", params = "op=select")
	public String select() {
		return "select";
	}

	@GetMapping(path = "product.do", params = "op=mgr", headers = { "Host=localhost", "Cookie" })
	public String mgr() {
		return "mgr!!";
	}
}
