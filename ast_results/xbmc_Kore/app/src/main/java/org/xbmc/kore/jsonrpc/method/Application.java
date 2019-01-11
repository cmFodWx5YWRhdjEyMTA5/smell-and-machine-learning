// isComment
package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.jsonrpc.type.ApplicationType;
import org.xbmc.kore.utils.JsonUtils;

/**
 * isComment
 */
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

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ApiMethod<Integer> {

        public static final String isVariable = "isStringConstant";

        /**
         * isComment
         */
        public isConstructor(String isParameter) {
            super();
            isMethod("isStringConstant", isNameExpr);
        }

        /**
         * isComment
         */
        public isConstructor(int isParameter) {
            super();
            isMethod("isStringConstant", isNameExpr);
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public Integer isMethod(ObjectNode isParameter) throws ApiException {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ApiMethod<Boolean> {

        public static final String isVariable = "isStringConstant";

        /**
         * isComment
         */
        public isConstructor() {
            super();
            isMethod("isStringConstant", "isStringConstant");
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public Boolean isMethod(ObjectNode isParameter) throws ApiException {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    /**
     * isComment
     */
    public static class isClassOrIsInterface extends ApiMethod<ApplicationType.PropertyValue> {

        public static final String isVariable = "isStringConstant";

        /**
         * isComment
         */
        public static final String isVariable = "isStringConstant";

        public static final String isVariable = "isStringConstant";

        public static final String isVariable = "isStringConstant";

        public static final String isVariable = "isStringConstant";

        /**
         * isComment
         */
        public isConstructor(String... isParameter) {
            super();
            isMethod("isStringConstant", isNameExpr);
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public ApplicationType.PropertyValue isMethod(ObjectNode isParameter) throws ApiException {
            return new ApplicationType.PropertyValue(isNameExpr.isMethod(isNameExpr));
        }
    }
}
