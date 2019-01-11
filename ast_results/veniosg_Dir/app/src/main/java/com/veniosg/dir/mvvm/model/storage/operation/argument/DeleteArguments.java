// isComment
package com.veniosg.dir.mvvm.model.storage.operation.argument;

import android.support.annotation.NonNull;
import com.veniosg.dir.mvvm.model.FileHolder;
import com.veniosg.dir.mvvm.model.storage.operation.FileOperation;
import java.io.File;

public class isClassOrIsInterface extends FileOperation.Arguments {

    @NonNull
    private final FileHolder[] isVariable;

    private isConstructor(@NonNull File isParameter, @NonNull FileHolder... isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public static DeleteArguments isMethod(@NonNull File isParameter, @NonNull FileHolder... isParameter) {
        return new DeleteArguments(isNameExpr, isNameExpr);
    }

    @NonNull
    public FileHolder[] isMethod() {
        return isNameExpr;
    }
}
