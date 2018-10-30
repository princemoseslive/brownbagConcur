package brownbaghelloworld.com;

public class ExtractDay {
    String sValue;
    public ExtractDay(String sValue) {
        this.sValue = sValue;
    }
    public long invoke() {
        long day;
        day = (long) (Double.parseDouble(sValue.substring(0, sValue.length() - 1)) * 60 * 60 * 1000);
        return day;
    }
}
