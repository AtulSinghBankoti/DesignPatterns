package design.pattern.builder.observer;

public class Client {

	public static void main(String[] args) {
		CricketNews cricketNews =  new CricketNews();
		
		CricketNewsObserver1 newsObserver1 = new CricketNewsObserver1();
		CricketNewsObserver2 newsObserver2 = new CricketNewsObserver2();
		CricketNewsObserver3 newsObserver3 = new CricketNewsObserver3();
		
		cricketNews.registerObserver(newsObserver1);
		cricketNews.registerObserver(newsObserver2);
		cricketNews.registerObserver(newsObserver3);
		
		cricketNews.publishNews("Rohit Sharma made first Triple Century in One Day Cricket!!!!");
		
		System.out.println(newsObserver1.getNews());
		System.out.println(newsObserver2.getNews());
		System.out.println(newsObserver3.getNews());
		
		cricketNews.deRegisterObserver(newsObserver2);
		
		cricketNews.publishNews("Rohit Sharma is new Captain of Indian Cricket team!!!!");
		System.out.println(newsObserver1.getNews());
		System.out.println(newsObserver2.getNews());
		System.out.println(newsObserver3.getNews());
	}

}
