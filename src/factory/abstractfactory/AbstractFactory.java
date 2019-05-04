package factory.abstractfactory;

import factory.ICourse;
import factory.INote;

public interface AbstractFactory {
    ICourse createCourse();

    INote createNote();
}
