// isComment
package com.ichi2.anki.analytics;

import android.content.Context;
import com.google.auto.service.AutoService;
import org.acra.config.CoreConfiguration;
import org.acra.interaction.ReportInteraction;
import org.acra.util.Installation;
import java.io.File;
import androidx.annotation.NonNull;
import timber.log.Timber;

@AutoService(ReportInteraction.class)
public class isClassOrIsInterface implements ReportInteraction {

    @Override
    public boolean isMethod(@NonNull Context isParameter, @NonNull CoreConfiguration isParameter, @NonNull File isParameter) {
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant" + isNameExpr.isMethod(isNameExpr));
        return true;
    }
}
