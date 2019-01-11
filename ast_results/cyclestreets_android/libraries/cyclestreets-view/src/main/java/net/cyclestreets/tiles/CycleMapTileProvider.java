// isComment
package net.cyclestreets.tiles;

import android.content.Context;
import net.cyclestreets.AppInfo;
import org.mapsforge.map.android.MapsforgeOSMDroidTileProvider;
import org.osmdroid.tileprovider.IMapTileProviderCallback;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.MapTileProviderArray;
import org.osmdroid.tileprovider.modules.CycleStreetsTileDownloader;
import org.osmdroid.tileprovider.modules.MapTileFilesystemProvider;
import org.osmdroid.tileprovider.modules.NetworkAvailabliltyCheck;
import org.osmdroid.tileprovider.modules.TileWriter;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.util.SimpleRegisterReceiver;
import okhttp3.Interceptor;

class isClassOrIsInterface extends MapTileProviderArray implements IMapTileProviderCallback {

    public isConstructor(final Context isParameter, final ITileSource isParameter) {
        this(isNameExpr, isNameExpr, new SimpleRegisterReceiver(isNameExpr));
    }

    private isConstructor(final Context isParameter, final ITileSource isParameter, final IRegisterReceiver isParameter) {
        super(isNameExpr, isNameExpr);
        Interceptor isVariable = new UserAgentInterceptor(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        final MapTileFilesystemProvider isVariable = new MapTileFilesystemProvider(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        final NetworkAvailabliltyCheck isVariable = new NetworkAvailabliltyCheck(isNameExpr);
        final CycleStreetsTileDownloader isVariable = new CycleStreetsTileDownloader.Builder().isMethod(isNameExpr).isMethod(new TileWriter()).isMethod(isNameExpr).isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr);
        final MapsforgeOSMDroidTileProvider isVariable = new MapsforgeOSMDroidTileProvider(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
