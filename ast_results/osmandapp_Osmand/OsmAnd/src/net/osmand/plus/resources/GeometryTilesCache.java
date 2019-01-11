// isComment
package net.osmand.plus.resources;

import net.osmand.binary.BinaryVectorTileReader;
import net.osmand.data.GeometryTile;
import net.osmand.map.ITileSource;
import net.osmand.plus.resources.AsyncLoadingThread.TileLoadDownloadRequest;
import java.io.File;
import java.io.IOException;

public class isClassOrIsInterface extends TilesCache<GeometryTile> {

    public isConstructor(AsyncLoadingThread isParameter) {
        super(isNameExpr);
        isNameExpr = isIntegerConstant;
    }

    @Override
    public boolean isMethod(ITileSource isParameter) {
        return "isStringConstant".isMethod(isNameExpr.isMethod());
    }

    @Override
    protected GeometryTile isMethod(TileLoadDownloadRequest isParameter) {
        GeometryTile isVariable = null;
        File isVariable = new File(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod()) {
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr, isNameExpr.isMethod());
            } catch (IOException isParameter) {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            } catch (OutOfMemoryError isParameter) {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
                isMethod();
            }
        }
        return isNameExpr;
    }
}
