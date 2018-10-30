package brownbaghelloworld.com;

public class ExtractSecond {
    String sValue;
    public ExtractSecond(String sValue) {
        this.sValue = sValue;
    }

    public long invoke() {
        long sec;
        sec = (long) (Double.parseDouble(sValue.substring(0, sValue.length() - 1)) * 60 * 60 * 1000);
        return sec;
    }
}
