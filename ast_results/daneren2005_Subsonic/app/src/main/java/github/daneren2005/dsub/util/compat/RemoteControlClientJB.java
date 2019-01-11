// isComment
package github.daneren2005.dsub.util.compat;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.media.RemoteControlClient;
import github.daneren2005.dsub.util.SilentBackgroundTask;

@TargetApi(isIntegerConstant)
public class isClassOrIsInterface extends RemoteControlClientICS {

    @Override
    public void isMethod(final Context isParameter, final ComponentName isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(new RemoteControlClient.OnGetPlaybackPositionListener() {

            @Override
            public long isMethod() {
                return isNameExpr.isMethod();
            }
        });
        isNameExpr.isMethod(new RemoteControlClient.OnPlaybackPositionUpdateListener() {

            @Override
            public void isMethod(final long isParameter) {
                new SilentBackgroundTask<Void>(isNameExpr) {

                    @Override
                    protected Void isMethod() throws Throwable {
                        isNameExpr.isMethod((int) isNameExpr);
                        return null;
                    }
                }.isMethod();
                isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);
            }
        });
    }

    @Override
    public void isMethod(final int isParameter, int isParameter, int isParameter) {
        if (isNameExpr == null) {
            return;
        }
        long isVariable = -isIntegerConstant;
        if (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod();
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr, isDoubleConstant);
    }

    @Override
    protected int isMethod() {
        return super.isMethod() | isNameExpr.isFieldAccessExpr;
    }
}
