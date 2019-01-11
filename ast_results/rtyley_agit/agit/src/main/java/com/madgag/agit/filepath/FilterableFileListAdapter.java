// isComment
package com.madgag.agit.filepath;

import static com.google.common.collect.Lists.newArrayList;
import static com.madgag.agit.R.layout.file_list_item;
import static com.madgag.android.listviews.ReflectiveHolderFactory.reflectiveFactoryFor;
import static com.madgag.android.listviews.ViewInflator.viewInflatorFor;
import static java.lang.System.currentTimeMillis;
import android.content.Context;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.common.base.Stopwatch;
import com.madgag.agit.FileViewHolder;
import com.madgag.android.listviews.ViewHoldingListAdapter;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class isClassOrIsInterface extends ViewHoldingListAdapter<FilePath> implements Filterable {

    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private final Object isVariable = new Object();

    // isComment
    // isComment
    private List<FilePath> isVariable;

    private final List<FilePath> isVariable;

    private final AtomicReference<FilePathMatcher> isVariable;

    private CachingFilePathListMatcher isVariable;

    private Filter isVariable;

    public isConstructor(final List<FilePath> isParameter, Context isParameter, AtomicReference<FilePathMatcher> isParameter) {
        super(isNameExpr, isMethod(isNameExpr, isNameExpr), isMethod(FileViewHolder.class, isNameExpr));
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = new CachingFilePathListMatcher(this.isFieldAccessExpr);
    }

    public Filter isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new Filter() {

                @Override
                protected FilterResults isMethod(CharSequence isParameter) {
                    if (isNameExpr == null) {
                        synchronized (isNameExpr) {
                            isNameExpr = isMethod(isNameExpr);
                        }
                    }
                    List<FilePath> isVariable;
                    synchronized (isNameExpr) {
                        isNameExpr = isMethod(isNameExpr);
                    }
                    FilterResults isVariable = new FilterResults();
                    if (isNameExpr.isMethod(isNameExpr)) {
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
                    } else {
                        // isComment
                        // isComment
                        Stopwatch isVariable = new Stopwatch().isMethod();
                        List<FilePath> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
                        // isComment
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
                    }
                    return isNameExpr;
                }

                @Override
                protected void isMethod(CharSequence isParameter, FilterResults isParameter) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr) ? null : new FilePathMatcher(isNameExpr.isMethod()));
                    isMethod((List<FilePath>) isNameExpr.isFieldAccessExpr);
                }
            };
        }
        return isNameExpr;
    }
}
