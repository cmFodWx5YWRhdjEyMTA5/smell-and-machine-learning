// isComment
package org.dmfs.provider.tasks.utils;

import org.dmfs.jems.function.BiFunction;
import org.dmfs.jems.single.elementary.ValueSingle;
import org.dmfs.optional.Present;
import org.junit.Test;
import static org.dmfs.jems.hamcrest.matchers.SingleMatcher.hasValue;
import static org.dmfs.jems.mockito.doubles.TestDoubles.dummy;
import static org.dmfs.jems.mockito.doubles.TestDoubles.failingMock;
import static org.dmfs.optional.Absent.absent;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Object isVariable = new Object();
        Object isVariable = new Object();
        Object isVariable = new Object();
        BiFunction<Object, Object, Object> isVariable = isMethod(BiFunction.class);
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr);
        isMethod(new Zipped<>(new Present<>(isNameExpr), new ValueSingle<>(isNameExpr), isNameExpr), isMethod(isMethod(isNameExpr)));
    }

    @Test
    public void isMethod() {
        Object isVariable = new Object();
        isMethod(new Zipped<>(isMethod(), new ValueSingle<>(isNameExpr), isMethod(BiFunction.class)), isMethod(isMethod(isNameExpr)));
    }
}
