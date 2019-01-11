// isComment
package buet.rafi.dictionary.activity;

import java.util.List;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.MenuItem;
import buet.rafi.dictionary.R;
import buet.rafi.dictionary.adapter.WordListAdapter;
import buet.rafi.dictionary.db.DatabaseInitializer;
import buet.rafi.dictionary.db.DictionaryDB;
import buet.rafi.dictionary.model.Word;

public class isClassOrIsInterface extends ListActivity {

    private DictionaryDB isVariable;

    private WordListAdapter isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod().isMethod(true);
        DatabaseInitializer isVariable = new DatabaseInitializer(isMethod());
        isNameExpr = new DictionaryDB(isNameExpr);
        isNameExpr = new WordListAdapter(this, isNameExpr);
        isMethod(isNameExpr);
        List<Word> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod();
            return true;
        }
        return super.isMethod(isNameExpr);
    }
}
