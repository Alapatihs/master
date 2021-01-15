package utility;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	private static Logger logger=Logger.getLogger("mylog");
	
	
	static 
	{
		 try {
			FileHandler fh=new FileHandler("../Logger.log");
			logger.addHandler(fh);
			SimpleFormatter formatter=new SimpleFormatter();
			fh.setFormatter(formatter);
			logger.info("Logger Initialized");
		} catch (Exception e) {
			logger.log(Level.WARNING,"Exception: "+e);
		}
	}

	public static void loggerinfo(String message)
	{
		logger.info(message);
	}
	
	public static void loggerinfo(String message,Exception e)
	{
		logger.log(Level.WARNING,message,e);
	}
 
}
