// isComment
package com.xabber.xmpp.vcard;

import java.util.Set;

public enum AddressType {

    HOME,
    WORK,
    POSTAL,
    PARCEL,
    DOM,
    INTL,
    PREF;

    public static boolean isMethod(Set<AddressType> isParameter) {
        return !(isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr));
    }
}
