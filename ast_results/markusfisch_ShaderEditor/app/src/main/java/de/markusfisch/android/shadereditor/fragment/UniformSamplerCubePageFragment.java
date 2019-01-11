// isComment
package de.markusfisch.android.shadereditor.fragment;

import de.markusfisch.android.shadereditor.activity.CubeMapActivity;
import de.markusfisch.android.shadereditor.app.ShaderEditorApp;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

public class isClassOrIsInterface extends UniformSampler2dPageFragment {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod() {
        Activity isVariable = isMethod();
        if (isNameExpr == null) {
            return;
        }
        isMethod(new Intent(isNameExpr, CubeMapActivity.class));
    }

    @Override
    protected Cursor isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod();
    }
}
