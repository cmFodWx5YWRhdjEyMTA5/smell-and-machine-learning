// isComment
package com.f2prateek.dfg.ui;

import android.content.Context;
import com.f2prateek.dfg.ForApplication;
import com.f2prateek.dfg.ui.activities.BaseActivity;
import com.f2prateek.dfg.ui.activities.MainActivity;
import com.f2prateek.dfg.ui.activities.ReceiverActivity;
import com.f2prateek.dfg.ui.fragments.AboutFragment;
import com.f2prateek.dfg.ui.fragments.DeviceFragment;
import com.squareup.picasso.Picasso;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(injects = { BaseActivity.class, MainActivity.class, ReceiverActivity.class, DeviceFragment.class, AboutFragment.class, AboutFragment.class }, complete = true, library = true)
public class isClassOrIsInterface {

    @Provides
    @Singleton
    AppContainer isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Provides
    @Singleton
    ActivityHierarchyServer isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Provides
    @Singleton
    Picasso isMethod(@ForApplication Context isParameter) {
        return new Picasso.Builder(isNameExpr).isMethod();
    }
}
