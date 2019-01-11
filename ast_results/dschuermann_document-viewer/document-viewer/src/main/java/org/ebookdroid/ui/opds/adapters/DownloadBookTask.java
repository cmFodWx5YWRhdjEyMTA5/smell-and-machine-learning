// isComment
package org.ebookdroid.ui.opds.adapters;

import org.sufficientlysecure.viewer.R;
import org.ebookdroid.opds.exceptions.AuthorizationRequiredException;
import org.ebookdroid.opds.exceptions.OPDSException;
import org.ebookdroid.opds.model.Book;
import org.ebookdroid.opds.model.BookDownloadLink;
import android.content.DialogInterface.OnCancelListener;
import java.io.File;
import org.emdev.ui.progress.IProgressIndicator;
import org.emdev.ui.tasks.BaseFileAsyncTask;

final class isClassOrIsInterface extends BaseFileAsyncTask<Object, DownloadBookResult> implements OnCancelListener, IProgressIndicator {

    private final OPDSAdapter isVariable;

    public isConstructor(OPDSAdapter isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected DownloadBookResult isMethod(final Object... isParameter) {
        final Book isVariable = (Book) isNameExpr[isIntegerConstant];
        final BookDownloadLink isVariable = (BookDownloadLink) isNameExpr[isIntegerConstant];
        try {
            final File isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr, this);
            return new DownloadBookResult(isNameExpr, isNameExpr, isNameExpr);
        } catch (final OPDSException isParameter) {
            return new DownloadBookResult(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    @Override
    protected void isMethod(final DownloadBookResult isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr instanceof AuthorizationRequiredException) {
                isNameExpr.isMethod(isNameExpr);
            } else if (isNameExpr.isFieldAccessExpr instanceof OPDSException) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, (OPDSException) isNameExpr.isFieldAccessExpr);
            } else if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, new OPDSException(isNameExpr.isFieldAccessExpr));
            }
        }
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod(final Throwable isParameter) {
    }
}
