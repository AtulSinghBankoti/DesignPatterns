package design.pattern.singleton;

public class Client {

	
	//In this program DBConnectionSingleton will be initialized only once.
	public static void main(String[] args) {
		DBConnectionSingleton ob1 = DBConnectionSingleton.getDBConnectionSingleton();
		DBConnectionSingleton ob2 = DBConnectionSingleton.getDBConnectionSingleton();
	}

}
