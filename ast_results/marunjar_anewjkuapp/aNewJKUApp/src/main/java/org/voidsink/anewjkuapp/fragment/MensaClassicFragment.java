// isComment
package org.voidsink.anewjkuapp.fragment;

import org.voidsink.anewjkuapp.mensa.ClassicMenuLoader;
import org.voidsink.anewjkuapp.mensa.MenuLoader;
import org.voidsink.anewjkuapp.utils.Consts;

public class isClassOrIsInterface extends MensaFragmentDetail {

    @Override
    protected MenuLoader isMethod() {
        return new ClassicMenuLoader();
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
