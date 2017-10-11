package com.mustafaergan.vektorel.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {
	
	public String bol(String veri, int bolum){
		return veri.substring(0, bolum);
	}
	

}
