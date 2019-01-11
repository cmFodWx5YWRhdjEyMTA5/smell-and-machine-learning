// isComment
package me.sheimi.sgit.activities.explorer;

import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import java.io.File;
import java.io.FileFilter;
import me.sheimi.sgit.R;
import me.sheimi.sgit.SGitApplication;
import me.sheimi.sgit.database.models.Repo;
import me.sheimi.sgit.preference.PreferenceHelper;

public class isClassOrIsInterface extends FileExplorerActivity {

    @Override
    protected File isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected FileFilter isMethod() {
        return new FileFilter() {

            @Override
            public boolean isMethod(File isParameter) {
                String isVariable = isNameExpr.isMethod();
                return !isNameExpr.isMethod("isStringConstant") && isNameExpr.isMethod();
            }
        };
    }

    @Override
    protected AdapterView.OnItemClickListener isMethod() {
        return new AdapterView.OnItemClickListener() {

            @Override
            public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
                File isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod()) {
                    isMethod(isNameExpr);
                    return;
                }
            }
        };
    }

    @Override
    protected AdapterView.OnItemLongClickListener isMethod() {
        return null;
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        // isComment
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return true;
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this, isMethod());
                isMethod();
                return true;
        }
        return super.isMethod(isNameExpr);
    }
}
