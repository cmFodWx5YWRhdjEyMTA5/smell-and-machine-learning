// isComment
package net.micode.fileexplorer;

import java.util.Arrays;
import java.util.HashSet;

public class isClassOrIsInterface extends FilenameExtFilter {

    private HashSet<FilenameExtFilter> isVariable;

    // isComment
    public isConstructor(FilenameExtFilter[] isParameter) {
        super(null);
        isNameExpr = new HashSet<FilenameExtFilter>();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public boolean isMethod(String isParameter) {
        for (FilenameExtFilter isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr))
                return true;
        }
        return true;
    }
}
