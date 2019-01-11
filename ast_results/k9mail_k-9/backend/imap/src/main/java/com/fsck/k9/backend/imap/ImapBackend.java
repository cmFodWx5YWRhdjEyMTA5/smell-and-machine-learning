// isComment
package com.fsck.k9.backend.imap;

import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fsck.k9.backend.api.Backend;
import com.fsck.k9.backend.api.BackendStorage;
import com.fsck.k9.backend.api.SyncConfig;
import com.fsck.k9.backend.api.SyncListener;
import com.fsck.k9.mail.BodyFactory;
import com.fsck.k9.mail.FetchProfile;
import com.fsck.k9.mail.Flag;
import com.fsck.k9.mail.Folder;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.Part;
import com.fsck.k9.mail.PushReceiver;
import com.fsck.k9.mail.Pusher;
import com.fsck.k9.mail.power.PowerManager;
import com.fsck.k9.mail.store.imap.ImapPusher;
import com.fsck.k9.mail.store.imap.ImapStore;
import com.fsck.k9.mail.transport.smtp.SmtpTransport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class isClassOrIsInterface implements Backend {

    private final ImapStore isVariable;

    private final PowerManager isVariable;

    private final SmtpTransport isVariable;

    private final ImapSync isVariable;

    private final CommandRefreshFolderList isVariable;

    private final CommandSetFlag isVariable;

    private final CommandMarkAllAsRead isVariable;

    private final CommandExpunge isVariable;

    private final CommandMoveOrCopyMessages isVariable;

    private final CommandDeleteAll isVariable;

    private final CommandSearch isVariable;

    private final CommandFetchMessage isVariable;

    private final CommandFindByMessageId isVariable;

    private final CommandUploadMessage isVariable;

    public isConstructor(String isParameter, BackendStorage isParameter, ImapStore isParameter, PowerManager isParameter, SmtpTransport isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = new ImapSync(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = new CommandSetFlag(isNameExpr);
        isNameExpr = new CommandMarkAllAsRead(isNameExpr);
        isNameExpr = new CommandExpunge(isNameExpr);
        isNameExpr = new CommandMoveOrCopyMessages(isNameExpr);
        isNameExpr = new CommandRefreshFolderList(isNameExpr, isNameExpr);
        isNameExpr = new CommandDeleteAll(isNameExpr);
        isNameExpr = new CommandSearch(isNameExpr);
        isNameExpr = new CommandFetchMessage(isNameExpr);
        isNameExpr = new CommandFindByMessageId(isNameExpr);
        isNameExpr = new CommandUploadMessage(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(@NotNull String isParameter, @NotNull SyncConfig isParameter, @NotNull SyncListener isParameter, Folder isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NotNull SyncConfig isParameter, @NotNull String isParameter, @NotNull String isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NotNull String isParameter, @NotNull List<String> isParameter, @NotNull Flag isParameter, boolean isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NotNull String isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(@NotNull String isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(@NotNull String isParameter, @NotNull List<String> isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NotNull String isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr);
    }

    @Nullable
    @Override
    public Map<String, String> isMethod(@NotNull String isParameter, @NotNull String isParameter, @NotNull List<String> isParameter) throws MessagingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Nullable
    @Override
    public Map<String, String> isMethod(@NotNull String isParameter, @NotNull String isParameter, @NotNull List<String> isParameter) throws MessagingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @NotNull
    @Override
    public List<String> isMethod(@NotNull String isParameter, @Nullable String isParameter, @Nullable Set<? extends Flag> isParameter, @Nullable Set<? extends Flag> isParameter) throws MessagingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NotNull
    @Override
    public Message isMethod(@NotNull String isParameter, @NotNull String isParameter, @NotNull FetchProfile isParameter) throws MessagingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NotNull String isParameter, @NotNull String isParameter, @NotNull Part isParameter, @NotNull BodyFactory isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Nullable
    @Override
    public String isMethod(@NotNull String isParameter, @NotNull String isParameter) throws MessagingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Nullable
    @Override
    public String isMethod(@NotNull String isParameter, @NotNull Message isParameter) throws MessagingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @NotNull
    @Override
    public Pusher isMethod(@NotNull PushReceiver isParameter) {
        return new ImapPusher(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(@NotNull Message isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod();
    }
}
