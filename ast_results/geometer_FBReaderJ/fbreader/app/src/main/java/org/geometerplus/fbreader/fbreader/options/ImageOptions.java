// isComment
package org.geometerplus.fbreader.fbreader.options;

import org.geometerplus.zlibrary.core.options.*;
import org.geometerplus.zlibrary.core.util.ZLColor;
import org.geometerplus.fbreader.fbreader.FBView;

public class isClassOrIsInterface {

    public final ZLColorOption isVariable;

    public final ZLEnumOption<FBView.ImageFitting> isVariable;

    public static enum TapActionEnum {

        doNothing, selectImage, openImageView
    }

    public final ZLEnumOption<TapActionEnum> isVariable;

    public final ZLBooleanOption isVariable;

    public isConstructor() {
        isNameExpr = new ZLColorOption("isStringConstant", "isStringConstant", new ZLColor(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isNameExpr = new ZLEnumOption<FBView.ImageFitting>("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = new ZLEnumOption<TapActionEnum>("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr = new ZLBooleanOption("isStringConstant", "isStringConstant", true);
    }
}
