// isComment
package com.nolanlawson.logcat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.nolanlawson.logcat.util.UtilLogger;

public class isClassOrIsInterface extends ListView {

    private static UtilLogger isVariable = new UtilLogger(ExceptionCatchingListView.class);

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        try {
            return super.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            return true;
        }
    }
}
