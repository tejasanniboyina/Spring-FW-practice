package com.tj.di.lc.prac;

public class ChooseService {
	private Airtel service;
	
	public void setAirtel(Airtel service) {
		this.service=service;
	}
	
	public void chooseService() {
		service.service();
	}
	

}
