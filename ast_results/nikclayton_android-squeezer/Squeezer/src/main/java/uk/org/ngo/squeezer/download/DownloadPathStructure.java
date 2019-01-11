// isComment
package uk.org.ngo.squeezer.download;

import android.content.Context;
import java.io.File;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.framework.EnumWithText;
import uk.org.ngo.squeezer.model.Album;
import uk.org.ngo.squeezer.model.Song;

public enum DownloadPathStructure implements EnumWithText {

    ARTIST_ARTISTALBUM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Album isParameter) {
            return new File(isNameExpr.isMethod(), isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod()).isMethod();
        }
    }
    , ARTIST_ALBUM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Album isParameter) {
            return new File(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod();
        }
    }
    , ARTISTALBUM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Album isParameter) {
            return isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod();
        }
    }
    , ALBUM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Album isParameter) {
            return isNameExpr.isMethod();
        }
    }
    , ARTIST(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public String isMethod(Album isParameter) {
            return isNameExpr.isMethod();
        }
    }
    ;

    private final int isVariable;

    protected abstract String isMethod(Album isParameter);

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public String isMethod(Song isParameter) {
        return isMethod(isNameExpr.isMethod());
    }
}
