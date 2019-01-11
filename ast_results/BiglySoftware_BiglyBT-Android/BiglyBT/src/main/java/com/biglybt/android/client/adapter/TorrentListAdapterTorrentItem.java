// isComment
package com.biglybt.android.client.adapter;

import java.util.Map;
import com.biglybt.android.client.session.Session;
import android.support.annotation.NonNull;

public class isClassOrIsInterface extends TorrentListAdapterItem {

    final Long isVariable;

    public isConstructor(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Map<?, ?> isMethod(@NonNull Session isParameter) {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod(@NonNull TorrentListAdapterItem isParameter) {
        if (isNameExpr instanceof TorrentListAdapterTorrentItem) {
            return isNameExpr.isMethod(((TorrentListAdapterTorrentItem) isNameExpr).isFieldAccessExpr);
        }
        return -isIntegerConstant;
    }
}
