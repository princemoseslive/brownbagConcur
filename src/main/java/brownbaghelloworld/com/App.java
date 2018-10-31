package brownbaghelloworld.com;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    	LOGGER.info( Level.INFO+"Hello World!" );
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
            LOGGER.log(Level.FINER, "Number format exception");
        }

        return 0;
    }


}
