package com.mustafaergan.vektorel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mustafaergan.vektorel.service.MainService;

@Controller
public class CrudController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping(path = "/veriekle")
	@ResponseBody
	public String veriekle(){
		mainService.veriEkle();
		return "basarili";
	}
	
	@RequestMapping(path="/veriekle2",  method = RequestMethod.GET)
	@ResponseBody
	public String veriekle2(@RequestParam("param") String veri){
		mainService.veriEkle(veri);
		return "basarili";
	}
	
	@RequestMapping(path="/verigetir",  method = RequestMethod.GET)
	@ResponseBody
	public String verigetir(@RequestParam("id") int id){
		return mainService.veriGetir(id);
	}

}
