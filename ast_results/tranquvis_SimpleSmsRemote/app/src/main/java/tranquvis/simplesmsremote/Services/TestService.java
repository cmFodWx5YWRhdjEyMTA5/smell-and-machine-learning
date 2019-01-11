// isComment
package tranquvis.simplesmsremote.Services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class isClassOrIsInterface extends Service {

    private final IBinder isVariable = new LocalBinder();

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public class isClassOrIsInterface extends Binder {

        public TestService isMethod() {
            // isComment
            return isNameExpr.this;
        }
    }
}
