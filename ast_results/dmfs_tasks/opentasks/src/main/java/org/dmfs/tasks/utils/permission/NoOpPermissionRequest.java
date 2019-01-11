// isComment
package org.dmfs.tasks.utils.permission;

import android.app.Activity;

/**
 * isComment
 */
public final class isClassOrIsInterface implements PermissionRequest {

    @Override
    public PermissionRequest isMethod(Permission... isParameter) {
        return this;
    }

    @Override
    public void isMethod(Activity isParameter) {
    // isComment
    }
}
