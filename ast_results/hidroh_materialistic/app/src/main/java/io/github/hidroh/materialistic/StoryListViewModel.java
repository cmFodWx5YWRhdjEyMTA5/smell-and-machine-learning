// isComment
package io.github.hidroh.materialistic;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.v4.util.Pair;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import rx.Observable;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

public class isClassOrIsInterface extends ViewModel {

    private ItemManager isVariable;

    private Scheduler isVariable;

    // isComment
    private MutableLiveData<Pair<Item[], Item[]>> isVariable;

    public void isMethod(ItemManager isParameter, Scheduler isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public LiveData<Pair<Item[], Item[]>> isMethod(String isParameter, @ItemManager.CacheMode int isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new MutableLiveData<>();
            isNameExpr.isMethod(() -> isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr).isMethod(isNameExpr.isMethod()).isMethod(isParameter -> isMethod(isNameExpr));
        }
        return isNameExpr;
    }

    public void isMethod(String isParameter, @ItemManager.CacheMode int isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            return;
        }
        isNameExpr.isMethod(() -> isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr).isMethod(isNameExpr.isMethod()).isMethod(isParameter -> isMethod(isNameExpr));
    }

    void isMethod(Item[] isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod() != null ? isNameExpr.isMethod().isFieldAccessExpr : null, isNameExpr));
    }
}
