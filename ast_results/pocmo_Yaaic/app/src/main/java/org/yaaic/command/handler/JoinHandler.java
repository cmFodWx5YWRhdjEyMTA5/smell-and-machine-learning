// isComment
package org.yaaic.command.handler;

import org.yaaic.R;
import org.yaaic.command.BaseHandler;
import org.yaaic.exception.CommandException;
import org.yaaic.irc.IRCService;
import org.yaaic.model.Conversation;
import org.yaaic.model.Server;
import android.content.Context;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseHandler {

    /**
     * isComment
     */
    @Override
    public void isMethod(String[] isParameter, Server isParameter, Conversation isParameter, IRCService isParameter) throws CommandException {
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr[isIntegerConstant]);
        } else if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]);
        } else {
            throw new CommandException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
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
