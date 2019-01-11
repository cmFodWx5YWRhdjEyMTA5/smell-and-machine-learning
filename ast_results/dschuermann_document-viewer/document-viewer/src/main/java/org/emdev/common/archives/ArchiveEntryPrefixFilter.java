// isComment
package org.emdev.common.archives;

import java.util.Set;
import org.emdev.common.filesystem.FilePrefixFilter;

public class isClassOrIsInterface extends FilePrefixFilter {

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
