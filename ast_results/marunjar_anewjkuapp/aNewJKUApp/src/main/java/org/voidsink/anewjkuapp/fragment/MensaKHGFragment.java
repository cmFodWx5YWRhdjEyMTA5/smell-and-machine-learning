// isComment
package org.voidsink.anewjkuapp.fragment;

import org.voidsink.anewjkuapp.mensa.KHGMenuLoader;
import org.voidsink.anewjkuapp.mensa.MenuLoader;
import org.voidsink.anewjkuapp.utils.Consts;

public class isClassOrIsInterface extends MensaFragmentDetail {

    @Override
    protected MenuLoader isMethod() {
        return new KHGMenuLoader();
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
