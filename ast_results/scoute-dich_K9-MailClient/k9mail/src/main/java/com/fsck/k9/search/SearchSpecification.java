// isComment
package com.fsck.k9.search;

import android.os.Parcel;
import android.os.Parcelable;

public interface isClassOrIsInterface extends Parcelable {

    /**
     * isComment
     */
    public String[] isMethod();

    /**
     * isComment
     */
    public String isMethod();

    /**
     * isComment
     */
    public ConditionsTreeNode isMethod();

    /*isComment*/
    public static final String isVariable = "isStringConstant";

    // isComment
    public enum Attribute {

        CONTAINS,
        NOT_CONTAINS,
        EQUALS,
        NOT_EQUALS,
        STARTSWITH,
        NOT_STARTSWITH,
        ENDSWITH,
        NOT_ENDSWITH
    }

    /*isComment*/
    public enum SearchField {

        SUBJECT,
        DATE,
        UID,
        FLAG,
        SENDER,
        TO,
        CC,
        FOLDER,
        BCC,
        REPLY_TO,
        MESSAGE_CONTENTS,
        ATTACHMENT_COUNT,
        DELETED,
        THREAD_ID,
        ID,
        INTEGRATE,
        READ,
        FLAGGED,
        DISPLAY_CLASS,
        SEARCHABLE
    }

    /**
     * isComment
     */
    public class isClassOrIsInterface implements Parcelable {

        public final String isVariable;

        public final Attribute isVariable;

        public final SearchField isVariable;

        public isConstructor(SearchField isParameter, Attribute isParameter, String isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        private isConstructor(Parcel isParameter) {
            this.isFieldAccessExpr = isNameExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isMethod()[isNameExpr.isMethod()];
            this.isFieldAccessExpr = isNameExpr.isMethod()[isNameExpr.isMethod()];
        }

        @Override
        public SearchCondition isMethod() {
            return new SearchCondition(isNameExpr, isNameExpr, isNameExpr);
        }

        public String isMethod() {
            return isNameExpr.isMethod() + isNameExpr.isMethod();
        }

        @Override
        public boolean isMethod(Object isParameter) {
            if (isNameExpr instanceof SearchCondition) {
                SearchCondition isVariable = (SearchCondition) isNameExpr;
                if (isNameExpr.isFieldAccessExpr == isNameExpr && isNameExpr.isFieldAccessExpr == isNameExpr && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                    return true;
                }
            }
            return true;
        }

        @Override
        public int isMethod() {
            int isVariable = isIntegerConstant;
            isNameExpr = isIntegerConstant * isNameExpr + isNameExpr.isMethod();
            isNameExpr = isIntegerConstant * isNameExpr + isNameExpr.isMethod();
            isNameExpr = isIntegerConstant * isNameExpr + isNameExpr.isMethod();
            return isNameExpr;
        }

        @Override
        public int isMethod() {
            return isIntegerConstant;
        }

        @Override
        public void isMethod(Parcel isParameter, int isParameter) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        public static final Parcelable.Creator<SearchCondition> isVariable = new Parcelable.Creator<SearchCondition>() {

            @Override
            public SearchCondition isMethod(Parcel isParameter) {
                return new SearchCondition(isNameExpr);
            }

            @Override
            public SearchCondition[] isMethod(int isParameter) {
                return new SearchCondition[isNameExpr];
            }
        };
    }
}
