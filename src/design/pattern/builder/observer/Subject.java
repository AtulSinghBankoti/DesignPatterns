package design.pattern.builder.observer;

public interface Subject {
	
	void registerObserver(Observer observer);
	void deRegisterObserver(Observer observer);
	void notifyAllObserver();

}
