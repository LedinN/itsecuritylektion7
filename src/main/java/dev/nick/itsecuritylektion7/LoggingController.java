package dev.nick.itsecuritylektion7;

import net.minidev.json.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public int divide(int a, int b) {
        int toReturn = 0;
        try {
            toReturn = a/b;
            logger.info("Division av " + a + " / " + b + " = " + toReturn);
            return toReturn;
        } catch (ArithmeticException e) {
            logger.error(e.getMessage());
        }
        return toReturn;
    }

}
