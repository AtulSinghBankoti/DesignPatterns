package design.pattern.factory;

import java.util.Scanner;

import design.pattern.common.Vechile;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vechile Type...!!!");
		String vechileType = sc.next();
		
		VechileFactory vechileFactory = VechileFactory.getVechileFactory();
		Vechile vechile = vechileFactory.createVehile(vechileType);
		vechile.drive();
	}

}
