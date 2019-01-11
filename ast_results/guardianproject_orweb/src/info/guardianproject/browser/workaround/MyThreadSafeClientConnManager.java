// isComment
package info.guardianproject.browser.workaround;

import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

public class isClassOrIsInterface extends ThreadSafeClientConnManager {

    public isConstructor(HttpParams isParameter, SchemeRegistry isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected ClientConnectionOperator isMethod(SchemeRegistry isParameter) {
        return new MyDefaultClientConnectionOperator(isNameExpr);
    }
}
