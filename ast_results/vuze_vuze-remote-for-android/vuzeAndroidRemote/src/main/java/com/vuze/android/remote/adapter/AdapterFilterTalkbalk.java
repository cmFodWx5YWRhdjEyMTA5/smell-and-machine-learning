// isComment
package com.vuze.android.remote.adapter;

import java.util.HashMap;
import java.util.List;

/**
 * isComment
 */
public interface isClassOrIsInterface<T extends Comparable<T>> {

    List<T> isMethod(List<T> isParameter, boolean isParameter);

    void isMethod();

    void isMethod(List<T> isParameter);

    void isMethod(HashMap<String, Integer> isParameter);
}
