// isComment
package de.schildbach.wallet.ui;

import de.schildbach.wallet.Configuration;
import de.schildbach.wallet.WalletApplication;
import de.schildbach.wallet.data.BlockchainStateLiveData;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidViewModel {

    private final WalletApplication isVariable;

    private BlockchainStateLiveData isVariable;

    private DisclaimerEnabledLiveData isVariable;

    public isConstructor(final Application isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = (WalletApplication) isNameExpr;
    }

    public BlockchainStateLiveData isMethod() {
        if (isNameExpr == null)
            isNameExpr = new BlockchainStateLiveData(isNameExpr);
        return isNameExpr;
    }

    public DisclaimerEnabledLiveData isMethod() {
        if (isNameExpr == null)
            isNameExpr = new DisclaimerEnabledLiveData(isNameExpr);
        return isNameExpr;
    }

    public static class isClassOrIsInterface extends LiveData<Boolean> implements OnSharedPreferenceChangeListener {

        private final Configuration isVariable;

        public isConstructor(final WalletApplication isParameter) {
            this.isFieldAccessExpr = isNameExpr.isMethod();
        }

        @Override
        protected void isMethod() {
            isNameExpr.isMethod(this);
            isMethod(isNameExpr.isMethod());
        }

        @Override
        protected void isMethod() {
            isNameExpr.isMethod(this);
        }

        @Override
        public void isMethod(final SharedPreferences isParameter, final String isParameter) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr))
                isMethod(isNameExpr.isMethod());
        }
    }
}
