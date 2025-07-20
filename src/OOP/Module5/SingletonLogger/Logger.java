package OOP.Module5.SingletonLogger;

public class Logger {
    private static volatile Logger logger;
    private StringBuilder errors;

    private Logger() {
        errors = new StringBuilder();
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void putError(String error) {
        errors.insert(0, error + " ");
    }

    public String getErrors() {
        return errors.toString().trim();
    }
}

