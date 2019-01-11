// isComment
package com.veniosg.dir.test.matcher;

import com.veniosg.dir.mvvm.model.FileHolder;
import org.hamcrest.Factory;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.core.IsEqual.equalTo;

public class isClassOrIsInterface<T> extends FeatureMatcher<T, String> {

    public isConstructor(Matcher<? super String> isParameter) {
        super(isNameExpr, "isStringConstant", "isStringConstant");
    }

    @Override
    protected String isMethod(T isParameter) {
        if (isNameExpr instanceof FileHolder) {
            return ((FileHolder) isNameExpr).isMethod();
        } else {
            return null;
        }
    }

    /**
     * isComment
     */
    @Factory
    public static <T> Matcher<T> isMethod(String isParameter) {
        return new FileHolderHasName<T>(isMethod(isNameExpr));
    }
}
