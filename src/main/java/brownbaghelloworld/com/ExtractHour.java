package brownbaghelloworld.com;

public class ExtractHour {
    String sValue;
    public ExtractHour(String sValue) {
        this.sValue = sValue;
    }
    public long invoke() {
        long hour;
        hour = (long) (Double.parseDouble(sValue.substring(0, sValue.length() - 1)) * 60 * 60 * 1000);
        return hour;
    }
}
