// isComment
package com.github.junrar.unpack;

import java.io.IOException;
import java.util.Arrays;
import com.github.junrar.exception.RarException;
import com.github.junrar.unpack.decode.AudioVariables;
import com.github.junrar.unpack.decode.BitDecode;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.decode.Decode;
import com.github.junrar.unpack.decode.DistDecode;
import com.github.junrar.unpack.decode.LitDecode;
import com.github.junrar.unpack.decode.LowDistDecode;
import com.github.junrar.unpack.decode.MultDecode;
import com.github.junrar.unpack.decode.RepDecode;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Unpack15 {

    protected MultDecode[] isVariable = new MultDecode[isIntegerConstant];

    protected byte[] isVariable = new byte[isNameExpr.isFieldAccessExpr * isIntegerConstant];

    protected int isVariable, isVariable, isVariable, isVariable;

    protected AudioVariables[] isVariable = new AudioVariables[isIntegerConstant];

    protected LitDecode isVariable = new LitDecode();

    protected DistDecode isVariable = new DistDecode();

    protected LowDistDecode isVariable = new LowDistDecode();

    protected RepDecode isVariable = new RepDecode();

    protected BitDecode isVariable = new BitDecode();

    public static final int[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    public static final byte[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    public static final int[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    public static final int[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    public static final int[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    public static final int[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    protected void isMethod(boolean isParameter) throws IOException, RarException {
        int isVariable;
        if (isNameExpr) {
            isNameExpr = isNameExpr;
        } else {
            isMethod(isNameExpr);
            if (!isMethod()) {
                return;
            }
            if (!isNameExpr) {
                if (!isMethod()) {
                    return;
                }
            }
            --isNameExpr;
        }
        while (isNameExpr >= isIntegerConstant) {
            isNameExpr &= isNameExpr.isFieldAccessExpr;
            if (isNameExpr > isNameExpr - isIntegerConstant)
                if (!isMethod())
                    break;
            if (((isNameExpr - isNameExpr) & isNameExpr.isFieldAccessExpr) < isIntegerConstant && isNameExpr != isNameExpr) {
                isMethod();
                if (isNameExpr)
                    return;
            }
            if (isNameExpr != isIntegerConstant) {
                int isVariable = isMethod(isNameExpr[isNameExpr]);
                if (isNameExpr == isIntegerConstant) {
                    if (!isMethod())
                        break;
                    continue;
                }
                isNameExpr[isNameExpr++] = isMethod(isNameExpr);
                if (++isNameExpr == isNameExpr)
                    isNameExpr = isIntegerConstant;
                --isNameExpr;
                continue;
            }
            int isVariable = isMethod(isNameExpr);
            if (isNameExpr < isIntegerConstant) {
                isNameExpr[isNameExpr++] = (byte) isNameExpr;
                --isNameExpr;
                continue;
            }
            if (isNameExpr > isIntegerConstant) {
                int isVariable = isNameExpr[isNameExpr -= isIntegerConstant] + isIntegerConstant;
                if ((isNameExpr = isNameExpr[isNameExpr]) > isIntegerConstant) {
                    isNameExpr += isMethod() >>> (isIntegerConstant - isNameExpr);
                    isMethod(isNameExpr);
                }
                int isVariable = isMethod(isNameExpr);
                int isVariable = isNameExpr[isNameExpr] + isIntegerConstant;
                if ((isNameExpr = isNameExpr[isNameExpr]) > isIntegerConstant) {
                    isNameExpr += isMethod() >>> (isIntegerConstant - isNameExpr);
                    isMethod(isNameExpr);
                }
                if (isNameExpr >= isIntegerConstant) {
                    isNameExpr++;
                    if (isNameExpr >= isStringConstant)
                        isNameExpr++;
                }
                isMethod(isNameExpr, isNameExpr);
                continue;
            }
            if (isNameExpr == isIntegerConstant) {
                if (!isMethod())
                    break;
                continue;
            }
            if (isNameExpr == isIntegerConstant) {
                isMethod(isNameExpr, isNameExpr);
                continue;
            }
            if (isNameExpr < isIntegerConstant) {
                int isVariable = isNameExpr[(isNameExpr - (isNameExpr - isIntegerConstant)) & isIntegerConstant];
                int isVariable = isMethod(isNameExpr);
                int isVariable = isNameExpr[isNameExpr] + isIntegerConstant;
                if ((isNameExpr = isNameExpr[isNameExpr]) > isIntegerConstant) {
                    isNameExpr += isMethod() >>> (isIntegerConstant - isNameExpr);
                    isMethod(isNameExpr);
                }
                if (isNameExpr >= isIntegerConstant) {
                    isNameExpr++;
                    if (isNameExpr >= isIntegerConstant) {
                        isNameExpr++;
                        if (isNameExpr >= isIntegerConstant)
                            isNameExpr++;
                    }
                }
                isMethod(isNameExpr, isNameExpr);
                continue;
            }
            if (isNameExpr < isIntegerConstant) {
                int isVariable = isNameExpr[isNameExpr -= isIntegerConstant] + isIntegerConstant;
                if ((isNameExpr = isNameExpr[isNameExpr]) > isIntegerConstant) {
                    isNameExpr += isMethod() >>> (isIntegerConstant - isNameExpr);
                    isMethod(isNameExpr);
                }
                isMethod(isIntegerConstant, isNameExpr);
                continue;
            }
        }
        isMethod();
        isMethod();
    }

    protected void isMethod(int isParameter, int isParameter) {
        isNameExpr = isNameExpr[isNameExpr++ & isIntegerConstant] = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr -= isNameExpr;
        int isVariable = isNameExpr - isNameExpr;
        if (isNameExpr < isNameExpr.isFieldAccessExpr - isIntegerConstant && isNameExpr < isNameExpr.isFieldAccessExpr - isIntegerConstant) {
            isNameExpr[isNameExpr++] = isNameExpr[isNameExpr++];
            isNameExpr[isNameExpr++] = isNameExpr[isNameExpr++];
            while (isNameExpr > isIntegerConstant) {
                isNameExpr--;
                isNameExpr[isNameExpr++] = isNameExpr[isNameExpr++];
            }
        } else {
            while ((isNameExpr--) != isIntegerConstant) {
                isNameExpr[isNameExpr] = isNameExpr[isNameExpr++ & isNameExpr.isFieldAccessExpr];
                isNameExpr = (isNameExpr + isIntegerConstant) & isNameExpr.isFieldAccessExpr;
            }
        }
    }

    protected void isMethod(byte[] isParameter, int isParameter, Decode isParameter, int isParameter) {
        int[] isVariable = new int[isIntegerConstant];
        int[] isVariable = new int[isIntegerConstant];
        int isVariable;
        long isVariable, isVariable;
        // isComment
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant);
        for (isNameExpr = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr[(int) (isNameExpr[isNameExpr + isNameExpr] & isIntegerConstant)]++;
        }
        isNameExpr[isIntegerConstant] = isIntegerConstant;
        for (isNameExpr[isIntegerConstant] = isIntegerConstant, isNameExpr.isMethod()[isIntegerConstant] = isIntegerConstant, isNameExpr.isMethod()[isIntegerConstant] = isIntegerConstant, isNameExpr = isIntegerConstant, isNameExpr = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr = isIntegerConstant * (isNameExpr + isNameExpr[isNameExpr]);
            isNameExpr = isNameExpr << (isIntegerConstant - isNameExpr);
            if (isNameExpr > isIntegerConstant) {
                isNameExpr = isIntegerConstant;
            }
            isNameExpr.isMethod()[isNameExpr] = (int) isNameExpr;
            isNameExpr[isNameExpr] = isNameExpr.isMethod()[isNameExpr] = isNameExpr.isMethod()[isNameExpr - isIntegerConstant] + isNameExpr[isNameExpr - isIntegerConstant];
        }
        for (isNameExpr = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            if (isNameExpr[isNameExpr + isNameExpr] != isIntegerConstant) {
                isNameExpr.isMethod()[isNameExpr[isNameExpr[isNameExpr + isNameExpr] & isIntegerConstant]++] = isNameExpr;
            }
        }
        isNameExpr.isMethod(isNameExpr);
    }

    protected int isMethod(Decode isParameter) {
        int isVariable;
        long isVariable = isMethod() & isIntegerConstant;
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
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        int[] isVariable = isNameExpr.isMethod();
        if (isNameExpr < isNameExpr[isIntegerConstant]) {
            if (isNameExpr < isNameExpr[isIntegerConstant]) {
                if (isNameExpr < isNameExpr[isIntegerConstant]) {
                    if (isNameExpr < isNameExpr[isIntegerConstant]) {
                        isNameExpr = isIntegerConstant;
                    } else {
                        isNameExpr = isIntegerConstant;
                    }
                } else {
                    if (isNameExpr < isNameExpr[isIntegerConstant]) {
                        isNameExpr = isIntegerConstant;
                    } else {
                        isNameExpr = isIntegerConstant;
                    }
                }
            } else {
                if (isNameExpr < isNameExpr[isIntegerConstant]) {
                    if (isNameExpr < isNameExpr[isIntegerConstant])
                        isNameExpr = isIntegerConstant;
                    else
                        isNameExpr = isIntegerConstant;
                } else {
                    if (isNameExpr < isNameExpr[isIntegerConstant]) {
                        isNameExpr = isIntegerConstant;
                    } else {
                        isNameExpr = isIntegerConstant;
                    }
                }
            }
        } else {
            if (isNameExpr < isNameExpr[isIntegerConstant]) {
                if (isNameExpr < isNameExpr[isIntegerConstant])
                    if (isNameExpr < isNameExpr[isIntegerConstant])
                        isNameExpr = isIntegerConstant;
                    else
                        isNameExpr = isIntegerConstant;
                else if (isNameExpr < isNameExpr[isIntegerConstant])
                    isNameExpr = isIntegerConstant;
                else
                    isNameExpr = isIntegerConstant;
            } else {
                if (isNameExpr < isNameExpr[isIntegerConstant]) {
                    if (isNameExpr < isNameExpr[isIntegerConstant]) {
                        isNameExpr = isIntegerConstant;
                    } else {
                        isNameExpr = isIntegerConstant;
                    }
                } else {
                    isNameExpr = isIntegerConstant;
                }
            }
        }
        isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod()[isNameExpr] + (((int) isNameExpr - isNameExpr[isNameExpr - isIntegerConstant]) >>> (isIntegerConstant - isNameExpr));
        if (isNameExpr >= isNameExpr.isMethod()) {
            isNameExpr = isIntegerConstant;
        }
        return (isNameExpr.isMethod()[isNameExpr]);
    }

    protected boolean isMethod() throws IOException, RarException {
        byte[] isVariable = new byte[isNameExpr.isFieldAccessExpr];
        byte[] isVariable = new byte[isNameExpr.isFieldAccessExpr * isIntegerConstant];
        int isVariable, isVariable, isVariable;
        if (isNameExpr > isNameExpr - isIntegerConstant) {
            if (!isMethod()) {
                return (true);
            }
        }
        int isVariable = isMethod();
        isNameExpr = (isNameExpr & isIntegerConstant);
        if (isIntegerConstant == (isNameExpr & isIntegerConstant)) {
            // isComment
            isNameExpr.isMethod(isNameExpr, (byte) isIntegerConstant);
        }
        isMethod(isIntegerConstant);
        if (isNameExpr != isIntegerConstant) {
            isNameExpr = ((isNameExpr >>> isIntegerConstant) & isIntegerConstant) + isIntegerConstant;
            if (isNameExpr >= isNameExpr) {
                isNameExpr = isIntegerConstant;
            }
            isMethod(isIntegerConstant);
            isNameExpr = isNameExpr.isFieldAccessExpr * isNameExpr;
        } else {
            isNameExpr = isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr;
        }
        for (isNameExpr = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr[isNameExpr] = (byte) (isMethod() >>> isIntegerConstant);
            isMethod(isIntegerConstant);
        }
        isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr = isIntegerConstant;
        while (isNameExpr < isNameExpr) {
            if (isNameExpr > isNameExpr - isIntegerConstant) {
                if (!isMethod()) {
                    return (true);
                }
            }
            int isVariable = isMethod(isNameExpr);
            if (isNameExpr < isIntegerConstant) {
                isNameExpr[isNameExpr] = (byte) ((isNameExpr + isNameExpr[isNameExpr]) & isIntegerConstant);
                isNameExpr++;
            } else if (isNameExpr == isIntegerConstant) {
                isNameExpr = (isMethod() >>> isIntegerConstant) + isIntegerConstant;
                isMethod(isIntegerConstant);
                while (isNameExpr-- > isIntegerConstant && isNameExpr < isNameExpr) {
                    isNameExpr[isNameExpr] = isNameExpr[isNameExpr - isIntegerConstant];
                    isNameExpr++;
                }
            } else {
                if (isNameExpr == isIntegerConstant) {
                    isNameExpr = (isMethod() >>> isIntegerConstant) + isIntegerConstant;
                    isMethod(isIntegerConstant);
                } else {
                    isNameExpr = (isMethod() >>> isIntegerConstant) + isIntegerConstant;
                    isMethod(isIntegerConstant);
                }
                while (isNameExpr-- > isIntegerConstant && isNameExpr < isNameExpr) isNameExpr[isNameExpr++] = isIntegerConstant;
            }
        }
        if (isNameExpr > isNameExpr) {
            return (true);
        }
        if (isNameExpr != isIntegerConstant)
            for (isNameExpr = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) isMethod(isNameExpr, isNameExpr * isNameExpr.isFieldAccessExpr, isNameExpr[isNameExpr], isNameExpr.isFieldAccessExpr);
        else {
            isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr[isNameExpr] = isNameExpr[isNameExpr];
        }
        return (true);
    }

    protected void isMethod(boolean isParameter) {
        if (!isNameExpr) {
            isNameExpr = isNameExpr = isIntegerConstant;
            isNameExpr = isIntegerConstant;
            // isComment
            isNameExpr.isMethod(isNameExpr, new AudioVariables());
            // isComment
            isNameExpr.isMethod(isNameExpr, (byte) isIntegerConstant);
        }
    }

    protected void isMethod() throws IOException, RarException {
        if (isNameExpr >= isNameExpr + isIntegerConstant) {
            if (isNameExpr != isIntegerConstant) {
                if (isMethod(isNameExpr[isNameExpr]) == isIntegerConstant) {
                    isMethod();
                }
            } else {
                if (isMethod(isNameExpr) == isIntegerConstant) {
                    isMethod();
                }
            }
        }
    }

    protected byte isMethod(int isParameter) {
        AudioVariables isVariable = isNameExpr[isNameExpr];
        isNameExpr.isMethod(isNameExpr.isMethod() + isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod() - isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        // isComment
        int isVariable = isIntegerConstant * isNameExpr.isMethod() + isNameExpr.isMethod() * isNameExpr.isMethod();
        isNameExpr += isNameExpr.isMethod() * isNameExpr.isMethod() + isNameExpr.isMethod() * isNameExpr.isMethod();
        isNameExpr += isNameExpr.isMethod() * isNameExpr.isMethod() + isNameExpr.isMethod() * isNameExpr;
        isNameExpr = (isNameExpr >>> isIntegerConstant) & isIntegerConstant;
        int isVariable = isNameExpr - isNameExpr;
        int isVariable = ((byte) isNameExpr) << isIntegerConstant;
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr - isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr + isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr - isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr + isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr - isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr + isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr - isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr + isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr - isNameExpr);
        // isComment
        isNameExpr.isMethod()[isIntegerConstant] += isNameExpr.isMethod(isNameExpr + isNameExpr);
        isNameExpr.isMethod((byte) (isNameExpr - isNameExpr.isMethod()));
        isNameExpr = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr);
        if ((isNameExpr.isMethod() & isIntegerConstant) == isIntegerConstant) {
            int isVariable = isNameExpr.isMethod()[isIntegerConstant], isVariable = isIntegerConstant;
            // isComment
            isNameExpr.isMethod()[isIntegerConstant] = isIntegerConstant;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod().isFieldAccessExpr; isNameExpr++) {
                if (isNameExpr.isMethod()[isNameExpr] < isNameExpr) {
                    isNameExpr = isNameExpr.isMethod()[isNameExpr];
                    isNameExpr = isNameExpr;
                }
                isNameExpr.isMethod()[isNameExpr] = isIntegerConstant;
            }
            switch(isNameExpr) {
                case isIntegerConstant:
                    if (isNameExpr.isMethod() >= -isIntegerConstant) {
                        // isComment
                        isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() < isIntegerConstant) {
                        // isComment
                        isNameExpr.isMethod(isNameExpr.isMethod() + isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() >= -isIntegerConstant) {
                        // isComment
                        isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() < isIntegerConstant) {
                        // isComment
                        isNameExpr.isMethod(isNameExpr.isMethod() + isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() >= -isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() < isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr.isMethod() + isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() >= -isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() < isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr.isMethod() + isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() >= -isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
                    }
                    break;
                case isIntegerConstant:
                    if (isNameExpr.isMethod() < isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr.isMethod() + isIntegerConstant);
                    }
                    break;
            }
        }
        return ((byte) isNameExpr);
    }
}
