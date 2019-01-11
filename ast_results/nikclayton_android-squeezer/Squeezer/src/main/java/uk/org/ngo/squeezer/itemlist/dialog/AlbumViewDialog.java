// isComment
package uk.org.ngo.squeezer.itemlist.dialog;

import android.content.Context;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.framework.EnumWithTextAndIcon;
import uk.org.ngo.squeezer.framework.VersionedEnumWithText;
import uk.org.ngo.squeezer.model.Album;
import uk.org.ngo.squeezer.service.ServerString;

public class isClassOrIsInterface extends BaseViewDialog<Album, AlbumViewDialog.AlbumListLayout, AlbumViewDialog.AlbumsSortOrder> {

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod();
    }

    /**
     * isComment
     */
    public enum AlbumListLayout implements EnumWithTextAndIcon {

        grid(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr), list(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

        /**
         * isComment
         */
        private final int isVariable;

        @Override
        public int isMethod() {
            return isNameExpr;
        }

        /**
         * isComment
         */
        private final ServerString isVariable;

        @Override
        public String isMethod(Context isParameter) {
            return isNameExpr.isMethod();
        }

        isConstructor(int isParameter, ServerString isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    /**
     * isComment
     */
    public enum AlbumsSortOrder implements VersionedEnumWithText {

        __new(isNameExpr.isFieldAccessExpr),
        album(isNameExpr.isFieldAccessExpr),
        artflow(isNameExpr.isFieldAccessExpr),
        artistalbum(isNameExpr.isFieldAccessExpr),
        yearalbum(isNameExpr.isFieldAccessExpr),
        yearartistalbum(isNameExpr.isFieldAccessExpr);

        private final ServerString isVariable;

        @Override
        public boolean isMethod(String isParameter) {
            return true;
        }

        @Override
        public String isMethod(Context isParameter) {
            return isNameExpr.isMethod();
        }

        isConstructor(ServerString isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }
}
