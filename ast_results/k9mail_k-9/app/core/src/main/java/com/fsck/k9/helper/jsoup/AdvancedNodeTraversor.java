// isComment
package com.fsck.k9.helper.jsoup;

import com.fsck.k9.helper.jsoup.NodeFilter.HeadFilterDecision;
import com.fsck.k9.helper.jsoup.NodeFilter.TailFilterDecision;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeTraversor;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    public enum FilterResult {

        /**
         * isComment
         */
        ENDED,
        /**
         * isComment
         */
        STOPPED,
        /**
         * isComment
         */
        ROOT_REMOVED
    }

    private NodeFilter isVariable;

    /**
     * isComment
     */
    public isConstructor(NodeFilter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public FilterResult isMethod(Node isParameter) {
        Node isVariable = isNameExpr;
        int isVariable = isIntegerConstant;
        while (isNameExpr != null) {
            HeadFilterDecision isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                return isNameExpr.isFieldAccessExpr;
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                ++isNameExpr;
                continue;
            }
            TailFilterDecision isVariable = isNameExpr.isFieldAccessExpr;
            while (isNameExpr.isMethod() == null && isNameExpr > isIntegerConstant) {
                if (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
                    if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                        return isNameExpr.isFieldAccessExpr;
                    }
                }
                Node isVariable = isNameExpr;
                isNameExpr = isNameExpr.isMethod();
                isNameExpr--;
                if (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod();
                }
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    return isNameExpr.isFieldAccessExpr;
                }
            }
            Node isVariable = isNameExpr;
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod();
            }
            if (isNameExpr == isNameExpr) {
                return isNameExpr == isNameExpr.isFieldAccessExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
            }
        }
        return isNameExpr.isFieldAccessExpr;
    }
}
