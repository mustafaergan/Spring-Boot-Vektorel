package com.mustafaergan.vektorel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mustafaergan.vektorel.service.MainService;
import com.mustafaergan.vektorel.service.MatematikService;
import com.mustafaergan.vektorel.service.StringService;

@Controller
@Scope("request")
public class HelloController {
	
	@Autowired
	MainService mainService;
	
	@Autowired
	StringService stringService;
	
	@Autowired
	MatematikService matematikService;
	
	
	@GetMapping(path = "/hello")
	@ResponseBody
	public String hello(){
		int sonuc =mainService.topla(10, 15);
		return "hello world"+ mainService;
	}
	
	
	@GetMapping(path = "/topla")
	@ResponseBody
	public String topla(){
		int sonuc = mainService.topla(10, 15);
		return "toplam sonucu="+mainService;
	}
	
	@GetMapping(path = "/bol")
	@ResponseBody
	public String bol(){
		String sonuc = stringService.bol("benimverim", 5);
		return sonuc;
	}
	
	
	@RequestMapping(path="/bol/{param}",  method = RequestMethod.GET)
	@ResponseBody
	public String bol(@RequestParam("param")String veri){
		String sonuc = stringService.bol("benimverim", 5);
		return sonuc;
	}
	

}
