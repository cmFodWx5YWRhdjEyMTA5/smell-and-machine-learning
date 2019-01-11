// isComment
package org.andstatus.app.note;

import android.database.Cursor;
import android.support.annotation.NonNull;
import org.andstatus.app.data.DbUtils;
import org.andstatus.app.database.table.ActivityTable;
import org.andstatus.app.database.table.NoteTable;
import org.andstatus.app.net.social.ActivityType;
import java.util.HashSet;
import java.util.Set;

public class isClassOrIsInterface extends ConversationItem<ConversationMemberItem> {

    public static final ConversationMemberItem isVariable = new ConversationMemberItem(true);

    ActivityType isVariable = isNameExpr.isFieldAccessExpr;

    protected isConstructor(boolean isParameter) {
        super(isNameExpr);
    }

    @NonNull
    @Override
    public ConversationMemberItem isMethod() {
        return new ConversationMemberItem(true);
    }

    @Override
    Set<String> isMethod() {
        Set<String> isVariable = new HashSet<>();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    @Override
    void isMethod(Cursor isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr));
    }

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod();
    }
}
