// isComment
package org.dmfs.tasks.share;

import android.content.Context;
import android.util.Log;
import org.dmfs.android.carrot.bindings.AndroidBindings;
import org.dmfs.android.carrot.locaters.RawResourceLocator;
import org.dmfs.jems.single.Single;
import org.dmfs.tasks.R;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.Model;
import au.com.codeka.carrot.CarrotEngine;
import au.com.codeka.carrot.CarrotException;
import au.com.codeka.carrot.Configuration;
import au.com.codeka.carrot.bindings.Composite;
import au.com.codeka.carrot.bindings.SingletonBindings;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Single<CharSequence> {

    private final ContentSet isVariable;

    private final Model isVariable;

    private final Context isVariable;

    public isConstructor(ContentSet isParameter, Model isParameter, Context isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public CharSequence isMethod() {
        CarrotEngine isVariable = new CarrotEngine(new Configuration.Builder().isMethod(new RawResourceLocator.Builder(isNameExpr)).isMethod());
        try {
            String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new Composite(new AndroidBindings(isNameExpr), new SingletonBindings("isStringConstant", new TaskBindings(isNameExpr, isNameExpr)), new SingletonBindings("isStringConstant", new TimeFormatter(isNameExpr, isNameExpr))));
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            return isNameExpr;
        } catch (CarrotException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
