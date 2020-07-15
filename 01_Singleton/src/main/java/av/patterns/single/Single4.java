package av.patterns.single;

/**
 * Вариант синглтона - через  поле внутреннего класса.
 * Lazy loading.
 */
public class Single4 {
    private static final class Holder {
        private static final Single4 INSTANCE = new Single4();
    }

    public static Single4 getINSTANCE() {
        return Holder.INSTANCE;
    }
}
