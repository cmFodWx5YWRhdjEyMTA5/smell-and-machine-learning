// isComment
package com.btchip.utils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class isClassOrIsInterface {

    static class isClassOrIsInterface implements Future<byte[]> {

        private byte[] isVariable;

        public isConstructor(byte[] isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public boolean isMethod(boolean isParameter) {
            return true;
        }

        @Override
        public byte[] isMethod() throws InterruptedException, ExecutionException {
            return isNameExpr;
        }

        @Override
        public byte[] isMethod(long isParameter, TimeUnit isParameter) throws InterruptedException, ExecutionException, TimeoutException {
            return isNameExpr;
        }

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public boolean isMethod() {
            return true;
        }
    }

    public static Future<byte[]> isMethod(byte[] isParameter) {
        return new DummyFuture(isNameExpr);
    }
}
