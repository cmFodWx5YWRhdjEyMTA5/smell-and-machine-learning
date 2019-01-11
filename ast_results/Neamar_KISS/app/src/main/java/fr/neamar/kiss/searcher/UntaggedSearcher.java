// isComment
package fr.neamar.kiss.searcher;

import java.util.Iterator;
import java.util.List;
import fr.neamar.kiss.KissApplication;
import fr.neamar.kiss.MainActivity;
import fr.neamar.kiss.pojo.Pojo;
import fr.neamar.kiss.pojo.PojoWithTags;

public class isClassOrIsInterface extends Searcher {

    public isConstructor(MainActivity isParameter) {
        super(isNameExpr, "isStringConstant");
    }

    @Override
    protected Void isMethod(Void... isParameter) {
        MainActivity isVariable = isNameExpr.isMethod();
        if (isNameExpr == null)
            return null;
        List<Pojo> isVariable = isNameExpr.isMethod(isNameExpr).isMethod().isMethod();
        if (isNameExpr == null)
            return null;
        for (Iterator<Pojo> isVariable = isNameExpr.isMethod(); isNameExpr.isMethod(); ) {
            Pojo isVariable = isNameExpr.isMethod();
            if (!(isNameExpr instanceof PojoWithTags)) {
                isNameExpr.isMethod();
                continue;
            }
            PojoWithTags isVariable = (PojoWithTags) isNameExpr;
            if (isNameExpr.isMethod() == null || isNameExpr.isMethod().isMethod()) {
                continue;
            }
            isNameExpr.isMethod();
        }
        this.isMethod(isNameExpr.isMethod(new Pojo[isIntegerConstant]));
        return null;
    }
}
