// isComment
package com.google.android.apps.mytracks;

import com.google.android.apps.mytracks.content.MyTracksProviderUtils;
import com.google.android.apps.mytracks.content.SearchEngine;
import com.google.android.apps.mytracks.content.SearchEngine.ScoredResult;
import com.google.android.apps.mytracks.content.SearchEngine.SearchQuery;
import com.google.android.apps.mytracks.content.SearchEngineProvider;
import com.google.android.apps.mytracks.content.Track;
import com.google.android.apps.mytracks.content.Waypoint;
import com.google.android.apps.mytracks.content.Waypoint.WaypointType;
import com.google.android.apps.mytracks.fragments.DeleteMarkerDialogFragment;
import com.google.android.apps.mytracks.fragments.DeleteMarkerDialogFragment.DeleteMarkerCaller;
import com.google.android.apps.mytracks.services.MyTracksLocationManager;
import com.google.android.apps.mytracks.services.TrackRecordingServiceConnection;
import com.google.android.apps.mytracks.stats.TripStatistics;
import com.google.android.apps.mytracks.util.ApiAdapterFactory;
import com.google.android.apps.mytracks.util.IntentUtils;
import com.google.android.apps.mytracks.util.ListItemUtils;
import com.google.android.apps.mytracks.util.PreferencesUtils;
import com.google.android.apps.mytracks.util.StringUtils;
import com.google.android.apps.mytracks.util.TrackIconUtils;
import com.google.android.apps.mytracks.util.TrackRecordingServiceConnectionUtils;
import com.google.android.gms.location.LocationListener;
import com.google.android.maps.mytracks.R;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.provider.SearchRecentSuggestions;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractSendToGoogleActivity implements DeleteMarkerCaller {

    private static final String isVariable = SearchListActivity.class.isMethod();

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private final OnSharedPreferenceChangeListener isVariable = new OnSharedPreferenceChangeListener() {

        @Override
        public void isMethod(SharedPreferences isParameter, String isParameter) {
            if (isNameExpr == null || isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.this);
            }
            if (isNameExpr == null || isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            if (isNameExpr == null || isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            }
            if (isNameExpr != null) {
                isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod();
                    }
                });
            }
        }
    };

    // isComment
    private ContextualActionModeCallback isVariable = new ContextualActionModeCallback() {

        @Override
        public boolean isMethod(int isParameter, int[] isParameter, long[] isParameter) {
            return isMethod(isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(Menu isParameter, int[] isParameter, long[] isParameter, boolean isParameter) {
            boolean isVariable = isNameExpr != isNameExpr.isFieldAccessExpr;
            boolean isVariable = isNameExpr.isFieldAccessExpr == isIntegerConstant;
            boolean isVariable;
            boolean isVariable;
            if (isNameExpr) {
                Map<String, Object> isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
                Long isVariable = (Long) isNameExpr.isMethod(isNameExpr);
                Track isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr) == null;
            } else {
                isNameExpr = true;
                isNameExpr = true;
            }
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(!isNameExpr && isNameExpr && isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(!isNameExpr && isNameExpr && isNameExpr && !isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr && !isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr && !isNameExpr);
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr && (isNameExpr || !isNameExpr));
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
        }
    };

    private MyTracksProviderUtils isVariable;

    private SharedPreferences isVariable;

    private TrackRecordingServiceConnection isVariable;

    private SearchEngine isVariable;

    private SearchRecentSuggestions isVariable;

    private ArrayAdapter<Map<String, Object>> isVariable;

    private boolean isVariable = true;

    private long isVariable = isNameExpr.isFieldAccessExpr;

    private boolean isVariable = isNameExpr.isFieldAccessExpr;

    // isComment
    private ListView isVariable;

    private MenuItem isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(this);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr = new TrackRecordingServiceConnection(this, null);
        isNameExpr = new SearchEngine(isNameExpr);
        isNameExpr = isNameExpr.isMethod(this);
        isNameExpr = (ListView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new OnItemClickListener() {

            @Override
            public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
                Map<String, Object> isVariable = isNameExpr.isMethod(isNameExpr);
                Long isVariable = (Long) isNameExpr.isMethod(isNameExpr);
                Long isVariable = (Long) isNameExpr.isMethod(isNameExpr);
                Intent isVariable;
                if (isNameExpr != null) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.this, TrackDetailActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                } else {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.this, TrackDetailActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                }
                isMethod(isNameExpr);
            }
        });
        isNameExpr = new ArrayAdapter<Map<String, Object>>(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

            @Override
            public View isMethod(int isParameter, View isParameter, android.view.ViewGroup isParameter) {
                View isVariable;
                if (isNameExpr == null) {
                    isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                } else {
                    isNameExpr = isNameExpr;
                }
                Map<String, Object> isVariable = isMethod(isNameExpr);
                boolean isVariable = (Boolean) isNameExpr.isMethod(isNameExpr);
                boolean isVariable = (Boolean) isNameExpr.isMethod(isNameExpr);
                int isVariable = (Integer) isNameExpr.isMethod(isNameExpr);
                int isVariable = (Integer) isNameExpr.isMethod(isNameExpr);
                String isVariable = (String) isNameExpr.isMethod(isNameExpr);
                String isVariable = (String) isNameExpr.isMethod(isNameExpr);
                String isVariable = (String) isNameExpr.isMethod(isNameExpr);
                String isVariable = (String) isNameExpr.isMethod(isNameExpr);
                int isVariable = (Integer) isNameExpr.isMethod(isNameExpr);
                Long isVariable = (Long) isNameExpr.isMethod(isNameExpr);
                String isVariable = (String) isNameExpr.isMethod(isNameExpr);
                String isVariable = (String) isNameExpr.isMethod(isNameExpr);
                String isVariable = (String) isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.this, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, true, isNameExpr, isNameExpr, isNameExpr);
                return isNameExpr;
            }
        };
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(this, isNameExpr, isNameExpr);
        isMethod(isMethod());
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(null, null);
        isNameExpr.isMethod(this, isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Intent isParameter) {
        isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(this, isNameExpr, null);
        return super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr.isMethod().isMethod(this);
            default:
                return super.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(ContextMenu isParameter, View isParameter, ContextMenuInfo isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        AdapterContextMenuInfo isVariable = (AdapterContextMenuInfo) isNameExpr;
        isNameExpr.isMethod(isNameExpr, new int[] { isNameExpr.isFieldAccessExpr }, new long[] { isNameExpr.isFieldAccessExpr }, true);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        AdapterContextMenuInfo isVariable = (AdapterContextMenuInfo) isNameExpr.isMethod();
        if (isMethod(isNameExpr.isMethod(), new int[] { isNameExpr.isFieldAccessExpr })) {
            return true;
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr != null) {
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                return true;
            }
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    private boolean isMethod(int isParameter, int[] isParameter) {
        if (isNameExpr.isFieldAccessExpr != isIntegerConstant) {
            return true;
        }
        Map<String, Object> isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
        Long isVariable = (Long) isNameExpr.isMethod(isNameExpr);
        Long isVariable = (Long) isNameExpr.isMethod(isNameExpr);
        Intent isVariable;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(new long[] { isNameExpr });
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr = isNameExpr.isMethod(this, TrackDetailActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isMethod(isNameExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr != null) {
                    isNameExpr = isNameExpr.isMethod(this, MarkerEditActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                } else {
                    isNameExpr = isNameExpr.isMethod(this, TrackEditActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                }
                isMethod(isNameExpr);
                // isComment
                isMethod();
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr != null) {
                    isNameExpr.isMethod(new long[] { isNameExpr }).isMethod(isMethod(), isNameExpr.isFieldAccessExpr);
                } else {
                    isMethod(new long[] { isNameExpr });
                }
                return true;
            default:
                return true;
        }
    }

    /**
     * isComment
     */
    private void isMethod(Intent isParameter) {
        if (!isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            isMethod();
            return;
        }
        final String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        final MyTracksLocationManager isVariable = new MyTracksLocationManager(this, isNameExpr.isMethod(), true);
        LocationListener isVariable = new LocationListener() {

            @Override
            public void isMethod(final Location isParameter) {
                isNameExpr.isMethod();
                new Thread() {

                    @Override
                    public void isMethod() {
                        SearchQuery isVariable = new SearchQuery(isNameExpr, isNameExpr, -isStringConstant, isNameExpr.isMethod());
                        isMethod(isNameExpr);
                    }
                }.isMethod();
            }
        };
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    private void isMethod(SearchQuery isParameter) {
        SortedSet<ScoredResult> isVariable = isNameExpr.isMethod(isNameExpr);
        final List<Map<String, Object>> isVariable = isMethod(isNameExpr);
        // isComment
        isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod();
                isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
            }
        });
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
    }

    /**
     * isComment
     */
    private List<Map<String, Object>> isMethod(Collection<ScoredResult> isParameter) {
        ArrayList<Map<String, Object>> isVariable = new ArrayList<Map<String, Object>>(isNameExpr.isMethod());
        for (ScoredResult isVariable : isNameExpr) {
            Map<String, Object> isVariable = new HashMap<String, Object>();
            if (isNameExpr.isFieldAccessExpr != null) {
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            } else {
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private void isMethod(Waypoint isParameter, Map<String, Object> isParameter) {
        /*isComment*/
        String isVariable = null;
        long isVariable = isNameExpr.isMethod();
        if (isNameExpr != -isStringConstant) {
            Track isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod();
            }
        }
        boolean isVariable = isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr, true);
        isNameExpr.isMethod(isNameExpr, true);
        isNameExpr.isMethod(isNameExpr, isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, null);
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr == null ? null : isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
        isNameExpr.isMethod(isNameExpr, null);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr ? null : isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr ? null : isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    private void isMethod(Track isParameter, Map<String, Object> isParameter) {
        TripStatistics isVariable = isNameExpr.isMethod();
        String isVariable = isNameExpr.isMethod();
        String isVariable = isNameExpr != null && !isNameExpr.isMethod("isStringConstant") ? null : isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod() == isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, null);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, null);
    }

    @Override
    public void isMethod() {
        isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isMethod(isMethod());
            }
        });
    }

    @Override
    protected TrackRecordingServiceConnection isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isMethod(isMethod());
            }
        });
    }
}
