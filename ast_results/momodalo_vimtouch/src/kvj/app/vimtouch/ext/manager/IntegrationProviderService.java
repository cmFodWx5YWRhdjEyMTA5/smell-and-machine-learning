// isComment
package kvj.app.vimtouch.ext.manager;

import net.momodalo.app.vimtouch.Exec;
import org.kvj.vimtouch.IntegrationProvider;
import org.kvj.vimtouch.TransferableData;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class isClassOrIsInterface extends Service {

    class isClassOrIsInterface extends IntegrationProvider.Stub {

        @Override
        public void isMethod(int isParameter, TransferableData isParameter) throws RemoteException {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }

        @Override
        public int isMethod() throws RemoteException {
            return isNameExpr.isMethod(isNameExpr.this).isMethod();
        }
    }

    private IntegrationProviderImpl isVariable = null;

    public isConstructor() {
        isNameExpr = new IntegrationProviderImpl();
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr;
    }
}
