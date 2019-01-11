// isComment
package com.concentricsky.android.khanacademy.app;

import static com.concentricsky.android.khanacademy.Constants.ACTION_BADGE_EARNED;
import static com.concentricsky.android.khanacademy.Constants.ACTION_DOWNLOAD_PROGRESS_UPDATE;
import static com.concentricsky.android.khanacademy.Constants.ACTION_OFFLINE_VIDEO_SET_CHANGED;
import static com.concentricsky.android.khanacademy.Constants.ACTION_TOAST;
import static com.concentricsky.android.khanacademy.Constants.DEFAULT_VIDEO_ID;
import static com.concentricsky.android.khanacademy.Constants.EXTRA_BADGE;
import static com.concentricsky.android.khanacademy.Constants.EXTRA_MESSAGE;
import static com.concentricsky.android.khanacademy.Constants.EXTRA_STATUS;
import static com.concentricsky.android.khanacademy.Constants.PARAM_PROGRESS_DONE;
import static com.concentricsky.android.khanacademy.Constants.PARAM_PROGRESS_UNKNOWN;
import static com.concentricsky.android.khanacademy.Constants.PARAM_TOPIC_ID;
import static com.concentricsky.android.khanacademy.Constants.PARAM_USERVIDEO_POINTS;
import static com.concentricsky.android.khanacademy.Constants.PARAM_VIDEO_ID;
import static com.concentricsky.android.khanacademy.Constants.PARAM_VIDEO_PLAY_STATE;
import static com.concentricsky.android.khanacademy.Constants.PARAM_VIDEO_POSITION;
import static com.concentricsky.android.khanacademy.Constants.TAG_CAPTION_FRAGMENT;
import static com.concentricsky.android.khanacademy.Constants.TAG_VIDEO_FRAGMENT;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.text.format.Time;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;
import com.concentricsky.android.khan.R;
import com.concentricsky.android.khanacademy.Constants;
import com.concentricsky.android.khanacademy.MainMenuDelegate;
import com.concentricsky.android.khanacademy.data.KADataService;
import com.concentricsky.android.khanacademy.data.KADataService.ServiceUnavailableException;
import com.concentricsky.android.khanacademy.data.db.Badge;
import com.concentricsky.android.khanacademy.data.db.User;
import com.concentricsky.android.khanacademy.data.db.UserVideo;
import com.concentricsky.android.khanacademy.data.db.Video;
import com.concentricsky.android.khanacademy.data.remote.KAAPIAdapter;
import com.concentricsky.android.khanacademy.util.Log;
import com.concentricsky.android.khanacademy.util.ObjectCallback;
import com.concentricsky.android.khanacademy.util.OfflineVideoManager;
import com.concentricsky.android.khanacademy.views.ThumbnailWrapper;
import com.concentricsky.android.khanacademy.views.VideoController;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.dao.RawRowMapper;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;

public class isClassOrIsInterface extends KADataServiceProviderActivityBase implements VideoFragment.Callbacks, CaptionFragment.Callbacks {

    public static final String isVariable = VideoDetailActivity.class.isMethod();

    private static final int isVariable = -isIntegerConstant;

    // isComment
    private static final int isVariable = isIntegerConstant;

    private String isVariable;

    private String isVariable;

    private Video isVariable;

    private UserVideo isVariable;

    private View isVariable;

    private TextView isVariable;

    private VideoFragment isVariable;

    private CaptionFragment isVariable;

    private MainMenuDelegate isVariable;

    private Menu isVariable;

    private KADataService isVariable;

    private ShareActionProvider isVariable;

    private int isVariable;

    private boolean isVariable = true;

    private boolean isVariable = true;

    private boolean isVariable;

    private long isVariable;

    private String isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private Time isVariable = new Time();

    // isComment
    // isComment
    // isComment
    private int isVariable;

    private float isVariable;

    private boolean isVariable = true;

    private int isVariable;

    private boolean isVariable;

    private Handler isVariable = new Handler();

    private BroadcastReceiver isVariable = new BroadcastReceiver() {

        @Override
        public void isMethod(Context isParameter, Intent isParameter) {
            if (isNameExpr.isMethod(isNameExpr.isMethod()) && isNameExpr != null) {
                Badge isVariable = (Badge) isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod().isMethod(isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                @SuppressWarnings("isStringConstant")
                final Map<String, Integer> isVariable = (Map<String, Integer>) isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    Integer isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    if (isNameExpr != null) {
                        isNameExpr.this.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
                    }
                }
            } else if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod(isNameExpr.this, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr).isMethod();
            }
        }
    };

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod().isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Intent isVariable = isMethod();
        isNameExpr = isNameExpr != null && isNameExpr.isMethod(isNameExpr) ? isNameExpr.isMethod(isNameExpr) : isNameExpr != null && isNameExpr.isMethod(isNameExpr) ? isNameExpr.isMethod(isNameExpr) : isNameExpr;
        isNameExpr = isNameExpr != null && isNameExpr.isMethod(isNameExpr) ? isNameExpr.isMethod(isNameExpr) : isNameExpr != null && isNameExpr.isMethod(isNameExpr) ? isNameExpr.isMethod(isNameExpr) : null;
        isMethod(new ObjectCallback<KADataService>() {

            @Override
            public void isMethod(final KADataService isParameter) {
                isNameExpr.this.isFieldAccessExpr = isNameExpr;
                isNameExpr.isMethod().isMethod(isNameExpr);
                isMethod(isNameExpr, true);
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isMethod(isNameExpr));
                }
                User isVariable = isMethod();
                isMethod(isNameExpr, isNameExpr);
                isMethod();
                isMethod();
            }
        });
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            isMethod();
        }
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr != null;
        if (isNameExpr != null) {
            // isComment
            MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod(isNameExpr, isNameExpr);
        }
        IntentFilter isVariable = new IntentFilter();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this).isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
        if (isNameExpr != null) {
            isMethod();
        }
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        // isComment
        if (isNameExpr != null) {
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
    }

    @Override
    protected void isMethod() {
        isMethod();
        isNameExpr = true;
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            isNameExpr = null;
        }
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
        }
        super.isMethod();
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod(this).isMethod(isNameExpr);
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
        }
        super.isMethod();
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod(isNameExpr);
            isNameExpr = null;
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
            isNameExpr = null;
        }
    }

    @Override
    public void isMethod() {
        if (isMethod() && isNameExpr) {
            if (isMethod()) {
                isMethod();
            } else {
                isMethod();
            }
        } else {
            super.isMethod();
        }
    }

    private View.OnTouchListener isVariable = new View.OnTouchListener() {

        @Override
        public boolean isMethod(View isParameter, MotionEvent isParameter) {
            if (isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr != isNameExpr.isMethod()) {
                // isComment
                isMethod();
            } else if (!isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod();
                // isComment
                isMethod();
                if (isNameExpr != null && isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
            }
            return true;
        }
    };

    private KAAPIAdapter.UserUpdateListener isVariable = new KAAPIAdapter.UserUpdateListener() {

        @Override
        public void isMethod(User isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            boolean isVariable = isNameExpr != null;
            // isComment
            if (isNameExpr && isNameExpr != null) {
                try {
                    Dao<UserVideo, Integer> isVariable = isNameExpr.isMethod().isMethod();
                    if (isNameExpr == null || isNameExpr.isMethod() == null) {
                        Map<String, Object> isVariable = new HashMap<String, Object>();
                        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
                        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
                        List<UserVideo> isVariable = isNameExpr.isMethod(isNameExpr);
                        if (isNameExpr.isMethod() > isIntegerConstant) {
                            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod()));
                            isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                        }
                    } else {
                        isNameExpr.isMethod(isNameExpr);
                    }
                    // isComment
                    isMethod(isNameExpr.isMethod());
                } catch (SQLException isParameter) {
                    isNameExpr.isMethod();
                }
            } else {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr ? isNameExpr.isMethod() : "isStringConstant", isNameExpr));
                // isComment
                isNameExpr = null;
            }
        }
    };

    private void isMethod(User isParameter, Video isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr == null ? "isStringConstant" : isNameExpr.isMethod(), isNameExpr == null ? "isStringConstant" : isNameExpr.isMethod()));
        if (isNameExpr != null && isNameExpr != null) {
            Dao<UserVideo, Integer> isVariable = null;
            try {
                isNameExpr = isMethod().isMethod().isMethod();
                QueryBuilder<UserVideo, Integer> isVariable = isNameExpr.isMethod();
                // isComment
                isNameExpr.isMethod("isStringConstant", true);
                isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr.isMethod()).isMethod().isMethod("isStringConstant", isNameExpr.isMethod());
                PreparedQuery<UserVideo> isVariable = isNameExpr.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr == null) {
                    // isComment
                    isNameExpr = new UserVideo();
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr.isMethod());
                    // isComment
                    isNameExpr.isMethod(isNameExpr);
                } else {
                    isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
                }
            } catch (SQLException isParameter) {
                // isComment
                isNameExpr.isMethod();
            } catch (ServiceUnavailableException isParameter) {
                isNameExpr.isMethod();
            }
            // isComment
            isMethod(isNameExpr.isMethod());
        } else if (isNameExpr != null) {
            isNameExpr = new UserVideo();
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    private void isMethod(String isParameter, boolean isParameter) {
        try {
            Dao<Video, String> isVariable = isMethod().isMethod().isMethod();
            QueryBuilder<Video, String> isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
            if (isNameExpr == null) {
                // isComment
                isNameExpr = isNameExpr.isMethod().isMethod();
            }
            // isComment
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            RawRowMapper<Video> isVariable = isNameExpr.isMethod();
            GenericRawResults<Video> isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr, new String[] { isNameExpr, "isStringConstant" + isNameExpr.isMethod() });
            final Video isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(true);
                }
            } else {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
            }
        } catch (SQLException isParameter) {
            isNameExpr.isMethod();
        } catch (ServiceUnavailableException isParameter) {
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod();
        isNameExpr = (int) (isNameExpr.isMethod(true) / isIntegerConstant);
        isNameExpr = isIntegerConstant;
        isNameExpr = true;
    }

    private void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = new VideoFragment();
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isNameExpr);
        FragmentTransaction isVariable = isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isNameExpr = isMethod().isMethod().isFieldAccessExpr;
        isMethod(isNameExpr);
        if (isMethod()) {
            isNameExpr = new CaptionFragment();
            isNameExpr.isMethod(this);
            if (isNameExpr != null && isNameExpr.isMethod() != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            }
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr = true;
        isNameExpr = true;
        isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod();
        isNameExpr = (int) (isNameExpr.isMethod(true) / isIntegerConstant);
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(true);
        isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr = true;
    }

    @Override
    public void isMethod(int isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isMethod() == null) {
            return;
        }
        isNameExpr.isMethod();
        int isVariable = (int) (isNameExpr.isMethod(true) / isIntegerConstant);
        boolean isVariable = isNameExpr - isNameExpr > isNameExpr.isFieldAccessExpr;
        float isVariable = isNameExpr.isMethod();
        boolean isVariable = isNameExpr > isNameExpr + isNameExpr.isFieldAccessExpr;
        if (isNameExpr && isNameExpr) {
            // isComment
            boolean isVariable = true;
            if (!isNameExpr) {
                isMethod();
            }
        }
    }

    @Override
    public void isMethod() {
        if (isMethod()) {
            if (isMethod()) {
                isMethod();
            } else {
                isMethod();
            }
        } else {
            isMethod();
        }
    }

    /**
     * isComment
     */
    private void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr = isIntegerConstant;
        if (isNameExpr != null) {
            int isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod() - isNameExpr > isIntegerConstant) {
                isNameExpr = isNameExpr * isIntegerConstant;
                if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }
    }

    /**
     * isComment
     */
    private void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isNameExpr != null && isNameExpr != null && isNameExpr.isMethod() != null) {
            int isVariable = isNameExpr.isMethod(isNameExpr);
            int isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr));
            isNameExpr = isIntegerConstant * isNameExpr;
            // isComment
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            try {
                isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
            } catch (SQLException isParameter) {
                isNameExpr.isMethod();
            }
        }
    }

    /**
     * isComment
     */
    private void isMethod() {
        if (!isNameExpr) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            isNameExpr = true;
            final float isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr));
            Runnable isVariable = new Runnable() {

                public void isMethod() {
                    isNameExpr.isMethod();
                    isNameExpr = (int) (isNameExpr.isMethod(true) / isIntegerConstant);
                    isMethod(isNameExpr);
                }
            };
            Runnable isVariable = new Runnable() {

                public void isMethod() {
                    isMethod(isNameExpr);
                }
            };
            // isComment
            isMethod();
            // isComment
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    private void isMethod(float isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = true;
    }

    @Override
    public void isMethod(int isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isNameExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod(Video isParameter) {
        OfflineVideoManager isVariable;
        try {
            isNameExpr = isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr);
        } catch (ServiceUnavailableException isParameter) {
            isNameExpr.isMethod();
        }
    }

    private String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, null);
    }

    /**
     * isComment
     */
    private User isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        String isVariable = isMethod();
        if (isNameExpr == null) {
            // isComment
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            return null;
        }
        User isVariable = null;
        try {
            isNameExpr = isMethod().isMethod().isMethod().isMethod(isNameExpr);
        } catch (SQLException isParameter) {
            // isComment
            isNameExpr.isMethod();
        } catch (ServiceUnavailableException isParameter) {
            // isComment
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr == null ? "isStringConstant" : isNameExpr.isMethod()));
        return isNameExpr;
    }

    private boolean isMethod() {
        return isMethod().isMethod().isFieldAccessExpr == isNameExpr.isFieldAccessExpr;
    }

    private boolean isMethod() {
        return isNameExpr;
    }

    private void isMethod(String isParameter, String isParameter) {
        // isComment
        Intent isVariable = new Intent(this, VideoDetailActivity.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(String isParameter, Class<?> isParameter) {
        Intent isVariable = new Intent(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    private Intent isMethod(Video isParameter) {
        Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
        String isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr;
    }

    private void isMethod(MenuItem isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        int isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        int isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = true;
                isNameExpr.isMethod(true).isMethod("isStringConstant").isMethod(isMethod().isMethod(isNameExpr));
                break;
            case isNameExpr:
                if (isNameExpr != null) {
                    try {
                        isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
                    } catch (SQLException isParameter) {
                        isNameExpr.isMethod();
                    }
                    switch(isNameExpr.isMethod()) {
                        case isNameExpr.isFieldAccessExpr:
                            isNameExpr = true;
                            isNameExpr.isMethod(true).isMethod("isStringConstant").isMethod(isMethod().isMethod(isNameExpr));
                            break;
                        case isNameExpr.isFieldAccessExpr:
                            isNameExpr = true;
                            isNameExpr.isMethod(true).isMethod("isStringConstant").isMethod(isMethod().isMethod(isNameExpr));
                            break;
                        case isNameExpr.isFieldAccessExpr:
                        default:
                            isNameExpr = true;
                            isNameExpr.isMethod(true).isMethod("isStringConstant").isMethod(isMethod().isMethod(isNameExpr));
                    }
                }
                break;
            default:
                isNameExpr = true;
                isNameExpr.isMethod(true).isMethod(isNameExpr + "isStringConstant").isMethod(null);
        }
    }

    private void isMethod(MenuItem isParameter) {
        isNameExpr = (ShareActionProvider) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod(isNameExpr));
    }

    ShareActionProvider.OnShareTargetSelectedListener isVariable = new ShareActionProvider.OnShareTargetSelectedListener() {

        @Override
        public boolean isMethod(ShareActionProvider isParameter, Intent isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
            String isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            if (isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant")) {
                // isComment
                int isVariable = isIntegerConstant;
                String isVariable = "isStringConstant";
                // isComment
                // isComment
                // isComment
                int isVariable = isIntegerConstant;
                // isComment
                int isVariable = isNameExpr.isMethod() - "isStringConstant".isMethod() + isNameExpr;
                // isComment
                isNameExpr -= "isStringConstant".isMethod();
                // isComment
                int isVariable = isNameExpr - isNameExpr;
                String isVariable = isNameExpr.isMethod("isStringConstant");
                if (isNameExpr.isMethod() > isNameExpr) {
                    isNameExpr = isNameExpr.isMethod(isIntegerConstant, isNameExpr - isIntegerConstant) + "isStringConstant";
                }
                String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod("isStringConstant"));
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            } else {
                String isVariable = "isStringConstant" + isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                String isVariable = "isStringConstant";
                String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"));
                String isVariable = isNameExpr.isMethod("isStringConstant");
                if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                    isNameExpr += "isStringConstant" + isNameExpr;
                }
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            }
            // isComment
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr);
            return true;
        }
    };

    @Override
    public boolean isMethod(Menu isParameter) {
        isNameExpr = new MainMenuDelegate(this);
        isNameExpr = isNameExpr;
        MenuInflater isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(true);
        }
        return true;
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(new ObjectCallback<KADataService>() {

            @Override
            public void isMethod(KADataService isParameter) {
                User isVariable = isNameExpr.isMethod().isMethod();
                boolean isVariable = isNameExpr != null;
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr).isMethod(isNameExpr);
            }
        });
        return true;
    }

    private void isMethod(final Video isParameter) {
        new AlertDialog.Builder(this).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new DialogInterface.OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                isMethod(isNameExpr);
                isNameExpr.this.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
            }
        }).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null).isMethod();
    }

    private void isMethod(Video isParameter) {
        final Set<Video> isVariable = new HashSet<Video>(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isMethod(new ObjectCallback<KADataService>() {

            @Override
            public void isMethod(KADataService isParameter) {
                isNameExpr.isMethod().isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.this, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr).isMethod();
            }
        });
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isNameExpr.isMethod(isNameExpr)) {
            return true;
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr != null && isNameExpr != null) {
                    isMethod(isNameExpr, isNameExpr);
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod().isMethod();
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isNameExpr) {
                    isMethod(isNameExpr);
                } else {
                    isMethod(isNameExpr);
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                // isComment
                if (isMethod() && isNameExpr) {
                    if (isMethod()) {
                        isMethod();
                    } else {
                        isMethod();
                    }
                } else {
                    isMethod(isNameExpr, VideoListActivity.class);
                }
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(Configuration isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr.isFieldAccessExpr != isNameExpr)
            isMethod(isNameExpr.isFieldAccessExpr);
    }

    private void isMethod(final int isParameter) {
        isNameExpr = isNameExpr;
        if (!isNameExpr || !isNameExpr) {
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr:
                    isMethod();
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isMethod();
                    break;
                default:
            }
        }
    }

    private void isMethod(int isParameter) {
        FragmentTransaction isVariable = isMethod().isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr = new CaptionFragment();
        Bundle isVariable = new Bundle();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            }
        }
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isMethod().isMethod();
    }

    private void isMethod() {
        FrameLayout isVariable = (FrameLayout) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            isMethod();
            isNameExpr = (TextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null && isNameExpr.isMethod() != null) {
                isMethod(isNameExpr.isMethod());
            }
        }
    }

    private void isMethod() {
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + (isNameExpr == null ? "isStringConstant" : "isStringConstant"));
        if (isNameExpr != null && isNameExpr != null) {
            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
            String isVariable = isNameExpr.isMethod();
            TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(new ScrollingMovementMethod());
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
    }

    private void isMethod() {
        isMethod(true);
    }

    private void isMethod(boolean isParameter) {
        isNameExpr = true;
        isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
        VideoController isVariable = (VideoController) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
        }
        ThumbnailWrapper isVariable = (ThumbnailWrapper) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
        if (isNameExpr != null) {
            FragmentTransaction isVariable = isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        }
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        }
        isMethod(isNameExpr == null || !isNameExpr.isMethod());
        isMethod().isMethod(isNameExpr);
    }

    private void isMethod() {
        if (isNameExpr) {
            isMethod();
        } else {
            isMethod(true);
        }
    }

    private void isMethod() {
        isNameExpr = true;
        isMethod(isNameExpr.isFieldAccessExpr);
        VideoController isVariable = (VideoController) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
        }
        ThumbnailWrapper isVariable = (ThumbnailWrapper) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
        FrameLayout isVariable = (FrameLayout) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        LinearLayout.LayoutParams isVariable = (LinearLayout.LayoutParams) isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        FrameLayout isVariable = (FrameLayout) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (LinearLayout.LayoutParams) isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod().isMethod(isNameExpr);
    }

    private void isMethod() {
        isNameExpr = true;
        isMethod(isNameExpr.isFieldAccessExpr);
        VideoController isVariable = (VideoController) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
        }
        ThumbnailWrapper isVariable = (ThumbnailWrapper) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
        FrameLayout isVariable = (FrameLayout) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        LinearLayout.LayoutParams isVariable = (LinearLayout.LayoutParams) isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        FrameLayout isVariable = (FrameLayout) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = (LinearLayout.LayoutParams) isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        }
        isMethod(true);
        isMethod();
        isMethod().isMethod(isNameExpr);
    }

    public void isMethod(int isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant");
        if (isNameExpr == null) {
            return;
        }
        if (isNameExpr == isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    private ViewTreeObserver isMethod() {
        ViewTreeObserver isVariable = isMethod().isMethod().isMethod();
        return isNameExpr;
    }

    int isVariable = -isIntegerConstant;

    // isComment
    // isComment
    private ViewTreeObserver.OnGlobalLayoutListener isVariable = new ViewTreeObserver.OnGlobalLayoutListener() {

        @Override
        public void isMethod() {
            if (isMethod()) {
                final View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                final FrameLayout.LayoutParams isVariable = (FrameLayout.LayoutParams) isNameExpr.isMethod();
                isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = isIntegerConstant;
            } else {
                isMethod().isMethod();
                int isVariable = isMethod().isMethod();
                // isComment
                if (isNameExpr != isNameExpr) {
                    // isComment
                    // isComment
                    // isComment
                    final View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    final FrameLayout.LayoutParams isVariable = (FrameLayout.LayoutParams) isNameExpr.isMethod();
                    isNameExpr.isMethod(isIntegerConstant, isNameExpr, isIntegerConstant, isIntegerConstant);
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr;
                }
            }
            isMethod().isMethod(this);
        }
    };

    private void isMethod() {
        isMethod(!isMethod());
    }

    private boolean isMethod() {
        return isNameExpr;
    }

    private void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr;
        if (isNameExpr) {
            // isComment
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod().isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod().isMethod();
            if (isNameExpr != null) {
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); ++isNameExpr) {
                    isNameExpr.isMethod(isNameExpr).isMethod(true);
                }
            }
            isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        } else {
            if (isMethod()) {
                isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isMethod().isMethod();
                // isComment
                if (isNameExpr != null) {
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); ++isNameExpr) {
                        isNameExpr.isMethod(isNameExpr).isMethod(true);
                    }
                }
            }
            isMethod(true);
        }
    }

    private void isMethod(boolean isParameter) {
        VideoController isVariable = (VideoController) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            if (isNameExpr) {
                isNameExpr.isMethod();
            } else {
                isNameExpr.isMethod();
            }
        }
    }

    private Runnable isVariable = new Runnable() {

        @Override
        public void isMethod() {
            if (!isMethod()) {
                isMethod(true);
            }
        }
    };
}
