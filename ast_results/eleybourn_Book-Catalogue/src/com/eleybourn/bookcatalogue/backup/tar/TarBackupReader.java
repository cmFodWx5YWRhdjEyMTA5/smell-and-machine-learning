// isComment
package com.eleybourn.bookcatalogue.backup.tar;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import com.eleybourn.bookcatalogue.backup.BackupContainer;
import com.eleybourn.bookcatalogue.backup.BackupInfo;
import com.eleybourn.bookcatalogue.backup.BackupReaderAbstract;
import com.eleybourn.bookcatalogue.backup.ReaderEntity;
import com.eleybourn.bookcatalogue.backup.ReaderEntity.BackupEntityType;

/**
 * isComment
 */
public class isClassOrIsInterface extends BackupReaderAbstract {

    /**
     * isComment
     */
    private final TarBackupContainer isVariable;

    /**
     * isComment
     */
    private TarArchiveInputStream isVariable;

    /**
     * isComment
     */
    private ReaderEntity isVariable = null;

    /**
     * isComment
     */
    private BackupInfo isVariable;

    /**
     * isComment
     */
    public isConstructor(TarBackupContainer isParameter) throws IOException {
        isNameExpr = isNameExpr;
        // isComment
        FileInputStream isVariable = new FileInputStream(isNameExpr.isMethod());
        isNameExpr = new TarArchiveInputStream(isNameExpr);
        // isComment
        ReaderEntity isVariable = isMethod();
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr)
            throw new RuntimeException("isStringConstant");
        // isComment
        isNameExpr = new BackupInfo(isNameExpr.isMethod());
        // isComment
        while (isNameExpr != null && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isMethod();
        }
        // isComment
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public BackupContainer isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public ReaderEntity isMethod() throws IOException {
        if (isNameExpr != null) {
            ReaderEntity isVariable = isNameExpr;
            isNameExpr = null;
            return isNameExpr;
        }
        TarArchiveEntry isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            return null;
        }
        // isComment
        BackupEntityType isVariable;
        if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()).isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()).isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()).isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
        // isComment
        return new TarReaderEntity(this, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    protected TarArchiveInputStream isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public BackupInfo isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() throws IOException {
        super.isMethod();
        isNameExpr.isMethod();
    }
}
