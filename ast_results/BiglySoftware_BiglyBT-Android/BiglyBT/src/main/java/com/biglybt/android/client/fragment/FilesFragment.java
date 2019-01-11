// isComment
package com.biglybt.android.client.fragment;

import java.io.File;
import java.net.URLDecoder;
import java.util.*;
import com.biglybt.android.adapter.FlexibleRecyclerSelectionListener;
import com.biglybt.android.adapter.SortableRecyclerAdapter;
import com.biglybt.android.client.*;
import com.biglybt.android.client.activity.ImageViewer;
import com.biglybt.android.client.activity.TorrentOpenOptionsActivity;
import com.biglybt.android.client.activity.VideoViewer;
import com.biglybt.android.client.adapter.*;
import com.biglybt.android.client.dialog.DialogFragmentSizeRange;
import com.biglybt.android.client.rpc.ReplyMapReceivedListener;
import com.biglybt.android.client.session.Session;
import com.biglybt.android.client.sidelist.SideListActivity;
import com.biglybt.android.util.MapUtils;
import com.biglybt.android.widget.CustomToast;
import com.biglybt.android.widget.PreCachingLayoutManager;
import com.biglybt.android.widget.SwipeRefreshLayoutExtra;
import com.biglybt.util.DisplayFormatters;
import com.biglybt.util.Thunk;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import android.Manifest;
import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.content.res.Resources;
import android.net.Uri;
import android.os.*;
import android.support.annotation.MenuRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.*;
import android.webkit.MimeTypeMap;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * isComment
 */
public class isClassOrIsInterface extends TorrentDetailPage implements ActionModeBeingReplacedListener, View.OnKeyListener, DialogFragmentSizeRange.SizeRangeDialogListener, SwipeRefreshLayoutExtra.OnExtraViewVisibilityChangeListener {

    @Thunk
    static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private static final boolean isVariable = true;

    private final RecyclerView.OnScrollListener isVariable;

    @Thunk
    RecyclerView isVariable;

    @Thunk
    FilesTreeAdapter isVariable;

    private Callback isVariable;

    @Thunk
    ActionMode isVariable;

    ReplyMapReceivedListener isVariable = new ReplyMapReceivedListener() {

        @Override
        public void isMethod(String isParameter, Map<?, ?> isParameter) {
            isMethod();
        }

        @Override
        public void isMethod(String isParameter, Exception isParameter) {
            isMethod();
        }

        @Override
        public void isMethod(String isParameter, String isParameter) {
            isMethod();
        }
    };

    @Thunk
    ActionModeBeingReplacedListener isVariable;

    @Thunk
    long isVariable = isIntegerConstant;

    @Thunk
    TextView isVariable;

    private TextView isVariable;

    @Thunk
    CompoundButton isVariable;

    @Thunk
    Handler isVariable;

    private MenuBuilder isVariable;

    private TextView isVariable;

    private TextView isVariable;

    private CompoundButton isVariable;

    private CompoundButton isVariable;

    private boolean isVariable;

    private SwipeRefreshLayoutExtra isVariable;

    public isConstructor() {
        super();
        isNameExpr = new RecyclerView.OnScrollListener() {

            int isVariable = isIntegerConstant;

            @Override
            public void isMethod(@NonNull RecyclerView isParameter, int isParameter, int isParameter) {
                super.isMethod(isNameExpr, isNameExpr, isNameExpr);
                if (isNameExpr == null) {
                    return;
                }
                LinearLayoutManager isVariable = (LinearLayoutManager) isNameExpr.isMethod();
                if (isNameExpr == null) {
                    return;
                }
                int isVariable = isNameExpr.isMethod();
                if (isNameExpr == this.isFieldAccessExpr) {
                    return;
                }
                this.isFieldAccessExpr = isNameExpr;
                FilesAdapterItem isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr == null) {
                    return;
                }
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr != null ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : "isStringConstant");
            }
        };
    }

    @Override
    public void isMethod(Bundle isParameter) {
        if (isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr, "isStringConstant" + this);
        }
        super.isMethod(isNameExpr);
        isMethod();
    }

    @Nullable
    @Override
    public View isMethod(@NonNull LayoutInflater isParameter, @Nullable ViewGroup isParameter, @Nullable Bundle isParameter) {
        FragmentActivity isVariable = isMethod();
        isNameExpr = isNameExpr instanceof TorrentOpenOptionsActivity;
        Map<?, ?> isVariable = null;
        View isVariable;
        if (isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr < isIntegerConstant) {
                return null;
            }
            Session isVariable = isMethod();
            isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                // isComment
                return null;
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isMethod()) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this::triggerRefresh);
            isNameExpr.isMethod(this);
        }
        FlexibleRecyclerSelectionListener<FilesTreeAdapter, FilesTreeViewHolder, FilesAdapterItem> isVariable = new FilesRecyclerSelectionListener();
        isNameExpr = new FilesTreeAdapter(isMethod(), this, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(this::onSetItemsComplete);
        if (isNameExpr != null) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(isNameExpr, true);
            } else {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr, null, (isParameter, isParameter, isParameter, isParameter, isParameter) -> isNameExpr.isMethod(isNameExpr.this, true, isParameter -> isNameExpr.isMethod(isNameExpr, true)));
            }
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        PreCachingLayoutManager isVariable = new PreCachingLayoutManager(isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod(isMethod())) {
            if (isNameExpr instanceof FastScrollRecyclerView) {
                ((FastScrollRecyclerView) isNameExpr).isMethod(true);
            }
            isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isNameExpr.isMethod((int) (isIntegerConstant * isDoubleConstant)));
        }
        isNameExpr.isMethod((isParameter, isParameter, isParameter) -> {
            if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
                return true;
            }
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr:
                case isNameExpr.isFieldAccessExpr:
                    {
                        isMethod();
                        return true;
                    }
            }
            return true;
        });
        return isNameExpr;
    }

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        FragmentActivity isVariable = isMethod();
        if (isNameExpr instanceof ActionModeBeingReplacedListener) {
            isNameExpr = (ActionModeBeingReplacedListener) isNameExpr;
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isParameter -> {
                if (isNameExpr == null) {
                    return;
                }
                isNameExpr.isMethod(isNameExpr.isMethod());
            });
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isParameter -> {
                if (isNameExpr == null) {
                    return;
                }
                FilesTreeFilter isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(true);
                isMethod();
            });
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isParameter -> {
                if (isNameExpr == null) {
                    return;
                }
                FilesTreeFilter isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(true);
                isMethod();
            });
        }
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod((isParameter, isParameter, isParameter) -> isMethod(isNameExpr, isNameExpr));
            isNameExpr.isMethod(isParameter -> isMethod());
        }
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isParameter -> isMethod());
        }
    }

    @Override
    public void isMethod(View isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
    }

    public void isMethod() {
        if (isNameExpr == null) {
            return;
        }
        FilesTreeFilter isVariable = isNameExpr.isMethod();
        long[] isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isMethod(), this, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]);
    }

    @Override
    public void isMethod(String isParameter, long isParameter, long isParameter) {
        if (isNameExpr == null) {
            return;
        }
        FilesTreeFilter isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(true);
        isMethod();
    }

    @Thunk
    boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            return true;
        }
        if (isNameExpr == null) {
            return true;
        }
        if (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) {
            FilesTreeFilter isVariable = isNameExpr.isMethod();
            long[] isVariable = isNameExpr.isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                // isComment
                isNameExpr[isIntegerConstant] += isIntegerConstant * isStringConstant * isIntegerConstant;
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                // isComment
                isNameExpr[isIntegerConstant] -= isIntegerConstant * isStringConstant * isIntegerConstant;
                if (isNameExpr[isIntegerConstant] < isIntegerConstant) {
                    isNameExpr[isIntegerConstant] = isIntegerConstant;
                }
            }
            isNameExpr.isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]);
            isNameExpr.isMethod(true);
            isMethod();
            return true;
        }
        return true;
    }

    public void isMethod() {
        FilesTreeFilter isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isMethod();
    }

    @Thunk
    void isMethod() {
        if (!isNameExpr.isMethod()) {
            isMethod().isMethod(this::updateFilterTexts);
            return;
        }
        if (isNameExpr == null) {
            return;
        }
        String isVariable = "isStringConstant";
        Resources isVariable = isMethod();
        String isVariable;
        FilesTreeFilter isVariable = isNameExpr.isMethod();
        long[] isVariable = isNameExpr.isMethod();
        if (isNameExpr[isIntegerConstant] <= isIntegerConstant && isNameExpr[isIntegerConstant] <= isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            if (isNameExpr[isIntegerConstant] > isIntegerConstant && isNameExpr[isIntegerConstant] > isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr[isIntegerConstant], true), isNameExpr.isMethod(isNameExpr[isIntegerConstant], true));
            } else if (isNameExpr[isIntegerConstant] > isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr[isIntegerConstant], true));
            } else {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr[isIntegerConstant], true));
            }
            if (isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr += "isStringConstant";
            }
            isNameExpr += isNameExpr;
        }
        if (isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr += "isStringConstant";
            }
            isNameExpr += isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        if (isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr += "isStringConstant";
            }
            isNameExpr += isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(@NonNull Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod("isStringConstant", isNameExpr);
    }

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    private void isMethod() {
        isNameExpr = new Callback() {

            // isComment
            @Override
            public boolean isMethod(ActionMode isParameter, Menu isParameter) {
                if (isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr, "isStringConstant");
                }
                if (isNameExpr.isMethod() < isIntegerConstant) {
                    return true;
                }
                FragmentActivity isVariable = isMethod();
                if (isNameExpr == null || isNameExpr.isMethod()) {
                    return true;
                }
                FilesAdapterItem isVariable = isNameExpr.isMethod();
                if (isNameExpr == null) {
                    return true;
                }
                @MenuRes
                int isVariable = (isNameExpr instanceof FilesAdapterItemFile) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
                if (isNameExpr == null) {
                    isMethod(isNameExpr);
                }
                return true;
            }

            // isComment
            // isComment
            // isComment
            @Override
            public boolean isMethod(ActionMode isParameter, Menu isParameter) {
                if (isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr, "isStringConstant");
                }
                return isMethod(isNameExpr);
            }

            // isComment
            @Override
            public boolean isMethod(ActionMode isParameter, MenuItem isParameter) {
                return isMethod(isNameExpr);
            }

            // isComment
            @Override
            public void isMethod(ActionMode isParameter) {
                isMethod();
            }
        };
    }

    @Thunk
    void isMethod() {
        if (isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr, "isStringConstant");
        }
        if (isNameExpr == null) {
            return;
        }
        isNameExpr = null;
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(() -> {
            if (isNameExpr != null) {
                isNameExpr.isMethod();
            }
        });
    }

    @Override
    @Thunk
    protected boolean isMethod(Menu isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            return true;
        }
        Resources isVariable = isMethod();
        boolean isVariable = true;
        boolean isVariable = true;
        boolean isVariable = true;
        Map<?, ?> isVariable = isMethod();
        FilesAdapterItem isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod().isMethod();
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        boolean isVariable = isNameExpr != null && isNameExpr > isIntegerConstant;
        boolean isVariable = isNameExpr != null && isNameExpr == isIntegerConstant;
        boolean isVariable = isNameExpr != null && isNameExpr == isNameExpr.isMethod().isMethod();
        boolean isVariable = isNameExpr && !isNameExpr;
        boolean isVariable = isNameExpr instanceof FilesAdapterItemFolder;
        boolean isVariable = !isNameExpr && (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant);
        if (isNameExpr || isNameExpr) {
            // isComment
            isNameExpr = true;
            isNameExpr = true;
        } else if (isNameExpr) {
            FilesAdapterItemFolder isVariable = (FilesAdapterItemFolder) isNameExpr;
            isNameExpr = isNameExpr.isFieldAccessExpr < isNameExpr.isMethod();
            isNameExpr = isNameExpr.isFieldAccessExpr > isIntegerConstant;
        } else if (!isNameExpr) {
            boolean isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, true);
            isNameExpr = !isNameExpr;
            isNameExpr = isNameExpr;
        }
        if (isNameExpr != null) {
            long isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
            long isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, -isIntegerConstant);
            // isComment
            isNameExpr = isNameExpr == isNameExpr;
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr) {
                String isVariable;
                if (isNameExpr) {
                    int isVariable = isNameExpr.isMethod().isMethod();
                    isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
                } else {
                    isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
                }
                isNameExpr.isMethod(isNameExpr);
            }
        }
        if (isNameExpr) {
            MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(true);
            }
        }
        boolean isVariable = isNameExpr.isMethod().isMethod();
        boolean isVariable = isNameExpr.isMethod().isMethod() || isNameExpr;
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            if (!isNameExpr && !isNameExpr && isNameExpr && isNameExpr) {
                isNameExpr.isMethod(true);
            } else {
                isNameExpr.isMethod(true);
            }
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            boolean isVariable = !isNameExpr && !isNameExpr && isNameExpr && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr &= isNameExpr;
            isNameExpr.isMethod(isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            boolean isVariable = !isNameExpr && !isNameExpr && !isNameExpr && isNameExpr && isNameExpr && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        // isComment
        boolean isVariable = (isNameExpr && !isNameExpr && isNameExpr) || !isNameExpr && !isNameExpr && isNameExpr && !isNameExpr;
        int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr < isNameExpr.isFieldAccessExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr > isNameExpr.isFieldAccessExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr);
        }
        // isComment
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr && isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr && isNameExpr && isNameExpr;
            if (isNameExpr) {
                FilesAdapterItemFolder isVariable = (FilesAdapterItemFolder) isNameExpr;
                int isVariable = isNameExpr.isMethod();
                if (isNameExpr == isNameExpr.isMethod() || isNameExpr.isFieldAccessExpr == isIntegerConstant) {
                    isNameExpr = true;
                } else {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isMethod(isNameExpr)));
                }
            }
            isNameExpr.isMethod(isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr && isNameExpr && isNameExpr;
            if (isNameExpr) {
                FilesAdapterItemFolder isVariable = (FilesAdapterItemFolder) isNameExpr;
                int isVariable = isNameExpr.isMethod();
                if (isNameExpr == isNameExpr.isMethod() || isNameExpr == isNameExpr.isFieldAccessExpr) {
                    isNameExpr = true;
                } else {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isMethod(isNameExpr)));
                }
            }
            isNameExpr.isMethod(isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr && isNameExpr && isNameExpr;
            if (isNameExpr) {
                FilesAdapterItemFolder isVariable = (FilesAdapterItemFolder) isNameExpr;
                if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
                    isNameExpr = true;
                } else {
                    int isVariable = isNameExpr.isMethod();
                    String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr);
                }
            }
            isNameExpr.isMethod(isNameExpr);
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr && isNameExpr && isNameExpr;
            if (isNameExpr) {
                FilesAdapterItemFolder isVariable = (FilesAdapterItemFolder) isNameExpr;
                int isVariable = isNameExpr.isMethod();
                if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                    isNameExpr = true;
                } else {
                    String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr);
                }
            }
            isNameExpr.isMethod(isNameExpr);
        }
        // isComment
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()) && isNameExpr.isMethod() instanceof FilesAdapterItemFolder);
        }
        isNameExpr.isMethod(isNameExpr);
        return true;
    }

    @Override
    @Thunk
    protected boolean isMethod(MenuItem isParameter) {
        if (super.isMethod(isNameExpr)) {
            return true;
        }
        if (isNameExpr < isIntegerConstant) {
            return true;
        }
        int isVariable = isNameExpr.isMethod();
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    Map<?, ?> isVariable = isMethod();
                    return isNameExpr != null && isMethod(isNameExpr);
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    Map<?, ?> isVariable = isMethod();
                    return isNameExpr != null && isMethod(isNameExpr);
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    Map<?, ?> isVariable = isMethod();
                    return isMethod(isNameExpr);
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    FilesAdapterItem isVariable = isNameExpr.isMethod();
                    if (isNameExpr instanceof FilesAdapterItemFile) {
                        isNameExpr.isMethod(true, isNameExpr, (FilesAdapterItemFile) isNameExpr);
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    FilesAdapterItemFile[] isVariable = isNameExpr.isMethod();
                    isNameExpr.isMethod(true, isNameExpr, isNameExpr);
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    FilesAdapterItem isVariable = isNameExpr.isMethod();
                    if (isNameExpr instanceof FilesAdapterItemFolder) {
                        boolean isVariable = isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                        isNameExpr.isMethod(true, isNameExpr, isNameExpr, (FilesAdapterItemFolder) isNameExpr);
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    // isComment
                    isMethod();
                    FilesAdapterItem isVariable = isNameExpr.isMethod();
                    if (isNameExpr instanceof FilesAdapterItemFile) {
                        isNameExpr.isMethod(true, isNameExpr, (FilesAdapterItemFile) isNameExpr);
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    // isComment
                    isMethod();
                    FilesAdapterItemFile[] isVariable = isNameExpr.isMethod();
                    isNameExpr.isMethod(true, isNameExpr, isNameExpr);
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    FilesAdapterItem isVariable = isNameExpr.isMethod();
                    if (isNameExpr instanceof FilesAdapterItemFolder) {
                        boolean isVariable = isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                        isNameExpr.isMethod(true, isNameExpr, isNameExpr, (FilesAdapterItemFolder) isNameExpr);
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    int[] isVariable;
                    int isVariable;
                    boolean isVariable = isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    if (isNameExpr) {
                        isNameExpr = isNameExpr.isMethod();
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else {
                        isNameExpr = new int[] { isMethod() };
                        Map<?, ?> isVariable = isMethod();
                        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                        if (isNameExpr >= isNameExpr.isFieldAccessExpr) {
                            return true;
                        } else {
                            isNameExpr += isIntegerConstant;
                        }
                    }
                    isMethod();
                    final int isVariable = isNameExpr;
                    isNameExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr));
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    int[] isVariable;
                    int isVariable;
                    boolean isVariable = isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    if (isNameExpr) {
                        isNameExpr = isNameExpr.isMethod();
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else {
                        isNameExpr = new int[] { isMethod() };
                        Map<?, ?> isVariable = isMethod();
                        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                        if (isNameExpr <= isNameExpr.isFieldAccessExpr) {
                            return true;
                        } else {
                            isNameExpr -= isIntegerConstant;
                        }
                    }
                    isMethod();
                    int isVariable = isNameExpr;
                    isNameExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr));
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    FilesAdapterItemFolder isVariable = (FilesAdapterItemFolder) isNameExpr.isMethod();
                    isNameExpr.isMethod(isNameExpr, !isNameExpr.isFieldAccessExpr);
                    return true;
                }
        }
        return true;
    }

    @Thunk
    boolean isMethod(Map<?, ?> isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        if (isNameExpr.isMethod().isMethod()) {
            return true;
        }
        final String isVariable = isMethod(isNameExpr);
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            return true;
        }
        final File isVariable = isNameExpr.isMethod();
        // isComment
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"));
        final File isVariable = new File(isNameExpr, isNameExpr);
        if (isNameExpr.isMethod().isMethod()) {
            Context isVariable = isMethod();
            if (isNameExpr != null) {
                String isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod())));
                AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, (isParameter, isParameter) -> isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, null);
                isNameExpr.isMethod();
                return true;
            }
        }
        isMethod(isNameExpr, isNameExpr);
        return true;
    }

    private String isMethod(Map<?, ?> isParameter) {
        long isVariable = isNameExpr.isMethod();
        if (isNameExpr > isIntegerConstant) {
            Map<?, ?> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                return null;
            }
            String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
            if (isNameExpr == null) {
                return null;
            }
            int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
            String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
            if (isNameExpr == null) {
                return null;
            }
            String isVariable = isNameExpr + "isStringConstant" + isNameExpr + isNameExpr.isMethod(isNameExpr);
            // isComment
            return isNameExpr.isMethod() + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
        }
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isIntegerConstant) == 'isStringConstant' || isNameExpr.isMethod(isIntegerConstant) == 'isStringConstant') {
            isNameExpr = isNameExpr.isMethod() + isNameExpr;
        }
        if (isNameExpr.isMethod("isStringConstant")) {
            // isComment
            return // isComment
            isNameExpr.isMethod(// isComment
            "isStringConstant", "isStringConstant" + isNameExpr.isMethod().isMethod() + "isStringConstant");
        }
        return isNameExpr;
    }

    @Thunk
    void isMethod(final String isParameter, final File isParameter) {
        isMethod(new String[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr }, () -> isMethod(isNameExpr, isNameExpr), () -> isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
    }

    @Thunk
    void isMethod(final String isParameter, final File isParameter) {
        DownloadManager isVariable = (DownloadManager) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            // isComment
            return;
        }
        DownloadManager.Request isVariable = new DownloadManager.Request(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Context isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod(isNameExpr) || !isNameExpr.isMethod(isNameExpr).isMethod()) {
            String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()));
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    private boolean isMethod(final Map<?, ?> isParameter) {
        FragmentActivity isVariable = isMethod();
        final String isVariable = isMethod(isNameExpr);
        if (isNameExpr.isMethod().isMethod() && isNameExpr != null) {
            String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
            String isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr)));
            AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, (isParameter, isParameter) -> isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, null);
            isNameExpr.isMethod();
        } else {
            return isMethod(isNameExpr, isNameExpr);
        }
        return true;
    }

    private boolean isMethod(Map<?, ?> isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
            File isVariable = new File(isNameExpr);
            if (isNameExpr.isMethod()) {
                Uri isVariable = isNameExpr.isMethod(isNameExpr);
                return isMethod(isNameExpr, isNameExpr.isMethod());
            } else {
                if (isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                }
            }
        }
        return true;
    }

    @Thunk
    boolean isMethod(Map<?, ?> isParameter, final String isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            return true;
        }
        Context isVariable = isMethod();
        Uri isVariable;
        if (isNameExpr.isMethod("isStringConstant") && isNameExpr != null) {
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr, "isStringConstant", new File(isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), "isStringConstant")));
            } catch (Throwable isParameter) {
                // isComment
                // isComment
                // isComment
                // isComment
                isNameExpr.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr);
            }
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        String isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
        Class<?> isVariable = VideoViewer.class;
        if (isNameExpr != null && isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = ImageViewer.class;
        }
        final PackageManager isVariable = isNameExpr == null ? null : isNameExpr.isMethod();
        if (isNameExpr != null) {
            List<ResolveInfo> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                for (ResolveInfo isVariable : isNameExpr) {
                    ComponentInfo isVariable = isNameExpr.isMethod(isNameExpr);
                    isMethod(isNameExpr, isNameExpr.isMethod() + "isStringConstant" + (isNameExpr == null ? "isStringConstant" : (isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr)));
                }
            }
            for (Iterator<ResolveInfo> isVariable = isNameExpr.isMethod(); isNameExpr.isMethod(); ) {
                ResolveInfo isVariable = isNameExpr.isMethod();
                ComponentInfo isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null && "isStringConstant".isMethod(isNameExpr.isFieldAccessExpr)) {
                    isNameExpr.isMethod();
                } else {
                    String isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
                }
            }
            if (isNameExpr.isMethod() == isIntegerConstant) {
                // isComment
                // isComment
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            if (isNameExpr.isMethod() == isIntegerConstant) {
                ResolveInfo isVariable = isNameExpr.isMethod(isIntegerConstant);
                ComponentInfo isVariable = isNameExpr.isMethod(isNameExpr);
                if ((isNameExpr != null && isNameExpr.isFieldAccessExpr != null) && ("isStringConstant".isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isFieldAccessExpr.isMethod("isStringConstant"))) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                } else {
                    ActivityInfo isVariable = isNameExpr.isFieldAccessExpr;
                    ComponentName isVariable = new ComponentName(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr.isFieldAccessExpr) {
                        isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                    }
                }
            }
        }
        try {
            isMethod(isNameExpr);
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod());
            }
        } catch (java.lang.SecurityException isParameter) {
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            }
            if (isNameExpr != null) {
                try {
                    Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr);
                    // isComment
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                    if (!isNameExpr) {
                        isNameExpr.isMethod(isNameExpr);
                    }
                    if (isNameExpr != null) {
                        List<ResolveInfo> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                        if (isNameExpr.isFieldAccessExpr) {
                            isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                            for (ResolveInfo isVariable : isNameExpr) {
                                ComponentInfo isVariable = isNameExpr.isMethod(isNameExpr);
                                isMethod(isNameExpr, isNameExpr.isMethod() + "isStringConstant" + (isNameExpr == null ? "isStringConstant" : (isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr)));
                            }
                        }
                    }
                    isMethod(isNameExpr);
                    if (isNameExpr.isFieldAccessExpr) {
                        isMethod(isNameExpr, "isStringConstant" + (isNameExpr.isMethod() == null ? "isStringConstant" : "isStringConstant") + "isStringConstant" + isNameExpr);
                    }
                    return true;
                } catch (Throwable isParameter) {
                    if (isNameExpr.isFieldAccessExpr) {
                        isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                    }
                }
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        } catch (android.content.ActivityNotFoundException isParameter) {
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            }
            if (isNameExpr != null) {
                try {
                    Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr);
                    // isComment
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                    if (!isNameExpr) {
                        isNameExpr.isMethod(isNameExpr);
                    }
                    isMethod(isNameExpr);
                    if (isNameExpr.isFieldAccessExpr) {
                        isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                    }
                    return true;
                } catch (android.content.ActivityNotFoundException isParameter) {
                    if (isNameExpr.isFieldAccessExpr) {
                        isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                    }
                }
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
        return true;
    }

    @Thunk
    int isMethod() {
        Map<?, ?> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            return -isIntegerConstant;
        }
        List<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
        int isVariable = isNameExpr.isMethod();
        long isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null || isNameExpr < isIntegerConstant || isNameExpr >= isNameExpr.isMethod()) {
            return -isIntegerConstant;
        }
        if (isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        }
        Object isVariable = isNameExpr.isMethod((int) isNameExpr);
        if (isNameExpr instanceof Map<?, ?>) {
            return (int) isNameExpr;
        }
        return -isIntegerConstant;
    }

    private Map<?, ?> isMethod() {
        FilesAdapterItem isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            return null;
        }
        if (isNameExpr instanceof FilesAdapterItemFolder) {
            return null;
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Thunk
    boolean isMethod() {
        if (isNameExpr.isMethod(isMethod())) {
            // isComment
            return true;
        }
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr, "isStringConstant");
            }
            Map<?, ?> isVariable = isMethod();
            String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            return true;
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(null, true);
        }
        AppCompatActivity isVariable = (AppCompatActivity) isMethod();
        if (isNameExpr == null) {
            return true;
        }
        if (isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + (isNameExpr.isMethod() == null ? "isStringConstant" : isNameExpr.isMethod().isMethod()));
        }
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isMethod(isNameExpr, "isStringConstant");
            return true;
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Map<?, ?> isVariable = isMethod();
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, true);
        }
        return true;
    }

    @Thunk
    void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            isNameExpr = null;
        }
    }

    @SuppressWarnings("isStringConstant")
    @Override
    public void isMethod(String isParameter, final List<?> isParameter, List<String> isParameter, final int[] isParameter, List<?> isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        boolean isVariable = true;
        for (Object isVariable : isNameExpr) {
            if (!(isNameExpr instanceof Map)) {
                continue;
            }
            Map isVariable = (Map) isNameExpr;
            Object isVariable = isNameExpr.isMethod("isStringConstant");
            if (isNameExpr instanceof Number) {
                isNameExpr = ((Number) isNameExpr).isMethod() == isNameExpr;
                if (isNameExpr) {
                    if (isNameExpr.isFieldAccessExpr) {
                        isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                    }
                    break;
                }
            }
        }
        if (!isNameExpr) {
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            }
            return;
        }
        // isComment
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(this, true, isParameter -> {
            if (isNameExpr != null) {
                if (isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                }
                isNameExpr.isMethod(isNameExpr, true);
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        });
    }

    @Override
    public void isMethod() {
        if (isNameExpr < isIntegerConstant) {
            isNameExpr.isMethod();
            return;
        }
        if (isMethod()) {
            if (isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr, "isStringConstant");
            }
            return;
        }
        isMethod(true);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr, null, (isParameter, isParameter, isParameter, isParameter, isParameter) -> isNameExpr.isMethod(this, true, isParameter -> {
            if (isNameExpr != null) {
                isNameExpr.isMethod(true);
            }
            isMethod(true);
        }));
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr);
        super.isMethod();
        FragmentActivity isVariable = isMethod();
        if (isNameExpr == null || isNameExpr.isMethod()) {
            return;
        }
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod().isMethod(true);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr);
        isMethod();
        super.isMethod();
        FragmentActivity isVariable = isMethod();
        if (isNameExpr == null || isNameExpr.isMethod()) {
            return;
        }
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    public void isMethod() {
        Map<?, ?> isVariable = isMethod();
        if (isNameExpr == null) {
            return;
        }
        boolean isVariable = isNameExpr.isMethod().isMethod();
        if (isNameExpr) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr);
        }
    }

    // isComment
    @Override
    public void isMethod(ActionMode isParameter, boolean isParameter) {
    }

    @Override
    public void isMethod() {
    }

    @Override
    public void isMethod() {
    }

    @Override
    public ActionMode isMethod() {
        return isNameExpr;
    }

    @Override
    public Callback isMethod() {
        return isNameExpr;
    }

    // isComment
    @Override
    public boolean isMethod(View isParameter, int isParameter, KeyEvent isParameter) {
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            return true;
        }
        switch(isNameExpr) {
            // isComment
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                {
                    if (isMethod()) {
                        return true;
                    }
                    break;
                }
        }
        return true;
    }

    @Thunk
    boolean isMethod() {
        int isVariable = isNameExpr.isMethod();
        if (isNameExpr < isIntegerConstant) {
            return true;
        }
        FilesAdapterItem isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr instanceof FilesAdapterItemFile ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        String isVariable = isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        return isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final View isParameter, int isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
            isNameExpr = null;
        }
        if (isNameExpr != isNameExpr.isFieldAccessExpr) {
            return;
        }
        isNameExpr = new Handler(isNameExpr.isMethod());
        isNameExpr.isMethod(new Runnable() {

            @Override
            public void isMethod() {
                FragmentActivity isVariable = isMethod();
                if (isNameExpr == null) {
                    return;
                }
                long isVariable = isNameExpr.isMethod() - isNameExpr;
                String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant).isMethod();
                String isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod(this, isNameExpr < isNameExpr.isFieldAccessExpr ? isNameExpr.isFieldAccessExpr : isNameExpr < isNameExpr.isFieldAccessExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
                }
            }
        }, isIntegerConstant);
    }

    @Override
    public SortableRecyclerAdapter isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @SuppressLint("isStringConstant")
    @Override
    public MenuBuilder isMethod() {
        if (isNameExpr == null) {
            Context isVariable = isMethod();
            if (isNameExpr == null) {
                return null;
            }
            isNameExpr = new MenuBuilder(isNameExpr);
            if (!isNameExpr && isNameExpr.isMethod(isNameExpr)) {
                MenuItem isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            SubMenu isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, "isStringConstant");
            new MenuInflater(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        }
        return isNameExpr;
    }

    private void isMethod(FilesTreeAdapter isParameter) {
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr || (isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) > isIntegerConstant);
            isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
        }
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
        }
        SideListActivity isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    protected boolean isMethod() {
        return true;
    }

    private class isClassOrIsInterface implements FlexibleRecyclerSelectionListener<FilesTreeAdapter, FilesTreeViewHolder, FilesAdapterItem> {

        @Override
        public void isMethod(FilesTreeAdapter isParameter, int isParameter) {
            if (!isNameExpr.isMethod()) {
                return;
            }
            FilesAdapterItem isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod()) {
                isMethod();
                if (isNameExpr instanceof FilesAdapterItemFolder) {
                    isNameExpr.isMethod(null, true, isNameExpr, (FilesAdapterItemFolder) isNameExpr);
                } else if (isNameExpr instanceof FilesAdapterItemFile) {
                    isNameExpr.isMethod(null, isNameExpr, (FilesAdapterItemFile) isNameExpr);
                } else {
                    isNameExpr.isMethod(null, null);
                }
                return;
            }
            if (isNameExpr instanceof FilesAdapterItemFolder) {
                FilesAdapterItemFolder isVariable = (FilesAdapterItemFolder) isNameExpr;
                isNameExpr.isMethod(isNameExpr, !isNameExpr.isFieldAccessExpr);
            } else {
                isMethod();
            }
        }

        @Override
        public boolean isMethod(FilesTreeAdapter isParameter, int isParameter) {
            return isMethod();
        }

        @Override
        public void isMethod(FilesTreeAdapter isParameter, int isParameter, boolean isParameter) {
        }

        @Override
        public void isMethod(FilesTreeAdapter isParameter, FilesAdapterItem isParameter, boolean isParameter) {
            if (isNameExpr.isMethod() == isIntegerConstant) {
                isMethod();
            } else {
                // isComment
                isMethod();
            }
            isNameExpr.isMethod(isMethod(), isNameExpr);
        }
    }
}
