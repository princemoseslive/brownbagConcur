package brownbaghelloworld.com;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static long parseTimeValue(String sValue) {

        if (sValue == null) {
            return 0;
        }

        try {
            long millis;
            if (sValue.endsWith("S")) {
                millis = new ExtractSecond(sValue).invoke();
            } else if (sValue.endsWith("ms")) {
                millis = new ExtractMillisecond(sValue).invoke();
            } else if (sValue.endsWith("s")) {
                millis = new ExtractInSecond(sValue).invoke();
            } else if (sValue.endsWith("m")) {
                millis = new ExtractInMinute(sValue).invoke();
            } else if (sValue.endsWith("H") || sValue.endsWith("h")) {
                millis = new ExtractHour(sValue).invoke();
            } else if (sValue.endsWith("d")) {
                millis = new ExtractDay(sValue).invoke();
            } else if (sValue.endsWith("w")) {
                millis = new ExtractWeek(sValue).invoke();
            } else {
                millis = Long.parseLong(sValue);
            }

            return millis;

        } catch (NumberFormatException e) {
            LOGGER.log(Level.INFO, "Number format exception");
        }

        return 0;
    }


}
