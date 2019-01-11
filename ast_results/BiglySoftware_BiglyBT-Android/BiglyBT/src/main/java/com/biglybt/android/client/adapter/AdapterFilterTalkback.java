// isComment
package com.biglybt.android.client.adapter;

import java.util.List;
import com.biglybt.android.adapter.DelayedFilter;
import android.arch.lifecycle.Lifecycle;
import android.util.SparseIntArray;

/**
 * isComment
 */
public interface isClassOrIsInterface<ADAPTERTYPE extends Comparable<ADAPTERTYPE>> extends DelayedFilter.PerformingFilteringListener {

    void isMethod();

    /**
     * isComment
     */
    boolean isMethod(List<ADAPTERTYPE> isParameter, SparseIntArray isParameter);

    boolean isMethod(Lifecycle.State isParameter);
}
