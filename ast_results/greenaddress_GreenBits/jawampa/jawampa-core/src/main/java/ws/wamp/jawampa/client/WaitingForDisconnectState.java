// isComment
package ws.wamp.jawampa.client;

import ws.wamp.jawampa.WampClient;
import ws.wamp.jawampa.connection.ICompletionCallback;
import ws.wamp.jawampa.connection.IWampConnectionFuture;
import ws.wamp.jawampa.connection.WampConnectionPromise;

/**
 * isComment
 */
public class isClassOrIsInterface implements ClientState, ICompletionCallback<Void> {

    private final StateController isVariable;

    private int isVariable;

    WampConnectionPromise<Void> isVariable = new WampConnectionPromise<Void>(this, null);

    public isConstructor(StateController isParameter, int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(ClientState isParameter) {
    }

    @Override
    public void isMethod(ClientState isParameter) {
    }

    @Override
    public void isMethod() {
        if (isNameExpr != isIntegerConstant) {
            // isComment
            isNameExpr = isIntegerConstant;
            isNameExpr.isMethod(new WampClient.DisconnectedState(null));
        }
    }

    /**
     * isComment
     */
    public WampConnectionPromise<Void> isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(IWampConnectionFuture<Void> isParameter) {
        // isComment
        if (isNameExpr == isIntegerConstant) {
            DisconnectedState isVariable = new DisconnectedState(isNameExpr, null);
            isNameExpr.isMethod(isNameExpr);
        } else {
            WaitingForReconnectState isVariable = new WaitingForReconnectState(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
