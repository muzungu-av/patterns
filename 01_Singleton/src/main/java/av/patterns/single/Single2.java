package av.patterns.single;

/**
 * Вариант синглтона - создается один раз при первом обращении.
 * Lazy loading.
 */
public class Single2 {

    private volatile static Object instance;

    public static Object getINSTANCE() {
        if (instance == null) {
            synchronized (Object.class) {
                if (instance == null) {
                    instance = new Object();
                }
            }
        }
        return instance;
    }
}