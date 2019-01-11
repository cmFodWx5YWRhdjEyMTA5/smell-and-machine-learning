// isComment
package net.grandcentrix.tray.core;

import net.grandcentrix.tray.TrayPreferences;
import android.support.annotation.NonNull;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements PreferenceStorage<TrayItem> {

    /**
     * isComment
     */
    public enum Type {

        /**
         * isComment
         */
        UNDEFINED,
        /**
         * isComment
         */
        USER,
        /**
         * isComment
         */
        DEVICE
    }

    private String isVariable;

    private Type isVariable;

    public isConstructor(final String isParameter, final Type isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public abstract void isMethod(final TrayStorage isParameter);

    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Type isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public abstract void isMethod(@NonNull OnTrayPreferenceChangeListener isParameter);

    /**
     * isComment
     */
    public abstract void isMethod(@NonNull OnTrayPreferenceChangeListener isParameter);
}
