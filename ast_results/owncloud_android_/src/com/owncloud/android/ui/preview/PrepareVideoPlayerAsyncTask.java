// isComment
package com.owncloud.android.ui.preview;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Base64;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.owncloud.android.MainApp;
import com.owncloud.android.datamodel.OCFile;
import com.owncloud.android.lib.common.accounts.AccountUtils;
import com.owncloud.android.lib.common.authentication.OwnCloudBasicCredentials;
import com.owncloud.android.lib.common.authentication.OwnCloudBearerCredentials;
import com.owncloud.android.lib.common.authentication.OwnCloudCredentials;
import com.owncloud.android.lib.common.authentication.OwnCloudSamlSsoCredentials;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/**
 * isComment
 */
public class isClassOrIsInterface extends AsyncTask<Object, Void, MediaSource> {

    private Context isVariable;

    private final WeakReference<OnPrepareVideoPlayerTaskListener> isVariable;

    private OCFile isVariable;

    private Account isVariable;

    private Handler isVariable;

    private static final DefaultBandwidthMeter isVariable = new DefaultBandwidthMeter();

    public isConstructor(Context isParameter, OnPrepareVideoPlayerTaskListener isParameter, OCFile isParameter, Account isParameter, Handler isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = new WeakReference<>(isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    protected MediaSource isMethod(Object... isParameter) {
        MediaSource isVariable = null;
        Uri isVariable;
        try {
            // isComment
            isNameExpr = isNameExpr.isMethod() ? isNameExpr.isMethod() : isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr) + isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant"));
            boolean isVariable = true;
            DefaultBandwidthMeter isVariable = isNameExpr ? isNameExpr : null;
            HttpDataSource.Factory isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr);
            // isComment
            DataSource.Factory isVariable = new DefaultDataSourceFactory(isNameExpr, isNameExpr, isNameExpr);
            // isComment
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } catch (AccountUtils.AccountNotFoundException isParameter) {
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private MediaSource isMethod(DataSource.Factory isParameter, Uri isParameter) {
        return new ExtractorMediaSource(isNameExpr, isNameExpr, new DefaultExtractorsFactory(), isNameExpr, null);
    }

    /**
     * isComment
     */
    private HttpDataSource.Factory isMethod(DefaultBandwidthMeter isParameter, OCFile isParameter, Account isParameter) {
        if (isNameExpr.isMethod()) {
            return new DefaultHttpDataSourceFactory(isNameExpr.isMethod(), isNameExpr);
        } else {
            try {
                OwnCloudCredentials isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                String isVariable = isNameExpr.isMethod();
                String isVariable = isNameExpr.isMethod();
                Map<String, String> isVariable = new HashMap<String, String>(isIntegerConstant);
                if (isNameExpr instanceof OwnCloudBasicCredentials) {
                    // isComment
                    String isVariable = isNameExpr + "isStringConstant" + isNameExpr;
                    String isVariable = "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                } else if (isNameExpr instanceof OwnCloudSamlSsoCredentials) {
                    // isComment
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                } else if (isNameExpr instanceof OwnCloudBearerCredentials) {
                    // isComment
                    String isVariable = isNameExpr.isMethod();
                    String isVariable = "isStringConstant" + isNameExpr;
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                }
                return new CustomHttpDataSourceFactory(isNameExpr.isMethod(), isNameExpr, isNameExpr);
            } catch (AuthenticatorException isParameter) {
                isNameExpr.isMethod();
            } catch (IOException isParameter) {
                isNameExpr.isMethod();
            } catch (OperationCanceledException isParameter) {
                isNameExpr.isMethod();
            }
        }
        return null;
    }

    @Override
    protected void isMethod(MediaSource isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            OnPrepareVideoPlayerTaskListener isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    /*isComment*/
    public interface isClassOrIsInterface {

        void isMethod(MediaSource isParameter);
    }
}
