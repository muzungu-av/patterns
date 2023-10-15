package singleton;

/**
 * Вариант синглтона - через перечисления/enum.
 * Eager loading
 */
public enum Single1 {

    INSTANCE;

    private Object object;

    Single1() {
        object = new Object();
    }

    public Object getObject() {
        return object;
    }
}