package factory.factoryMethod;

import factory.ICourse;
import factory.JavaCourse;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
