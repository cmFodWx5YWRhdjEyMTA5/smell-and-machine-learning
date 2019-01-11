// isComment
package github.daneren2005.dsub.adapter;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import github.daneren2005.dsub.domain.Share;
import github.daneren2005.dsub.view.ShareView;
import github.daneren2005.dsub.view.UpdateView;

public class isClassOrIsInterface extends SectionAdapter<Share> {

    public static int isVariable = isIntegerConstant;

    public isConstructor(Context isParameter, List<Share> isParameter, OnItemClickedListener isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public UpdateView.UpdateViewHolder isMethod(ViewGroup isParameter, int isParameter) {
        return new UpdateView.UpdateViewHolder(new ShareView(isNameExpr));
    }

    @Override
    public void isMethod(UpdateView.UpdateViewHolder isParameter, Share isParameter, int isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Override
    public int isMethod(Share isParameter) {
        return isNameExpr;
    }
}
