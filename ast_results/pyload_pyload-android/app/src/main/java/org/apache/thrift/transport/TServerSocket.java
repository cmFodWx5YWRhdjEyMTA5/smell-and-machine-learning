// isComment
package org.apache.thrift.transport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * isComment
 */
public class isClassOrIsInterface extends TServerTransport {

    private static final Logger isVariable = isNameExpr.isMethod(TServerSocket.class.isMethod());

    /**
     * isComment
     */
    private ServerSocket isVariable = null;

    /**
     * isComment
     */
    private int isVariable = isIntegerConstant;

    /**
     * isComment
     */
    public isConstructor(ServerSocket isParameter) {
        this(isNameExpr, isIntegerConstant);
    }

    /**
     * isComment
     */
    public isConstructor(ServerSocket isParameter, int isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(int isParameter) throws TTransportException {
        this(isNameExpr, isIntegerConstant);
    }

    /**
     * isComment
     */
    public isConstructor(int isParameter, int isParameter) throws TTransportException {
        this(new InetSocketAddress(isNameExpr), isNameExpr);
    }

    public isConstructor(InetSocketAddress isParameter) throws TTransportException {
        this(isNameExpr, isIntegerConstant);
    }

    public isConstructor(InetSocketAddress isParameter, int isParameter) throws TTransportException {
        isNameExpr = isNameExpr;
        try {
            // isComment
            isNameExpr = new ServerSocket();
            // isComment
            isNameExpr.isMethod(true);
            // isComment
            isNameExpr.isMethod(isNameExpr);
        } catch (IOException isParameter) {
            isNameExpr = null;
            throw new TTransportException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        }
    }

    public void isMethod() throws TTransportException {
        // isComment
        if (isNameExpr != null) {
            try {
                isNameExpr.isMethod(isIntegerConstant);
            } catch (SocketException isParameter) {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
        }
    }

    protected TSocket isMethod() throws TTransportException {
        if (isNameExpr == null) {
            throw new TTransportException(isNameExpr.isFieldAccessExpr, "isStringConstant");
        }
        try {
            Socket isVariable = isNameExpr.isMethod();
            TSocket isVariable = new TSocket(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            return isNameExpr;
        } catch (IOException isParameter) {
            throw new TTransportException(isNameExpr);
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            try {
                isNameExpr.isMethod();
            } catch (IOException isParameter) {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
            isNameExpr = null;
        }
    }

    public void isMethod() {
        // isComment
        // isComment
        isMethod();
    }

    public ServerSocket isMethod() {
        return isNameExpr;
    }
}
