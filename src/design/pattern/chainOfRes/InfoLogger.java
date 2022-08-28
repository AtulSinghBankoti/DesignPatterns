package design.pattern.chainOfRes;

public class InfoLogger  extends AbstractLogger {

	public InfoLogger(String logLevel){
		super(logLevel);
	}
	
	@Override
	void printLog(String message) {
		System.out.println("::Logger:Info::"+message);
	}
	
}
