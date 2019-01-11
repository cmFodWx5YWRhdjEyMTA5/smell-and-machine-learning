// isComment
package net.osmand.plus.resources;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import net.osmand.map.ITileSource;
import net.osmand.plus.SQLiteTileSource;
import net.osmand.plus.resources.AsyncLoadingThread.TileLoadDownloadRequest;
import java.io.File;

public class isClassOrIsInterface extends TilesCache<Bitmap> {

    public isConstructor(AsyncLoadingThread isParameter) {
        super(isNameExpr);
        // isComment
        // isComment
        // isComment
        isNameExpr = isIntegerConstant;
    }

    @Override
    public boolean isMethod(ITileSource isParameter) {
        return !"isStringConstant".isMethod(isNameExpr.isMethod());
    }

    @Override
    protected Bitmap isMethod(TileLoadDownloadRequest isParameter) {
        Bitmap isVariable = null;
        if (isNameExpr.isFieldAccessExpr instanceof SQLiteTileSource) {
            try {
                long[] isVariable = new long[isIntegerConstant];
                isNameExpr = ((SQLiteTileSource) isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                if (isNameExpr[isIntegerConstant] != isIntegerConstant) {
                    isMethod(isNameExpr, isNameExpr[isIntegerConstant]);
                }
            } catch (OutOfMemoryError isParameter) {
                // isComment
                isNameExpr.isMethod("isStringConstant", isNameExpr);
                isMethod();
            }
        } else {
            File isVariable = new File(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod()) {
                try {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
                    isMethod(isNameExpr, isNameExpr.isMethod());
                } catch (OutOfMemoryError isParameter) {
                    // isComment
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                    isMethod();
                }
            }
        }
        return isNameExpr;
    }
}
