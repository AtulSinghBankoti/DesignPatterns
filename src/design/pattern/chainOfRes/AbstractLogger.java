package design.pattern.chainOfRes;

public abstract class AbstractLogger {
	
	private final String logLevel;
	
	AbstractLogger nextLogger;
	
	public AbstractLogger(String logLevel) {
		super();
		this.logLevel = logLevel;
	}
	

	public AbstractLogger getNextLogger() {
		return nextLogger;
	}



	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}



	void logMessage(String logLevel, String message){
		if(this.logLevel.equalsIgnoreCase(logLevel)) {
			printLog(message);
		}else {
			nextLogger.logMessage(logLevel, message);
		}
		
	}
	
	
	abstract void printLog(String message);
	
}
