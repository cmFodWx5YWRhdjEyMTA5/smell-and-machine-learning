// isComment
package net.micode.fileexplorer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

public class isClassOrIsInterface extends ArrayAdapter<FileInfo> {

    private LayoutInflater isVariable;

    private FileViewInteractionHub isVariable;

    private FileIconHelper isVariable;

    private Context isVariable;

    public isConstructor(Context isParameter, int isParameter, List<FileInfo> isParameter, FileViewInteractionHub isParameter, FileIconHelper isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        View isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr;
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        }
        FileInfo isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new FileListItem.FileItemOnClickListener(isNameExpr, isNameExpr));
        return isNameExpr;
    }
}
