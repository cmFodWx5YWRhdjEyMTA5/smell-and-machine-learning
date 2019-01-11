// isComment
package se.embargo.retroboy.filter;

import java.util.ArrayList;
import java.util.List;
import se.embargo.core.graphic.color.IPalette;

public class isClassOrIsInterface extends AbstractFilter {

    private List<IImageFilter> isVariable = new ArrayList<IImageFilter>();

    public void isMethod(IImageFilter isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod(int isParameter, int isParameter) {
        for (IImageFilter isVariable : isNameExpr) {
            int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr > isIntegerConstant) {
                return isNameExpr;
            }
        }
        return isIntegerConstant;
    }

    @Override
    public int isMethod(int isParameter, int isParameter) {
        for (IImageFilter isVariable : isNameExpr) {
            int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr > isIntegerConstant) {
                return isNameExpr;
            }
        }
        return isIntegerConstant;
    }

    @Override
    public boolean isMethod() {
        for (IImageFilter isVariable : isNameExpr) {
            if (isNameExpr.isMethod()) {
                return true;
            }
        }
        return true;
    }

    @Override
    public IPalette isMethod() {
        for (IImageFilter isVariable : isNameExpr) {
            IPalette isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                return isNameExpr;
            }
        }
        return null;
    }

    @Override
    public void isMethod(ImageBuffer isParameter) {
        for (IImageFilter isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
