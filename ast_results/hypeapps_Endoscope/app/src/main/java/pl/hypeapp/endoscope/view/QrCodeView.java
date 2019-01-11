// isComment
package pl.hypeapp.endoscope.view;

import android.graphics.Bitmap;
import net.grandcentrix.thirtyinch.TiView;
import net.grandcentrix.thirtyinch.callonmainthread.CallOnMainThread;

public interface isClassOrIsInterface extends TiView {

    @CallOnMainThread
    void isMethod(Bitmap isParameter);
}
