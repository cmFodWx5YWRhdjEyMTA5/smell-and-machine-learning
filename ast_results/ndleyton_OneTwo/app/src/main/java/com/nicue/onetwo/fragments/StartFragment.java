// isComment
package com.nicue.onetwo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nicue.onetwo.R;

public class isClassOrIsInterface extends Fragment {

    /**
     * isComment
     */
    public interface isClassOrIsInterface {

        void isMethod(View isParameter);
    }

    @Nullable
    @Override
    public View isMethod(LayoutInflater isParameter, @Nullable ViewGroup isParameter, @Nullable Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        return isNameExpr;
    }
}
