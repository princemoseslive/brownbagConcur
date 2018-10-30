package brownbaghelloworld.com;

public class ExtractMillisecond {
    String sValue;

    public ExtractMillisecond(String sValue) {
        this.sValue = sValue;
    }
    public long invoke() {
        long millis;
        millis = (long) (Double.parseDouble(sValue.substring(0, sValue.length() - 1)) * 60 * 60 * 1000);
        return millis;
    }
}
