// isComment
package org.gittner.osmbugs.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.joda.time.DateTime;

public class isClassOrIsInterface extends Comment implements Parcelable {

    public static final Creator<OsmNoteComment> isVariable = new Creator<OsmNoteComment>() {

        @Override
        public OsmNoteComment isMethod(Parcel isParameter) {
            return new OsmNoteComment(isNameExpr);
        }

        @Override
        public OsmNoteComment[] isMethod(int isParameter) {
            return new OsmNoteComment[isNameExpr];
        }
    };

    /*isComment*/
    private DateTime isVariable;

    public isConstructor() {
        this("isStringConstant", "isStringConstant", isNameExpr.isMethod());
    }

    public isConstructor(String isParameter, String isParameter, DateTime isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public DateTime isMethod() {
        return isNameExpr;
    }

    public void isMethod(DateTime isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
