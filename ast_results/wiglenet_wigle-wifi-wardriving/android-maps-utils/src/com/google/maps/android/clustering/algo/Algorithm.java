// isComment
package com.google.maps.android.clustering.algo;

import java.util.Collection;
import java.util.Set;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;

/**
 * isComment
 */
public interface isClassOrIsInterface<T extends ClusterItem> {

    void isMethod(T isParameter);

    void isMethod(Collection<T> isParameter);

    void isMethod();

    void isMethod(T isParameter);

    Set<? extends Cluster<T>> isMethod(double isParameter);

    Collection<T> isMethod();
}
