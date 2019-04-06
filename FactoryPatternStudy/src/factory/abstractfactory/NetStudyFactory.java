package factory.abstractfactory;

import factory.ICourse;
import factory.INote;
import factory.NetCourse;
import factory.NetNote;

public class NetStudyFactory implements AbstractFactory {
    @Override
    public ICourse createCourse() {
        return new NetCourse();
    }

    @Override
    public INote createNote() {
        return new NetNote();
    }
}
