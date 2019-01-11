// isComment
package org.mozilla.mozstumbler.svclocator.services;

import org.mozilla.mozstumbler.svclocator.ServiceLocator;

public class isClassOrIsInterface implements ISampleInterface {

    public String isMethod(String isParameter) {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public long isMethod() {
        return isIntegerConstant;
    }

    @Override
    public float isMethod() {
        return isIntegerConstant;
    }

    @Override
    public char isMethod() {
        return 'isStringConstant';
    }

    @Override
    public byte isMethod() {
        return isIntegerConstant;
    }

    @Override
    public short isMethod() {
        return isIntegerConstant;
    }

    @Override
    public double isMethod() {
        return isIntegerConstant;
    }

    @Override
    public Integer isMethod() {
        return new Integer(isIntegerConstant);
    }

    @Override
    public void isMethod() {
    }

    @Override
    public ServiceLocator isMethod() {
        return isNameExpr.isMethod();
    }
}
