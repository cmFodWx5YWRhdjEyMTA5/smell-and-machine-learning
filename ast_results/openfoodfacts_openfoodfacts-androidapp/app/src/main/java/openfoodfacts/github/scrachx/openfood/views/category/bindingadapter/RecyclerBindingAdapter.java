// isComment
package openfoodfacts.github.scrachx.openfood.views.category.bindingadapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import openfoodfacts.github.scrachx.openfood.models.CategoryName;
import openfoodfacts.github.scrachx.openfood.views.category.adapter.CategoryListRecyclerAdapter;

public class isClassOrIsInterface {

    @BindingAdapter({ "isStringConstant" })
    public static void isMethod(RecyclerView isParameter, List<CategoryName> isParameter) {
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(new CategoryListRecyclerAdapter(isNameExpr));
        }
    }
}
