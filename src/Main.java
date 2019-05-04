import factory.abstractfactory.AbstractFactory;
import factory.abstractfactory.NetStudyFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new NetStudyFactory();
        factory.createCourse().record();
        factory.createNote().write();

        // 这是一个测试类代码，测试修改记录
        System.out.println("Hello Word");
    }
}
