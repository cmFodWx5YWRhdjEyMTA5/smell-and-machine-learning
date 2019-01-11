// isComment
package org.andstatus.app.note;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.Menu;
import org.andstatus.app.ActivityRequestCode;
import org.andstatus.app.MyAction;
import org.andstatus.app.account.AccountSelector;
import org.andstatus.app.account.MyAccount;
import org.andstatus.app.actor.ActorListType;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.data.MatchedUri;
import org.andstatus.app.data.MyQuery;
import org.andstatus.app.data.TextMediaType;
import org.andstatus.app.database.table.ActivityTable;
import org.andstatus.app.database.table.NoteTable;
import org.andstatus.app.list.ContextMenuItem;
import org.andstatus.app.net.social.Actor;
import org.andstatus.app.os.AsyncTaskLauncher;
import org.andstatus.app.os.MyAsyncTask;
import org.andstatus.app.service.CommandData;
import org.andstatus.app.service.CommandEnum;
import org.andstatus.app.service.MyServiceManager;
import org.andstatus.app.timeline.meta.Timeline;
import org.andstatus.app.timeline.meta.TimelineType;
import org.andstatus.app.util.I18n;
import org.andstatus.app.util.MyHtml;
import org.andstatus.app.util.MyLog;
import org.andstatus.app.util.StringUtils;
import org.andstatus.app.util.TriState;
import org.andstatus.app.view.MyContextMenu;

public enum NoteContextMenuItem implements ContextMenuItem {

    REPLY(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod();
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr);
        }
    }
    ,
    EDIT(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(), isNameExpr.isMethod());
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr);
        }
    }
    ,
    RESEND(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            MyAccount isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()));
            long isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            CommandData isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
            return null;
        }
    }
    ,
    REPLY_TO_CONVERSATION_PARTICIPANTS(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(true).isMethod();
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr);
        }
    }
    ,
    REPLY_TO_MENTIONED_ACTORS(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(true).isMethod();
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr);
        }
    }
    ,
    PRIVATE_NOTE(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            return isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(true);
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr);
        }
    }
    ,
    LIKE {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
    ,
    UNDO_LIKE {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
    ,
    ANNOUNCE {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
    ,
    UNDO_ANNOUNCE {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
    ,
    DELETE_NOTE {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
    ,
    SHARE {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            NoteShare isVariable = new NoteShare(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }
    ,
    COPY_TEXT(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            return isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr);
        }
    }
    ,
    COPY_AUTHOR(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            final long isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(this, () -> "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr);
            return isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr);
        }
    }
    ,
    NOTES_BY_ACTOR(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()));
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
    ,
    NOTES_BY_AUTHOR(true, true) {

        @Override
        NoteEditorData isMethod(NoteContextMenu isParameter) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()));
        }

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
    ,
    FOLLOW_ACTOR(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
        }
    }
    ,
    UNDO_FOLLOW_ACTOR(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
        }
    }
    ,
    FOLLOW_AUTHOR(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
        }
    }
    ,
    UNDO_FOLLOW_AUTHOR(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
        }
    }
    ,
    PROFILE(true, true),
    BLOCK,
    ACT_AS_FIRST_OTHER_ACCOUNT(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            MyAccount isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod(), isNameExpr));
                isNameExpr.isMethod();
            } else {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
    }
    ,
    ACT_AS(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
    }
    ,
    OPEN_NOTE_PERMALINK {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            NoteShare isVariable = new NoteShare(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }
    ,
    VIEW_IMAGE(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            NoteShare isVariable = new NoteShare(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }
    ,
    OPEN_CONVERSATION(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            Uri isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isMethod()), isNameExpr.isMethod());
            String isVariable = isNameExpr.isMethod().isMethod().isMethod();
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) || isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                if (isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr)) {
                    isNameExpr.isMethod(this, "isStringConstant" + isNameExpr);
                }
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, new Intent().isMethod(isNameExpr));
            } else {
                if (isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr)) {
                    isNameExpr.isMethod(this, "isStringConstant" + isNameExpr);
                }
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
            }
        }
    }
    ,
    ACTORS_OF_NOTE(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            Uri isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(), isNameExpr.isMethod(), "isStringConstant");
            if (isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(this, "isStringConstant" + isNameExpr);
            }
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        }
    }
    ,
    SHOW_DUPLICATES(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
    }
    ,
    COLLAPSE_DUPLICATES(true, true) {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
    }
    ,
    GET_NOTE {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod()));
        }
    }
    ,
    OPEN_NOTE_LINK {

        @Override
        void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isMethod()));
        }

        private String isMethod(@NonNull String isParameter) {
            int isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr < isIntegerConstant) {
                return isNameExpr;
            }
            return isNameExpr.isMethod(isNameExpr + isNameExpr.isMethod());
        }
    }
    ,
    NONEXISTENT,
    UNKNOWN;

    public static final String isVariable = "isStringConstant";

    private static final String isVariable = NoteContextMenuItem.class.isMethod();

    private final boolean isVariable;

    public final boolean isVariable;

    isConstructor() {
        this(true, true);
    }

    isConstructor(boolean isParameter, boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr + isMethod() + isIntegerConstant;
    }

    public static NoteContextMenuItem isMethod(int isParameter) {
        for (NoteContextMenuItem isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    protected void isMethod(NoteEditorData isParameter) {
        isNameExpr.isMethod(this, () -> "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        if (!isNameExpr.isMethod(isNameExpr.isMethod())) {
            // isComment
            ClipboardManager isVariable = (ClipboardManager) isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            ClipData isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()), isIntegerConstant), isNameExpr.isMethod(isNameExpr.isMethod()));
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(this, () -> "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        }
    }

    public void isMethod(Menu isParameter, int isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, this.isMethod(), isNameExpr, isNameExpr);
    }

    public void isMethod(Menu isParameter, int isParameter, CharSequence isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, this.isMethod(), isNameExpr, isNameExpr);
    }

    public boolean isMethod(NoteContextMenu isParameter) {
        isNameExpr.isMethod(this, "isStringConstant");
        if (isNameExpr) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, new NoteEditorData(isNameExpr.isFieldAccessExpr.isMethod().isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isIntegerConstant, true));
        }
        return true;
    }

    private void isMethod(final NoteContextMenu isParameter) {
        isNameExpr.isMethod(isNameExpr, true, new MyAsyncTask<Void, Void, NoteEditorData>(isNameExpr + isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

            @Override
            protected NoteEditorData isMethod(Void... isParameter) {
                isNameExpr.isMethod(isNameExpr.this, () -> "isStringConstant" + isNameExpr.isMethod());
                return isMethod(isNameExpr);
            }

            @Override
            protected void isMethod(NoteEditorData isParameter) {
                isNameExpr.isMethod(isNameExpr.this, "isStringConstant");
                isMethod(isNameExpr, isNameExpr);
            }
        });
    }

    NoteEditorData isMethod(NoteContextMenu isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    void isMethod(NoteContextMenu isParameter, NoteEditorData isParameter) {
    // isComment
    }

    void isMethod(CommandEnum isParameter, MyAccount isParameter, Actor isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()));
    }

    void isMethod(CommandEnum isParameter, NoteEditorData isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()));
    }
}
