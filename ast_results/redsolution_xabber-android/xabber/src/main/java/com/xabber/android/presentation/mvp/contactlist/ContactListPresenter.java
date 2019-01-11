// isComment
package com.xabber.android.presentation.mvp.contactlist;

import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.View;
import com.xabber.android.R;
import com.xabber.android.data.Application;
import com.xabber.android.data.SettingsManager;
import com.xabber.android.data.account.AccountItem;
import com.xabber.android.data.account.AccountManager;
import com.xabber.android.data.account.CommonState;
import com.xabber.android.data.account.listeners.OnAccountChangedListener;
import com.xabber.android.data.database.messagerealm.MessageItem;
import com.xabber.android.data.entity.AccountJid;
import com.xabber.android.data.entity.UserJid;
import com.xabber.android.data.extension.blocking.BlockingManager;
import com.xabber.android.data.extension.muc.MUCManager;
import com.xabber.android.data.extension.muc.RoomChat;
import com.xabber.android.data.extension.muc.RoomContact;
import com.xabber.android.data.message.AbstractChat;
import com.xabber.android.data.message.ChatContact;
import com.xabber.android.data.message.MessageManager;
import com.xabber.android.data.message.NewMessageEvent;
import com.xabber.android.data.roster.AbstractContact;
import com.xabber.android.data.roster.GroupManager;
import com.xabber.android.data.roster.OnContactChangedListener;
import com.xabber.android.data.roster.RosterContact;
import com.xabber.android.data.roster.RosterManager;
import com.xabber.android.presentation.ui.contactlist.viewobjects.AccountVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.AccountWithButtonsVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.AccountWithContactsVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.AccountWithGroupsVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.ButtonVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.CategoryVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.ChatVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.ChatWithButtonVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.ContactVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.ExtContactVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.GroupVO;
import com.xabber.android.presentation.ui.contactlist.viewobjects.ToolbarVO;
import com.xabber.android.ui.adapter.ChatComparator;
import com.xabber.android.ui.adapter.contactlist.AccountConfiguration;
import com.xabber.android.ui.adapter.contactlist.ContactListGroupUtils;
import com.xabber.android.ui.adapter.contactlist.GroupConfiguration;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import eu.davidea.flexibleadapter.items.IFlexible;

public class isClassOrIsInterface implements OnContactChangedListener, OnAccountChangedListener, ContactVO.ContactClickListener, AccountVO.AccountClickListener, ToolbarVO.OnClickListener, GroupVO.GroupClickListener, UpdateBackpressure.UpdatableObject {

    private static final int isVariable = isIntegerConstant;

    private static ContactListPresenter isVariable;

    private ContactListView isVariable;

    private UpdateBackpressure isVariable;

    private String isVariable = null;

    protected Locale isVariable = isNameExpr.isMethod();

    private ChatListState isVariable = isNameExpr.isFieldAccessExpr;

    public static ContactListPresenter isMethod() {
        if (isNameExpr == null)
            isNameExpr = new ContactListPresenter();
        return isNameExpr;
    }

    public isConstructor() {
        isNameExpr = new UpdateBackpressure(this);
    }

    public void isMethod(ContactListView isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod().isMethod(OnAccountChangedListener.class, this);
        isNameExpr.isMethod().isMethod(OnContactChangedListener.class, this);
        isNameExpr.isMethod().isMethod(this);
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod() {
        this.isFieldAccessExpr = null;
        isNameExpr.isMethod().isMethod(OnAccountChangedListener.class, this);
        isNameExpr.isMethod().isMethod(OnContactChangedListener.class, this);
        isNameExpr.isMethod().isMethod(this);
        isNameExpr.isMethod();
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }

    public void isMethod(IFlexible isParameter) {
        if (isNameExpr instanceof ContactVO) {
            AccountJid isVariable = ((ContactVO) isNameExpr).isMethod();
            UserJid isVariable = ((ContactVO) isNameExpr).isMethod();
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr));
        } else if (isNameExpr instanceof ButtonVO) {
            ButtonVO isVariable = (ButtonVO) isNameExpr;
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(int isParameter, ContextMenu isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(int isParameter, ContextMenu isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(int isParameter, View isParameter) {
        if (this.isFieldAccessExpr != null)
            this.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(ChatListState isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }

    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Collection<AccountJid> isParameter) {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Collection<RosterContact> isParameter) {
        isNameExpr.isMethod();
    }

    @Subscribe(threadMode = isNameExpr.isFieldAccessExpr)
    public void isMethod(NewMessageEvent isParameter) {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        // isComment
        List<IFlexible> isVariable = new ArrayList<>();
        final Collection<RosterContact> isVariable = isNameExpr.isMethod().isMethod();
        Map<AccountJid, Collection<UserJid>> isVariable = new TreeMap<>();
        for (AccountJid isVariable : isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod(isNameExpr));
        }
        final Collection<RosterContact> isVariable = new ArrayList<>();
        for (RosterContact isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                Collection<UserJid> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                if (isNameExpr != null) {
                    if (!isNameExpr.isMethod(isNameExpr.isMethod()))
                        isNameExpr.isMethod(isNameExpr);
                } else
                    isNameExpr.isMethod(isNameExpr);
            }
        }
        final boolean isVariable = isNameExpr.isMethod();
        final boolean isVariable = isNameExpr.isMethod();
        final boolean isVariable = isNameExpr.isMethod();
        final boolean isVariable = true;
        final boolean isVariable = true;
        final boolean isVariable = isNameExpr.isMethod();
        final Comparator<AbstractContact> isVariable = isNameExpr.isMethod();
        final CommonState isVariable = isNameExpr.isMethod().isMethod();
        final AccountJid isVariable = isNameExpr.isMethod().isMethod();
        /**
         * isComment
         */
        final Map<String, GroupConfiguration> isVariable;
        /**
         * isComment
         */
        final List<AbstractContact> isVariable;
        /**
         * isComment
         */
        final GroupConfiguration isVariable;
        /**
         * isComment
         */
        boolean isVariable = true;
        /**
         * isComment
         */
        boolean isVariable = true;
        final Map<AccountJid, AccountConfiguration> isVariable = new TreeMap<>();
        for (AccountJid isVariable : isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr, null);
        }
        /**
         * isComment
         */
        final Map<AccountJid, Map<UserJid, AbstractChat>> isVariable = new TreeMap<>();
        for (AbstractChat isVariable : isNameExpr.isMethod().isMethod()) {
            if ((isNameExpr instanceof RoomChat || isNameExpr.isMethod()) && isNameExpr.isMethod(isNameExpr.isMethod())) {
                final AccountJid isVariable = isNameExpr.isMethod();
                Map<UserJid, AbstractChat> isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr == null) {
                    isNameExpr = new TreeMap<>();
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
                isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
            }
        }
        if (isNameExpr == null || isNameExpr.isMethod()) {
            // isComment
            if (isNameExpr) {
                isNameExpr = null;
                isNameExpr = null;
                for (Map.Entry<AccountJid, AccountConfiguration> isVariable : isNameExpr.isMethod()) {
                    isNameExpr.isMethod(new AccountConfiguration(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()));
                }
            } else {
                if (isNameExpr) {
                    isNameExpr = new TreeMap<>();
                    isNameExpr = null;
                } else {
                    isNameExpr = null;
                    isNameExpr = new ArrayList<>();
                }
            }
            // isComment
            Collection<AbstractChat> isVariable = isNameExpr.isMethod().isMethod();
            isNameExpr = isMethod(isNameExpr, isNameExpr);
            // isComment
            for (RosterContact isVariable : isNameExpr) {
                if (!isNameExpr.isMethod()) {
                    continue;
                }
                isNameExpr = true;
                final boolean isVariable = isNameExpr.isMethod().isMethod();
                final AccountJid isVariable = isNameExpr.isMethod();
                final Map<UserJid, AbstractChat> isVariable = isNameExpr.isMethod(isNameExpr);
                final AbstractChat isVariable;
                if (isNameExpr == null) {
                    isNameExpr = null;
                } else {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
                }
                if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr)) {
                    continue;
                }
                if (isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr)) {
                    isNameExpr = true;
                }
            }
            for (Map<UserJid, AbstractChat> isVariable : isNameExpr.isMethod()) for (AbstractChat isVariable : isNameExpr.isMethod()) {
                final AbstractContact isVariable;
                if (isNameExpr instanceof RoomChat) {
                    isNameExpr = new RoomContact((RoomChat) isNameExpr);
                } else {
                    isNameExpr = new ChatContact(isNameExpr);
                }
                if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr.isMethod())) {
                    continue;
                }
                final String isVariable;
                final boolean isVariable;
                if (isNameExpr instanceof RoomChat) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    isNameExpr = isNameExpr.isMethod().isMethod();
                } else if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isMethod())) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    isNameExpr = isNameExpr.isMethod().isMethod();
                } else {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    isNameExpr = true;
                }
                isNameExpr = true;
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
            // isComment
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isMethod(new ToolbarVO(isNameExpr.isMethod().isMethod(), this, isNameExpr));
            if (isNameExpr) {
                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    // isComment
                    int isVariable = isIntegerConstant;
                    for (AbstractContact isVariable : isNameExpr.isMethod()) {
                        if (isNameExpr == isNameExpr - isIntegerConstant) {
                            if (isMethod() > isNameExpr)
                                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, this));
                            else
                                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, this, null));
                        } else
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, this, null));
                        isNameExpr++;
                    }
                    if (isNameExpr) {
                        // isComment
                        for (AccountConfiguration isVariable : isNameExpr.isMethod()) {
                            if (isNameExpr.isMethod() != isIntegerConstant) {
                                if (isNameExpr) {
                                    isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                                } else {
                                    isMethod(isNameExpr, isNameExpr, isNameExpr);
                                }
                            } else {
                                AccountWithButtonsVO isVariable = isNameExpr.isMethod(isNameExpr, this);
                                ButtonVO isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
                                isNameExpr.isMethod(isNameExpr);
                                isNameExpr.isMethod(isNameExpr);
                            }
                        }
                    } else {
                        if (isNameExpr) {
                            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                        } else {
                            isMethod(isNameExpr, isNameExpr, isNameExpr);
                        }
                    }
                } else
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), this, null));
            }
        } else {
            // isComment
            final ArrayList<AbstractContact> isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod();
            isNameExpr.isMethod(new CategoryVO(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod(isNameExpr, this) : isNameExpr.isMethod(isNameExpr, this));
            isNameExpr = isNameExpr.isMethod() > isIntegerConstant;
        }
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr != null);
        if (isNameExpr != null) {
            if (isNameExpr.isMethod() == isIntegerConstant && (isNameExpr == null || isNameExpr.isMethod())) {
                if (isNameExpr == isNameExpr.isFieldAccessExpr)
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                if (isNameExpr == isNameExpr.isFieldAccessExpr)
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            } else
                isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    private GroupConfiguration isMethod(Collection<AbstractChat> isParameter, ChatListState isParameter) {
        GroupConfiguration isVariable = new GroupConfiguration(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        List<AbstractChat> isVariable = new ArrayList<>();
        int isVariable = isIntegerConstant;
        for (AbstractChat isVariable : isNameExpr) {
            MessageItem isVariable = isNameExpr.isMethod();
            if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr.isMethod())) {
                AccountItem isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
                if (isNameExpr != null && isNameExpr.isMethod()) {
                    int isVariable = isNameExpr.isMethod();
                    if (isNameExpr.isMethod())
                        isNameExpr = isNameExpr + isNameExpr;
                    switch(isNameExpr) {
                        case isNameExpr:
                            if (!isNameExpr.isMethod() && isNameExpr > isIntegerConstant)
                                isNameExpr.isMethod(isNameExpr);
                            break;
                        case isNameExpr:
                            if (isNameExpr.isMethod())
                                isNameExpr.isMethod(isNameExpr);
                            break;
                        default:
                            // isComment
                            if (!isNameExpr.isMethod())
                                isNameExpr.isMethod(isNameExpr);
                            break;
                    }
                }
            }
        }
        isNameExpr.isMethod().isMethod(new UpdateUnreadCountEvent(isNameExpr));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        int isVariable = isIntegerConstant;
        for (AbstractChat isVariable : isNameExpr) {
            if (isNameExpr < isNameExpr || isNameExpr != isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
                isNameExpr.isMethod(true);
                isNameExpr++;
            } else
                break;
        }
        return isNameExpr;
    }

    private void isMethod(List<IFlexible> isParameter, AccountConfiguration isParameter, boolean isParameter, Comparator<AbstractContact> isParameter) {
        AccountWithGroupsVO isVariable = isNameExpr.isMethod(isNameExpr, this);
        boolean isVariable = true;
        for (GroupConfiguration isVariable : isNameExpr.isMethod()) {
            if (isNameExpr || !isNameExpr.isMethod()) {
                GroupVO isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, this);
                isNameExpr = true;
                isNameExpr.isMethod(isNameExpr);
                for (AbstractContact isVariable : isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod(isNameExpr, this) : isNameExpr.isMethod(isNameExpr, this));
                }
                isNameExpr.isMethod(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(List<IFlexible> isParameter, AccountConfiguration isParameter, Comparator<AbstractContact> isParameter) {
        AccountWithContactsVO isVariable = isNameExpr.isMethod(isNameExpr, this);
        isNameExpr.isMethod(isNameExpr);
        for (AbstractContact isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod(isNameExpr, this) : isNameExpr.isMethod(isNameExpr, this));
        }
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(List<IFlexible> isParameter, boolean isParameter, Map<String, GroupConfiguration> isParameter, Comparator<AbstractContact> isParameter) {
        for (GroupConfiguration isVariable : isNameExpr.isMethod()) {
            if (isNameExpr || !isNameExpr.isMethod()) {
                GroupVO isVariable = isNameExpr.isMethod(isNameExpr, true, this);
                isNameExpr.isMethod(isNameExpr);
                for (AbstractContact isVariable : isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod(isNameExpr, this) : isNameExpr.isMethod(isNameExpr, this));
                }
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    private void isMethod(List<IFlexible> isParameter, List<AbstractContact> isParameter, Comparator<AbstractContact> isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod(isNameExpr, this) : isNameExpr.isMethod(isNameExpr, this));
    }

    private ArrayList<AbstractContact> isMethod(Collection<RosterContact> isParameter, Comparator<AbstractContact> isParameter, Map<AccountJid, Map<UserJid, AbstractChat>> isParameter) {
        final ArrayList<AbstractContact> isVariable = new ArrayList<>();
        // isComment
        for (RosterContact isVariable : isNameExpr) {
            if (!isNameExpr.isMethod()) {
                continue;
            }
            final AccountJid isVariable = isNameExpr.isMethod();
            final Map<UserJid, AbstractChat> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            if (isNameExpr.isMethod().isMethod(isNameExpr).isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        for (Map<UserJid, AbstractChat> isVariable : isNameExpr.isMethod()) {
            for (AbstractChat isVariable : isNameExpr.isMethod()) {
                final AbstractContact isVariable;
                if (isNameExpr instanceof RoomChat) {
                    isNameExpr = new RoomContact((RoomChat) isNameExpr);
                } else {
                    isNameExpr = new ChatContact(isNameExpr);
                }
                if (isNameExpr.isMethod().isMethod(isNameExpr).isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    public ChatListState isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        Collection<AbstractChat> isVariable = isNameExpr.isMethod().isMethod();
        GroupConfiguration isVariable = isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        return isNameExpr.isMethod();
    }

    public ArrayList<IFlexible> isMethod() {
        Collection<AbstractChat> isVariable = isNameExpr.isMethod().isMethod();
        GroupConfiguration isVariable = isMethod(isNameExpr, isNameExpr);
        ArrayList<AbstractContact> isVariable = (ArrayList<AbstractContact>) isNameExpr.isMethod();
        ArrayList<IFlexible> isVariable = new ArrayList<>();
        if (isNameExpr != null && isNameExpr.isMethod() >= isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr - isIntegerConstant), this, null));
            if (isMethod() > isNameExpr)
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr - isIntegerConstant), this));
            else
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr - isIntegerConstant), this));
        }
        return isNameExpr;
    }

    public enum ChatListState {

        recent, unread, archived, all
    }

    public static class isClassOrIsInterface {

        private int isVariable;

        public isConstructor(int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        public int isMethod() {
            return isNameExpr;
        }
    }
}
