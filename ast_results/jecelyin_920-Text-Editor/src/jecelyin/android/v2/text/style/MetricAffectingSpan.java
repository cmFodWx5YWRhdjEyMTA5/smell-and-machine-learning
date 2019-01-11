// isComment
package jecelyin.android.v2.text.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateLayout;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends CharacterStyle implements UpdateLayout {

    public abstract void isMethod(TextPaint isParameter);

    /**
     * isComment
     */
    @Override
    public MetricAffectingSpan isMethod() {
        return this;
    }

    /*isComment*/
    static class isClassOrIsInterface extends MetricAffectingSpan {

        private MetricAffectingSpan isVariable;

        /**
         * isComment
         */
        public isConstructor(MetricAffectingSpan isParameter) {
            isNameExpr = isNameExpr;
        }

        /**
         * isComment
         */
        @Override
        public void isMethod(TextPaint isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }

        /**
         * isComment
         */
        @Override
        public void isMethod(TextPaint isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }

        /**
         * isComment
         */
        @Override
        public MetricAffectingSpan isMethod() {
            return isNameExpr.isMethod();
        }
    }
}
