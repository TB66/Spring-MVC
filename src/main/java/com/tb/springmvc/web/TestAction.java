package com.tb.springmvc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class TestAction {
	@GetMapping("add")
	public String add() {
		return "add";
	}
	@GetMapping("del")
	public String del() {
		return "del";
	}
	@GetMapping("?/msg")
	public String msg() {
		return "msg";
	}
	@GetMapping("*/mod")
	public String mod() {
		return "mod";
	}
	@GetMapping("**/get")
	public String get() {
		return "get";
	}
}
