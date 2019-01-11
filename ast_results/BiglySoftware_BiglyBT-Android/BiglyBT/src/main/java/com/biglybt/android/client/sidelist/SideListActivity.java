// isComment
package com.biglybt.android.client.sidelist;

import java.util.List;
import com.biglybt.android.adapter.SortableRecyclerAdapter;
import com.biglybt.android.client.AndroidUtils;
import com.biglybt.android.client.AndroidUtilsUI;
import com.biglybt.android.client.R;
import com.biglybt.android.client.activity.DrawerActivity;
import com.biglybt.util.Thunk;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends DrawerActivity implements SideListHelperListener {

    private static final String isVariable = "isStringConstant";

    @Thunk
    private SideListHelper isVariable;

    @Override
    public void isMethod(View isParameter) {
        isMethod(isNameExpr);
    }

    private void isMethod(View isParameter) {
        SortableRecyclerAdapter isVariable = isMethod();
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            }
            if (isNameExpr != null) {
                isNameExpr.isMethod();
            }
            return;
        }
        if (isNameExpr == null || !isNameExpr.isMethod()) {
            isNameExpr = new SideListHelper(this, this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, this);
            if (!isNameExpr.isMethod()) {
                return;
            }
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr) {
            // isComment
            if (isMethod() == null && isNameExpr != null) {
                if (isNameExpr.isMethod()) {
                    return true;
                }
            }
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod(isNameExpr.isMethod(this));
    }

    @Override
    public void isMethod(boolean isParameter) {
        List<Fragment> isVariable = isNameExpr.isMethod(isMethod());
        for (Fragment isVariable : isNameExpr) {
            if (isNameExpr instanceof SideListHelperListener) {
                ((SideListHelperListener) isNameExpr).isMethod(isNameExpr);
            }
        }
    }

    @Override
    public void isMethod(boolean isParameter) {
        List<Fragment> isVariable = isNameExpr.isMethod(isMethod());
        for (Fragment isVariable : isNameExpr) {
            if (isNameExpr instanceof SideListHelperListener) {
                ((SideListHelperListener) isNameExpr).isMethod(isNameExpr);
            }
        }
    }

    @Override
    public void isMethod(SideListHelper isParameter) {
        List<Fragment> isVariable = isNameExpr.isMethod(isMethod());
        for (Fragment isVariable : isNameExpr) {
            if (isNameExpr instanceof SideListHelperListener) {
                ((SideListHelperListener) isNameExpr).isMethod(isNameExpr);
            }
        }
    }

    @Override
    public void isMethod(SideListHelper isParameter) {
        List<Fragment> isVariable = isNameExpr.isMethod(isMethod());
        for (Fragment isVariable : isNameExpr) {
            if (isNameExpr instanceof SideListHelperListener) {
                ((SideListHelperListener) isNameExpr).isMethod(isNameExpr);
            }
        }
    }

    @Override
    public void isMethod(View isParameter) {
        List<Fragment> isVariable = isNameExpr.isMethod(isMethod());
        for (Fragment isVariable : isNameExpr) {
            if (isNameExpr instanceof SideListHelperListener) {
                ((SideListHelperListener) isNameExpr).isMethod(isNameExpr);
            }
        }
    }

    public void isMethod() {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            return;
        }
        isNameExpr.isMethod();
    }

    public void isMethod() {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            return;
        }
        isNameExpr.isMethod();
    }

    public boolean isMethod() {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            return true;
        }
        return isNameExpr.isMethod();
    }

    public void isMethod() {
        isMethod(isNameExpr.isMethod(this));
    }
}
