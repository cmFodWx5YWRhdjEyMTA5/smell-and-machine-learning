// isComment
package org.osmdroid.samplefragments.tilesources;

import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.tileprovider.tilesource.HEREWeGoTileSource;

public class isClassOrIsInterface extends BaseSampleFragment {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(new HEREWeGoTileSource(isMethod()));
    }
}
