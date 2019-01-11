// isComment
package org.osmdroid.samplefragments.tileproviders;

import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.tileprovider.MapTileProviderArray;
import org.osmdroid.tileprovider.modules.MapTileAssetsProvider;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.util.SimpleRegisterReceiver;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseSampleFragment {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod() {
        this.isFieldAccessExpr.isMethod(true);
        MapTileAssetsProvider isVariable = new MapTileAssetsProvider(new SimpleRegisterReceiver(isMethod()), isMethod().isMethod());
        this.isFieldAccessExpr.isMethod(new MapTileProviderArray(isNameExpr.isFieldAccessExpr, new SimpleRegisterReceiver(isMethod()), new MapTileModuleProviderBase[] { isNameExpr }));
    }
}
