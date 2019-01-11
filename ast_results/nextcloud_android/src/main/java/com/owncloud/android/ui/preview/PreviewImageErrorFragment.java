// isComment
package com.owncloud.android.ui.preview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.owncloud.android.R;
import com.owncloud.android.ui.fragment.FileFragment;
import androidx.annotation.Nullable;
import static com.owncloud.android.ui.activity.FileActivity.EXTRA_FILE;

public class isClassOrIsInterface extends FileFragment {

    @Nullable
    @Override
    public View isMethod(LayoutInflater isParameter, @Nullable ViewGroup isParameter, @Nullable Bundle isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
    }

    public static FileFragment isMethod() {
        FileFragment isVariable = new PreviewImageErrorFragment();
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, null);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }
}
