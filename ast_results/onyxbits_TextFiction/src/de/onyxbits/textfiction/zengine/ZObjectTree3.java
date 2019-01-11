// isComment
package de.onyxbits.textfiction.zengine;

class isClassOrIsInterface extends ZObjectTree {

    public isConstructor(ZMachine isParameter) {
        super(isNameExpr);
    }

    protected int isMethod() {
        return isIntegerConstant;
    }

    protected int isMethod(short isParameter) {
        return isNameExpr + (((isNameExpr & isIntegerConstant) - isIntegerConstant) * isIntegerConstant);
    }

    protected int isMethod() {
        return isIntegerConstant;
    }

    public short isMethod(short isParameter) {
        int isVariable;
        isNameExpr = isMethod(isNameExpr);
        return (short) (isNameExpr.isFieldAccessExpr[isNameExpr + isIntegerConstant] & isIntegerConstant);
    }

    public short isMethod(short isParameter) {
        int isVariable;
        isNameExpr = isMethod(isNameExpr);
        return (short) (isNameExpr.isFieldAccessExpr[isNameExpr + isIntegerConstant] & isIntegerConstant);
    }

    public short isMethod(short isParameter) {
        int isVariable;
        isNameExpr = isMethod(isNameExpr);
        return (short) (isNameExpr.isFieldAccessExpr[isNameExpr + isIntegerConstant] & isIntegerConstant);
    }

    public void isMethod(short isParameter, short isParameter) {
        int isVariable;
        isNameExpr = isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr[isNameExpr + isIntegerConstant] = (byte) isNameExpr;
    }

    public void isMethod(short isParameter, short isParameter) {
        int isVariable;
        isNameExpr = isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr[isNameExpr + isIntegerConstant] = (byte) isNameExpr;
    }

    public void isMethod(short isParameter, short isParameter) {
        int isVariable;
        isNameExpr = isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr[isNameExpr + isIntegerConstant] = (byte) isNameExpr;
    }

    public int isMethod(short isParameter, short isParameter) {
        int isVariable;
        int isVariable;
        // isComment
        // isComment
        isNameExpr = isMethod(isNameExpr);
        isNameExpr += (isNameExpr.isFieldAccessExpr[isNameExpr] & isIntegerConstant) * isIntegerConstant + isIntegerConstant;
        isNameExpr = isNameExpr.isFieldAccessExpr[isNameExpr] & isIntegerConstant;
        while (isNameExpr != isIntegerConstant) {
            // isComment
            if ((isNameExpr & isIntegerConstant) == isNameExpr)
                return isNameExpr;
            else if ((isNameExpr & isIntegerConstant) < isNameExpr)
                return isIntegerConstant;
            isNameExpr += (isNameExpr >> isIntegerConstant) + isIntegerConstant;
            isNameExpr = isNameExpr.isFieldAccessExpr[isNameExpr] & isIntegerConstant;
        }
        return isIntegerConstant;
    }

    public short isMethod(short isParameter, short isParameter) {
        int isVariable;
        int isVariable;
        if (isNameExpr == isIntegerConstant) {
            isNameExpr = isMethod(isNameExpr);
            if (isNameExpr == isIntegerConstant)
                isNameExpr.isMethod("isStringConstant");
            isNameExpr += (isNameExpr.isFieldAccessExpr[isNameExpr] & isIntegerConstant) * isIntegerConstant + isIntegerConstant;
        } else {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
            if (isNameExpr == isIntegerConstant)
                isNameExpr.isMethod("isStringConstant");
            isNameExpr += ((isNameExpr.isFieldAccessExpr[isNameExpr] & isIntegerConstant) >> isIntegerConstant) + isIntegerConstant;
        }
        isNameExpr = isNameExpr.isFieldAccessExpr[isNameExpr] & isIntegerConstant;
        return (short) (isNameExpr & isIntegerConstant);
    }

    public short isMethod(short isParameter, short isParameter) {
        int isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr == isIntegerConstant)
            return isIntegerConstant;
        return (short) (isNameExpr + isIntegerConstant);
    }

    public short isMethod(short isParameter) {
        int isVariable;
        if (isNameExpr == isIntegerConstant) {
            isNameExpr.isMethod("isStringConstant");
            return (short) -isIntegerConstant;
        }
        isNameExpr = isNameExpr.isFieldAccessExpr[(isNameExpr & isIntegerConstant) - isIntegerConstant] & isIntegerConstant;
        return (short) ((isNameExpr >> isIntegerConstant) + isIntegerConstant);
    }
}
