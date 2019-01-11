// isComment
package org.andstatus.app.actor;

import org.andstatus.app.account.MyAccount;
import org.andstatus.app.context.MyContext;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.data.MyQuery;
import org.andstatus.app.database.table.ActivityTable;
import org.andstatus.app.database.table.NoteTable;
import org.andstatus.app.net.social.Actor;
import org.andstatus.app.net.social.Audience;
import org.andstatus.app.origin.Origin;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActorListLoader {

    private final long isVariable;

    private final Origin isVariable;

    final String isVariable;

    private boolean isVariable = true;

    public isConstructor(MyContext isParameter, ActorListType isParameter, Origin isParameter, long isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public ActorsOfNoteListLoader isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        return this;
    }

    @Override
    protected void isMethod() {
        isMethod();
        if (!isNameExpr) {
            super.isMethod();
        }
    }

    private void isMethod() {
        if (!isNameExpr) {
            isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr));
            isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr));
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod().isMethod(this::addActorToList);
        if (!isNameExpr) {
            isMethod();
        }
    }

    private void isMethod() {
        for (Actor isVariable : isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr, isNameExpr)) {
            isMethod(isNameExpr);
        }
    }

    @Override
    protected String isMethod() {
        return isNameExpr;
    }
}
