// isComment
package org.droidupnp.model.cling.didl;

import org.droidupnp.R;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.item.VideoItem;
import java.util.List;

public class isClassOrIsInterface extends ClingDIDLItem {

    public isConstructor(VideoItem isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public String isMethod() {
        List<Res> isVariable = isNameExpr.isMethod();
        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant)
            return "isStringConstant" + ((isNameExpr.isMethod(isIntegerConstant).isMethod() != null) ? isNameExpr.isMethod(isIntegerConstant).isMethod() : "isStringConstant");
        return "isStringConstant";
    }

    @Override
    public String isMethod() {
        List<Res> isVariable = isNameExpr.isMethod();
        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant)
            return "isStringConstant" + ((isNameExpr.isMethod(isIntegerConstant).isMethod() != null) ? isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod("isStringConstant")[isIntegerConstant] : "isStringConstant");
        return "isStringConstant";
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
