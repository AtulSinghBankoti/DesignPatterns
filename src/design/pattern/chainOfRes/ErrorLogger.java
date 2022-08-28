package design.pattern.chainOfRes;

public class ErrorLogger extends AbstractLogger{

 	public ErrorLogger(String logLevel){
		super(logLevel);
	}
	
	@Override
	void printLog(String message) {
		System.out.println("::Logger:Error::"+message);
	}

}
