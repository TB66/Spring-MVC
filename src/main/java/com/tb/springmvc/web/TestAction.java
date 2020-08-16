package com.tb.springmvc.web;

import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
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

	@RequestMapping("**/head")
	public String head(@RequestHeader() String accept,
			@RequestHeader(name = "Connection", required = true) String conn) {
		return accept + "<br>" + conn + "<br>";
	}

	@RequestMapping("**/cookie")
	public String cookie(@CookieValue String user, @CookieValue int age, @RequestHeader String cookie) {
		return user + "<br>" + age + "<br>" + cookie;
	}

	@RequestMapping("**/servlet")
	public String servlet(HttpServletRequest request, HttpServletResponse response, HttpSession session, InputStream in,
			OutputStream out) {
		return request + "<br>" + response + "<br>" + session + "<br>" + in + "<br>" + out;
	}
}
