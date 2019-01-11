// isComment
package it.sasabz.android.sasabus.util.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import it.sasabz.android.sasabus.R;
import it.sasabz.android.sasabus.data.model.Changelog;

/**
 * isComment
 */
public class isClassOrIsInterface extends RecyclerView.Adapter<ChangelogAdapter.ViewHolder> {

    private final List<Changelog> isVariable;

    public isConstructor(List<Changelog> isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public ViewHolder isMethod(ViewGroup isParameter, int isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        return new ViewHolder(isNameExpr);
    }

    @Override
    public void isMethod(ViewHolder isParameter, int isParameter) {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    public static class isClassOrIsInterface extends RecyclerView.ViewHolder {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        isConstructor(View isParameter) {
            super(isNameExpr);
            isNameExpr.isMethod(this, isNameExpr);
        }
    }
}
