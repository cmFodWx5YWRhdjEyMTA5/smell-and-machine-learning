// isComment
package com.veniosg.dir.mvvm.model.storage.operation.argument;

import android.support.annotation.NonNull;
import com.veniosg.dir.mvvm.model.storage.operation.FileOperation;
import java.io.File;

public class isClassOrIsInterface extends FileOperation.Arguments {

    private isConstructor(@NonNull File isParameter) {
        super(isNameExpr);
    }

    public static CreateDirectoryArguments isMethod(@NonNull File isParameter) {
        return new CreateDirectoryArguments(isNameExpr);
    }
}
