// isComment
package de.test.antennapod.ui;

import android.test.ActivityInstrumentationTestCase2;
import com.robotium.solo.Solo;
import de.danoeh.antennapod.activity.VideoplayerActivity;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityInstrumentationTestCase2<VideoplayerActivity> {

    private Solo isVariable;

    public isConstructor() {
        super(VideoplayerActivity.class);
    }

    @Override
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = new Solo(isMethod(), isMethod());
    }

    @Override
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        super.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod() throws Exception {
        isNameExpr.isMethod(VideoplayerActivity.class);
    }
}
