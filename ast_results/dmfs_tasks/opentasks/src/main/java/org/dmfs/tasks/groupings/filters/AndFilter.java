// isComment
package org.dmfs.tasks.groupings.filters;

/**
 * isComment
 */
public final class isClassOrIsInterface extends BinaryOperationFilter {

    public isConstructor(AbstractFilter... isParameter) {
        super("isStringConstant", isNameExpr);
    }
}
