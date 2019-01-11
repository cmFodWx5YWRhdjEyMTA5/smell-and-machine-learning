// isComment
package pl.hypeapp.endoscope.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import pl.hypeapp.endoscope.ui.fragment.IpAddressFragment;
import pl.hypeapp.endoscope.ui.fragment.NfcFragment;
import pl.hypeapp.endoscope.ui.fragment.QrCodeFragment;

public class isClassOrIsInterface extends FragmentPagerAdapter {

    public isConstructor(FragmentManager isParameter) {
        super(isNameExpr);
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new IpAddressFragment();
            case isIntegerConstant:
                return new QrCodeFragment();
            case isIntegerConstant:
                return new NfcFragment();
            default:
                break;
        }
        return null;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }
}
