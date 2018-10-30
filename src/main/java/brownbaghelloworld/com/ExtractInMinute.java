package brownbaghelloworld.com;

public class ExtractInMinute {
    String sValue;
    public ExtractInMinute(String sValue) {
        this.sValue = sValue;
    }
    public long invoke() {
        long min;
        min = (long) (Double.parseDouble(sValue.substring(0, sValue.length() - 1)) * 60 * 60 * 1000);
        return min;
    }

}
