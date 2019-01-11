// isComment
package com.xabber.android.data.notification;

import com.xabber.android.data.entity.AccountJid;

public interface isClassOrIsInterface<T extends AccountNotificationItem> extends NotificationProvider<T> {

    void isMethod(AccountJid isParameter);
}
