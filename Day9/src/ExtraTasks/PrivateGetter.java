package ExtraTasks;

import java.lang.reflect.Field;

public class PrivateGetter {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateClass privateClass = new PrivateClass("Азат", 19);
        Field field1 = PrivateClass.class.getDeclaredField("name");
        Field field2 = PrivateClass.class.getDeclaredField("age");

        field1.setAccessible(true);
        field2.setAccessible(true);

        System.out.println(field1.get(privateClass));
        System.out.println(field2.get(privateClass));
    }
}
