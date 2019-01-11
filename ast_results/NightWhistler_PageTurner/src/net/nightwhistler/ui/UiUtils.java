// isComment
package net.nightwhistler.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.SearchView;
import jedi.option.Option;
import static jedi.option.Options.option;

/**
 * isComment
 */
public class isClassOrIsInterface {

    public static interface isClassOrIsInterface<A> {

        void isMethod(A isParameter);
    }

    public static interface isClassOrIsInterface {

        void isMethod();
    }

    public static Operation<Action> isMethod(Menu isParameter, int isParameter) {
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public static Operation<Action> isMethod(MenuItem isParameter) {
        return isParameter -> isNameExpr.isMethod(isParameter -> {
            isNameExpr.isMethod();
            return true;
        });
    }

    public static Operation<Action> isMethod(android.view.MenuItem isParameter) {
        return isParameter -> isNameExpr.isMethod(isParameter -> {
            isNameExpr.isMethod();
            return true;
        });
    }

    public static SearchView.OnQueryTextListener isMethod(Operation<String> isParameter) {
        return new SearchView.OnQueryTextListener() {

            @Override
            public boolean isMethod(String isParameter) {
                isNameExpr.isMethod(isNameExpr);
                return true;
            }

            @Override
            public boolean isMethod(String isParameter) {
                return true;
            }
        };
    }

    public static MenuItem.OnActionExpandListener isMethod(Action isParameter) {
        return new MenuItem.OnActionExpandListener() {

            @Override
            public boolean isMethod(MenuItem isParameter) {
                return true;
            }

            @Override
            public boolean isMethod(MenuItem isParameter) {
                isNameExpr.isMethod();
                return true;
            }
        };
    }

    public static Option<TextView> isMethod(View isParameter, int isParameter) {
        return isMethod(isNameExpr, isNameExpr, TextView.class);
    }

    public static Option<ImageView> isMethod(View isParameter, int isParameter) {
        return isMethod(isNameExpr, isNameExpr, ImageView.class);
    }

    public static <T extends View> Option<T> isMethod(View isParameter, int isParameter, Class<T> isParameter) {
        return isMethod((T) isNameExpr.isMethod(isNameExpr));
    }
}
