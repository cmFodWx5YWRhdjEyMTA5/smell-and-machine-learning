// isComment
package com.owncloud.android.utils;

import android.content.res.Resources;
import com.owncloud.android.R;
import com.owncloud.android.lib.common.operations.RemoteOperation;
import com.owncloud.android.lib.common.operations.RemoteOperationResult;
import com.owncloud.android.lib.common.operations.RemoteOperationResult.ResultCode;
import com.owncloud.android.operations.CopyFileOperation;
import com.owncloud.android.operations.CreateFolderOperation;
import com.owncloud.android.operations.CreateShareViaLinkOperation;
import com.owncloud.android.operations.CreateShareWithShareeOperation;
import com.owncloud.android.operations.DownloadFileOperation;
import com.owncloud.android.operations.MoveFileOperation;
import com.owncloud.android.operations.RemoveFileOperation;
import com.owncloud.android.operations.RenameFileOperation;
import com.owncloud.android.operations.SynchronizeFileOperation;
import com.owncloud.android.operations.SynchronizeFolderOperation;
import com.owncloud.android.operations.UnshareOperation;
import com.owncloud.android.operations.UpdateSharePermissionsOperation;
import com.owncloud.android.operations.UpdateShareViaLinkOperation;
import com.owncloud.android.operations.UploadFileOperation;
import org.apache.commons.httpclient.ConnectTimeoutException;
import java.io.File;
import java.net.SocketTimeoutException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    private isConstructor() {
    // isComment
    }

    /**
     * isComment
     */
    @NonNull
    public static String isMethod(RemoteOperationResult isParameter, RemoteOperation isParameter, Resources isParameter) {
        String isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr == null || isNameExpr.isMethod() <= isIntegerConstant) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        if (isNameExpr == null || isNameExpr.isMethod() <= isIntegerConstant) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        if (isNameExpr == null) {
            if (isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Nullable
    private static String isMethod(RemoteOperationResult isParameter, RemoteOperation isParameter, Resources isParameter) {
        String isVariable = null;
        if (isNameExpr instanceof UploadFileOperation) {
            isNameExpr = isMethod(isNameExpr, (UploadFileOperation) isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof DownloadFileOperation) {
            isNameExpr = isMethod(isNameExpr, (DownloadFileOperation) isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof RemoveFileOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof RenameFileOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof SynchronizeFileOperation) {
            if (!((SynchronizeFileOperation) isNameExpr).isMethod()) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        } else if (isNameExpr instanceof CreateFolderOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof CreateShareViaLinkOperation || isNameExpr instanceof CreateShareWithShareeOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof UnshareOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof UpdateShareViaLinkOperation || isNameExpr instanceof UpdateSharePermissionsOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof MoveFileOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof SynchronizeFolderOperation) {
            isNameExpr = isMethod(isNameExpr, (SynchronizeFolderOperation) isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof CopyFileOperation) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    private static String isMethod(RemoteOperationResult isParameter, SynchronizeFolderOperation isParameter, Resources isParameter) {
        if (!isNameExpr.isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new File(isNameExpr.isMethod()).isMethod());
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
            // isComment
            return (String) isNameExpr.isMethod().isMethod(isIntegerConstant);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            // isComment
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
            // isComment
            return (String) isNameExpr.isMethod().isMethod(isIntegerConstant);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            // isComment
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
            // isComment
            return (String) isNameExpr.isMethod().isMethod(isIntegerConstant);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            // isComment
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            // isComment
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                // isComment
                return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, DownloadFileOperation isParameter, Resources isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new File(isNameExpr.isMethod()).isMethod());
        } else {
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        return null;
    }

    private static String isMethod(RemoteOperationResult isParameter, UploadFileOperation isParameter, Resources isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        } else {
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        return null;
    }

    /**
     * isComment
     */
    @Nullable
    private static String isMethod(RemoteOperationResult isParameter, Resources isParameter) {
        String isVariable = null;
        if (!isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (isNameExpr.isMethod() instanceof SocketTimeoutException) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                } else if (isNameExpr.isMethod() instanceof ConnectTimeoutException) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
                // isComment
                isNameExpr = isNameExpr.isMethod();
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Nullable
    private static String isMethod(RemoteOperation isParameter, Resources isParameter) {
        String isVariable = null;
        if (isNameExpr instanceof UploadFileOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), ((UploadFileOperation) isNameExpr).isMethod());
        } else if (isNameExpr instanceof DownloadFileOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new File(((DownloadFileOperation) isNameExpr).isMethod()).isMethod());
        } else if (isNameExpr instanceof RemoveFileOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof RenameFileOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof CreateFolderOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof CreateShareViaLinkOperation || isNameExpr instanceof CreateShareWithShareeOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof UnshareOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof UpdateShareViaLinkOperation || isNameExpr instanceof UpdateSharePermissionsOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof MoveFileOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof SynchronizeFolderOperation) {
            String isVariable = new File(((SynchronizeFolderOperation) isNameExpr).isMethod()).isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
        } else if (isNameExpr instanceof CopyFileOperation) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }
}
