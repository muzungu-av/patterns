package av.patterns.single;

/**
 * Вариант синглтона - создается один раз при первом обращении.
 * Lazy loading.
 */
public class Single2 {

    private volatile static Single2 instance;

    public static Single2 getINSTANCE() {
        if (instance == null) {
            synchronized (Single2.class) {
                if (instance == null) {
                    instance = new Single2();
                }
            }
        }
        return instance;
    }
}