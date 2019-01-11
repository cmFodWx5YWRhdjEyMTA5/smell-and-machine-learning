// isComment
package com.sismics.reader.core.dao.lucene;

import java.io.IOException;
import java.io.Reader;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.charfilter.HTMLStripCharFilter;
import org.apache.lucene.analysis.core.LowerCaseFilter;
import org.apache.lucene.analysis.core.StopAnalyzer;
import org.apache.lucene.analysis.core.StopFilter;
import org.apache.lucene.analysis.standard.ClassicAnalyzer;
import org.apache.lucene.analysis.standard.ClassicTokenizer;
import org.apache.lucene.analysis.standard.StandardFilter;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.analysis.util.CharArraySet;
import org.apache.lucene.analysis.util.StopwordAnalyzerBase;
import org.apache.lucene.util.Version;

/**
 * isComment
 */
public final class isClassOrIsInterface extends StopwordAnalyzerBase {

    /**
     * isComment
     */
    public static final int isVariable = isIntegerConstant;

    private int isVariable = isNameExpr;

    /**
     * isComment
     */
    public static final CharArraySet isVariable = isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    public isConstructor(Version isParameter, CharArraySet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(Version isParameter) {
        this(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(Version isParameter, Reader isParameter) throws IOException {
        this(isNameExpr, isMethod(isNameExpr, isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    @Override
    protected TokenStreamComponents isMethod(final String isParameter, final Reader isParameter) {
        final StandardTokenizer isVariable = new StandardTokenizer(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        TokenStream isVariable = new StandardFilter(isNameExpr, isNameExpr);
        isNameExpr = new LowerCaseFilter(isNameExpr, isNameExpr);
        isNameExpr = new StopFilter(isNameExpr, isNameExpr, isNameExpr);
        return new TokenStreamComponents(isNameExpr, isNameExpr) {

            @Override
            protected void isMethod(final Reader isParameter) throws IOException {
                isNameExpr.isMethod(isNameExpr.this.isFieldAccessExpr);
                super.isMethod(isNameExpr);
            }
        };
    }

    @Override
    protected Reader isMethod(String isParameter, Reader isParameter) {
        if (isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant")) {
            return new HTMLStripCharFilter(super.isMethod(isNameExpr, isNameExpr));
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }
}
