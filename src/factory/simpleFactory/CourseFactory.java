package factory.simpleFactory;

import factory.ICourse;

public class CourseFactory {
    public static ICourse create(Class<? extends ICourse> clazz) {
        if (null != clazz) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
