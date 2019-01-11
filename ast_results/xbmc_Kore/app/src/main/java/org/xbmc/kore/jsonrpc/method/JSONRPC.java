// isComment
package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

public class isClassOrIsInterface {

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ApiMethod<String> {

        public static final String isVariable = "isStringConstant";

        /**
         * isComment
         */
        public isConstructor() {
            super();
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public String isMethod(ObjectNode isParameter) throws ApiException {
            return isNameExpr.isMethod(isNameExpr).isMethod();
        }
    }
}
