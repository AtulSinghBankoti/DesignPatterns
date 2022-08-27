package design.pattern.singleton;

public class DBConnectionSingleton {
	
	private DBConnectionSingleton() {
		System.out.println("Initializing Singleton Oblect....");
	}
	
	private static DBConnectionSingleton dbConnectionSingleton;
	
	
	public static synchronized DBConnectionSingleton  getDBConnectionSingleton(){
		
		if(dbConnectionSingleton == null) {
			dbConnectionSingleton = new DBConnectionSingleton();
		}
		return dbConnectionSingleton;
	}
	

}
