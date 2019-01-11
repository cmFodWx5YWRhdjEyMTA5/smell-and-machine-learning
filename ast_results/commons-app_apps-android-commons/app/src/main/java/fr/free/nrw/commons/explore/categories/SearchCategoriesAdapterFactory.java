// isComment
package fr.free.nrw.commons.explore.categories;

import com.pedrogomez.renderers.ListAdapteeCollection;
import com.pedrogomez.renderers.RVRendererAdapter;
import com.pedrogomez.renderers.RendererBuilder;
import java.util.Collections;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private final SearchCategoriesRenderer.CategoryClickedListener isVariable;

    public isConstructor(SearchCategoriesRenderer.CategoryClickedListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public RVRendererAdapter<String> isMethod(List<String> isParameter) {
        RendererBuilder<String> isVariable = new RendererBuilder<String>().isMethod(String.class, new SearchCategoriesRenderer(isNameExpr));
        ListAdapteeCollection<String> isVariable = new ListAdapteeCollection<>(isNameExpr != null ? isNameExpr : isNameExpr.<String>isMethod());
        return new RVRendererAdapter<>(isNameExpr, isNameExpr);
    }
}
