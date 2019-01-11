// isComment
package org.ebookdroid.core.codec;

import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

public abstract class isClassOrIsInterface implements CodecPage {

    @Override
    public List<PageLink> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public List<PageTextBox> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public List<? extends RectF> isMethod(String isParameter) {
        return isNameExpr.isMethod();
    }
}
