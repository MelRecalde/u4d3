package Es2;

public class Call {
    private String calledNumber;
    private int duration;

    public Call(String calledNum, int duration) {
        this.calledNumber = calledNum;
        this.duration = duration;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public int getDuration() {
        return duration;
    }
}
