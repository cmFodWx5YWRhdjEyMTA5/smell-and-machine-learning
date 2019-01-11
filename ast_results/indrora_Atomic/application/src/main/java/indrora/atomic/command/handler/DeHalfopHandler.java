// isComment
package indrora.atomic.command.handler;

import android.content.Context;
import indrora.atomic.R;
import indrora.atomic.command.BaseHandler;
import indrora.atomic.exception.CommandException;
import indrora.atomic.irc.IRCService;
import indrora.atomic.model.Conversation;
import indrora.atomic.model.Server;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseHandler {

    /**
     * isComment
     */
    @Override
    public void isMethod(String[] isParameter, Server isParameter, Conversation isParameter, IRCService isParameter) throws CommandException {
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            throw new CommandException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(), isNameExpr[isIntegerConstant]);
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
