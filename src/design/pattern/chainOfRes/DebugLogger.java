package design.pattern.chainOfRes;

public class DebugLogger extends AbstractLogger {
	public DebugLogger(String logLevel){
		super(logLevel);
	}
	
	@Override
	void printLog(String message) {
		System.out.println("::Logger:Debug::"+message);
	}
}
