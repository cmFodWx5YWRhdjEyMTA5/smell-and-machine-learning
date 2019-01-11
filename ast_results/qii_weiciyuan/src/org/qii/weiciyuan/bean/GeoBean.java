// isComment
package org.qii.weiciyuan.bean;

import org.qii.weiciyuan.support.utils.ObjectToStringUtility;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * isComment
 */
public class isClassOrIsInterface implements Parcelable {

    private String isVariable;

    private double[] isVariable = { isDoubleConstant, isDoubleConstant };

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public double[] isMethod() {
        return isNameExpr;
    }

    public void isMethod(double[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public double isMethod() {
        return isNameExpr[isIntegerConstant];
    }

    public double isMethod() {
        return isNameExpr[isIntegerConstant];
    }

    public void isMethod(double isParameter) {
        isNameExpr[isIntegerConstant] = isNameExpr;
    }

    public void isMethod(double isParameter) {
        isNameExpr[isIntegerConstant] = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(this);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public static final Parcelable.Creator<GeoBean> isVariable = new Parcelable.Creator<GeoBean>() {

        public GeoBean isMethod(Parcel isParameter) {
            GeoBean isVariable = new GeoBean();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = new double[isIntegerConstant];
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            return isNameExpr;
        }

        public GeoBean[] isMethod(int isParameter) {
            return new GeoBean[isNameExpr];
        }
    };
}
