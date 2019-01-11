// isComment
package ch.qos.logback.classic.filter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class isClassOrIsInterface extends Filter<ILoggingEvent> {

    private Level isVariable;

    private String isVariable;

    @Override
    public FilterReply isMethod(ILoggingEvent isParameter) {
        if (!isMethod()) {
            return isNameExpr.isFieldAccessExpr;
        }
        if (!isNameExpr.isMethod().isMethod(isNameExpr))
            return isNameExpr.isFieldAccessExpr;
        if (isNameExpr.isMethod().isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isFieldAccessExpr;
        }
    }

    public void isMethod(Level isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod() {
        if (this.isFieldAccessExpr != null && this.isFieldAccessExpr != null) {
            super.isMethod();
        }
    }
}
