// isComment
package org.voidsink.anewjkuapp.fragment;

import org.voidsink.anewjkuapp.mensa.ChoiceMenuLoader;
import org.voidsink.anewjkuapp.mensa.MenuLoader;
import org.voidsink.anewjkuapp.utils.Consts;

public class isClassOrIsInterface extends MensaFragmentDetail {

    @Override
    protected MenuLoader isMethod() {
        return new ChoiceMenuLoader();
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
