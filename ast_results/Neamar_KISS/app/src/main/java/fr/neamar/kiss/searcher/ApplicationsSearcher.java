// isComment
package fr.neamar.kiss.searcher;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import fr.neamar.kiss.KissApplication;
import fr.neamar.kiss.MainActivity;
import fr.neamar.kiss.pojo.Pojo;
import fr.neamar.kiss.pojo.PojoComparator;

/**
 * isComment
 */
public class isClassOrIsInterface extends Searcher {

    public isConstructor(MainActivity isParameter) {
        super(isNameExpr, "isStringConstant");
    }

    @Override
    PriorityQueue<Pojo> isMethod(Context isParameter) {
        // isComment
        return new PriorityQueue<>(isNameExpr, isNameExpr.isMethod(new PojoComparator()));
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected Void isMethod(Void... isParameter) {
        MainActivity isVariable = isNameExpr.isMethod();
        if (isNameExpr == null)
            return null;
        List<Pojo> isVariable = isNameExpr.isMethod(isNameExpr).isMethod().isMethod();
        if (isNameExpr != null)
            this.isMethod(isNameExpr.isMethod(new Pojo[isIntegerConstant]));
        return null;
    }

    @Override
    protected void isMethod(Void isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod().isFieldAccessExpr.isMethod();
    }
}
