// isComment
package org.lumicall.android.preferences;

import java.util.List;
import java.util.Vector;
import org.lumicall.android.R;
import org.lumicall.android.db.LumicallDataSource;
import org.lumicall.android.db.SIPIdentity;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class isClassOrIsInterface extends DBObjectListPreference<SIPIdentity> {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    protected List<SIPIdentity> isMethod(LumicallDataSource isParameter) {
        return isNameExpr.isMethod();
    }
}
