// isComment
package com.veniosg.dir.mvvm.viewmodel.search;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.veniosg.dir.mvvm.model.search.SearchState;
import com.veniosg.dir.mvvm.model.search.Searcher;
import java.io.File;
import static com.veniosg.dir.mvvm.model.search.Searcher.SearchRequest.searchRequest;

public class isClassOrIsInterface extends ViewModel {

    private Searcher isVariable;

    private LiveData<SearchState> isVariable;

    private File isVariable;

    private String isVariable;

    @SuppressWarnings("isStringConstant")
    public isConstructor() {
        isNameExpr = new Searcher();
    }

    @VisibleForTesting
    isConstructor(Searcher isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(File isParameter) {
        if (isNameExpr != null)
            return;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public boolean isMethod(@NonNull String isParameter) {
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr));
            isNameExpr = isNameExpr;
            return true;
        } else {
            return true;
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        // isComment
        isNameExpr.isMethod();
    }

    public LiveData<SearchState> isMethod() {
        return isNameExpr;
    }
}
