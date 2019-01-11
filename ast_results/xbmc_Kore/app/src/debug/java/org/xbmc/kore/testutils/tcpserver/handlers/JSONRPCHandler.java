// isComment
package org.xbmc.kore.testutils.tcpserver.handlers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.method.JSONRPC;
import org.xbmc.kore.testutils.tcpserver.handlers.jsonrpc.JsonResponse;
import org.xbmc.kore.testutils.tcpserver.handlers.jsonrpc.response.methods.JSONRPC.Ping;
import java.util.ArrayList;

/**
 * isComment
 */
public class isClassOrIsInterface implements JSONConnectionHandlerManager.ConnectionHandler {

    @Override
    public String[] isMethod() {
        return new String[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr };
    }

    @Override
    public ArrayList<JsonResponse> isMethod(String isParameter, ObjectNode isParameter) {
        ArrayList<JsonResponse> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new Ping(isNameExpr.isMethod("isStringConstant").isMethod()));
        return isNameExpr;
    }

    @Override
    public ArrayList<JsonResponse> isMethod() {
        return null;
    }

    @Override
    public void isMethod() {
    }
}
