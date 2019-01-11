// isComment
package de.markusfisch.android.shadereditor.fragment;

import de.markusfisch.android.shadereditor.activity.LoadSampleActivity;
import de.markusfisch.android.shadereditor.adapter.SamplesAdapter;
import de.markusfisch.android.shadereditor.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class isClassOrIsInterface extends Fragment {

    private SamplesAdapter isVariable;

    private ListView isVariable;

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod());
        return isNameExpr;
    }

    private void isMethod(Context isParameter) {
        isNameExpr = new SamplesAdapter(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(new AdapterView.OnItemClickListener() {

            @Override
            public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
                isMethod(isNameExpr.isMethod(isNameExpr));
            }
        });
    }

    private void isMethod(SamplesAdapter.Sample isParameter) {
        Activity isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod();
        }
    }
}
