// isComment
package com.ichi2.anki;

import com.ichi2.libanki.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface extends RobolectricTest {

    @Test
    public void isMethod() {
        Reviewer isVariable = isNameExpr.isMethod(NullCollectionReviewer.class);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Reviewer isVariable = isNameExpr.isMethod(Reviewer.class);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }
}

class isClassOrIsInterface extends Reviewer {

    @Override
    public Collection isMethod() {
        return null;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    protected void isMethod(Collection isParameter) {
    // isComment
    }
}
