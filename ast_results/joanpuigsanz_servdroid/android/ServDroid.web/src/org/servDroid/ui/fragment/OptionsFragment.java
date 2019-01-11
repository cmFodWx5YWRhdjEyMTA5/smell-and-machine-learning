// isComment
package org.servDroid.ui.fragment;

import org.servDroid.ui.adapter.MainOptionsAdapter;
import org.servDroid.ui.option.MainOptionList;
import org.servDroid.web.R;
import roboguice.inject.InjectView;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.inject.Inject;

public class isClassOrIsInterface extends ServDroidBaseFragment implements OnItemClickListener {

    @InjectView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ListView isVariable;

    @Inject
    private Context isVariable;

    private MainOptionsAdapter isVariable;

    @Inject
    private MainOptionList isVariable;

    private OnOptionClickListener isVariable;

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = new MainOptionsAdapter(isNameExpr, isNameExpr.isMethod());
    }

    @Override
    public void isMethod(Activity isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr instanceof OnOptionClickListener) {
            isNameExpr = (OnOptionClickListener) isNameExpr;
        }
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        return isNameExpr;
    }

    @Override
    public void isMethod(View isParameter, Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        // isComment
        isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr.isMethod(isIntegerConstant));
    }

    @Override
    public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
        if (isNameExpr == null)
            return;
        isNameExpr.isMethod((int) isNameExpr);
    }

    public interface isClassOrIsInterface {

        public void isMethod(int isParameter);
    }
}
