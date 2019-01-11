// isComment
package com.madgag.agit.filepath;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

public class isClassOrIsInterface {

    public static Function<ScoredPath, FilePath> isVariable = new Function<ScoredPath, FilePath>() {

        public FilePath isMethod(ScoredPath isParameter) {
            return isNameExpr.isFieldAccessExpr;
        }
    };

    public static Function<FilePath, ScoredPath> isMethod(final String isParameter) {
        final FilePathMatcher isVariable = new FilePathMatcher(isNameExpr);
        return new Function<FilePath, ScoredPath>() {

            public ScoredPath isMethod(FilePath isParameter) {
                return new ScoredPath(isNameExpr, isNameExpr.isMethod(isNameExpr));
            }
        };
    }

    public static final Ordering<ScoredPath> isVariable = new Ordering<ScoredPath>() {

        public int isMethod(ScoredPath isParameter, ScoredPath isParameter) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
    };

    public final FilePath isVariable;

    public final double isVariable;

    public isConstructor(FilePath isParameter, double isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }
}
