// isComment
package org.wordpress.android.login.di;

import org.wordpress.android.login.Login2FaFragment;
import org.wordpress.android.login.LoginEmailFragment;
import org.wordpress.android.login.LoginEmailPasswordFragment;
import org.wordpress.android.login.LoginGoogleFragment;
import org.wordpress.android.login.LoginMagicLinkRequestFragment;
import org.wordpress.android.login.LoginMagicLinkSentFragment;
import org.wordpress.android.login.LoginSiteAddressFragment;
import org.wordpress.android.login.LoginSiteAddressHelpDialogFragment;
import org.wordpress.android.login.LoginUsernamePasswordFragment;
import org.wordpress.android.login.SignupEmailFragment;
import org.wordpress.android.login.SignupGoogleFragment;
import org.wordpress.android.login.SignupMagicLinkFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class isClassOrIsInterface {

    @ContributesAndroidInjector
    abstract Login2FaFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginEmailFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginEmailPasswordFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginGoogleFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginMagicLinkRequestFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginMagicLinkSentFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginSiteAddressFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginSiteAddressHelpDialogFragment isMethod();

    @ContributesAndroidInjector
    abstract LoginUsernamePasswordFragment isMethod();

    @ContributesAndroidInjector
    abstract SignupEmailFragment isMethod();

    @ContributesAndroidInjector
    abstract SignupGoogleFragment isMethod();

    @ContributesAndroidInjector
    abstract SignupMagicLinkFragment isMethod();
}
