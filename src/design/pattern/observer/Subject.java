package design.pattern.observer;

public interface Subject {
	
	void registerObserver(Observer observer);
	void deRegisterObserver(Observer observer);
	void notifyAllObserver();

}
