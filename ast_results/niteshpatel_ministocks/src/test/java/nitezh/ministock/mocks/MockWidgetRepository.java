// isComment
package nitezh.ministock.mocks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nitezh.ministock.domain.Widget;
import nitezh.ministock.domain.WidgetRepository;

public class isClassOrIsInterface implements WidgetRepository {

    private HashSet<String> isVariable;

    @Override
    public List<Integer> isMethod() {
        return new ArrayList<>();
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Set<String> isMethod() {
        if (this.isFieldAccessExpr != null) {
            return this.isFieldAccessExpr;
        }
        return new HashSet<>();
    }

    public void isMethod(HashSet<String> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(int isParameter) {
    }

    @Override
    public Widget isMethod(int isParameter) {
        return new MockWidget();
    }

    @Override
    public Widget isMethod(int isParameter, int isParameter) {
        return this.isMethod(isNameExpr);
    }
}
