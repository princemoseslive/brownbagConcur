package brownbaghelloworld.com;

public class ExtractWeek {
    String sValue;
    public ExtractWeek(String sValue) {
        this.sValue = sValue;
    }

    public long invoke() {
        long week;
        week = (long) (Double.parseDouble(sValue.substring(0, sValue.length() - 1)) * 60 * 60 * 1000);
        return week;
    }
}
