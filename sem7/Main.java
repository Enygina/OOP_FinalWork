package sem7;

public class Main {
    public static void main(String[] args) {
        App innerApp = new AppBuilder(null).build();
        innerApp.write();
    }
}
