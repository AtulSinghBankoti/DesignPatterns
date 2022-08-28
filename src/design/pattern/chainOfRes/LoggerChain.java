package design.pattern.chainOfRes;

public class LoggerChain {
	
	AbstractLogger getLoggerChain(){	
		ErrorLogger errorLogger = new ErrorLogger("ERROR");
		InfoLogger infoLogger = new InfoLogger("INFO");
		DebugLogger debugLogger = new DebugLogger("DEBUG");
		infoLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(errorLogger);
		return infoLogger; 
	}
}
