package factory.factoryMethod;

import factory.ICourse;
import factory.NetCourse;

public class NetCourseFactory implements CourseFactory {
    @Override
    public ICourse create() {
        return new NetCourse();
    }
}
