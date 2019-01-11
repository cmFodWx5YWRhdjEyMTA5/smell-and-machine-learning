// isComment
package pl.hypeapp.endoscope.ui.fragment;

import android.content.SharedPreferences;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import net.grandcentrix.thirtyinch.TiFragment;
import pl.hypeapp.endoscope.R;
import pl.hypeapp.endoscope.presenter.NfcPresenter;
import pl.hypeapp.endoscope.view.NfcView;

public class isClassOrIsInterface extends TiFragment<NfcPresenter, NfcView> implements NfcView, NfcAdapter.CreateNdefMessageCallback {

    private static final String isVariable = "isStringConstant";

    @NonNull
    @Override
    public NfcPresenter isMethod() {
        SharedPreferences isVariable = isNameExpr.isMethod(isMethod());
        String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
        return new NfcPresenter(isNameExpr);
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
    }

    @Override
    public void isMethod() {
        NfcAdapter isVariable = isNameExpr.isMethod(isMethod());
        if (isNameExpr != null) {
            isNameExpr.isMethod(this, isMethod());
            isNameExpr.isMethod(isMethod());
        }
    }

    @Override
    public NdefMessage isMethod(NfcEvent isParameter) {
        NdefRecord[] isVariable = isMethod().isMethod();
        // isComment
        return new NdefMessage(isNameExpr);
    }
}
