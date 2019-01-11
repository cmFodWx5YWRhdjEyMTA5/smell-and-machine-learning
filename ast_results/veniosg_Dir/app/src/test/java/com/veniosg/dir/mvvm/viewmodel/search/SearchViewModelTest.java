// isComment
package com.veniosg.dir.mvvm.viewmodel.search;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import com.veniosg.dir.mvvm.model.search.SearchState;
import com.veniosg.dir.mvvm.model.search.Searcher;
import com.veniosg.dir.mvvm.viewmodel.search.SearchViewModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import java.io.File;
import static com.veniosg.dir.mvvm.model.search.Searcher.SearchRequest.searchRequest;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class isClassOrIsInterface {

    @Mock
    private Searcher isVariable;

    private SearchViewModel isVariable;

    private final File isVariable = new File("isStringConstant");

    @Before
    public void isMethod() {
        isMethod(this);
        isNameExpr = new SearchViewModel(isNameExpr);
    }

    @Test
    public void isMethod() {
        LiveData<SearchState> isVariable = new MutableLiveData<>();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isMethod(isNameExpr, isNameExpr)));
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isMethod(isNameExpr, isNameExpr)));
    }
}
