// isComment
package net.nightwhistler.pageturner.library;

import android.widget.SectionIndexer;
import jedi.option.Option;
import java.util.List;
import static jedi.option.Options.none;
import static jedi.option.Options.option;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends QueryResultAdapter<LibraryBook> implements SectionIndexer {

    private KeyedQueryResult<LibraryBook> isVariable;

    @Override
    public void isMethod(QueryResult<LibraryBook> isParameter) {
        if (isNameExpr instanceof KeyedQueryResult) {
            this.isFieldAccessExpr = (KeyedQueryResult<LibraryBook>) isNameExpr;
        } else {
            this.isFieldAccessExpr = null;
        }
        super.isMethod(isNameExpr);
    }

    public boolean isMethod() {
        return this.isFieldAccessExpr != null;
    }

    public Option<String> isMethod(int isParameter) {
        List<String> isVariable = isNameExpr.isMethod();
        if (isNameExpr == null || isNameExpr >= isNameExpr.isMethod()) {
            return isMethod();
        }
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public List<Character> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod(int isParameter) {
        if (isNameExpr < isIntegerConstant || isNameExpr == null) {
            return -isIntegerConstant;
        }
        List<Character> isVariable = this.isFieldAccessExpr.isMethod();
        if (isNameExpr >= isNameExpr.isMethod()) {
            return isIntegerConstant;
        }
        Character isVariable = isNameExpr.isMethod(isNameExpr);
        return this.isFieldAccessExpr.isMethod(isNameExpr).isMethod(-isIntegerConstant);
    }

    @Override
    public int isMethod(int isParameter) {
        if (this.isFieldAccessExpr == null) {
            return isIntegerConstant;
        }
        if (isNameExpr < isIntegerConstant || isNameExpr >= this.isFieldAccessExpr.isMethod()) {
            return isIntegerConstant;
        }
        Option<Character> isVariable = this.isFieldAccessExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod(isParameter -> this.isFieldAccessExpr.isMethod().isMethod(isNameExpr), () -> isIntegerConstant);
    }

    @Override
    public Object[] isMethod() {
        if (isNameExpr == null) {
            return new Object[isIntegerConstant];
        }
        List<Character> isVariable = this.isFieldAccessExpr.isMethod();
        return isNameExpr.isMethod(new Character[isNameExpr.isMethod()]);
    }
}
