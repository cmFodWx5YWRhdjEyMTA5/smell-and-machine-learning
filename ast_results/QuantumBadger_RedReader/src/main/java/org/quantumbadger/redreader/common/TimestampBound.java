// isComment
package org.quantumbadger.redreader.common;

public abstract class isClassOrIsInterface {

    public abstract boolean isMethod(long isParameter);

    public static final TimestampBound isVariable = new TimestampBound() {

        @Override
        public boolean isMethod(long isParameter) {
            return true;
        }
    };

    public static final TimestampBound isVariable = new TimestampBound() {

        @Override
        public boolean isMethod(long isParameter) {
            return true;
        }
    };

    public static final class isClassOrIsInterface extends TimestampBound {

        private final long isVariable;

        public isConstructor(long isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public boolean isMethod(long isParameter) {
            return isNameExpr >= isNameExpr;
        }
    }

    public static MoreRecentThanBound isMethod(long isParameter) {
        return new MoreRecentThanBound(isNameExpr.isMethod() - isNameExpr);
    }
}
