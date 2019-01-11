// isComment
package org.addhen.smssync.presentation.view.ui.adapter;

import com.addhen.android.raiburari.presentation.ui.adapter.BaseRecyclerViewAdapter;
import org.addhen.smssync.R;
import org.addhen.smssync.presentation.model.LogModel;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseRecyclerViewAdapter<LogModel> {

    @Override
    public RecyclerView.ViewHolder isMethod(ViewGroup isParameter) {
        return new Widgets(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true));
    }

    @Override
    public int isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public void isMethod(List<LogModel> isParameter) {
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(RecyclerView.ViewHolder isParameter, int isParameter) {
        final LogModel isVariable = isMethod(isNameExpr);
        // isComment
        ((Widgets) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isMethod());
    }

    public class isClassOrIsInterface extends RecyclerView.ViewHolder {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        AppCompatTextView isVariable;

        public isConstructor(final View isParameter) {
            super(isNameExpr);
            isNameExpr.isMethod(this, isNameExpr);
        }
    }
}
