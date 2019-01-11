// isComment
package net.programmierecke.radiodroid2;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.List;

public class isClassOrIsInterface implements OptionsProvider {

    @Override
    public CastOptions isMethod(Context isParameter) {
        return new CastOptions.Builder().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Override
    public List<SessionProvider> isMethod(Context isParameter) {
        return null;
    }
}
