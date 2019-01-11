// isComment
package protect.card_locker.intro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.github.paolorotolo.appintro.AppIntro;

public class isClassOrIsInterface extends AppIntro {

    @Override
    public void isMethod(Bundle isParameter) {
        isMethod(new IntroSlide1());
        isMethod(new IntroSlide2());
        isMethod(new IntroSlide3());
        isMethod(new IntroSlide4());
        isMethod(new IntroSlide5());
        isMethod(new IntroSlide6());
    }

    @Override
    public void isMethod(Fragment isParameter) {
        isMethod();
    }

    @Override
    public void isMethod(Fragment isParameter) {
        isMethod();
    }
}
