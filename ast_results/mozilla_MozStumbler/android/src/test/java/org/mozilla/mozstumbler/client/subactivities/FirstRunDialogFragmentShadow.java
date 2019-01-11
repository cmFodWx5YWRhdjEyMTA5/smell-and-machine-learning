// isComment
package org.mozilla.mozstumbler.client.subactivities;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import static org.robolectric.Robolectric.directlyOn;

@Implements(Fragment.class)
public class isClassOrIsInterface {

    @RealObject
    private DialogFragment isVariable;

    private boolean isVariable;

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Implementation
    public final FragmentActivity isMethod() {
        if (this.isFieldAccessExpr) {
            return null;
        }
        return isMethod(isNameExpr, Fragment.class).isMethod();
    }
}
