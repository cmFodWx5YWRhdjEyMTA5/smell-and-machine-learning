// isComment
package uk.org.ngo.squeezer.download;

import android.content.Context;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.framework.EnumWithText;
import uk.org.ngo.squeezer.model.Song;

public enum DownloadFilenameStructure implements EnumWithText {

    NUMBER_TITLE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Song isParameter) {
            return isMethod(isNameExpr.isMethod()) + "isStringConstant" + isNameExpr.isMethod();
        }
    }
    ,
    ARTIST_TITLE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Song isParameter) {
            return isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod();
        }
    }
    ,
    ARTIST_NUMBER_TITLE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Song isParameter) {
            return isNameExpr.isMethod() + "isStringConstant" + isMethod(isNameExpr.isMethod()) + "isStringConstant" + isNameExpr.isMethod();
        }
    }
    ,
    ALBUMARTIST_NUMBER_TITLE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Song isParameter) {
            return isNameExpr.isMethod().isMethod() + "isStringConstant" + isMethod(isNameExpr.isMethod()) + "isStringConstant" + isNameExpr.isMethod();
        }
    }
    ,
    TITLE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Song isParameter) {
            return isNameExpr.isMethod();
        }
    }
    ,
    NUMBER_DOT_ARTIST_TITLE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Song isParameter) {
            return isMethod(isNameExpr.isMethod()) + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod();
        }
    }
    ;

    private final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public abstract String isMethod(Song isParameter);

    private static String isMethod(int isParameter) {
        return isNameExpr.isMethod("isStringConstant", isNameExpr);
    }
}
