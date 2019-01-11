// isComment
package github.daneren2005.dsub.adapter;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import github.daneren2005.dsub.view.BasicListView;
import github.daneren2005.dsub.view.UpdateView;

public class isClassOrIsInterface extends SectionAdapter<String> {

    public static int isVariable = isIntegerConstant;

    public isConstructor(Context isParameter, List<String> isParameter, OnItemClickedListener isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public UpdateView.UpdateViewHolder isMethod(ViewGroup isParameter, int isParameter) {
        return new UpdateView.UpdateViewHolder(new BasicListView(isNameExpr));
    }

    @Override
    public void isMethod(UpdateView.UpdateViewHolder isParameter, String isParameter, int isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Override
    public int isMethod(String isParameter) {
        return isNameExpr;
    }
}
