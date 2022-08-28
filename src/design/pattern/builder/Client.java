package design.pattern.builder;

import design.pattern.builder.GenericVechile.GenericVechileBuilder;

public class Client {

	public static void main(String[] args) {
		GenericVechileBuilder builder =  new GenericVechile.GenericVechileBuilder("Tiago", "Manual", 3L, 140L, 2L);
	 	GenericVechile vechile = builder.setCrashSensor(true).setCrashSensor(true).build();
	 	System.out.println("Vechile Info:");
	 	System.out.println(vechile);
	}

}
