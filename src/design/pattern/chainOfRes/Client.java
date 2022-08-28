package design.pattern.chainOfRes;

public class Client {

	public static void main(String[] args) {
		String message ="Hello World!!!";
		LoggerChain loggerChain = new LoggerChain();
		AbstractLogger logger = loggerChain.getLoggerChain();
		logger.logMessage("DEBUG", message);
		logger.logMessage("INFO", message);
		logger.logMessage("ERROR", message);
	}

}
