// isComment
package com.owncloud.android.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(isNameExpr.isFieldAccessExpr)
@Target(isNameExpr.isFieldAccessExpr)
public @interface NextcloudServer {

    int min() default -isIntegerConstant;

    int max();
}
