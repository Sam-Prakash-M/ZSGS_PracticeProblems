package com.samprakash.application;

public class LaptopList {
	
	public  static String [] ourLaptops = {"Apple","Samsung","Asus"};
     private int stage;
 	private String option, laptopName;
 	public LaptopList(int stage, String option) {
 		this.stage = stage;
 		this.option = option;
 	}

 	public int getstage() {
 		return stage;
 	}

 	public void setstage(int stage) {
 		this.stage = stage;
 	}

 	public String getOption() {
 		return option;
 	}

 	public void setOption(String option) {
 		this.option = option;
 	}

 	public String getlaptopName() {
 		return laptopName;
 	}

 	public void setlaptopName(String laptopName) {
 		this.laptopName = laptopName;
 	}
}
