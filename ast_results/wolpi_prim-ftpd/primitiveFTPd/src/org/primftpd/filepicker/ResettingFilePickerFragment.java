// isComment
package org.primftpd.filepicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nononsenseapps.filepicker.FilePickerFragment;
import org.primftpd.R;
import org.primftpd.util.Defaults;

public class isClassOrIsInterface extends FilePickerFragment {

    protected View isMethod(LayoutInflater isParameter, ViewGroup isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
    }

    @Override
    public void isMethod(View isParameter, @Nullable Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

            @Override
            public void isMethod(View isParameter) {
                isMethod(isNameExpr.isFieldAccessExpr);
            }
        });
    }
}
