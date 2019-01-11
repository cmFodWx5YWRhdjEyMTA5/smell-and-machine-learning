// isComment
package org.yaaic.command.handler;

import org.yaaic.R;
import org.yaaic.command.BaseHandler;
import org.yaaic.exception.CommandException;
import org.yaaic.irc.IRCService;
import org.yaaic.model.Broadcast;
import org.yaaic.model.Conversation;
import org.yaaic.model.Server;
import android.content.Context;
import android.content.Intent;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseHandler {

    /**
     * isComment
     */
    @Override
    public void isMethod(String[] isParameter, Server isParameter, Conversation isParameter, IRCService isParameter) throws CommandException {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            throw new CommandException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            }
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod());
                Intent isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    /**
     * isComment
     */
    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    /**
     * isComment
     */
    @Override
    public String isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
