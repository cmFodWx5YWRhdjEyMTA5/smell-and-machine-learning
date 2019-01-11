// isComment
package com.veniosg.dir.mvvm.model.storage.operation.argument;

import android.support.annotation.NonNull;
import com.veniosg.dir.mvvm.model.FileHolder;
import com.veniosg.dir.mvvm.model.storage.operation.FileOperation;
import java.io.File;
import java.util.List;
import static java.util.Collections.unmodifiableList;

public class isClassOrIsInterface extends FileOperation.Arguments {

    @NonNull
    private final List<FileHolder> isVariable;

    private isConstructor(@NonNull List<FileHolder> isParameter, @NonNull File isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public static MoveArguments isMethod(List<FileHolder> isParameter, File isParameter) {
        return new MoveArguments(isNameExpr, isNameExpr);
    }

    @NonNull
    public List<FileHolder> isMethod() {
        return isMethod(isNameExpr);
    }
}
