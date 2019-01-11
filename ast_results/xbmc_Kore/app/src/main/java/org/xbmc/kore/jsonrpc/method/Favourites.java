// isComment
package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiList;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.jsonrpc.type.FavouriteType;
import org.xbmc.kore.jsonrpc.type.ListType;
import java.util.ArrayList;
import java.util.Collections;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    public static class isClassOrIsInterface extends ApiMethod<ApiList<FavouriteType.DetailsFavourite>> {

        public static final String isVariable = "isStringConstant";

        private static final String isVariable = "isStringConstant";

        /**
         * isComment
         */
        public isConstructor() {
            isMethod("isStringConstant", new String[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr });
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public ApiList<FavouriteType.DetailsFavourite> isMethod(ObjectNode isParameter) throws ApiException {
            ListType.LimitsReturned isVariable = new ListType.LimitsReturned(isNameExpr);
            JsonNode isVariable = isNameExpr.isMethod(isNameExpr);
            ArrayNode isVariable = isNameExpr.isMethod(isNameExpr) && !isNameExpr.isMethod(isNameExpr).isMethod() ? (ArrayNode) isNameExpr.isMethod(isNameExpr) : null;
            if (isNameExpr == null) {
                return new ApiList<>(isNameExpr.<FavouriteType.DetailsFavourite>isMethod(), isNameExpr);
            }
            ArrayList<FavouriteType.DetailsFavourite> isVariable = new ArrayList<>(isNameExpr.isMethod());
            for (JsonNode isVariable : isNameExpr) {
                isNameExpr.isMethod(new FavouriteType.DetailsFavourite(isNameExpr));
            }
            return new ApiList<>(isNameExpr, isNameExpr);
        }
    }
}
