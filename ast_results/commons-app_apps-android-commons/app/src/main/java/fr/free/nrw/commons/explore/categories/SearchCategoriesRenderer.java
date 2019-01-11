// isComment
package fr.free.nrw.commons.explore.categories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.pedrogomez.renderers.Renderer;
import butterknife.BindView;
import butterknife.ButterKnife;
import fr.free.nrw.commons.R;

/**
 * isComment
 */
class isClassOrIsInterface extends Renderer<String> {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    private final CategoryClickedListener isVariable;

    isConstructor(CategoryClickedListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected View isMethod(LayoutInflater isParameter, ViewGroup isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
    }

    @Override
    protected void isMethod(View isParameter) {
        isNameExpr.isMethod(this, isNameExpr);
    }

    @Override
    protected void isMethod(View isParameter) {
        isNameExpr.isMethod(isParameter -> {
            String isVariable = isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        });
    }

    @Override
    public void isMethod() {
        String isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
    }

    public interface isClassOrIsInterface {

        void isMethod(String isParameter);
    }
}
