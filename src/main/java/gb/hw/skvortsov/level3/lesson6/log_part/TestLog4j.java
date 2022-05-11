package gb.hw.skvortsov.level3.lesson6.log_part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j {

    public static final Logger logger = LoggerFactory.getLogger(TestLog4j.class);

    public static void main(String[] args) {
        foo();
    }

    public static void foo(){
        logger.trace("!!!! trace!");
        logger.debug("!!!! debug!");
        logger.info(" !!!! info @!");
        logger.warn("!!! warn !!");
        logger.error("!!!! ERr!");
    }



    // TRACE
    // DEBUG
    // INFO
    // WARN
    // ERROR
    // FATAL
    // OFF

// внести зависимости log4j, скачать файл с конфигурацией логгеров log4j.properties


}
