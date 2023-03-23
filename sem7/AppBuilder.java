package sem7;

import java.util.Objects;

public class AppBuilder {
    IInterface printer;
    public AppBuilder(IInterface printer) {
        setPrinter(printer);
    }

    public AppBuilder setPrinter(IInterface printer) {
        this.printer = Objects.requireNonNullElseGet(printer, () -> new DefaultPrinter());
        return this;
    }

    public App build(){
        return new App(printer);
    }
}