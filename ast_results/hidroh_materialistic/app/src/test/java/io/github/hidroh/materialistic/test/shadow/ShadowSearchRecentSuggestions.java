// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.provider.SearchRecentSuggestions;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import java.util.ArrayList;
import java.util.List;

@Implements(value = SearchRecentSuggestions.class, inheritImplementationMethods = true)
public class isClassOrIsInterface {

    public static int isVariable = isIntegerConstant;

    public static List<String> isVariable = new ArrayList<>();

    @Implementation
    public void isMethod() {
        isNameExpr++;
    }

    @Implementation
    public void isMethod(final String isParameter, final String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
