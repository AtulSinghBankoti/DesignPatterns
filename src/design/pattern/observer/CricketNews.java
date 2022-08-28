package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;


public class CricketNews implements Subject{
	
	
	String news;

	List<Observer> observerList = new ArrayList<>();
	
	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void deRegisterObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyAllObserver() {
		observerList.stream().forEach(observer -> observer.update(news));
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}
	
	public void publishNews(String news) {
		setNews(news);
		notifyAllObserver();
	}
	
	public void publishNews() {
		notifyAllObserver();
		
	}
}
