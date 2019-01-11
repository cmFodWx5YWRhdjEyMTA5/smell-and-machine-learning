// isComment
package de.azapps.mirakel.settings.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import org.sufficientlysecure.donations.DonationsFragment;
import de.azapps.mirakel.helper.AnalyticsWrapperBase;
import de.azapps.mirakel.settings.custom_views.Settings;
import de.azapps.mirakel.settings.model_settings.generic_list.IDetailFragment;

public class isClassOrIsInterface extends DonationsFragment implements IDetailFragment<Settings> {

    @NonNull
    @Override
    public Settings isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (((AppCompatActivity) isMethod()).isMethod() != null) {
            ((AppCompatActivity) isMethod()).isMethod().isMethod(isMethod().isMethod());
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this);
    }

    @NonNull
    public static Fragment isMethod() {
        return new DonationFragmentWrapper();
    }
}
