// isComment
package com.fsck.k9.ui.messageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.fsck.k9.R;
import com.fsck.k9.mailstore.AttachmentViewInfo;
import com.fsck.k9.view.ToolableViewAnimator;

public class isClassOrIsInterface extends ToolableViewAnimator implements OnClickListener {

    private ViewStub isVariable;

    private AttachmentViewInfo isVariable;

    private AttachmentViewCallback isVariable;

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
    protected void isMethod() {
        super.isMethod();
        if (isMethod()) {
            return;
        }
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr = (ViewStub) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(View isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    break;
                }
        }
    }

    private void isMethod() {
        if (isNameExpr == null) {
            throw new IllegalStateException("isStringConstant");
        }
        AttachmentView isVariable = (AttachmentView) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = null;
        isMethod(isIntegerConstant);
    }

    public void isMethod(AttachmentViewInfo isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(AttachmentViewCallback isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
