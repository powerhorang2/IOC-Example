package com.example.ioc.encode;

public class Encoder {
	
	private IEncoder iEncoder;
	
	public Encoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}
	
	public void setIEncoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}
	
	public String encode(String message) {
		return iEncoder.encode(message);
	}
}
