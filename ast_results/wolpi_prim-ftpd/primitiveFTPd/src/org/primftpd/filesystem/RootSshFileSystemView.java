// isComment
package org.primftpd.filesystem;

import org.apache.sshd.common.Session;
import org.apache.sshd.common.file.FileSystemView;
import org.apache.sshd.common.file.SshFile;
import org.primftpd.pojo.LsOutputBean;
import java.io.File;
import eu.chainfire.libsuperuser.Shell;

public class isClassOrIsInterface extends RootFileSystemView<RootSshFile, SshFile> implements FileSystemView {

    private final File isVariable;

    private final Session isVariable;

    public isConstructor(Shell.Interactive isParameter, File isParameter, Session isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected RootSshFile isMethod(LsOutputBean isParameter, String isParameter) {
        return new RootSshFile(isNameExpr, isNameExpr, isNameExpr, isNameExpr, this);
    }

    @Override
    protected String isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Override
    public SshFile isMethod(SshFile isParameter, String isParameter) {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr);
        // isComment
        return isMethod(isNameExpr.isMethod() + "isStringConstant" + isNameExpr);
    }

    @Override
    public FileSystemView isMethod() {
        isNameExpr.isMethod("isStringConstant");
        return this;
    }
}
