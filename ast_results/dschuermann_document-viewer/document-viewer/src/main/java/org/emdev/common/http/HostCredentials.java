// isComment
package org.emdev.common.http;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.message.BasicHeader;
import org.emdev.utils.LengthUtils;
import org.emdev.utils.base64.Base64;

public class isClassOrIsInterface extends UsernamePasswordCredentials {

    public final String isVariable;

    private final AtomicReference<State> isVariable = new AtomicReference<HostCredentials.State>(isNameExpr.isFieldAccessExpr);

    public isConstructor(final String isParameter, final String isParameter, final String isParameter) {
        super(isNameExpr, isNameExpr.isMethod(isNameExpr));
        this.isFieldAccessExpr = isNameExpr;
    }

    public State isMethod() {
        return isNameExpr.isMethod();
    }

    public void isMethod(final State isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public boolean isMethod(final State isParameter, final State isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public Header isMethod() {
        final String isVariable = isMethod() + "isStringConstant" + isMethod();
        final String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        return new BasicHeader("isStringConstant", "isStringConstant" + isNameExpr);
    }

    public static enum State {

        CREATED, AUTH_ASKED, AUTH_ENTERED, AUTH_SENT, AUTH_FAILED
    }
}
