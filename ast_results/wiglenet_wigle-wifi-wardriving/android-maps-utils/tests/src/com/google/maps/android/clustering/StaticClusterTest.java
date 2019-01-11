// isComment
package com.google.maps.android.clustering;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.algo.StaticCluster;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    private StaticCluster<ClusterItem> isVariable;

    public void isMethod() {
        isNameExpr = new StaticCluster<ClusterItem>(new LatLng(isDoubleConstant, isDoubleConstant));
    }

    public void isMethod() {
        StaticCluster<ClusterItem> isVariable = new StaticCluster<ClusterItem>(new LatLng(isDoubleConstant, isDoubleConstant));
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    public void isMethod() {
        StaticCluster<ClusterItem> isVariable = new StaticCluster<ClusterItem>(new LatLng(isDoubleConstant, isDoubleConstant));
        isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod() == isNameExpr.isMethod());
    }
}
