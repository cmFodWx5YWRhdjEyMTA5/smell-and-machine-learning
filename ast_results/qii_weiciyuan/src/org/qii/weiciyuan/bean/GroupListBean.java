// isComment
package org.qii.weiciyuan.bean;

import org.qii.weiciyuan.support.utils.ObjectToStringUtility;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface implements Parcelable {

    private List<GroupBean> isVariable = new ArrayList<GroupBean>();

    private String isVariable = "isStringConstant";

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public static final Parcelable.Creator<GroupListBean> isVariable = new Parcelable.Creator<GroupListBean>() {

        public GroupListBean isMethod(Parcel isParameter) {
            GroupListBean isVariable = new GroupListBean();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = new ArrayList<GroupBean>();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            return isNameExpr;
        }

        public GroupListBean[] isMethod(int isParameter) {
            return new GroupListBean[isNameExpr];
        }
    };

    public List<GroupBean> isMethod() {
        return isNameExpr;
    }

    public void isMethod(List<GroupBean> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(this);
    }
}
