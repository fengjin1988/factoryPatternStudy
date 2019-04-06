package factory.abstractfactory;

import factory.ICourse;
import factory.INote;
import factory.JavaCourse;
import factory.JavaNote;

public class JavaStudyFactory implements AbstractFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }
}
