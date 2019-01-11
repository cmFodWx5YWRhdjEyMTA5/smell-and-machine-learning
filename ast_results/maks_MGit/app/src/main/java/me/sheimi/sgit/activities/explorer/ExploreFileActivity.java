// isComment
package me.sheimi.sgit.activities.explorer;

import java.io.File;
import java.io.FileFilter;
import android.app.Activity;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;

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
                return !isNameExpr.isMethod("isStringConstant");
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
                Intent isVariable = new Intent();
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isMethod();
            }
        };
    }

    @Override
    protected AdapterView.OnItemLongClickListener isMethod() {
        return null;
    }
}
