// isComment
package uk.org.ngo.squeezer.menu;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.framework.EnumWithText;
import uk.org.ngo.squeezer.framework.EnumWithTextAndIcon;
import uk.org.ngo.squeezer.framework.Item;
import uk.org.ngo.squeezer.framework.ItemAdapter;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseMenuFragment {

    private ListActivityWithViewMenu isVariable;

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
        isNameExpr = (ListActivityWithViewMenu) isMethod();
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod();
                return true;
        }
        return super.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public interface isClassOrIsInterface<T extends Item, ListLayout extends Enum<ListLayout> & EnumWithTextAndIcon, SortOrder extends Enum<SortOrder> & EnumWithText> {

        /**
         * isComment
         */
        void isMethod();

        /**
         * isComment
         */
        FragmentManager isMethod();

        SortOrder isMethod();

        void isMethod(SortOrder isParameter);

        ListLayout isMethod();

        void isMethod(ListLayout isParameter);

        /**
         * isComment
         */
        ItemAdapter<T> isMethod();
    }
}
