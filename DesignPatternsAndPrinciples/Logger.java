package DesignPatternsAndPrinciples;
class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
    public class LoggerTest {
        public static void main(String[] args) {
            Logger logger1 = Logger.getInstance();
            logger1.log("User logging in");

            Logger logger2 = Logger.getInstance();
            logger2.log("User logged in successfully");

            System.out.println("Are both logger instances the same? " + (logger1 == logger2));
        }
    }
}
/* OUTPUT : 
Logger instance created.
Log: User logging in
Log: User logged in successfully
Are both logger instances the same? true 
*/