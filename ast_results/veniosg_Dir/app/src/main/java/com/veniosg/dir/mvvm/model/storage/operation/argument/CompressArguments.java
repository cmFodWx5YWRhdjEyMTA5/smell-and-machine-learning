// isComment
package com.veniosg.dir.mvvm.model.storage.operation.argument;

import android.support.annotation.NonNull;
import com.veniosg.dir.mvvm.model.FileHolder;
import com.veniosg.dir.mvvm.model.storage.operation.FileOperation;
import java.io.File;
import java.util.List;

public class isClassOrIsInterface extends FileOperation.Arguments {

    @NonNull
    private final List<FileHolder> isVariable;

    private isConstructor(@NonNull File isParameter, @NonNull List<FileHolder> isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public static CompressArguments isMethod(@NonNull File isParameter, @NonNull List<FileHolder> isParameter) {
        return new CompressArguments(isNameExpr, isNameExpr);
    }

    @NonNull
    public List<FileHolder> isMethod() {
        return isNameExpr;
    }
}
