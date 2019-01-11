// isComment
package indrora.atomic.command.handler;

import indrora.atomic.command.BaseHandler;
import indrora.atomic.exception.CommandException;
import indrora.atomic.irc.IRCService;
import indrora.atomic.model.Channel;
import indrora.atomic.model.Conversation;
import indrora.atomic.model.Server;
import indrora.atomic.R;
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
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            throw new CommandException(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        Channel isVariable = (Channel) isNameExpr;
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            // isComment
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), "isStringConstant", isIntegerConstant, true);
        } else if (isNameExpr.isFieldAccessExpr > isIntegerConstant) {
            // isComment
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr));
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
