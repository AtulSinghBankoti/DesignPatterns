package design.pattern.abstractFactory;

import design.pattern.common.Bike;
import design.pattern.common.Bus;
import design.pattern.common.Car;
import design.pattern.common.Vechile;
import design.pattern.enums.VechileType;

public class IndiaVechileFactory implements AbstractVechileFactoy{

	@Override
	public Vechile createVechile(String type) {
		System.out.println("Crating Vechile with IndiaVechileFactory...");
		Vechile vechile = null;
		if(VechileType.BIKE.toString().equalsIgnoreCase(type)) {
			vechile = new Bike();
		}else if(VechileType.CAR.toString().equalsIgnoreCase(type)){
			vechile = new Car();
		}else if(VechileType.BUS.toString().equalsIgnoreCase(type)) {
			vechile = new Bus();
		}else {
			throw new RuntimeException("Vechile Type Not available....!!!");
		}	
		
		return vechile;
	}

}
