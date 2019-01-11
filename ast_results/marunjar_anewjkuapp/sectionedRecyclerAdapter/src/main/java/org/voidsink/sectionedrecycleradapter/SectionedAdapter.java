// isComment
package org.voidsink.sectionedrecycleradapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public interface isClassOrIsInterface<VH extends RecyclerView.ViewHolder> {

    int isMethod();

    long isMethod(int isParameter);

    VH isMethod(ViewGroup isParameter);

    void isMethod(VH isParameter, int isParameter);
}
