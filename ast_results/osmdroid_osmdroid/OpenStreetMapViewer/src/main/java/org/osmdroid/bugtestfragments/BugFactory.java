// isComment
package org.osmdroid.bugtestfragments;

import org.osmdroid.ISampleFactory;
import org.osmdroid.samplefragments.BaseSampleFragment;

/**
 * isComment
 */
public final class isClassOrIsInterface implements ISampleFactory {

    private final Class<? extends BaseSampleFragment>[] isVariable;

    private static ISampleFactory isVariable;

    public static ISampleFactory isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new BugFactory();
        }
        return isNameExpr;
    }

    private isConstructor() {
        isNameExpr = new Class[] { Bug82WinDeath.class, SampleBug57.class, Bug382Crash.class, Bug164EndlessOnScolls.class, Bug419Zoom.class, Bug445Caching.class, Bug512Marker.class, Bug512CacheManagerWp.class, Bug846InfiniteRedrawLoop.class };
    }

    public BaseSampleFragment isMethod(int isParameter) {
        try {
            return isNameExpr[isNameExpr].isMethod();
        } catch (InstantiationException isParameter) {
            isNameExpr.isMethod();
        } catch (IllegalAccessException isParameter) {
            isNameExpr.isMethod();
        }
        return null;
    }

    public int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
