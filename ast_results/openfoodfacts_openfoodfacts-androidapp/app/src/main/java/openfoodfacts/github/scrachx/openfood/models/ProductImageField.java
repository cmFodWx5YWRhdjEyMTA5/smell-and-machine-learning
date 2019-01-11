// isComment
package openfoodfacts.github.scrachx.openfood.models;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;

/**
 * isComment
 */
public enum ProductImageField {

    FRONT, INGREDIENTS, NUTRITION, OTHER;

    @Override
    @JsonValue
    public String isMethod() {
        return this.isMethod().isMethod(isNameExpr.isMethod());
    }
}
