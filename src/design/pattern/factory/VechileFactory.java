package design.pattern.factory;

import design.pattern.common.Bike;
import design.pattern.common.Bus;
import design.pattern.common.Car;
import design.pattern.common.Vechile;
import design.pattern.enums.VechileType;

public class VechileFactory {
	
	private VechileFactory(){
		System.out.println("Initializing Vechile Factory...");
	}
	
	static private VechileFactory vechileFactory;
	
	public static VechileFactory getVechileFactory(){
		if(vechileFactory == null) {
			vechileFactory =  new VechileFactory();
		}
		
		return vechileFactory;
	}
	
	
	Vechile createVehile(String vchileType){
		Vechile vechile = null;
		
		if(VechileType.BIKE.toString().equalsIgnoreCase(vchileType)) {
			vechile = new Bike();
		}else if(VechileType.CAR.toString().equalsIgnoreCase(vchileType)){
			vechile = new Car();
		}else if(VechileType.BUS.toString().equalsIgnoreCase(vchileType)) {
			vechile = new Bus();
		}else {
			throw new RuntimeException("Vechile Type Not available....!!!");
		}	
		
		return vechile;
	}
	
	
}
