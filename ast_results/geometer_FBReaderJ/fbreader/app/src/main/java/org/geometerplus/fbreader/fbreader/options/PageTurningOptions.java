// isComment
package org.geometerplus.fbreader.fbreader.options;

import org.geometerplus.zlibrary.core.options.*;
import org.geometerplus.zlibrary.core.view.ZLView;

public class isClassOrIsInterface {

    public static enum FingerScrollingType {

        byTap, byFlick, byTapAndFlick
    }

    public final ZLEnumOption<FingerScrollingType> isVariable = new ZLEnumOption<FingerScrollingType>("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);

    public final ZLEnumOption<ZLView.Animation> isVariable = new ZLEnumOption<ZLView.Animation>("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    public final ZLIntegerRangeOption isVariable = new ZLIntegerRangeOption("isStringConstant", "isStringConstant", isIntegerConstant, isIntegerConstant, isIntegerConstant);

    public final ZLBooleanOption isVariable = new ZLBooleanOption("isStringConstant", "isStringConstant", true);

    public final ZLStringOption isVariable = new ZLStringOption("isStringConstant", "isStringConstant", "isStringConstant");
}
