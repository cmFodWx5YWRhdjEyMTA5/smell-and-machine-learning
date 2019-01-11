// isComment
package ws.wamp.jawampa.connection;

public interface isClassOrIsInterface<T> extends IWampConnectionFuture<T> {

    void isMethod(T isParameter);

    void isMethod(Throwable isParameter);

    boolean isMethod();

    Throwable isMethod();

    /**
     * isComment
     */
    public static final IWampConnectionPromise<Void> isVariable = new IWampConnectionPromise<Void>() {

        @Override
        public Void isMethod() {
            return null;
        }

        @Override
        public Object isMethod() {
            return null;
        }

        @Override
        public void isMethod(Void isParameter) {
        }

        @Override
        public void isMethod(Throwable isParameter) {
        }

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public Throwable isMethod() {
            return null;
        }
    };
}
