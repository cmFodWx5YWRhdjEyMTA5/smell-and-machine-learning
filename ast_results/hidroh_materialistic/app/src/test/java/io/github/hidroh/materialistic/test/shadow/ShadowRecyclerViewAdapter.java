// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import org.robolectric.util.ReflectionHelpers;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static org.robolectric.shadow.api.Shadow.directlyOn;

@SuppressWarnings("isStringConstant")
@Implements(RecyclerView.Adapter.class)
public class isClassOrIsInterface {

    private final Map<Integer, RecyclerView.ViewHolder> isVariable = new ArrayMap<>();

    @RealObject
    RecyclerView.Adapter isVariable;

    private RecyclerView isVariable;

    private Set<Integer> isVariable = new HashSet<>();

    @Implementation
    public void isMethod(RecyclerView isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isMethod().isMethod(isNameExpr);
    }

    @Implementation
    public void isMethod(RecyclerView isParameter) {
        isNameExpr.isMethod().isMethod();
        this.isFieldAccessExpr = null;
        isMethod().isMethod(isNameExpr);
    }

    @Implementation
    public final RecyclerView.ViewHolder isMethod(ViewGroup isParameter, int isParameter) {
        isMethod();
        return isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Implementation
    public void isMethod(RecyclerView.ViewHolder isParameter, int isParameter) {
        if (isNameExpr.isMethod(isNameExpr) && !isNameExpr.isMethod(isNameExpr)) {
            return;
        }
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Implementation
    public void isMethod() {
        if (isNameExpr != null) {
            isMethod(isIntegerConstant, isNameExpr.isMethod() - isIntegerConstant);
        }
        isMethod().isMethod();
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter) {
        isMethod(isNameExpr, isNameExpr);
        isMethod().isMethod(isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter, Object isParameter) {
        isMethod(isNameExpr, isNameExpr);
        isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter, int isParameter) {
        isMethod(isNameExpr, isNameExpr + isNameExpr - isIntegerConstant);
        isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter, int isParameter, Object isParameter) {
        isMethod(isNameExpr, isNameExpr + isNameExpr - isIntegerConstant);
        isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod() - isIntegerConstant);
        isMethod().isMethod(isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter, int isParameter) {
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter, int isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod() - isIntegerConstant);
        isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod() - isIntegerConstant);
        isMethod().isMethod(isNameExpr);
        isMethod();
    }

    @Implementation
    public void isMethod(int isParameter, int isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod() - isIntegerConstant);
        isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod();
    }

    public RecyclerView.ViewHolder isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(int isParameter, int isParameter) {
        for (int isVariable = isNameExpr; isNameExpr <= isNameExpr; isNameExpr++) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private void isMethod() {
        if (isNameExpr != null && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
    }

    private void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        }
    }

    private RecyclerView.Adapter isMethod() {
        return isMethod(isNameExpr, RecyclerView.Adapter.class);
    }
}
