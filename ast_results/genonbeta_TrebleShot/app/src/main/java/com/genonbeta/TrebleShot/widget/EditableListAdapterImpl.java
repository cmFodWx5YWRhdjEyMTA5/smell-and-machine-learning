// isComment
package com.genonbeta.TrebleShot.widget;

import com.genonbeta.TrebleShot.object.Editable;
import com.genonbeta.android.framework.widget.ListAdapterImpl;
import java.util.ArrayList;

/**
 * isComment
 */
public interface isClassOrIsInterface<T extends Editable> extends ListAdapterImpl<T> {

    boolean isMethod(T isParameter);

    void isMethod();

    void isMethod(int isParameter);

    void isMethod(int isParameter, int isParameter);

    void isMethod();

    void isMethod(ArrayList<T> isParameter);
}
