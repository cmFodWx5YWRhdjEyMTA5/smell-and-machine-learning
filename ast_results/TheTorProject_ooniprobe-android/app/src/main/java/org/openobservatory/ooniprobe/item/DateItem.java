// isComment
package org.openobservatory.ooniprobe.item;

import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.openobservatory.ooniprobe.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import localhost.toolkit.widget.HeterogeneousRecyclerItem;

public class isClassOrIsInterface extends HeterogeneousRecyclerItem<Date, DateItem.ViewHolder> {

    private SimpleDateFormat isVariable;

    public isConstructor(Date isParameter) {
        super(isNameExpr);
        isNameExpr = new SimpleDateFormat(isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant"), isNameExpr.isMethod());
    }

    @Override
    public ViewHolder isMethod(LayoutInflater isParameter, ViewGroup isParameter) {
        return new ViewHolder(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true));
    }

    @Override
    public void isMethod(ViewHolder isParameter) {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    class isClassOrIsInterface extends RecyclerView.ViewHolder {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        isConstructor(View isParameter) {
            super(isNameExpr);
            isNameExpr.isMethod(this, isNameExpr);
        }
    }
}
