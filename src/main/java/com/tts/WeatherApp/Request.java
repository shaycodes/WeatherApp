package com.tts.WeatherApp;

import lombok.Data;

@Data
public class Request {
	public String zipCode;
    
    public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

    
}