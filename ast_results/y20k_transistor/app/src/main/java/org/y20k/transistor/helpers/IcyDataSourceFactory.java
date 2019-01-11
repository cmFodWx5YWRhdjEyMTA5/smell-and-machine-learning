// isComment
package org.y20k.transistor.helpers;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Factory {

    /*isComment*/
    private final Context isVariable;

    private final TransferListener isVariable;

    private final DataSource.Factory isVariable;

    private boolean isVariable = true;

    private PlayerCallback isVariable;

    /*isComment*/
    public isConstructor(Context isParameter, String isParameter, boolean isParameter, PlayerCallback isParameter) {
        // isComment
        this(isNameExpr, isNameExpr, null, isNameExpr, isNameExpr);
    }

    /*isComment*/
    public isConstructor(Context isParameter, String isParameter, TransferListener isParameter, boolean isParameter, PlayerCallback isParameter) {
        // isComment
        this(isNameExpr, isNameExpr, new DefaultHttpDataSourceFactory(isNameExpr, isNameExpr), isNameExpr, isNameExpr);
    }

    /*isComment*/
    public isConstructor(Context isParameter, TransferListener isParameter, DataSource.Factory isParameter, boolean isParameter, PlayerCallback isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod();
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public DataSource isMethod() {
        // isComment
        if (isNameExpr) {
            return new IcyDataSource(isNameExpr);
        } else {
            return new DefaultDataSource(isNameExpr, isNameExpr, isNameExpr.isMethod());
        }
    }
}
