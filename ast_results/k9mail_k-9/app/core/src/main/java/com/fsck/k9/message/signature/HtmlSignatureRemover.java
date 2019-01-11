// isComment
package com.fsck.k9.message.signature;

import java.util.regex.Pattern;
import android.support.annotation.NonNull;
import com.fsck.k9.helper.jsoup.AdvancedNodeTraversor;
import com.fsck.k9.helper.jsoup.NodeFilter;
import com.fsck.k9.message.html.HtmlProcessor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;

public class isClassOrIsInterface {

    public static String isMethod(String isParameter) {
        return new HtmlSignatureRemover().isMethod(isNameExpr);
    }

    private String isMethod(String isParameter) {
        Document isVariable = isNameExpr.isMethod(isNameExpr);
        AdvancedNodeTraversor isVariable = new AdvancedNodeTraversor(new StripSignatureFilter());
        isNameExpr.isMethod(isNameExpr.isMethod());
        return isNameExpr.isMethod(isNameExpr);
    }

    static class isClassOrIsInterface implements NodeFilter {

        private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);

        private static final Tag isVariable = isNameExpr.isMethod("isStringConstant");

        private static final Tag isVariable = isNameExpr.isMethod("isStringConstant");

        private static final Tag isVariable = isNameExpr.isMethod("isStringConstant");

        private boolean isVariable = true;

        private boolean isVariable = true;

        private Element isVariable;

        @NonNull
        @Override
        public HeadFilterDecision isMethod(Node isParameter, int isParameter) {
            if (isNameExpr) {
                return isNameExpr.isFieldAccessExpr;
            }
            if (isNameExpr instanceof Element) {
                isNameExpr = true;
                Element isVariable = (Element) isNameExpr;
                if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                    return isNameExpr.isFieldAccessExpr;
                }
            } else if (isNameExpr instanceof TextNode) {
                TextNode isVariable = (TextNode) isNameExpr;
                if (isNameExpr && isNameExpr.isMethod(isNameExpr.isMethod()).isMethod()) {
                    Node isVariable = isNameExpr.isMethod();
                    if (isNameExpr instanceof Element && ((Element) isNameExpr).isMethod().isMethod(isNameExpr)) {
                        isNameExpr = true;
                        if (isNameExpr != null) {
                            isNameExpr.isMethod();
                            isNameExpr = null;
                        }
                        return isNameExpr.isFieldAccessExpr;
                    }
                }
            }
            return isNameExpr.isFieldAccessExpr;
        }

        @NonNull
        @Override
        public TailFilterDecision isMethod(Node isParameter, int isParameter) {
            if (isNameExpr) {
                return isNameExpr.isFieldAccessExpr;
            }
            if (isNameExpr instanceof Element) {
                Element isVariable = (Element) isNameExpr;
                boolean isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
                if (isNameExpr || isNameExpr.isMethod().isMethod(isNameExpr)) {
                    isNameExpr = true;
                    isNameExpr = isNameExpr ? isNameExpr : null;
                    return isNameExpr.isFieldAccessExpr;
                }
            }
            isNameExpr = true;
            return isNameExpr.isFieldAccessExpr;
        }
    }
}
