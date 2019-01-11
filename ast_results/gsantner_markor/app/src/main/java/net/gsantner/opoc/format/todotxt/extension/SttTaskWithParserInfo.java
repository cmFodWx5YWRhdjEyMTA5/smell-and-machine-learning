// isComment
package net.gsantner.opoc.format.todotxt.extension;

import net.gsantner.opoc.format.todotxt.SttTask;

public class isClassOrIsInterface extends SttTask implements SttTaskParserInfoExtension<SttTaskWithParserInfo> {

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr, "isStringConstant");
    }

    @Override
    public SttTaskWithParserInfo isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return this;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod(isNameExpr, isIntegerConstant);
    }

    @Override
    public SttTaskWithParserInfo isMethod(int isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return this;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod(isNameExpr, isIntegerConstant);
    }

    @Override
    public SttTaskWithParserInfo isMethod(int isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return this;
    }
}
