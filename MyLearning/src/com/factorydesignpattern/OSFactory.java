package com.factorydesignpattern;

public class OSFactory {

	public OS getOS(String osType){
		
		if(osType.equals("android")){
			
			return new Android();
		}
		else if(osType.equals("windows")){
			
			return new Windows();
		
		}
		
		return null;
	}
	
	
}
