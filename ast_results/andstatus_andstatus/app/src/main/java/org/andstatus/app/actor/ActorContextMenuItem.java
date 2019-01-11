// isComment
package org.andstatus.app.actor;

import android.net.Uri;
import android.view.Menu;
import org.andstatus.app.ActivityRequestCode;
import org.andstatus.app.MyAction;
import org.andstatus.app.account.AccountSelector;
import org.andstatus.app.account.MyAccount;
import org.andstatus.app.data.MatchedUri;
import org.andstatus.app.list.ContextMenuItem;
import org.andstatus.app.net.social.Actor;
import org.andstatus.app.note.NoteEditorData;
import org.andstatus.app.origin.Origin;
import org.andstatus.app.os.AsyncTaskLauncher;
import org.andstatus.app.os.MyAsyncTask;
import org.andstatus.app.service.CommandData;
import org.andstatus.app.service.CommandEnum;
import org.andstatus.app.service.MyServiceManager;
import org.andstatus.app.timeline.TimelineActivity;
import org.andstatus.app.timeline.meta.TimelineType;
import org.andstatus.app.util.MyLog;

public enum ActorContextMenuItem implements ContextMenuItem {

    GET_ACTOR(true) {

        @Override
        NoteEditorData isMethod(Params isParameter) {
            CommandData isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod().isMethod(), isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
            return super.isMethod(isNameExpr);
        }
    }
    ,
    PRIVATE_NOTE(true) {

        @Override
        NoteEditorData isMethod(Params isParameter) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod());
        }

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
            if (isNameExpr.isFieldAccessExpr.isMethod().isMethod().isMethod()) {
                isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr);
            }
        }
    }
    ,
    SHARE {

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
        // isComment
        }
    }
    ,
    NOTES_BY_ACTOR(true) {

        @Override
        NoteEditorData isMethod(Params isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(), isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod().isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod().isMethod()), true);
            return super.isMethod(isNameExpr);
        }
    }
    ,
    FOLLOW {

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
    ,
    STOP_FOLLOWING {

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
    ,
    ACT_AS_FIRST_OTHER_ACCOUNT {

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isMethod()));
            isNameExpr.isMethod();
        }
    }
    ,
    ACT_AS {

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
    }
    ,
    FOLLOWERS(true) {

        @Override
        NoteEditorData isMethod(Params isParameter) {
            isMethod(isNameExpr);
            return super.isMethod(isNameExpr);
        }

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }
    ,
    FRIENDS(true) {

        @Override
        NoteEditorData isMethod(Params isParameter) {
            isMethod(isNameExpr);
            return super.isMethod(isNameExpr);
        }

        @Override
        void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }
    ,
    NONEXISTENT,
    UNKNOWN;

    private static class isClassOrIsInterface {

        ActorContextMenu isVariable;

        isConstructor(ActorContextMenu isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    private final boolean isVariable;

    private static final String isVariable = ActorContextMenuItem.class.isMethod();

    isConstructor() {
        this(true);
    }

    isConstructor(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr + isMethod() + isIntegerConstant;
    }

    public static ActorContextMenuItem isMethod(int isParameter) {
        for (ActorContextMenuItem isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public void isMethod(Menu isParameter, int isParameter, int isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr, this.isMethod(), isNameExpr, isNameExpr);
    }

    public void isMethod(Menu isParameter, int isParameter, int isParameter, CharSequence isParameter) {
        isNameExpr.isMethod(isNameExpr, this.isMethod(), isNameExpr, isNameExpr);
    }

    public boolean isMethod(ActorContextMenu isParameter, MyAccount isParameter) {
        Params isVariable = new Params(isNameExpr);
        isNameExpr.isMethod(this, "isStringConstant");
        if (isNameExpr) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr.isFieldAccessExpr, new NoteEditorData(isNameExpr.isMethod(), isNameExpr.isMethod(), isIntegerConstant, isIntegerConstant, true));
        }
        return true;
    }

    private void isMethod(final Params isParameter) {
        isNameExpr.isMethod(isNameExpr, true, new MyAsyncTask<Void, Void, NoteEditorData>(isNameExpr + isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

            @Override
            protected NoteEditorData isMethod(Void... isParameter) {
                isNameExpr.isMethod(this, "isStringConstant" + isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr.isMethod());
                return isMethod(isNameExpr);
            }

            @Override
            protected void isMethod(NoteEditorData isParameter) {
                isNameExpr.isMethod(this, "isStringConstant");
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            }

            @Override
            public String isMethod() {
                return isNameExpr + "isStringConstant" + super.isMethod();
            }
        });
    }

    NoteEditorData isMethod(Params isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    void isMethod(ActorContextMenu isParameter, NoteEditorData isParameter) {
    // isComment
    }

    void isMethod(Params isParameter) {
        Actor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod();
        Origin isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        if (!isNameExpr.isMethod()) {
            isNameExpr.isMethod(this, "isStringConstant" + isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr);
            return;
        }
        if (isNameExpr.isFieldAccessExpr.isMethod().isMethod() || !isNameExpr.isFieldAccessExpr.isMethod().isMethod().isMethod(isNameExpr)) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod().isMethod(isNameExpr));
            if (isNameExpr.isFieldAccessExpr.isMethod().isMethod()) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod().isMethod(isNameExpr));
            }
        }
    }

    void isMethod(ActorContextMenu isParameter, ActorListType isParameter) {
        Uri isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod(), "isStringConstant");
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(this, "isStringConstant" + isNameExpr);
        }
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
    }

    void isMethod(CommandEnum isParameter, ActorContextMenu isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isFieldAccessExpr.isMethod()));
    }
}
