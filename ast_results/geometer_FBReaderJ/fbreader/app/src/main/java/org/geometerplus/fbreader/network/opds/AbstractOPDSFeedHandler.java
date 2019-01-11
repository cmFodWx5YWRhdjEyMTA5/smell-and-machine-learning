// isComment
package org.geometerplus.fbreader.network.opds;

import org.geometerplus.zlibrary.core.xml.ZLStringMap;
import org.geometerplus.fbreader.network.atom.ATOMFeedHandler;

abstract class isClassOrIsInterface implements ATOMFeedHandler<OPDSFeedMetadata, OPDSEntry>, OPDSConstants {

    public OPDSFeedMetadata isMethod(ZLStringMap isParameter) {
        return new OPDSFeedMetadata(isNameExpr);
    }

    public OPDSEntry isMethod(ZLStringMap isParameter) {
        return new OPDSEntry(isNameExpr);
    }

    public OPDSLink isMethod(ZLStringMap isParameter) {
        return new OPDSLink(isNameExpr);
    }
}
