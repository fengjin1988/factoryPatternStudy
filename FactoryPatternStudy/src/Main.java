import factory.abstractfactory.AbstractFactory;
import factory.abstractfactory.NetStudyFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new NetStudyFactory();
        factory.createCourse().record();
        factory.createNote().write();
    }
}
