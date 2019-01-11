// isComment
package pl.hypeapp.endoscope.view;

import net.grandcentrix.thirtyinch.TiView;
import net.grandcentrix.thirtyinch.callonmainthread.CallOnMainThread;

public interface isClassOrIsInterface extends TiView {

    @CallOnMainThread
    void isMethod(String isParameter);
}
