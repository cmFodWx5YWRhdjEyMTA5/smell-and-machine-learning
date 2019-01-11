// isComment
package pl.hypeapp.endoscope.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import net.grandcentrix.thirtyinch.TiFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pl.hypeapp.endoscope.R;
import pl.hypeapp.endoscope.presenter.NfcReaderPresenter;
import pl.hypeapp.endoscope.ui.activity.ConnectToStreamActivity;
import pl.hypeapp.endoscope.view.NfcReaderView;

public class isClassOrIsInterface extends TiFragment<NfcReaderPresenter, NfcReaderView> implements NfcReaderView {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    Button isVariable;

    @NonNull
    @Override
    public NfcReaderPresenter isMethod() {
        return new NfcReaderPresenter();
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr.isMethod(this, isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        isMethod().isMethod();
    }

    @Override
    public void isMethod(String isParameter) {
        ConnectToStreamActivity isVariable = (ConnectToStreamActivity) isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
    }

    public void isMethod(Intent isParameter) {
        if (isMethod() != null) {
            isMethod().isMethod(isNameExpr);
        }
    }
}
