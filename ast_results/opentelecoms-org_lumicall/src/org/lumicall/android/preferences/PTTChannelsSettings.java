// isComment
package org.lumicall.android.preferences;

import java.util.List;
import org.lumicall.android.R;
import org.lumicall.android.db.LumicallDataSource;
import org.lumicall.android.db.PTTChannel;
import org.lumicall.android.db.SIPIdentity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;

public class isClassOrIsInterface extends DBObjectsSettings<PTTChannel> {

    @Override
    protected List<PTTChannel> isMethod(LumicallDataSource isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod(LumicallDataSource isParameter, PTTChannel isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected Class isMethod() {
        return PTTChannelSettings.class;
    }
}
