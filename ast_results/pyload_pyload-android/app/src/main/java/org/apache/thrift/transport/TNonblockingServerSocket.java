// isComment
package org.apache.thrift.transport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * isComment
 */
public class isClassOrIsInterface extends TNonblockingServerTransport {

    private static final Logger isVariable = isNameExpr.isMethod(TNonblockingServerTransport.class.isMethod());

    /**
     * isComment
     */
    private ServerSocketChannel isVariable = null;

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
            isNameExpr = isNameExpr.isMethod();
            isNameExpr.isMethod(true);
            // isComment
            isNameExpr = isNameExpr.isMethod();
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
                isNameExpr.isMethod();
            }
        }
    }

    protected TNonblockingSocket isMethod() throws TTransportException {
        if (isNameExpr == null) {
            throw new TTransportException(isNameExpr.isFieldAccessExpr, "isStringConstant");
        }
        try {
            SocketChannel isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                return null;
            }
            TNonblockingSocket isVariable = new TNonblockingSocket(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            return isNameExpr;
        } catch (IOException isParameter) {
            throw new TTransportException(isNameExpr);
        }
    }

    public void isMethod(Selector isParameter) {
        try {
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (ClosedChannelException isParameter) {
        // isComment
        // isComment
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            try {
                isNameExpr.isMethod();
            } catch (IOException isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
            }
            isNameExpr = null;
        }
    }

    public void isMethod() {
        // isComment
        // isComment
        isMethod();
    }
}
