// isComment
package fr.neamar.kiss.dataprovider;

import android.widget.Toast;
import fr.neamar.kiss.R;
import fr.neamar.kiss.loader.LoadShortcutsPojos;
import fr.neamar.kiss.normalizer.StringNormalizer;
import fr.neamar.kiss.pojo.Pojo;
import fr.neamar.kiss.pojo.ShortcutsPojo;
import fr.neamar.kiss.searcher.Searcher;
import fr.neamar.kiss.utils.FuzzyScore;

public class isClassOrIsInterface extends Provider<ShortcutsPojo> {

    @Override
    public void isMethod() {
        super.isMethod();
        try {
            this.isMethod(new LoadShortcutsPojos(this));
        } catch (IllegalStateException isParameter) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod(String isParameter, Searcher isParameter) {
        StringNormalizer.Result isVariable = isNameExpr.isMethod(isNameExpr, true);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr == isIntegerConstant) {
            return;
        }
        FuzzyScore isVariable = new FuzzyScore(isNameExpr.isFieldAccessExpr);
        FuzzyScore.MatchInfo isVariable;
        boolean isVariable;
        for (ShortcutsPojo isVariable : isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            // isComment
            if (isNameExpr.isMethod() != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod().isFieldAccessExpr);
                if (isNameExpr.isFieldAccessExpr && (!isNameExpr || isNameExpr.isFieldAccessExpr > isNameExpr.isFieldAccessExpr)) {
                    isNameExpr = true;
                    isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
                }
            }
            if (isNameExpr && !isNameExpr.isMethod(isNameExpr)) {
                return;
            }
        }
    }

    public Pojo isMethod(String isParameter) {
        for (Pojo isVariable : isNameExpr) {
            if (isNameExpr.isMethod().isMethod(isNameExpr))
                return isNameExpr;
        }
        return null;
    }
}
