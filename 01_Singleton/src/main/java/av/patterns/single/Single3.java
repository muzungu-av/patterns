package av.patterns.single;

/**
 * Вариант синглтона - создается при загрузке класса.
 * Eager loading.
 */
public class Single3 {
    private static final Single3 INSTANCE = new Single3();

    public static Single3 getINSTANCE() {
        return INSTANCE;
    }
}
