// isComment
package de.schildbach.wallet.ui.send;

import javax.annotation.Nullable;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.VersionedChecksummedBytes;
import org.bitcoinj.wallet.Wallet;
import de.schildbach.wallet.WalletApplication;
import de.schildbach.wallet.data.DynamicFeeLiveData;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidViewModel {

    public enum State {

        // isComment
        DECODE_KEY,
        // isComment
        CONFIRM_SWEEP,
        // isComment
        PREPARATION,
        // isComment
        SENDING,
        // isComment
        SENT,
        // isComment
        FAILED
    }

    private final WalletApplication isVariable;

    private DynamicFeeLiveData isVariable;

    public final MutableLiveData<String> isVariable = new MutableLiveData<>();

    public State isVariable = isNameExpr.isFieldAccessExpr;

    @Nullable
    public VersionedChecksummedBytes isVariable = null;

    @Nullable
    public Wallet isVariable = null;

    @Nullable
    public Transaction isVariable = null;

    public isConstructor(final Application isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = (WalletApplication) isNameExpr;
    }

    public DynamicFeeLiveData isMethod() {
        if (isNameExpr == null)
            isNameExpr = new DynamicFeeLiveData(isNameExpr);
        return isNameExpr;
    }
}
