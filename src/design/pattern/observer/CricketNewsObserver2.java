package design.pattern.observer;

public class CricketNewsObserver2 implements Observer{

	String news;
	
	public String getNews() {
		System.out.println("News from CricketNewsObserver2:");
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	@Override
	public void update(String news) {
		setNews(news);
	}
}
