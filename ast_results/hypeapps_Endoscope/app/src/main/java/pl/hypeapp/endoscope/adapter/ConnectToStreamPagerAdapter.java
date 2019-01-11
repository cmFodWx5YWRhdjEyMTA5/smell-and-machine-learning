// isComment
package pl.hypeapp.endoscope.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.HashMap;
import pl.hypeapp.endoscope.ui.fragment.NfcReaderFragment;
import pl.hypeapp.endoscope.ui.fragment.QrCodeScannerFragment;
import pl.hypeapp.endoscope.ui.fragment.WriteIpAddressFragment;

public class isClassOrIsInterface extends FragmentPagerAdapter {

    private static final int isVariable = isIntegerConstant;

    private HashMap<Integer, Fragment> isVariable = new HashMap<>();

    public isConstructor(FragmentManager isParameter) {
        super(isNameExpr);
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new WriteIpAddressFragment();
            case isIntegerConstant:
                return new QrCodeScannerFragment();
            case isIntegerConstant:
                // isComment
                if (isNameExpr.isMethod(isNameExpr) != null) {
                    return isNameExpr.isMethod(isNameExpr);
                }
                NfcReaderFragment isVariable = new NfcReaderFragment();
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return isNameExpr;
            default:
                break;
        }
        return null;
    }

    @Override
    public int isMethod() {
        return isNameExpr;
    }
}
