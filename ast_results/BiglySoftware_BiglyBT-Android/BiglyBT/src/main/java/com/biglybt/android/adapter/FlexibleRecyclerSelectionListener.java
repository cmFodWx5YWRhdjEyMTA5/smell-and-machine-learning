// isComment
package com.biglybt.android.adapter;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;

/**
 * isComment
 */
public interface isClassOrIsInterface<ADAPTERTYPE extends RecyclerView.Adapter<VH>, VH extends RecyclerView.ViewHolder, T extends Comparable<T>> {

    @UiThread
    void isMethod(ADAPTERTYPE isParameter, int isParameter);

    /**
     * isComment
     */
    @UiThread
    boolean isMethod(ADAPTERTYPE isParameter, int isParameter);

    /**
     * isComment
     */
    @UiThread
    void isMethod(ADAPTERTYPE isParameter, int isParameter, boolean isParameter);

    /**
     * isComment
     */
    @UiThread
    void isMethod(ADAPTERTYPE isParameter, T isParameter, boolean isParameter);
}
