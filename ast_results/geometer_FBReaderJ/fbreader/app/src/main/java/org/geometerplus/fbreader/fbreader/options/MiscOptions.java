// isComment
package org.geometerplus.fbreader.fbreader.options;

import org.geometerplus.zlibrary.core.options.*;
import org.geometerplus.fbreader.fbreader.DurationEnum;

public class isClassOrIsInterface {

    public final ZLBooleanOption isVariable;

    public final ZLStringOption isVariable;

    public final ZLBooleanOption isVariable;

    public final ZLBooleanOption isVariable;

    public static enum WordTappingActionEnum {

        doNothing, selectSingleWord, startSelecting, openDictionary
    }

    public final ZLEnumOption<WordTappingActionEnum> isVariable;

    public final ZLIntegerRangeOption isVariable;

    public static enum FootnoteToastEnum {

        never, footnotesOnly, footnotesAndSuperscripts, allInternalLinks
    }

    public final ZLEnumOption<FootnoteToastEnum> isVariable;

    public final ZLEnumOption<DurationEnum> isVariable;

    public isConstructor() {
        isNameExpr = new ZLBooleanOption("isStringConstant", "isStringConstant", true);
        isNameExpr = new ZLStringOption("isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr = new ZLBooleanOption("isStringConstant", "isStringConstant", true);
        isNameExpr = new ZLBooleanOption("isStringConstant", "isStringConstant", true);
        isNameExpr = new ZLEnumOption<WordTappingActionEnum>("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr = new ZLIntegerRangeOption("isStringConstant", "isStringConstant", isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isNameExpr = new ZLEnumOption<FootnoteToastEnum>("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr = new ZLEnumOption<DurationEnum>("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
    }
}
