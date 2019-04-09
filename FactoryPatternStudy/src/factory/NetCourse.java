package factory;

public class NetCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("java course");
    }
}
