// isComment
package com.google.maps.android.clustering.view;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import java.util.Set;

/**
 * isComment
 */
public interface isClassOrIsInterface<T extends ClusterItem> {

    /**
     * isComment
     */
    void isMethod(Set<? extends Cluster<T>> isParameter);

    void isMethod(ClusterManager.OnClusterClickListener<T> isParameter);

    void isMethod(ClusterManager.OnClusterInfoWindowClickListener<T> isParameter);

    void isMethod(ClusterManager.OnClusterItemClickListener<T> isParameter);

    void isMethod(ClusterManager.OnClusterItemInfoWindowClickListener<T> isParameter);

    /**
     * isComment
     */
    void isMethod();

    /**
     * isComment
     */
    void isMethod();
}
