// isComment
package net.gsantner.markor.activity.openeditor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import net.gsantner.markor.util.AppSettings;

public class isClassOrIsInterface extends OpenEditorActivity {

    @Override
    protected void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(new AppSettings(isMethod()).isMethod());
    }
}
