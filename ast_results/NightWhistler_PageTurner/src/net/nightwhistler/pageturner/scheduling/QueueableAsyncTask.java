// isComment
package net.nightwhistler.pageturner.scheduling;

import android.os.AsyncTask;
import jedi.functional.Command;
import jedi.functional.Functor;
import jedi.option.Option;
import net.nightwhistler.ui.UiUtils;
import static java.lang.Integer.toHexString;
import static jedi.option.Options.none;

/**
 * isComment
 */
public class isClassOrIsInterface<Params, Progress, Result> extends AsyncTask<Params, Progress, Option<Result>> {

    public static interface isClassOrIsInterface {

        void isMethod(QueueableAsyncTask<?, ?, ?> isParameter, boolean isParameter);
    }

    private UiUtils.Action isVariable;

    private Command<Option<Result>> isVariable;

    private Command<Option<Result>> isVariable;

    private Command<Progress[]> isVariable;

    private Functor<Params[], Option<Result>> isVariable;

    private QueueCallback isVariable;

    private boolean isVariable = true;

    @Override
    protected final void isMethod() {
        this.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod() {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod();
        }
    }

    @Override
    protected final void isMethod(Progress... isParameter) {
        this.isMethod(isNameExpr);
    }

    public void isMethod(Progress... isParameter) {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    @Override
    protected final void isMethod(Option<Result> isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(this, this.isFieldAccessExpr);
        }
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod() {
        this.isFieldAccessExpr = true;
        this.isMethod(true);
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    protected final void isMethod(Option<Result> isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(this, this.isFieldAccessExpr);
        }
        isMethod(isNameExpr);
    }

    @Override
    protected final void isMethod() {
        isMethod(null);
    }

    public void isMethod(Option<Result> isParameter) {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    public void isMethod(QueueCallback isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Option<Result> isParameter) {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public Option<Result> isMethod(Params... isParameter) {
        if (this.isFieldAccessExpr != null) {
            return this.isFieldAccessExpr.isMethod(isNameExpr);
        }
        return isMethod();
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod() + "isStringConstant" + isMethod(isMethod()) + "isStringConstant";
    }

    /**
     * isComment
     */
    public QueueableAsyncTask isMethod(Command<Option<Result>> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        return this;
    }

    public QueueableAsyncTask isMethod(Command<Option<Result>> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        return this;
    }

    public QueueableAsyncTask isMethod(Functor<Params[], Option<Result>> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        return this;
    }

    public void isMethod(UiUtils.Action isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(Command<Progress[]> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
