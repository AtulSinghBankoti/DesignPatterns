package design.pattern.abstractFactory;

import java.util.Scanner;

import design.pattern.common.Vechile;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vechile type...");
		String vechileType = sc.next();
		
		VechileFactoryy vechileFactoryy = VechileFactoryy.getVechileFactory();
		
		Vechile vechile = vechileFactoryy.createVehile(vechileType);
		vechile.drive();

	}

}
