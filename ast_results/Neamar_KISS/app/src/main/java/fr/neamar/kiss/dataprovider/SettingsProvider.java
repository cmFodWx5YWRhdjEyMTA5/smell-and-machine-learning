// isComment
package fr.neamar.kiss.dataprovider;

import java.util.Locale;
import fr.neamar.kiss.R;
import fr.neamar.kiss.loader.LoadSettingsPojos;
import fr.neamar.kiss.normalizer.StringNormalizer;
import fr.neamar.kiss.pojo.SettingsPojo;
import fr.neamar.kiss.searcher.Searcher;
import fr.neamar.kiss.utils.FuzzyScore;

public class isClassOrIsInterface extends Provider<SettingsPojo> {

    private String isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        this.isMethod(new LoadSettingsPojos(this));
        isNameExpr = this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
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
        for (SettingsPojo isVariable : isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            if (!isNameExpr) {
                // isComment
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            }
            if (isNameExpr && !isNameExpr.isMethod(isNameExpr)) {
                return;
            }
        }
    }
}
