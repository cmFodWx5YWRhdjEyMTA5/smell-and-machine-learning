// isComment
package org.andstatus.app.util;

public interface isClassOrIsInterface {

    boolean isMethod();

    default boolean isMethod() {
        return !isMethod();
    }
}
