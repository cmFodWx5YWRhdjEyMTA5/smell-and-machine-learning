// isComment
package org.sufficientlysecure.keychain.ui.base;

import java.io.IOException;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.os.AsyncTask;
import android.os.Bundle;
import nordpol.android.TagDispatcher;
import nordpol.android.TagDispatcherBuilder;
import org.sufficientlysecure.keychain.R;
import org.sufficientlysecure.keychain.securitytoken.CardException;
import org.sufficientlysecure.keychain.securitytoken.NfcTransport;
import org.sufficientlysecure.keychain.securitytoken.SecurityTokenConnection;
import org.sufficientlysecure.keychain.securitytoken.SecurityTokenInfo;
import org.sufficientlysecure.keychain.securitytoken.SecurityTokenInfo.TokenType;
import org.sufficientlysecure.keychain.securitytoken.Transport;
import org.sufficientlysecure.keychain.securitytoken.UsbConnectionDispatcher;
import org.sufficientlysecure.keychain.securitytoken.usb.UnsupportedUsbTokenException;
import org.sufficientlysecure.keychain.securitytoken.usb.UsbTransport;
import org.sufficientlysecure.keychain.securitytoken.usb.UsbTransportException;
import org.sufficientlysecure.keychain.service.PassphraseCacheService;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;
import org.sufficientlysecure.keychain.ui.CreateKeyActivity;
import org.sufficientlysecure.keychain.ui.PassphraseDialogActivity;
import org.sufficientlysecure.keychain.ui.dialog.FidesmoInstallDialog;
import org.sufficientlysecure.keychain.ui.dialog.FidesmoPgpInstallDialog;
import org.sufficientlysecure.keychain.ui.util.Notify;
import org.sufficientlysecure.keychain.ui.util.Notify.Style;
import org.sufficientlysecure.keychain.util.Passphrase;
import timber.log.Timber;

public abstract class isClassOrIsInterface extends BaseActivity {

    public static final int isVariable = isIntegerConstant;

    public static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    protected TagDispatcher isVariable;

    protected UsbConnectionDispatcher isVariable;

    private boolean isVariable;

    protected SecurityTokenInfo isVariable;

    private Passphrase isVariable;

    /**
     * isComment
     */
    protected void isMethod() {
    }

    /**
     * isComment
     */
    protected void isMethod(SecurityTokenConnection isParameter) throws IOException {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant" + isNameExpr);
    }

    /**
     * isComment
     */
    protected void isMethod(SecurityTokenConnection isParameter) {
        Intent isVariable = new Intent(this, CreateKeyActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    protected void isMethod(String isParameter) {
        isNameExpr.isMethod(this, isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
    }

    /**
     * isComment
     */
    protected void isMethod(String isParameter, SecurityTokenInfo isParameter) {
        isMethod(isNameExpr);
    }

    private void isMethod(Tag isParameter) {
        // isComment
        if (!isNameExpr) {
            return;
        }
        NfcTransport isVariable = new NfcTransport(isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(UsbTransport isParameter) {
        // isComment
        if (!isNameExpr) {
            return;
        }
        isMethod(isNameExpr);
    }

    public void isMethod(final Transport isParameter) {
        // isComment
        if (!isNameExpr) {
            return;
        }
        final SecurityTokenConnection isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        new AsyncTask<Void, Void, IOException>() {

            @Override
            protected void isMethod() {
                super.isMethod();
                isMethod();
            }

            @Override
            protected IOException isMethod(Void... isParameter) {
                try {
                    isNameExpr.isMethod(isMethod());
                    isMethod(isNameExpr);
                } catch (IOException isParameter) {
                    return isNameExpr;
                }
                return null;
            }

            @Override
            protected void isMethod(IOException isParameter) {
                super.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    isMethod(isNameExpr, isNameExpr);
                    return;
                }
                isMethod(isNameExpr);
            }
        }.isMethod();
    }

    protected void isMethod() {
        isNameExpr = true;
    }

    protected void isMethod() {
        isNameExpr = true;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = new TagDispatcherBuilder(this, this::nfcTagDiscovered).isMethod(true).isMethod(true).isMethod(true).isMethod(true).isMethod();
        isNameExpr = new UsbConnectionDispatcher(this, this::usbTransportDiscovered);
        // isComment
        if (isNameExpr != null) {
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = true;
        }
        Intent isVariable = isMethod();
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            throw new AssertionError("isStringConstant");
        }
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(final Intent isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(SecurityTokenConnection isParameter, IOException isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isNameExpr instanceof UnsupportedUsbTokenException) {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        if (isNameExpr instanceof TagLostException) {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        if (isNameExpr instanceof NfcTransport.IsoDepNotSupportedException) {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        if (isNameExpr instanceof UsbTransportException) {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()));
            return;
        }
        if (isNameExpr instanceof CardException) {
            short isVariable = ((CardException) isNameExpr).isMethod();
            // isComment
            if ((isNameExpr & (short) isIntegerConstant) == isIntegerConstant) {
                int isVariable = isNameExpr & isIntegerConstant;
                SecurityTokenInfo isVariable = null;
                try {
                    isNameExpr = isNameExpr.isMethod();
                } catch (IOException isParameter) {
                // isComment
                }
                // isComment
                isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr), isNameExpr);
                return;
            }
            // isComment
            switch(isNameExpr) {
                // isComment
                case isIntegerConstant:
                    {
                        SecurityTokenInfo isVariable = null;
                        try {
                            isNameExpr = isNameExpr.isMethod();
                        } catch (IOException isParameter) {
                        // isComment
                        }
                        // isComment
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
                        break;
                    }
                /*isComment*/
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    }
                // isComment
                case isIntegerConstant:
                    {
                        // isComment
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null);
                        break;
                    }
                // isComment
                case isIntegerConstant:
                    {
                        // isComment
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null);
                        break;
                    }
                /*isComment*/
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    }
                /*isComment*/
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    }
                // isComment
                case isIntegerConstant:
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    }
                // isComment
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    }
                // isComment
                case isIntegerConstant:
                    {
                        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            // isComment
                            if (isMethod(isNameExpr)) {
                                isMethod();
                            } else {
                                isMethod();
                            }
                        }
                        break;
                    }
                /*isComment*/
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    }
                /*isComment*/
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
                        break;
                    }
                /*isComment*/
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
                        break;
                    }
                /*isComment*/
                case isIntegerConstant:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
                        break;
                    }
                default:
                    {
                        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()));
                        break;
                    }
            }
        }
        // isComment
        if (isNameExpr.isMethod() != null) {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()));
        } else {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
    }

    /**
     * isComment
     */
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
    }

    protected void isMethod(RequiredInputParcel isParameter) {
        try {
            Passphrase isVariable = isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr.isMethod());
            if (isNameExpr != null) {
                isNameExpr = isNameExpr;
                return;
            }
            Intent isVariable = new Intent(this, PassphraseDialogActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
            isMethod(isNameExpr, isNameExpr);
        } catch (PassphraseCacheService.KeyNotFoundException isParameter) {
            throw new AssertionError("isStringConstant");
        }
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                {
                    if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                        isMethod(isNameExpr);
                        isMethod();
                        return;
                    }
                    CryptoInputParcel isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr = isNameExpr.isMethod();
                    break;
                }
            default:
                super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    protected void isMethod(SecurityTokenConnection isParameter) throws IOException {
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    private void isMethod() {
        FidesmoPgpInstallDialog isVariable = new FidesmoPgpInstallDialog();
        isNameExpr.isMethod(isMethod(), "isStringConstant");
    }

    /**
     * isComment
     */
    private void isMethod() {
        FidesmoInstallDialog isVariable = new FidesmoInstallDialog();
        isNameExpr.isMethod(isMethod(), "isStringConstant");
    }

    /**
     * isComment
     */
    private boolean isMethod(String isParameter) {
        PackageManager isVariable = isMethod();
        boolean isVariable;
        try {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr = true;
        } catch (PackageManager.NameNotFoundException isParameter) {
            isNameExpr.isMethod("isStringConstant");
            isNameExpr = true;
        }
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod() {
        isNameExpr.isMethod();
    }
}
