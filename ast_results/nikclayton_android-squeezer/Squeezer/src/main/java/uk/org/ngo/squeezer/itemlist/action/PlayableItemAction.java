// isComment
package uk.org.ngo.squeezer.itemlist.action;

import android.content.Context;
import android.support.annotation.NonNull;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.framework.EnumWithText;
import uk.org.ngo.squeezer.framework.ItemListActivity;
import uk.org.ngo.squeezer.framework.PlaylistItem;

public abstract class isClassOrIsInterface {

    public static final Type[] isVariable = new Type[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };

    public static final Type[] isVariable = new Type[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };

    public enum Type implements EnumWithText {

        /**
         * isComment
         */
        NONE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        PLAY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        ADD(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        INSERT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        BROWSE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

        private final int isVariable;

        isConstructor(int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public String isMethod(Context isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    protected final ItemListActivity isVariable;

    public isConstructor(ItemListActivity isParameter) {
        super();
        this.isFieldAccessExpr = isNameExpr;
    }

    protected String isMethod() {
        return isMethod().isMethod();
    }

    public abstract void isMethod(PlaylistItem isParameter);

    @NonNull
    public static PlayableItemAction isMethod(ItemListActivity isParameter, Type isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return new BrowseSongsAction(isNameExpr);
            case isNameExpr:
                return new AddAction(isNameExpr);
            case isNameExpr:
                return new InsertAction(isNameExpr);
            case isNameExpr:
                return new PlayAction(isNameExpr);
            default:
                return new AskAction(isNameExpr);
        }
    }
}
