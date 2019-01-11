// isComment
package io.github.hidroh.materialistic.widget;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.MenuRes;
import android.support.annotation.StringRes;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

public interface isClassOrIsInterface {

    /**
     * isComment
     */
    PopupMenu isMethod(Context isParameter, View isParameter, int isParameter);

    /**
     * isComment
     */
    PopupMenu isMethod(@MenuRes int isParameter);

    /**
     * isComment
     */
    PopupMenu isMethod(@IdRes int isParameter, boolean isParameter);

    /**
     * isComment
     */
    PopupMenu isMethod(@IdRes int isParameter, @StringRes int isParameter);

    /**
     * isComment
     */
    PopupMenu isMethod(OnMenuItemClickListener isParameter);

    /**
     * isComment
     */
    void isMethod();

    /**
     * isComment
     */
    interface isClassOrIsInterface {

        /**
         * isComment
         */
        boolean isMethod(MenuItem isParameter);
    }

    class isClassOrIsInterface implements PopupMenu {

        private android.support.v7.widget.PopupMenu isVariable;

        @Override
        public PopupMenu isMethod(Context isParameter, View isParameter, int isParameter) {
            isNameExpr = new android.support.v7.widget.PopupMenu(isNameExpr, isNameExpr, isNameExpr);
            return this;
        }

        @Override
        public PopupMenu isMethod(@MenuRes int isParameter) {
            isNameExpr.isMethod(isNameExpr);
            return this;
        }

        @Override
        public PopupMenu isMethod(@IdRes int isParameter, boolean isParameter) {
            isNameExpr.isMethod().isMethod(isNameExpr).isMethod(isNameExpr);
            return this;
        }

        @Override
        public PopupMenu isMethod(@IdRes int isParameter, @StringRes int isParameter) {
            isNameExpr.isMethod().isMethod(isNameExpr).isMethod(isNameExpr);
            return this;
        }

        @Override
        public PopupMenu isMethod(final OnMenuItemClickListener isParameter) {
            isNameExpr.isMethod(listener::onMenuItemClick);
            return this;
        }

        @Override
        public void isMethod() {
            isNameExpr.isMethod();
        }
    }
}
