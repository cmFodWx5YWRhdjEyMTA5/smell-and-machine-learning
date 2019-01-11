// isComment
package org.bitcoinj.core.listeners;

import org.bitcoinj.core.*;
import javax.annotation.*;
import java.util.*;

/**
 * isComment
 */
@Deprecated
public abstract class isClassOrIsInterface implements PeerDataEventListener {

    @Override
    public void isMethod(Peer isParameter, Block isParameter, @Nullable FilteredBlock isParameter, int isParameter) {
    }

    @Override
    public void isMethod(Peer isParameter, int isParameter) {
    }

    @Override
    public Message isMethod(Peer isParameter, Message isParameter) {
        // isComment
        return isNameExpr;
    }

    @Override
    public List<Message> isMethod(Peer isParameter, GetDataMessage isParameter) {
        return null;
    }
}
