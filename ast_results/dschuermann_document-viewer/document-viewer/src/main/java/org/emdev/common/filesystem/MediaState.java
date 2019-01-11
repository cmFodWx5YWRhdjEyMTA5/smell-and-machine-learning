// isComment
package org.emdev.common.filesystem;

import android.os.Environment;
import org.emdev.utils.enums.ResourceConstant;

public enum MediaState implements ResourceConstant {

    /**
     * isComment
     */
    MEDIA_UNMOUNTED(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_CHECKING(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_NOFS(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_MOUNTED(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_MOUNTED_READ_ONLY(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_SHARED(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_REMOVED(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_BAD_REMOVAL(isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    MEDIA_UNMOUNTABLE(isNameExpr.isFieldAccessExpr, true, true);

    public final String isVariable;

    public final boolean isVariable;

    public final boolean isVariable;

    private isConstructor(final String isParameter, final boolean isParameter, final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }
}
