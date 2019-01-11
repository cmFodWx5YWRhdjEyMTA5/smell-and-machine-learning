// isComment
package uk.org.ngo.squeezer;

import android.app.Application;
import android.content.Context;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class isClassOrIsInterface extends Application {

    private static Squeezer isVariable;

    public isConstructor() {
        isNameExpr = this;
    }

    public static Context isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(this, new Crashlytics());
        }
    }
}
