// isComment
package org.sipdroid.sipua.phone;

import android.content.Context;
import android.telephony.ServiceState;

public interface isClassOrIsInterface {

    enum State {

        IDLE, RINGING, OFFHOOK
    }

    State isMethod();

    enum SuppService {

        UNKNOWN,
        SWITCH,
        SEPARATE,
        TRANSFER,
        CONFERENCE,
        REJECT,
        HANGUP
    }

    Context isMethod();

    Call isMethod();

    Call isMethod();

    Call isMethod();

    ServiceState isMethod();
}
