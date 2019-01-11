// isComment
package org.openintents.openpgp.util;

import java.util.concurrent.Executor;
import android.content.Intent;
import android.os.AsyncTask;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import org.robolectric.shadows.ShadowAsyncTask;

@Implements(OpenPgpApi.OpenPgpAsyncTask.class)
public class isClassOrIsInterface extends ShadowAsyncTask<Void, Integer, Intent> {

    @RealObject
    private OpenPgpApi.OpenPgpAsyncTask isVariable;

    @Implementation
    public AsyncTask<Void, Integer, Intent> isMethod(Executor isParameter, Void... isParameter) {
        return super.isMethod(isNameExpr);
    }
}
