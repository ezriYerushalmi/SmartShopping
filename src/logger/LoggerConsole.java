package logger;
import java.util.Date;

public class LoggerConsole implements Logger {

	public void log(Date date , String message ) {
		System.out.println("Logger: Date " +  date + "messeage: " + message);
	}
	
}
