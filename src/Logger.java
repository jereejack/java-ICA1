public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logInformation(String message){
    }

    public void logDebugInformation(String message){
    }

    public void logErrorMessage(String message){
    }


    public String logFormatting(String message){
        return message;
    }


}
