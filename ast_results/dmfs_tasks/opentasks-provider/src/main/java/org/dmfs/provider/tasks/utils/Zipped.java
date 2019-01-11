// isComment
package org.dmfs.provider.tasks.utils;

import org.dmfs.jems.function.BiFunction;
import org.dmfs.jems.optional.decorators.Mapped;
import org.dmfs.jems.single.Single;
import org.dmfs.jems.single.combined.Backed;
import org.dmfs.jems.single.decorators.DelegatingSingle;
import org.dmfs.optional.Optional;

/**
 * isComment
 */
@Deprecated
public final class isClassOrIsInterface<T> extends DelegatingSingle<T> {

    public <V> isConstructor(Optional<V> isParameter, Single<T> isParameter, BiFunction<V, T, T> isParameter) {
        super(new Backed<T>(new Mapped<>(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()), isNameExpr), isNameExpr));
    }
}
