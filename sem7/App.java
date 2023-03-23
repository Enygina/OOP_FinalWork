package sem7;

public class App {
    IInterface v;

    public App(IInterface v) {
        this.v = v;
    }

    public void write() {
        v.print();
    }
}