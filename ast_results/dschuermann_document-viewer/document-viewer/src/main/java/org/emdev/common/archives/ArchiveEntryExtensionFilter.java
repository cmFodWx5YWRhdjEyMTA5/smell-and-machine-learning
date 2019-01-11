// isComment
package org.emdev.common.archives;

import java.util.Set;
import org.emdev.common.filesystem.FileExtensionFilter;

public class isClassOrIsInterface extends FileExtensionFilter {

    public isConstructor(final Set<String> isParameter) {
        super(isNameExpr);
    }

    public isConstructor(final String... isParameter) {
        super(isNameExpr);
    }

    public final boolean isMethod(final ArchiveEntry isParameter) {
        return isMethod(isNameExpr.isMethod().isMethod());
    }
}
