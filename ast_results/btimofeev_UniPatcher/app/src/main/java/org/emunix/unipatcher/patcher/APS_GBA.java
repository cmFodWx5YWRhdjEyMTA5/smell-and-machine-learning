// isComment
package org.emunix.unipatcher.patcher;

import android.content.Context;
import org.apache.commons.io.IOUtils;
import org.emunix.unipatcher.R;
import org.emunix.unipatcher.Utils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class isClassOrIsInterface extends Patcher {

    // isComment
    private static final byte[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    private static final int isVariable = isIntegerConstant;

    private static final int[] isVariable = { // isComment
    isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    public isConstructor(Context isParameter, File isParameter, File isParameter, File isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) throws PatchException, IOException {
        long isVariable, isVariable, isVariable, isVariable;
        int isVariable, isVariable, isVariable, isVariable, isVariable;
        boolean isVariable = true;
        boolean isVariable = true;
        byte[] isVariable = new byte[isNameExpr];
        byte[] isVariable = new byte[isNameExpr];
        BufferedInputStream isVariable = null;
        RandomAccessFile isVariable = null;
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        try {
            isNameExpr = new BufferedInputStream(new FileInputStream(isNameExpr));
            isNameExpr = new RandomAccessFile(isNameExpr, "isStringConstant");
            byte[] isVariable = new byte[isIntegerConstant];
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr < isIntegerConstant || !isNameExpr.isMethod(isNameExpr, isNameExpr))
                throw new PatchException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr = isMethod(isNameExpr);
            isNameExpr = isMethod(isNameExpr);
            if (isNameExpr < isIntegerConstant || isNameExpr < isIntegerConstant)
                throw new PatchException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr = isNameExpr.isMethod() - isIntegerConstant;
            while (isNameExpr > isIntegerConstant) {
                isNameExpr = isMethod(isNameExpr);
                isNameExpr = isMethod(isNameExpr);
                isNameExpr = isMethod(isNameExpr);
                isNameExpr -= isIntegerConstant;
                if (isNameExpr < isIntegerConstant || isNameExpr < isIntegerConstant || isNameExpr < isIntegerConstant)
                    throw new PatchException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                isNameExpr -= isNameExpr;
                if (isNameExpr < isNameExpr)
                    throw new PatchException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                if (isNameExpr < isNameExpr) {
                    if (isNameExpr < isIntegerConstant)
                        isNameExpr = isIntegerConstant;
                    for (int isVariable = isNameExpr; isNameExpr < isNameExpr; isNameExpr++) isNameExpr[isNameExpr] = isIntegerConstant;
                }
                isNameExpr = isMethod(isNameExpr);
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) isNameExpr[isNameExpr] ^= isNameExpr[isNameExpr];
                if (isNameExpr == isNameExpr) {
                    isNameExpr = true;
                } else if (isNameExpr == isNameExpr) {
                    isNameExpr = true;
                } else {
                    if (!isNameExpr)
                        throw new PatchException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                }
                if (isNameExpr && isNameExpr)
                    throw new PatchException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            }
        } finally {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    private long isMethod(InputStream isParameter) throws IOException {
        long isVariable = isIntegerConstant;
        int isVariable;
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr == -isIntegerConstant)
                return -isIntegerConstant;
            isNameExpr += ((long) isNameExpr) << (isNameExpr * isIntegerConstant);
        }
        return isNameExpr;
    }

    private int isMethod(InputStream isParameter) throws IOException {
        int isVariable = isIntegerConstant;
        int isVariable;
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr == -isIntegerConstant)
                return -isIntegerConstant;
            isNameExpr += isNameExpr << (isNameExpr * isIntegerConstant);
        }
        return isNameExpr;
    }

    private int isMethod(byte[] isParameter) {
        int isVariable = isIntegerConstant;
        for (byte isVariable : isNameExpr) {
            isNameExpr = (isNameExpr << isIntegerConstant) ^ isNameExpr[((isNameExpr >> isIntegerConstant) ^ isNameExpr) & isIntegerConstant];
            isNameExpr = (short) isNameExpr & isIntegerConstant;
        }
        return isNameExpr;
    }
}
