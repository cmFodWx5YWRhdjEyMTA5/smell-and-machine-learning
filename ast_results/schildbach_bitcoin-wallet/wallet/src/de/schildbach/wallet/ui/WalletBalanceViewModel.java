// isComment
package de.schildbach.wallet.ui;

import de.schildbach.wallet.WalletApplication;
import de.schildbach.wallet.data.BlockchainStateLiveData;
import de.schildbach.wallet.data.SelectedExchangeRateLiveData;
import de.schildbach.wallet.data.WalletBalanceLiveData;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidViewModel {

    private final WalletApplication isVariable;

    private BlockchainStateLiveData isVariable;

    private WalletBalanceLiveData isVariable;

    private SelectedExchangeRateLiveData isVariable;

    public isConstructor(final Application isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = (WalletApplication) isNameExpr;
    }

    public BlockchainStateLiveData isMethod() {
        if (isNameExpr == null)
            isNameExpr = new BlockchainStateLiveData(isNameExpr);
        return isNameExpr;
    }

    public WalletBalanceLiveData isMethod() {
        if (isNameExpr == null)
            isNameExpr = new WalletBalanceLiveData(isNameExpr);
        return isNameExpr;
    }

    public SelectedExchangeRateLiveData isMethod() {
        if (isNameExpr == null)
            isNameExpr = new SelectedExchangeRateLiveData(isNameExpr);
        return isNameExpr;
    }
}
