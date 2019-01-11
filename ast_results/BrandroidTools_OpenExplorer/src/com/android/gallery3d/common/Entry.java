// isComment
package com.android.gallery3d.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public abstract class isClassOrIsInterface {

    public static final String[] isVariable = { "isStringConstant" };

    public static interface isClassOrIsInterface {

        public static final String isVariable = "isStringConstant";
    }

    // isComment
    @Column("isStringConstant")
    public long isVariable = isIntegerConstant;

    @Retention(isNameExpr.isFieldAccessExpr)
    @Target(isNameExpr.isFieldAccessExpr)
    public @interface Table {

        String value();
    }

    @Retention(isNameExpr.isFieldAccessExpr)
    @Target(isNameExpr.isFieldAccessExpr)
    public @interface Column {

        String value();

        boolean indexed() default true;

        boolean fullText() default true;

        String defaultValue() default "isStringConstant";
    }

    public void isMethod() {
        isNameExpr = isIntegerConstant;
    }
}
