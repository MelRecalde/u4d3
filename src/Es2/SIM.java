package Es2;

public class SIM {
    public String number;
    private double credit;
    private Call[] callList;

    public SIM(String number) {
        this.number = number;
        this.credit = 0;
        this.callList = new Call[5];
    }

    public void setCallList(Call[] callList) {
        this.callList = callList;
    }

    public void printData() {
        System.out.println("SIM: " + this.number);
        System.out.println("Credit available: " + this.credit);

        if (callList[0] != null) {
            System.out.println(" Call 1: " + callList[0].getCalledNumber()
                    + " Duration : " + callList[0].getDuration());
        }
        if (callList[1] != null) {
            System.out.println(" Call 2: " + callList[1].getCalledNumber()
                    + " Duration : " + callList[1].getDuration());
        }
        if (callList[2] != null) {
            System.out.println(" Call 3: " + callList[2].getCalledNumber()
                    + " Duration : " + callList[2].getDuration());
        }
        if (callList[3] != null) {
            System.out.println(" Call 4: " + callList[3].getCalledNumber()
                    + " Duration : " + callList[3].getDuration());
        }
        if (callList[4] != null) {
            System.out.println(" Call 5: " + callList[4].getCalledNumber()
                    + " Duration : " + callList[4].getDuration());
        }
    }
}
