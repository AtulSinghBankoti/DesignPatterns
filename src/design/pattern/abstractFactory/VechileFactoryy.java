package design.pattern.abstractFactory;

import java.util.ArrayList;
import java.util.List;

import design.pattern.common.Bike;
import design.pattern.common.Bus;
import design.pattern.common.Car;
import design.pattern.common.Vechile;
import design.pattern.enums.VechileType;
import design.pattern.factory.VechileFactory;

public class VechileFactoryy {
	
	private List<String> locationList = new ArrayList<>();
	
	{
		
		locationList.add("India");
		locationList.add("Usa");
		locationList.add("China");
		
	}
	
	private VechileFactoryy(){
		System.out.println("Initializing Vechile Factory...");
	}
	
	static private VechileFactoryy vechileFactoryy;
	
	public static VechileFactoryy getVechileFactory(){
		if(vechileFactoryy == null) {
			vechileFactoryy =  new VechileFactoryy();
		}
		
		return vechileFactoryy;
	}
	
	
	Vechile createVehile(String vchileType){
		
		AbstractVechileFactoy abstractVechileFactoy = null;
		Vechile vechile = null;
		
		
		String location= locationList.stream().findAny().get();
		
		if(location.equalsIgnoreCase("india")) {
			abstractVechileFactoy= new IndiaVechileFactory();
		}else if(location.equalsIgnoreCase("china")) {
			abstractVechileFactoy= new ChinaVechileFactory(); 
		}else if(location.equalsIgnoreCase("usa")) {
			abstractVechileFactoy= new USAVechileFactory();
		}else{
			throw new RuntimeException("Factory Not Availble...!!!");
		}
		
		vechile= abstractVechileFactoy.createVechile(vchileType);
		return vechile;
	}
	

}
