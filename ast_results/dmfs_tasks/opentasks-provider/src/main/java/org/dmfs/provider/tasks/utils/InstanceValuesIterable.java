// isComment
package org.dmfs.provider.tasks.utils;

import android.content.ContentValues;
import org.dmfs.iterables.elementary.Seq;
import org.dmfs.iterators.SingletonIterator;
import org.dmfs.jems.single.Single;
import org.dmfs.optional.NullSafe;
import org.dmfs.optional.Optional;
import org.dmfs.optional.adapters.FirstPresent;
import org.dmfs.optional.composite.Zipped;
import org.dmfs.provider.tasks.model.TaskAdapter;
import org.dmfs.provider.tasks.processors.tasks.instancedata.Distant;
import org.dmfs.provider.tasks.processors.tasks.instancedata.DueDated;
import org.dmfs.provider.tasks.processors.tasks.instancedata.Enduring;
import org.dmfs.provider.tasks.processors.tasks.instancedata.Overridden;
import org.dmfs.provider.tasks.processors.tasks.instancedata.StartDated;
import org.dmfs.provider.tasks.processors.tasks.instancedata.VanillaInstanceData;
import org.dmfs.rfc5545.DateTime;
import java.util.Iterator;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Iterable<Single<ContentValues>> {

    private final TaskAdapter isVariable;

    public isConstructor(TaskAdapter isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Iterator<Single<ContentValues>> isMethod() {
        Optional<DateTime> isVariable = new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        Optional<DateTime> isVariable = new FirstPresent<>(new Seq<>(new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)), new Zipped<>(isNameExpr, new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)), DateTime::addDuration)));
        Single<ContentValues> isVariable = new Distant(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) ? -isIntegerConstant : isIntegerConstant, new Enduring(new DueDated(isNameExpr, new StartDated(isNameExpr, new VanillaInstanceData()))));
        // isComment
        return new SingletonIterator<>(isNameExpr.isMethod() ? new Overridden(new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)), isNameExpr) : isNameExpr);
    }
}
