// isComment
package github.daneren2005.dsub.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;
import github.daneren2005.dsub.R;
import github.daneren2005.dsub.domain.User;
import github.daneren2005.dsub.util.ImageLoader;
import github.daneren2005.dsub.view.UpdateView;
import github.daneren2005.dsub.view.UserView;

public class isClassOrIsInterface extends SectionAdapter<User> {

    public static int isVariable = isIntegerConstant;

    private final ImageLoader isVariable;

    public isConstructor(Context isParameter, List<User> isParameter, ImageLoader isParameter, OnItemClickedListener isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public UpdateView.UpdateViewHolder isMethod(ViewGroup isParameter, int isParameter) {
        return new UpdateView.UpdateViewHolder(new UserView(isNameExpr));
    }

    @Override
    public void isMethod(UpdateView.UpdateViewHolder isParameter, User isParameter, int isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod(User isParameter) {
        return isNameExpr;
    }
}
