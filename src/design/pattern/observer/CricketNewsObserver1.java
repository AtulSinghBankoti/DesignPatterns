package design.pattern.observer;

public class CricketNewsObserver1 implements Observer{

	String news;
		
	public String getNews() {
		System.out.println("News from CricketNewsObserver1:");
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
