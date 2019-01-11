// isComment
package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;

/**
 * isComment
 */
final class isClassOrIsInterface {

    private static final int[][] isVariable = { { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant } };

    private static final int[][] isVariable = { { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant } };

    // isComment
    private static final int[][] isVariable = { // isComment
    { -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, // isComment
    { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant } };

    // isComment
    private static final int[][] isVariable = { { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant }, { isIntegerConstant, isIntegerConstant } };

    // isComment
    // isComment
    private static final int isVariable = isIntegerConstant;

    // isComment
    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private isConstructor() {
    // isComment
    }

    // isComment
    // isComment
    // isComment
    // isComment
    static void isMethod(ByteMatrix isParameter) {
        isNameExpr.isMethod((byte) -isIntegerConstant);
    }

    // isComment
    // isComment
    static void isMethod(BitArray isParameter, ErrorCorrectionLevel isParameter, Version isParameter, int isParameter, ByteMatrix isParameter) throws WriterException {
        isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    static void isMethod(Version isParameter, ByteMatrix isParameter) throws WriterException {
        // isComment
        isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr);
    }

    // isComment
    static void isMethod(ErrorCorrectionLevel isParameter, int isParameter, ByteMatrix isParameter) throws WriterException {
        BitArray isVariable = new BitArray();
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); ++isNameExpr) {
            // isComment
            // isComment
            boolean isVariable = isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant - isNameExpr);
            // isComment
            int[] isVariable = isNameExpr[isNameExpr];
            int isVariable = isNameExpr[isIntegerConstant];
            int isVariable = isNameExpr[isIntegerConstant];
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            if (isNameExpr < isIntegerConstant) {
                // isComment
                int isVariable = isNameExpr.isMethod() - isNameExpr - isIntegerConstant;
                int isVariable = isIntegerConstant;
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            } else {
                // isComment
                int isVariable = isIntegerConstant;
                int isVariable = isNameExpr.isMethod() - isIntegerConstant + (isNameExpr - isIntegerConstant);
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        }
    }

    // isComment
    // isComment
    static void isMethod(Version isParameter, ByteMatrix isParameter) throws WriterException {
        if (isNameExpr.isMethod() < isIntegerConstant) {
            // isComment
            return;
        }
        BitArray isVariable = new BitArray();
        isMethod(isNameExpr, isNameExpr);
        // isComment
        int isVariable = isIntegerConstant * isIntegerConstant - isIntegerConstant;
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
                // isComment
                boolean isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr--;
                // isComment
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod() - isIntegerConstant + isNameExpr, isNameExpr);
                // isComment
                isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant + isNameExpr, isNameExpr, isNameExpr);
            }
        }
    }

    // isComment
    // isComment
    // isComment
    static void isMethod(BitArray isParameter, int isParameter, ByteMatrix isParameter) throws WriterException {
        int isVariable = isIntegerConstant;
        int isVariable = -isIntegerConstant;
        // isComment
        int isVariable = isNameExpr.isMethod() - isIntegerConstant;
        int isVariable = isNameExpr.isMethod() - isIntegerConstant;
        while (isNameExpr > isIntegerConstant) {
            // isComment
            if (isNameExpr == isIntegerConstant) {
                isNameExpr -= isIntegerConstant;
            }
            while (isNameExpr >= isIntegerConstant && isNameExpr < isNameExpr.isMethod()) {
                for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
                    int isVariable = isNameExpr - isNameExpr;
                    // isComment
                    if (!isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr))) {
                        continue;
                    }
                    boolean isVariable;
                    if (isNameExpr < isNameExpr.isMethod()) {
                        isNameExpr = isNameExpr.isMethod(isNameExpr);
                        ++isNameExpr;
                    } else {
                        // isComment
                        // isComment
                        isNameExpr = true;
                    }
                    // isComment
                    if (isNameExpr != -isIntegerConstant && isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr)) {
                        isNameExpr = !isNameExpr;
                    }
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
                isNameExpr += isNameExpr;
            }
            // isComment
            isNameExpr = -isNameExpr;
            isNameExpr += isNameExpr;
            // isComment
            isNameExpr -= isIntegerConstant;
        }
        // isComment
        if (isNameExpr != isNameExpr.isMethod()) {
            throw new WriterException("isStringConstant" + isNameExpr + 'isStringConstant' + isNameExpr.isMethod());
        }
    }

    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    static int isMethod(int isParameter) {
        return isIntegerConstant - isNameExpr.isMethod(isNameExpr);
    }

    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    static int isMethod(int isParameter, int isParameter) {
        if (isNameExpr == isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant");
        }
        // isComment
        // isComment
        int isVariable = isMethod(isNameExpr);
        isNameExpr <<= isNameExpr - isIntegerConstant;
        // isComment
        while (isMethod(isNameExpr) >= isNameExpr) {
            isNameExpr ^= isNameExpr << (isMethod(isNameExpr) - isNameExpr);
        }
        // isComment
        return isNameExpr;
    }

    // isComment
    // isComment
    // isComment
    static void isMethod(ErrorCorrectionLevel isParameter, int isParameter, BitArray isParameter) throws WriterException {
        if (!isNameExpr.isMethod(isNameExpr)) {
            throw new WriterException("isStringConstant");
        }
        int isVariable = (isNameExpr.isMethod() << isIntegerConstant) | isNameExpr;
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        int isVariable = isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        BitArray isVariable = new BitArray();
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod() != isIntegerConstant) {
            // isComment
            throw new WriterException("isStringConstant" + isNameExpr.isMethod());
        }
    }

    // isComment
    // isComment
    static void isMethod(Version isParameter, BitArray isParameter) throws WriterException {
        isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant);
        int isVariable = isMethod(isNameExpr.isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        if (isNameExpr.isMethod() != isIntegerConstant) {
            // isComment
            throw new WriterException("isStringConstant" + isNameExpr.isMethod());
        }
    }

    // isComment
    private static boolean isMethod(int isParameter) {
        return isNameExpr == -isIntegerConstant;
    }

    private static void isMethod(ByteMatrix isParameter) {
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod() - isIntegerConstant; ++isNameExpr) {
            int isVariable = (isNameExpr + isIntegerConstant) % isIntegerConstant;
            // isComment
            if (isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant))) {
                isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr);
            }
            // isComment
            if (isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr))) {
                isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr);
            }
        }
    }

    // isComment
    private static void isMethod(ByteMatrix isParameter) throws WriterException {
        if (isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod() - isIntegerConstant) == isIntegerConstant) {
            throw new WriterException();
        }
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod() - isIntegerConstant, isIntegerConstant);
    }

    private static void isMethod(int isParameter, int isParameter, ByteMatrix isParameter) throws WriterException {
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
            if (!isMethod(isNameExpr.isMethod(isNameExpr + isNameExpr, isNameExpr))) {
                throw new WriterException();
            }
            isNameExpr.isMethod(isNameExpr + isNameExpr, isNameExpr, isIntegerConstant);
        }
    }

    private static void isMethod(int isParameter, int isParameter, ByteMatrix isParameter) throws WriterException {
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
            if (!isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr + isNameExpr))) {
                throw new WriterException();
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr + isNameExpr, isIntegerConstant);
        }
    }

    private static void isMethod(int isParameter, int isParameter, ByteMatrix isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
            int[] isVariable = isNameExpr[isNameExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
                isNameExpr.isMethod(isNameExpr + isNameExpr, isNameExpr + isNameExpr, isNameExpr[isNameExpr]);
            }
        }
    }

    private static void isMethod(int isParameter, int isParameter, ByteMatrix isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
            int[] isVariable = isNameExpr[isNameExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
                isNameExpr.isMethod(isNameExpr + isNameExpr, isNameExpr + isNameExpr, isNameExpr[isNameExpr]);
            }
        }
    }

    // isComment
    private static void isMethod(ByteMatrix isParameter) throws WriterException {
        // isComment
        int isVariable = isNameExpr[isIntegerConstant].isFieldAccessExpr;
        // isComment
        isMethod(isIntegerConstant, isIntegerConstant, isNameExpr);
        // isComment
        isMethod(isNameExpr.isMethod() - isNameExpr, isIntegerConstant, isNameExpr);
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod() - isNameExpr, isNameExpr);
        // isComment
        int isVariable = isIntegerConstant;
        // isComment
        isMethod(isIntegerConstant, isNameExpr - isIntegerConstant, isNameExpr);
        // isComment
        isMethod(isNameExpr.isMethod() - isNameExpr, isNameExpr - isIntegerConstant, isNameExpr);
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod() - isNameExpr, isNameExpr);
        // isComment
        int isVariable = isIntegerConstant;
        // isComment
        isMethod(isNameExpr, isIntegerConstant, isNameExpr);
        // isComment
        isMethod(isNameExpr.isMethod() - isNameExpr - isIntegerConstant, isIntegerConstant, isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr.isMethod() - isNameExpr, isNameExpr);
    }

    // isComment
    private static void isMethod(Version isParameter, ByteMatrix isParameter) {
        if (isNameExpr.isMethod() < isIntegerConstant) {
            // isComment
            return;
        }
        int isVariable = isNameExpr.isMethod() - isIntegerConstant;
        int[] isVariable = isNameExpr[isNameExpr];
        for (int isVariable : isNameExpr) {
            if (isNameExpr >= isIntegerConstant) {
                for (int isVariable : isNameExpr) {
                    if (isNameExpr >= isIntegerConstant && isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr))) {
                        // isComment
                        // isComment
                        // isComment
                        isMethod(isNameExpr - isIntegerConstant, isNameExpr - isIntegerConstant, isNameExpr);
                    }
                }
            }
        }
    }
}
