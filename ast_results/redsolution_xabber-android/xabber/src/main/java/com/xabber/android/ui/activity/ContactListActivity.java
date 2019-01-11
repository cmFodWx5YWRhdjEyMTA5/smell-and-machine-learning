// isComment
package com.xabber.android.ui.activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.Toast;
import com.xabber.android.R;
import com.xabber.android.data.ActivityManager;
import com.xabber.android.data.Application;
import com.xabber.android.data.NetworkException;
import com.xabber.android.data.SettingsManager;
import com.xabber.android.data.account.AccountManager;
import com.xabber.android.data.account.CommonState;
import com.xabber.android.data.account.listeners.OnAccountChangedListener;
import com.xabber.android.data.entity.AccountJid;
import com.xabber.android.data.entity.BaseEntity;
import com.xabber.android.data.entity.UserJid;
import com.xabber.android.data.extension.avatar.AvatarManager;
import com.xabber.android.data.extension.muc.MUCManager;
import com.xabber.android.data.intent.EntityIntentBuilder;
import com.xabber.android.data.log.LogManager;
import com.xabber.android.data.message.AbstractChat;
import com.xabber.android.data.message.MessageManager;
import com.xabber.android.data.roster.AbstractContact;
import com.xabber.android.data.roster.RosterContact;
import com.xabber.android.data.roster.RosterManager;
import com.xabber.android.data.xaccount.XMPPAccountSettings;
import com.xabber.android.data.xaccount.XabberAccountManager;
import com.xabber.android.presentation.mvp.contactlist.ContactListPresenter;
import com.xabber.android.presentation.ui.contactlist.ContactListFragment;
import com.xabber.android.ui.color.ColorManager;
import com.xabber.android.ui.dialog.AccountChooseDialogFragment;
import com.xabber.android.ui.dialog.AccountChooseDialogFragment.OnChooseListener;
import com.xabber.android.ui.dialog.ContactSubscriptionDialog;
import com.xabber.android.ui.dialog.EnterPassDialog;
import com.xabber.android.ui.dialog.MucInviteDialog;
import com.xabber.android.ui.dialog.MucPrivateChatInvitationDialog;
import com.xabber.android.ui.dialog.TranslationDialog;
import com.xabber.android.ui.fragment.ContactListDrawerFragment;
import com.xabber.android.ui.preferences.PreferenceEditor;
import com.xabber.android.ui.widget.bottomnavigation.BottomMenu;
import com.xabber.xmpp.uri.XMPPUri;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import rx.subscriptions.CompositeSubscription;

/**
 * isComment
 */
public class isClassOrIsInterface extends ManagedActivity implements OnAccountChangedListener, View.OnClickListener, OnChooseListener, ContactListFragment.ContactListFragmentListener, ContactListDrawerFragment.ContactListDrawerListener, BottomMenu.OnClickListener {

    /**
     * isComment
     */
    private static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final long isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = ContactListActivity.class.isMethod();

    /**
     * isComment
     */
    private String isVariable;

    /**
     * isComment
     */
    private String isVariable;

    private BottomMenu isVariable;

    private Fragment isVariable;

    private View isVariable;

    private Button isVariable;

    private CompositeSubscription isVariable = new CompositeSubscription();

    public static Intent isMethod(Context isParameter) {
        Intent isVariable = new Intent(isNameExpr, ContactListActivity.class);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    public static Intent isMethod(Context isParameter) {
        return new Intent(isNameExpr, ContactListActivity.class);
    }

    public static Intent isMethod(Context isParameter, AccountJid isParameter, UserJid isParameter) {
        Intent isVariable = new EntityIntentBuilder(isNameExpr, ContactListActivity.class).isMethod(isNameExpr).isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    public static Intent isMethod(Context isParameter, AccountJid isParameter, UserJid isParameter) {
        Intent isVariable = new EntityIntentBuilder(isNameExpr, ContactListActivity.class).isMethod(isNameExpr).isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    public static Intent isMethod(Context isParameter, AccountJid isParameter, UserJid isParameter) {
        Intent isVariable = new EntityIntentBuilder(isNameExpr, ContactListActivity.class).isMethod(isNameExpr).isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    public static Intent isMethod(Context isParameter, AccountJid isParameter, UserJid isParameter) {
        Intent isVariable = new EntityIntentBuilder(isNameExpr, ContactListActivity.class).isMethod(isNameExpr).isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    private static AccountJid isMethod(Intent isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    private static UserJid isMethod(Intent isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        if (isNameExpr.isFieldAccessExpr.isMethod(isMethod().isMethod()) || isNameExpr.isFieldAccessExpr.isMethod(isMethod().isMethod()) || isNameExpr.isFieldAccessExpr.isMethod(isMethod().isMethod()) || isNameExpr.isFieldAccessExpr.isMethod(isMethod().isMethod())) {
            isNameExpr.isMethod().isMethod(this);
        }
        super.isMethod(isNameExpr);
        if (isMethod()) {
            return;
        }
        if (!isMethod() && !isNameExpr.isMethod(isMethod().isMethod())) {
            isMethod();
            return;
        }
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod().isMethod(null);
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isMethod(null);
            isNameExpr = null;
            isNameExpr = isMethod().isMethod();
        }
        isMethod().isMethod(null);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (Button) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new View.OnClickListener() {

            @Override
            public void isMethod(View isParameter) {
                isNameExpr.isMethod();
                isMethod(true);
            }
        });
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod(Intent isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr = isMethod().isMethod();
        isMethod().isMethod(null);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        super.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    private void isMethod(UserJid isParameter, String isParameter) {
        UserJid isVariable = isNameExpr.isMethod();
        ArrayList<BaseEntity> isVariable = new ArrayList<>();
        for (AbstractChat isVariable : isNameExpr.isMethod().isMethod()) {
            if (isNameExpr.isMethod() && isNameExpr.isMethod().isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr);
            return;
        }
        isNameExpr.isMethod();
        Collection<AccountJid> isVariable = isNameExpr.isMethod().isMethod();
        RosterManager isVariable = isNameExpr.isMethod();
        for (AccountJid isVariable : isNameExpr) {
            RosterContact isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr);
            return;
        }
        if (isNameExpr.isMethod()) {
            return;
        }
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isMethod(isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr), isNameExpr);
            return;
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(isMethod(), "isStringConstant");
    }

    /**
     * isComment
     */
    private void isMethod(AccountJid isParameter, UserJid isParameter, String isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod(this, isNameExpr, isNameExpr, null));
        } else {
            isMethod(isNameExpr.isMethod(this, isNameExpr, isNameExpr, isNameExpr));
        }
        isMethod();
    }

    private void isMethod(BaseEntity isParameter, String isParameter) {
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (!isNameExpr.isMethod().isMethod() && isNameExpr.isMethod().isMethod() == null) {
            isMethod(isNameExpr.isMethod(this));
            isMethod();
            return;
        }
        isMethod();
        isMethod();
        isNameExpr.isMethod().isMethod(OnAccountChangedListener.class, this);
        if (isNameExpr != null) {
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr:
                case isNameExpr.isFieldAccessExpr:
                case isNameExpr.isFieldAccessExpr:
                    if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                        isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
                    }
                    isNameExpr.isMethod(this, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr).isMethod();
                    break;
                case isNameExpr.isFieldAccessExpr:
                    {
                        isNameExpr = null;
                        Uri isVariable = isMethod().isMethod();
                        if (isNameExpr != null && "isStringConstant".isMethod(isNameExpr.isMethod())) {
                            XMPPUri isVariable;
                            try {
                                isNameExpr = isNameExpr.isMethod(isNameExpr);
                            } catch (IllegalArgumentException isParameter) {
                                isNameExpr = null;
                            }
                            if (isNameExpr != null && "isStringConstant".isMethod(isNameExpr.isMethod())) {
                                ArrayList<String> isVariable = isNameExpr.isMethod("isStringConstant");
                                String isVariable = null;
                                if (isNameExpr != null && !isNameExpr.isMethod()) {
                                    isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                                }
                                UserJid isVariable = null;
                                try {
                                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
                                } catch (UserJid.UserJidCreateException isParameter) {
                                    isNameExpr.isMethod(this, isNameExpr);
                                }
                                if (isNameExpr != null) {
                                    isMethod(isNameExpr, isNameExpr);
                                }
                            }
                        }
                        break;
                    }
                case isNameExpr.isFieldAccessExpr:
                    {
                        isNameExpr = null;
                        Uri isVariable = isMethod().isMethod();
                        if (isNameExpr != null) {
                            String isVariable = isNameExpr.isMethod();
                            if (isNameExpr != null && isNameExpr.isMethod("isStringConstant")) {
                                try {
                                    UserJid isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
                                    isMethod(isNameExpr, null);
                                } catch (UserJid.UserJidCreateException isParameter) {
                                    isNameExpr.isMethod(this, isNameExpr);
                                }
                            }
                        }
                        break;
                    }
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr = null;
                    isMethod();
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr = null;
                    isMethod();
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr = null;
                    isMethod();
                    break;
            }
        }
        if (isNameExpr.isMethod().isMethod()) {
            if (!isNameExpr.isMethod()) {
                Locale isVariable = isMethod().isMethod().isFieldAccessExpr;
                if (!isNameExpr.isMethod().isMethod("isStringConstant") && !isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
                    new TranslationDialog().isMethod(isMethod(), "isStringConstant");
                }
            }
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        }
        // isComment
        isMethod();
        // isComment
        if (!isNameExpr.isMethod()) {
            isMethod(true);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod();
    }

    public void isMethod() {
        List<XMPPAccountSettings> isVariable = isNameExpr.isMethod().isMethod();
        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
            for (XMPPAccountSettings isVariable : isNameExpr) {
                if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod()) || isNameExpr.isMethod()) {
                    if (!isNameExpr.isMethod() && isNameExpr.isMethod().isMethod(isNameExpr.isMethod()) == null) {
                        if (isNameExpr.isMethod() != null && !isNameExpr.isMethod().isMethod()) {
                            // isComment
                            try {
                                AccountJid isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), "isStringConstant", isNameExpr.isMethod(), true, true, true, true, true, true, true);
                                isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod().isMethod(isNameExpr.isMethod()));
                                isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod());
                                isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod());
                                isNameExpr.isMethod().isMethod(isNameExpr);
                            } catch (NetworkException isParameter) {
                                isNameExpr.isMethod().isMethod(isNameExpr);
                            }
                        // isComment
                        } else
                            isNameExpr.isMethod(isNameExpr).isMethod(isMethod(), EnterPassDialog.class.isMethod());
                    }
                }
            }
            isNameExpr.isMethod().isMethod();
        }
    }

    private void isMethod() {
        Intent isVariable = isMethod();
        AccountJid isVariable = isMethod(isNameExpr);
        UserJid isVariable = isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(isMethod(), MucInviteDialog.class.isMethod());
        }
    }

    private void isMethod() {
        Intent isVariable = isMethod();
        AccountJid isVariable = isMethod(isNameExpr);
        UserJid isVariable = isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(isMethod(), ContactSubscriptionDialog.class.isMethod());
        }
    }

    private void isMethod() {
        Intent isVariable = isMethod();
        AccountJid isVariable = isMethod(isNameExpr);
        UserJid isVariable = isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(isMethod(), MucPrivateChatInvitationDialog.class.isMethod());
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod();
        isNameExpr.isMethod().isMethod(OnAccountChangedListener.class, this);
    }

    private void isMethod() {
        if (isMethod() != null) {
            InputMethodManager isVariable = (InputMethodManager) isMethod(isNameExpr);
            isNameExpr.isMethod(isMethod().isMethod(), isIntegerConstant);
        }
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        super.isMethod(isNameExpr);
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return true;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Configuration isParameter) {
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr);
        // isComment
        new Handler().isMethod(new Runnable() {

            @Override
            public void isMethod() {
                // isComment
                isMethod();
            }
        }, isNameExpr);
    }

    private ContactListFragment isMethod() {
        return (ContactListFragment) isMethod().isMethod(isNameExpr);
    }

    @Override
    public void isMethod(ContextMenu isParameter, View isParameter, ContextMenuInfo isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected Dialog isMethod(int isParameter) {
        super.isMethod(isNameExpr);
        switch(isNameExpr) {
            case isNameExpr:
                ProgressDialog isVariable = new ProgressDialog(this);
                isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isMethod(new OnCancelListener() {

                    @Override
                    public void isMethod(DialogInterface isParameter) {
                        isMethod();
                    }
                });
                isNameExpr.isMethod(true);
                return isNameExpr;
            default:
                return null;
        }
    }

    @Override
    public void isMethod(View isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod(isIntegerConstant);
                break;
        }
    }

    @Override
    public void isMethod(AbstractContact isParameter) {
        if (isNameExpr != null)
            ((ContactListFragment) isNameExpr).isMethod("isStringConstant");
        if (isNameExpr != null)
            isNameExpr.isMethod();
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr.isMethod(), null), isNameExpr);
            return;
        }
        switch(isNameExpr) {
            case isNameExpr:
                {
                    isNameExpr = null;
                    Intent isVariable = isMethod();
                    AccountJid isVariable = isMethod(isNameExpr);
                    UserJid isVariable = isMethod(isNameExpr);
                    if (isNameExpr != null && isNameExpr != null) {
                        try {
                            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
                        } catch (NetworkException isParameter) {
                            isNameExpr.isMethod().isMethod(isNameExpr);
                        }
                    }
                    isMethod();
                    break;
                }
            case isNameExpr.isFieldAccessExpr:
                if (!isMethod(isMethod().isMethod())) {
                    // isComment
                    if (isMethod().isMethod() != null) {
                        isNameExpr = null;
                        isMethod(isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr.isMethod(), (Uri) isMethod().isMethod(isNameExpr.isFieldAccessExpr)));
                        isMethod();
                    }
                } else {
                    isNameExpr = null;
                    isMethod(isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr));
                    isMethod();
                }
                break;
            case isNameExpr.isFieldAccessExpr:
                {
                    isMethod(isNameExpr);
                    isMethod();
                    break;
                }
            default:
                isMethod(isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr.isMethod()), isNameExpr);
                break;
        }
    }

    @Override
    public void isMethod(CommonState isParameter) {
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    private void isMethod(AbstractContact isParameter) {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr.isMethod()));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        Bitmap isVariable;
        if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isMethod())) {
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
        } else {
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(Collection<AccountJid> isParameter) {
        isMethod();
        isMethod();
    }

    @Override
    public void isMethod(AccountJid isParameter, UserJid isParameter, String isParameter) {
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    private void isMethod() {
        BottomMenu isVariable = ((BottomMenu) isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }

    @Override
    public void isMethod(int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr.isMethod(this));
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr.isMethod(this));
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr.isMethod(this));
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr.isMethod(this));
                break;
        }
    }

    @Override
    public void isMethod(AccountJid isParameter) {
        isMethod(isNameExpr.isMethod(this, isNameExpr));
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null && isNameExpr instanceof ContactListFragment) {
            ((ContactListFragment) isNameExpr).isMethod();
            ((ContactListFragment) isNameExpr).isMethod(isIntegerConstant);
            ((ContactListFragment) isNameExpr).isMethod();
        } else
            isMethod(null);
    }

    @Override
    public void isMethod() {
        // isComment
        isMethod();
    }

    @Override
    public void isMethod(AccountJid isParameter) {
        if (isNameExpr != null && isNameExpr instanceof ContactListFragment) {
            // isComment
            ((ContactListFragment) isNameExpr).isMethod(isNameExpr);
            ((ContactListFragment) isNameExpr).isMethod();
        } else
            isMethod(isNameExpr);
    }

    @Override
    public void isMethod(String isParameter) {
        if (isNameExpr != null && isNameExpr instanceof ContactListFragment)
            ((ContactListFragment) isNameExpr).isMethod(isNameExpr);
        else
            isMethod(null);
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null && isNameExpr instanceof ContactListFragment) {
            ((ContactListFragment) isNameExpr).isMethod();
        } else
            isMethod(null);
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod(this));
    }

    private void isMethod() {
        if (!isMethod()) {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod();
            FragmentTransaction isVariable = isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod();
        }
    }

    private void isMethod() {
        if (!isMethod()) {
            isNameExpr = isNameExpr.isMethod();
            FragmentTransaction isVariable = isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod();
        }
    }

    private void isMethod(@Nullable AccountJid isParameter) {
        if (!isMethod()) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            FragmentTransaction isVariable = isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod();
        }
    }

    @Subscribe(threadMode = isNameExpr.isFieldAccessExpr)
    public void isMethod(ContactListPresenter.UpdateUnreadCountEvent isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public void isMethod(AccountJid isParameter) {
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod().isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr));
        }
    }

    public void isMethod() {
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod().isMethod(isNameExpr.isMethod().isMethod().isMethod());
        }
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr != null && isNameExpr instanceof ContactListFragment) {
            ContactListPresenter.ChatListState isVariable = ((ContactListFragment) isNameExpr).isMethod();
            if (isNameExpr == isNameExpr && (isNameExpr == (isNameExpr.isFieldAccessExpr.isFieldAccessExpr) || isNameExpr == (isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                ((ContactListFragment) isNameExpr).isMethod();
            }
        }
    }

    private boolean isMethod(String isParameter) {
        return isNameExpr.isMethod("isStringConstant");
    }

    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
    }

    public void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }
}
