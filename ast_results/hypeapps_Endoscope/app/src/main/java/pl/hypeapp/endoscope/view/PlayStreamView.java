// isComment
package pl.hypeapp.endoscope.view;

import android.net.Uri;
import net.grandcentrix.thirtyinch.TiView;
import net.grandcentrix.thirtyinch.callonmainthread.CallOnMainThread;

public interface isClassOrIsInterface extends TiView {

    @CallOnMainThread
    void isMethod();

    @CallOnMainThread
    void isMethod(Uri isParameter);

    @CallOnMainThread
    void isMethod(String isParameter);

    @CallOnMainThread
    void isMethod();
}
