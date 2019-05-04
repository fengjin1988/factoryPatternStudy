package factory;

public class NetNote implements INote {
    @Override
    public void write() {
        System.out.println("net note");
    }
}
