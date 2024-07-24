package Es2;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM("3333333333");


        Call[] calls = new Call[5];
        calls[0] = new Call("11111111111", 3);
        calls[0] = new Call("22222222222", 30);
        calls[0] = new Call("00000000000", 20);
        calls[0] = new Call("44444444444", 2);
        calls[0] = new Call("88888888888", 25);

        sim.setCallList(calls);
        sim.printData();
    }
}
