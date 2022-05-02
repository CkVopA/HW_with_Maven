package gb.hw.skvortsov.level3.lesson6.log_part;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class TestLog {

    public static final Logger logger = Logger.getLogger("testLog");
    // название логгера "testLog" всегда должно совпадать с названием класса или пакета, для которого он создаётся

    public static void main(String[] args) throws IOException {

        // OFF
        // SEVERE
        // WARNING
        // INFO
        //- - - - - -
        // CONFIG
        // FINE(3)
        // ALL

        logger.setLevel(Level.ALL);
        Handler handler = new FileHandler("src/level3/lesson3p6/loggerFile.log");
       // handler.setFormatter(new SimpleFormatter());
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("%s\t%s\t%s\n", record.getLevel(), new Date(record.getMillis()), record.getMessage());
            }
        });
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);

        logger.log(Level.SEVERE, "Логирование S");
        logger.finer("Логирование F");
        logger.info("Логирование I");
        logger.config("Логирование C");
        logger.warning("Логирование W");

    }
}
