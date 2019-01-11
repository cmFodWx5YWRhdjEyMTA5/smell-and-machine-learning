// isComment
package io.mrarm.irc.util;

import java.util.concurrent.Future;
import io.mrarm.chatlib.ResponseCallback;
import io.mrarm.chatlib.ResponseErrorCallback;
import io.mrarm.chatlib.dto.MessageFilterOptions;
import io.mrarm.chatlib.dto.MessageInfo;
import io.mrarm.chatlib.dto.MessageList;
import io.mrarm.chatlib.dto.MessageListAfterIdentifier;
import io.mrarm.chatlib.message.MessageListener;
import io.mrarm.chatlib.message.WritableMessageStorageApi;
import io.mrarm.chatlib.util.InstantFuture;

public class isClassOrIsInterface implements WritableMessageStorageApi {

    @Override
    public Future<Void> isMethod(String isParameter, MessageInfo isParameter, ResponseCallback<Void> isParameter, ResponseErrorCallback isParameter) {
        return new InstantFuture<>(null);
    }

    @Override
    public Future<MessageList> isMethod(String isParameter, int isParameter, MessageFilterOptions isParameter, MessageListAfterIdentifier isParameter, ResponseCallback<MessageList> isParameter, ResponseErrorCallback isParameter) {
        return null;
    }

    @Override
    public MessageListAfterIdentifier isMethod(String isParameter, int isParameter, MessageFilterOptions isParameter, MessageListAfterIdentifier isParameter) {
        return null;
    }

    @Override
    public Future<Void> isMethod(String isParameter, MessageListener isParameter, ResponseCallback<Void> isParameter, ResponseErrorCallback isParameter) {
        return new InstantFuture<>(null);
    }

    @Override
    public Future<Void> isMethod(String isParameter, MessageListener isParameter, ResponseCallback<Void> isParameter, ResponseErrorCallback isParameter) {
        return new InstantFuture<>(null);
    }
}
