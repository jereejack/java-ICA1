import java.util.ArrayList;
import java.util.List;

public class Protocol {

    private List<Logger> loggers;

    public Protocol() {
        this.loggers = new ArrayList<>();
    }

    public void registerLogger(Logger logger) {
        loggers.add(logger);
    }
}
