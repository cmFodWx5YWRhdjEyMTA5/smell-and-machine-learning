// isComment
package com.wangdaye.mysplash.main.presenter.fragment;

import android.content.Context;
import android.view.View;
import com.wangdaye.mysplash.common.i.presenter.PopupManagePresenter;
import com.wangdaye.mysplash.common.i.view.PopupManageView;
import com.wangdaye.mysplash.common.ui.popup.SearchCategoryPopupWindow;
import com.wangdaye.mysplash.common.ui.popup.SearchFeaturedPopupWindow;
import com.wangdaye.mysplash.common.ui.popup.SearchOrientationPopupWindow;

public class isClassOrIsInterface implements PopupManagePresenter {

    private PopupManageView isVariable;

    public isConstructor(PopupManageView isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(Context isParameter, View isParameter, String isParameter, final int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                SearchCategoryPopupWindow isVariable = new SearchCategoryPopupWindow(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr), true);
                isNameExpr.isMethod(new SearchCategoryPopupWindow.OnSearchCategoryChangedListener() {

                    @Override
                    public void isMethod(int isParameter) {
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
                    }
                });
                break;
            case isIntegerConstant:
                SearchOrientationPopupWindow isVariable = new SearchOrientationPopupWindow(isNameExpr, isNameExpr, isNameExpr);
                isNameExpr.isMethod(new SearchOrientationPopupWindow.OnSearchOrientationChangedListener() {

                    @Override
                    public void isMethod(String isParameter) {
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                    }
                });
                break;
            case isIntegerConstant:
                SearchFeaturedPopupWindow isVariable = new SearchFeaturedPopupWindow(isNameExpr, isNameExpr, isNameExpr);
                isNameExpr.isMethod(new SearchFeaturedPopupWindow.OnSearchFeaturedChangedListener() {

                    @Override
                    public void isMethod(boolean isParameter) {
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
                    }
                });
                break;
        }
    }
}
