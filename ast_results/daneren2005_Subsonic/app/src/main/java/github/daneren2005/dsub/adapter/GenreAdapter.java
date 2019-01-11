// isComment
package github.daneren2005.dsub.adapter;

import android.content.Context;
import android.view.ViewGroup;
import github.daneren2005.dsub.domain.Genre;
import github.daneren2005.dsub.view.FastScroller;
import github.daneren2005.dsub.view.GenreView;
import github.daneren2005.dsub.view.UpdateView;
import java.util.List;

public class isClassOrIsInterface extends SectionAdapter<Genre> implements FastScroller.BubbleTextGetter {

    public static int isVariable = isIntegerConstant;

    public isConstructor(Context isParameter, List<Genre> isParameter, OnItemClickedListener isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public UpdateView.UpdateViewHolder isMethod(ViewGroup isParameter, int isParameter) {
        return new UpdateView.UpdateViewHolder(new GenreView(isNameExpr));
    }

    @Override
    public void isMethod(UpdateView.UpdateViewHolder isParameter, Genre isParameter, int isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Override
    public int isMethod(Genre isParameter) {
        return isNameExpr;
    }

    @Override
    public String isMethod(int isParameter) {
        return isMethod(isMethod(isNameExpr).isMethod());
    }
}
