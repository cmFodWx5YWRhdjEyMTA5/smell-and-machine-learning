// isComment
package net.osmand.plus.myplaces;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AlertDialog;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import net.osmand.AndroidUtils;
import net.osmand.data.LatLon;
import net.osmand.data.PointDescription;
import net.osmand.plus.GPXDatabase.GpxDataItem;
import net.osmand.plus.GPXUtilities;
import net.osmand.plus.GPXUtilities.GPXFile;
import net.osmand.plus.GPXUtilities.GPXTrackAnalysis;
import net.osmand.plus.GPXUtilities.Track;
import net.osmand.plus.GPXUtilities.TrkSegment;
import net.osmand.plus.GPXUtilities.WptPt;
import net.osmand.plus.GpxSelectionHelper.GpxDisplayGroup;
import net.osmand.plus.GpxSelectionHelper.GpxDisplayItem;
import net.osmand.plus.GpxSelectionHelper.GpxDisplayItemType;
import net.osmand.plus.GpxSelectionHelper.SelectedGpxFile;
import net.osmand.plus.UiUtilities;
import net.osmand.plus.OsmAndFormatter;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.OsmandSettings;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.activities.TrackActivity;
import net.osmand.plus.base.OsmAndListFragment;
import net.osmand.plus.helpers.GpxUiHelper;
import net.osmand.plus.helpers.GpxUiHelper.GPXDataSetAxisType;
import net.osmand.plus.helpers.GpxUiHelper.GPXDataSetType;
import net.osmand.plus.helpers.GpxUiHelper.OrderedLineDataSet;
import net.osmand.plus.measurementtool.NewGpxData;
import net.osmand.plus.myplaces.TrackBitmapDrawer.TrackBitmapDrawerListener;
import net.osmand.plus.views.controls.PagerSlidingTabStrip;
import net.osmand.plus.views.controls.PagerSlidingTabStrip.CustomTabProvider;
import net.osmand.plus.views.controls.WrapContentHeightViewPager;
import net.osmand.plus.views.controls.WrapContentHeightViewPager.ViewAtPositionInterface;
import net.osmand.plus.widgets.IconPopupMenu;
import net.osmand.util.Algorithms;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class isClassOrIsInterface extends OsmAndListFragment implements TrackBitmapDrawerListener {

    private OsmandApplication isVariable;

    private TrackActivityFragmentAdapter isVariable;

    private SegmentGPXAdapter isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private IconPopupMenu isVariable;

    private IconPopupMenu isVariable;

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        this.isFieldAccessExpr = isMethod();
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        ListView isVariable = (ListView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(null);
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = new TrackActivityFragmentAdapter(isNameExpr, this, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = new SegmentGPXAdapter(isNameExpr.isMethod(), new ArrayList<GpxDisplayItem>());
        isMethod(isNameExpr);
        return isNameExpr;
    }

    @Nullable
    public TrackActivity isMethod() {
        return (TrackActivity) isMethod();
    }

    public ArrayAdapter<?> isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        return super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        isNameExpr.isMethod();
        GPXFile isVariable = isMethod();
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr != null && !isNameExpr.isFieldAccessExpr) {
                MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new MenuItem.OnMenuItemClickListener() {

                    @Override
                    public boolean isMethod(MenuItem isParameter) {
                        final Uri isVariable = isNameExpr.isMethod(isMethod(), new File(isMethod().isFieldAccessExpr));
                        final Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                        isNameExpr.isMethod("isStringConstant");
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isMethod(isNameExpr);
                        return true;
                    }
                });
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            }
            if (isNameExpr.isFieldAccessExpr) {
                MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new MenuItem.OnMenuItemClickListener() {

                    @Override
                    public boolean isMethod(MenuItem isParameter) {
                        if (isMethod()) {
                            isMethod();
                            isNameExpr.isMethod();
                        }
                        return true;
                    }
                });
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            }
        }
    }

    @Nullable
    private GPXFile isMethod() {
        TrackActivity isVariable = isMethod();
        return isNameExpr != null ? isNameExpr.isMethod() : null;
    }

    @Nullable
    private GpxDataItem isMethod() {
        TrackActivity isVariable = isMethod();
        return isNameExpr != null ? isNameExpr.isMethod() : null;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod(true);
        isMethod();
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod(true);
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr.isFieldAccessExpr.isMethod();
            }
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr.isFieldAccessExpr.isMethod();
            }
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = null;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public void isMethod() {
        isNameExpr.isMethod();
        List<GpxDisplayGroup> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
            List<GpxDisplayItem> isVariable = isMethod(isNameExpr);
            if (isNameExpr != null) {
                for (GpxDisplayItem isVariable : isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                }
                isNameExpr.isMethod();
                if (isMethod() != null) {
                    isMethod();
                }
            }
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Nullable
    private List<GpxDisplayItem> isMethod(List<GpxDisplayGroup> isParameter) {
        return isNameExpr != null ? isNameExpr.isMethod(isNameExpr) : null;
    }

    @Nullable
    private List<GpxDisplayGroup> isMethod() {
        return isNameExpr != null ? isNameExpr.isMethod() : null;
    }

    @Nullable
    private List<GpxDisplayGroup> isMethod() {
        return isNameExpr != null ? isNameExpr.isMethod() : null;
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Bitmap isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private class isClassOrIsInterface extends ArrayAdapter<GpxDisplayItem> {

        isConstructor(@NonNull Context isParameter, @NonNull List<GpxDisplayItem> isParameter) {
            super(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        }

        @Override
        public boolean isMethod() {
            return true;
        }

        @NonNull
        @Override
        public View isMethod(int isParameter, View isParameter, @NonNull ViewGroup isParameter) {
            View isVariable = isNameExpr;
            PagerSlidingTabStrip isVariable;
            WrapContentHeightViewPager isVariable;
            boolean isVariable = true;
            if (isNameExpr == null) {
                LayoutInflater isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                boolean isVariable = isNameExpr.isMethod().isMethod();
                isNameExpr = (PagerSlidingTabStrip) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isDoubleConstant));
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isDoubleConstant));
                isNameExpr.isMethod(true);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr = (WrapContentHeightViewPager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(true);
                isNameExpr.isMethod(isIntegerConstant);
                isNameExpr = true;
            } else {
                isNameExpr = (PagerSlidingTabStrip) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr = (WrapContentHeightViewPager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            GpxDisplayItem isVariable = isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(new GPXItemPagerAdapter(isNameExpr, isNameExpr));
                if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                } else {
                    isNameExpr.isMethod(true);
                }
            }
            return isNameExpr;
        }
    }

    private enum GPXTabItemType {

        GPX_TAB_ITEM_GENERAL, GPX_TAB_ITEM_ALTITUDE, GPX_TAB_ITEM_SPEED
    }

    private class isClassOrIsInterface extends PagerAdapter implements CustomTabProvider, ViewAtPositionInterface {

        protected SparseArray<View> isVariable = new SparseArray<>();

        private PagerSlidingTabStrip isVariable;

        private GpxDisplayItem isVariable;

        private GPXTabItemType[] isVariable;

        private String[] isVariable;

        private Map<GPXTabItemType, List<ILineDataSet>> isVariable = new HashMap<>();

        private TrkSegment isVariable;

        private float isVariable;

        isConstructor(PagerSlidingTabStrip isParameter, GpxDisplayItem isParameter) {
            super();
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            isMethod();
        }

        private void isMethod() {
            List<GPXTabItemType> isVariable = new ArrayList<>();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr != null && isNameExpr.isFieldAccessExpr != null) {
                if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
                if (isNameExpr.isFieldAccessExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
            }
            isNameExpr = isNameExpr.isMethod(new GPXTabItemType[isNameExpr.isMethod()]);
            Context isVariable = isNameExpr.isMethod();
            isNameExpr = new String[isNameExpr.isFieldAccessExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                switch(isNameExpr[isNameExpr]) {
                    case isNameExpr:
                        isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        break;
                    case isNameExpr:
                        isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        break;
                    case isNameExpr:
                        isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        break;
                }
            }
        }

        private List<ILineDataSet> isMethod(GPXTabItemType isParameter, LineChart isParameter) {
            List<ILineDataSet> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null && isNameExpr != null) {
                isNameExpr = new ArrayList<>();
                GPXTrackAnalysis isVariable = isNameExpr.isFieldAccessExpr;
                switch(isNameExpr) {
                    case isNameExpr:
                        {
                            OrderedLineDataSet isVariable = null;
                            OrderedLineDataSet isVariable = null;
                            if (isNameExpr.isFieldAccessExpr) {
                                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, true, true);
                            }
                            if (isNameExpr.isFieldAccessExpr) {
                                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, true, true);
                            }
                            if (isNameExpr != null) {
                                isNameExpr.isMethod(isNameExpr);
                                if (isNameExpr != null) {
                                    isNameExpr.isMethod(isNameExpr.isMethod() < isNameExpr.isMethod() ? isIntegerConstant : isIntegerConstant, isNameExpr);
                                }
                            } else if (isNameExpr != null) {
                                isNameExpr.isMethod(isNameExpr);
                            }
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            break;
                        }
                    case isNameExpr:
                        {
                            OrderedLineDataSet isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, true, true);
                            if (isNameExpr != null) {
                                isNameExpr.isMethod(isNameExpr);
                            }
                            if (isNameExpr.isFieldAccessExpr) {
                                List<Entry> isVariable = isNameExpr != null ? isNameExpr.isMethod() : null;
                                OrderedLineDataSet isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, true, true);
                                if (isNameExpr != null) {
                                    isNameExpr.isMethod(isNameExpr);
                                }
                            }
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            break;
                        }
                    case isNameExpr:
                        {
                            OrderedLineDataSet isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, true, true);
                            if (isNameExpr != null) {
                                isNameExpr.isMethod(isNameExpr);
                            }
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            break;
                        }
                }
            }
            return isNameExpr;
        }

        private TrkSegment isMethod(LineChart isParameter) {
            if (isNameExpr == null) {
                List<ILineDataSet> isVariable = isNameExpr.isMethod().isMethod();
                if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                    for (GPXUtilities.Track isVariable : isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr) {
                        for (TrkSegment isVariable : isNameExpr.isFieldAccessExpr) {
                            if (isNameExpr.isFieldAccessExpr.isMethod() > isIntegerConstant && isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
                                isNameExpr = isNameExpr;
                                break;
                            }
                        }
                        if (isNameExpr != null) {
                            break;
                        }
                    }
                }
            }
            return isNameExpr;
        }

        private WptPt isMethod(LineChart isParameter, float isParameter) {
            WptPt isVariable = null;
            List<ILineDataSet> isVariable = isNameExpr.isMethod().isMethod();
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                TrkSegment isVariable = isMethod(isNameExpr);
                OrderedLineDataSet isVariable = (OrderedLineDataSet) isNameExpr.isMethod(isIntegerConstant);
                if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                    float isVariable = isNameExpr * isIntegerConstant;
                    for (WptPt isVariable : isNameExpr.isFieldAccessExpr) {
                        if (isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr) {
                            isNameExpr = isNameExpr;
                            break;
                        }
                    }
                } else {
                    float isVariable = isNameExpr * isNameExpr.isMethod();
                    double isVariable = isIntegerConstant;
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr.isMethod(); isNameExpr++) {
                        WptPt isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                        if (isNameExpr != isIntegerConstant) {
                            WptPt isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr - isIntegerConstant);
                            if (isNameExpr.isFieldAccessExpr < isNameExpr.isFieldAccessExpr) {
                                isNameExpr += isNameExpr.isFieldAccessExpr;
                            }
                        }
                        if (isNameExpr + isNameExpr.isFieldAccessExpr >= isNameExpr) {
                            isNameExpr = isNameExpr;
                            break;
                        }
                    }
                }
            }
            return isNameExpr;
        }

        private void isMethod(int isParameter) {
            isMethod().isMethod(isMethod().isMethod(), isMethod().isMethod(isIntegerConstant).isMethod() - isNameExpr);
        }

        @Override
        public int isMethod() {
            return isNameExpr.isFieldAccessExpr;
        }

        @Override
        public CharSequence isMethod(int isParameter) {
            return isNameExpr[isNameExpr];
        }

        @NonNull
        @Override
        public Object isMethod(@NonNull ViewGroup isParameter, int isParameter) {
            isNameExpr = true;
            GPXTabItemType isVariable = isNameExpr[isNameExpr];
            final View isVariable;
            LayoutInflater isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            switch(isNameExpr) {
                case isNameExpr:
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                    break;
                case isNameExpr:
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                    break;
                case isNameExpr:
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                    break;
                default:
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                    break;
            }
            GPXFile isVariable = isMethod();
            if (isNameExpr != null && isNameExpr != null) {
                GPXTrackAnalysis isVariable = isNameExpr.isFieldAccessExpr;
                final LineChart isVariable = (LineChart) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(true);
                isNameExpr.isMethod(new View.OnClickListener() {

                    @SuppressLint("isStringConstant")
                    @Override
                    public void isMethod(View isParameter) {
                        if (!isNameExpr) {
                            isNameExpr = true;
                            isNameExpr.isMethod(true);
                            isNameExpr.isMethod(new View.OnTouchListener() {

                                @Override
                                public boolean isMethod(View isParameter, MotionEvent isParameter) {
                                    isMethod().isMethod(true);
                                    switch(isNameExpr.isMethod()) {
                                        case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                                            isNameExpr = isNameExpr.isMethod();
                                            break;
                                        case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                                            isMethod(isNameExpr.isMethod(isNameExpr - isNameExpr.isMethod()));
                                            isNameExpr = isNameExpr.isMethod();
                                            break;
                                    }
                                    return true;
                                }
                            });
                            isNameExpr.isMethod(new OnChartValueSelectedListener() {

                                @Override
                                public void isMethod(Entry isParameter, Highlight isParameter) {
                                    WptPt isVariable = isMethod(isNameExpr, isNameExpr.isMethod());
                                    if (isNameExpr != null && isNameExpr != null) {
                                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                                    }
                                }

                                @Override
                                public void isMethod() {
                                }
                            });
                            final View isVariable = isNameExpr;
                            isNameExpr.isMethod(new OnChartGestureListener() {

                                float isVariable = -isIntegerConstant;

                                @Override
                                public void isMethod(MotionEvent isParameter, ChartGesture isParameter) {
                                    if (isNameExpr.isMethod() != null && isNameExpr.isMethod().isFieldAccessExpr > isIntegerConstant) {
                                        isNameExpr = isNameExpr.isMethod()[isIntegerConstant].isMethod();
                                    } else {
                                        isNameExpr = -isIntegerConstant;
                                    }
                                }

                                @Override
                                public void isMethod(MotionEvent isParameter, ChartGesture isParameter) {
                                    isNameExpr.isFieldAccessExpr = new Matrix(isNameExpr.isMethod().isMethod());
                                    Highlight[] isVariable = isNameExpr.isMethod();
                                    if (isNameExpr != null && isNameExpr.isFieldAccessExpr > isIntegerConstant) {
                                        isNameExpr.isFieldAccessExpr = isNameExpr[isIntegerConstant].isMethod();
                                    } else {
                                        isNameExpr.isFieldAccessExpr = -isIntegerConstant;
                                    }
                                    for (int isVariable = isIntegerConstant; isNameExpr < isMethod(); isNameExpr++) {
                                        View isVariable = isMethod(isNameExpr);
                                        if (isNameExpr != isNameExpr) {
                                            isMethod(isNameExpr);
                                        }
                                    }
                                }

                                @Override
                                public void isMethod(MotionEvent isParameter) {
                                }

                                @Override
                                public void isMethod(MotionEvent isParameter) {
                                }

                                @Override
                                public void isMethod(MotionEvent isParameter) {
                                }

                                @Override
                                public void isMethod(MotionEvent isParameter, MotionEvent isParameter, float isParameter, float isParameter) {
                                }

                                @Override
                                public void isMethod(MotionEvent isParameter, float isParameter, float isParameter) {
                                }

                                @Override
                                public void isMethod(MotionEvent isParameter, float isParameter, float isParameter) {
                                    if (isNameExpr != -isIntegerConstant) {
                                        Highlight isVariable = isNameExpr.isMethod(isNameExpr, isDoubleConstant);
                                        if (isNameExpr != null) {
                                            isNameExpr.isMethod(isNameExpr);
                                            WptPt isVariable = isMethod(isNameExpr, isNameExpr.isMethod());
                                            if (isNameExpr != null && isNameExpr != null) {
                                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
                final UiUtilities isVariable = isNameExpr.isMethod();
                switch(isNameExpr) {
                    case isNameExpr:
                        if (isNameExpr != null) {
                            if (isNameExpr.isFieldAccessExpr || isNameExpr.isFieldAccessExpr) {
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
                                isNameExpr.isMethod(new LineData(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr)));
                                isMethod(isNameExpr);
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            } else {
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            }
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr));
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod((int) (isNameExpr.isFieldAccessExpr / isIntegerConstant), isNameExpr.isMethod()));
                            if (isNameExpr.isFieldAccessExpr > isIntegerConstant) {
                                DateFormat isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                                DateFormat isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                                Date isVariable = new Date(isNameExpr.isFieldAccessExpr);
                                ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
                                ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
                                Date isVariable = new Date(isNameExpr.isFieldAccessExpr);
                                ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
                                ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
                            } else {
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            }
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        }
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                            @Override
                            public void isMethod(View isParameter) {
                                isMethod(isNameExpr.isFieldAccessExpr);
                            }
                        });
                        if (isNameExpr.isFieldAccessExpr) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                                @Override
                                public void isMethod(View isParameter) {
                                    isMethod();
                                }
                            });
                        }
                        if (!isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr) {
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                                @Override
                                public void isMethod(View isParameter) {
                                    TrackActivity isVariable = isMethod();
                                    if (isNameExpr != null) {
                                        isNameExpr = new IconPopupMenu(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        Menu isVariable = isNameExpr.isMethod();
                                        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        isNameExpr.isMethod(new IconPopupMenu.OnMenuItemClickListener() {

                                            @Override
                                            public boolean isMethod(MenuItem isParameter) {
                                                switch(isNameExpr.isMethod()) {
                                                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                                        TrkSegment isVariable = isMethod();
                                                        if (isNameExpr != null && isNameExpr != null) {
                                                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                                                        }
                                                        return true;
                                                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                                        TrackActivity isVariable = isMethod();
                                                        if (isNameExpr != null) {
                                                            AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr);
                                                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                                                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

                                                                @Override
                                                                public void isMethod(DialogInterface isParameter, int isParameter) {
                                                                    TrackActivity isVariable = isMethod();
                                                                    if (isNameExpr != null && isMethod()) {
                                                                        GPXFile isVariable = isMethod();
                                                                        if (isNameExpr != null && isNameExpr != null) {
                                                                            boolean isVariable = isNameExpr.isMethod();
                                                                            SelectedGpxFile isVariable = isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, true);
                                                                            new SaveGpxAsyncTask(isNameExpr, isNameExpr.this, isNameExpr, isNameExpr ? isNameExpr : null).isMethod(isNameExpr.isFieldAccessExpr);
                                                                        }
                                                                    }
                                                                }
                                                            });
                                                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
                                                            isNameExpr.isMethod();
                                                        }
                                                        return true;
                                                }
                                                return true;
                                            }
                                        });
                                        isNameExpr.isMethod();
                                    }
                                }
                            });
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        }
                        break;
                    case isNameExpr:
                        if (isNameExpr != null) {
                            if (isNameExpr.isFieldAccessExpr) {
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
                                isNameExpr.isMethod(new LineData(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr)));
                                isMethod(isNameExpr);
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            } else {
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            }
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr));
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr));
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        }
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                            @Override
                            public void isMethod(View isParameter) {
                                isMethod(isNameExpr.isFieldAccessExpr);
                            }
                        });
                        if (isNameExpr.isFieldAccessExpr) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                                @Override
                                public void isMethod(View isParameter) {
                                    isMethod();
                                }
                            });
                        }
                        if (!isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr) {
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                                @Override
                                public void isMethod(View isParameter) {
                                    TrackActivity isVariable = isMethod();
                                    if (isNameExpr != null) {
                                        isNameExpr = new IconPopupMenu(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        Menu isVariable = isNameExpr.isMethod();
                                        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        isNameExpr.isMethod(new IconPopupMenu.OnMenuItemClickListener() {

                                            @Override
                                            public boolean isMethod(MenuItem isParameter) {
                                                switch(isNameExpr.isMethod()) {
                                                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                                        TrkSegment isVariable = isMethod();
                                                        if (isNameExpr != null && isNameExpr != null) {
                                                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                                                        }
                                                        return true;
                                                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                                        TrackActivity isVariable = isMethod();
                                                        if (isNameExpr != null && isMethod()) {
                                                            GPXFile isVariable = isMethod();
                                                            if (isNameExpr != null && isNameExpr != null) {
                                                                boolean isVariable = isNameExpr.isMethod();
                                                                SelectedGpxFile isVariable = isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, true);
                                                                new SaveGpxAsyncTask(isNameExpr, isNameExpr.this, isNameExpr, isNameExpr ? isNameExpr : null).isMethod(isNameExpr.isFieldAccessExpr);
                                                            }
                                                        }
                                                        return true;
                                                }
                                                return true;
                                            }
                                        });
                                        isNameExpr.isMethod();
                                    }
                                }
                            });
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        }
                        break;
                    case isNameExpr:
                        if (isNameExpr != null && isNameExpr.isMethod()) {
                            if (isNameExpr.isFieldAccessExpr) {
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
                                isNameExpr.isMethod(new LineData(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr)));
                                isMethod(isNameExpr);
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            } else {
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            }
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod((int) (isNameExpr.isFieldAccessExpr / isIntegerConstant), isNameExpr.isMethod()));
                            ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr));
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        }
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                            @Override
                            public void isMethod(View isParameter) {
                                isMethod(isNameExpr.isFieldAccessExpr);
                            }
                        });
                        if (isNameExpr.isFieldAccessExpr) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                                @Override
                                public void isMethod(View isParameter) {
                                    isMethod();
                                }
                            });
                        }
                        if (!isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr) {
                            ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new View.OnClickListener() {

                                @Override
                                public void isMethod(View isParameter) {
                                    TrackActivity isVariable = isMethod();
                                    if (isNameExpr != null) {
                                        IconPopupMenu isVariable = new IconPopupMenu(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        Menu isVariable = isNameExpr.isMethod();
                                        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                        isNameExpr.isMethod(new IconPopupMenu.OnMenuItemClickListener() {

                                            @Override
                                            public boolean isMethod(MenuItem isParameter) {
                                                switch(isNameExpr.isMethod()) {
                                                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                                        TrkSegment isVariable = isMethod();
                                                        if (isNameExpr != null && isNameExpr != null) {
                                                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                                                        }
                                                        return true;
                                                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                                        TrackActivity isVariable = isMethod();
                                                        if (isNameExpr != null && isMethod()) {
                                                            GPXFile isVariable = isMethod();
                                                            if (isNameExpr != null && isNameExpr != null) {
                                                                boolean isVariable = isNameExpr.isMethod();
                                                                SelectedGpxFile isVariable = isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, true);
                                                                new SaveGpxAsyncTask(isNameExpr, isNameExpr.this, isNameExpr, isNameExpr ? isNameExpr : null).isMethod(isNameExpr.isFieldAccessExpr);
                                                            }
                                                        }
                                                        return true;
                                                }
                                                return true;
                                            }
                                        });
                                        isNameExpr.isMethod();
                                    }
                                }
                            });
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
                        }
                        break;
                }
            }
            isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr;
        }

        private boolean isMethod() {
            TrkSegment isVariable = isMethod();
            if (isNameExpr != null) {
                GPXFile isVariable = isMethod();
                if (isNameExpr != null) {
                    return isNameExpr.isMethod(isNameExpr);
                }
            }
            return true;
        }

        @Override
        public void isMethod(@NonNull ViewGroup isParameter, int isParameter, @NonNull Object isParameter) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod((View) isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull View isParameter, @NonNull Object isParameter) {
            return isNameExpr == isNameExpr;
        }

        @Override
        public View isMethod(@NonNull ViewGroup isParameter, int isParameter) {
            View isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            isNameExpr.isMethod(isNameExpr[isNameExpr].isMethod());
            isMethod(isNameExpr);
            return isNameExpr;
        }

        private int isMethod(GPXTabItemType isParameter) {
            int isVariable;
            switch(isNameExpr) {
                case isNameExpr:
                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    break;
                case isNameExpr:
                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    break;
                case isNameExpr:
                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    break;
                default:
                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }

        @Override
        public void isMethod(View isParameter) {
            GPXTabItemType isVariable = isNameExpr.isMethod((String) isNameExpr.isMethod());
            ImageView isVariable = (ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            int isVariable = isMethod(isNameExpr);
            switch(isNameExpr.isMethod()) {
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod()));
                    break;
            }
        }

        @Override
        public void isMethod(View isParameter) {
            GPXTabItemType isVariable = isNameExpr.isMethod((String) isNameExpr.isMethod());
            ImageView isVariable = (ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            int isVariable = isMethod(isNameExpr);
            switch(isNameExpr.isMethod()) {
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod()));
                    break;
            }
        }

        @Override
        public View isMethod(int isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }

        void isMethod(int isParameter) {
            View isVariable = isMethod(isNameExpr);
            if (isNameExpr != null) {
                isMethod((LineChart) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
        }

        void isMethod(LineChart isParameter) {
            if (isNameExpr != null && !isNameExpr.isMethod()) {
                if (isNameExpr.isFieldAccessExpr != null) {
                    isNameExpr.isMethod().isMethod(new Matrix(isNameExpr.isFieldAccessExpr), isNameExpr, true);
                }
                if (isNameExpr.isFieldAccessExpr != -isIntegerConstant) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
                } else {
                    isNameExpr.isMethod(null);
                }
            }
        }

        private TrkSegment isMethod() {
            for (Track isVariable : isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr) {
                for (TrkSegment isVariable : isNameExpr.isFieldAccessExpr) {
                    if (isNameExpr.isFieldAccessExpr.isMethod() > isIntegerConstant && isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
                        return isNameExpr;
                    }
                }
            }
            return null;
        }

        void isMethod(GPXTabItemType isParameter) {
            LatLon isVariable = null;
            WptPt isVariable = null;
            isNameExpr.isFieldAccessExpr = null;
            List<ILineDataSet> isVariable = isMethod(isNameExpr, null);
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr.isFieldAccessExpr = new GPXDataSetType[isNameExpr.isMethod()];
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    OrderedLineDataSet isVariable = (OrderedLineDataSet) isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isFieldAccessExpr[isNameExpr] = isNameExpr.isMethod();
                }
                if (isNameExpr.isFieldAccessExpr != -isIntegerConstant) {
                    TrkSegment isVariable = null;
                    for (Track isVariable : isNameExpr.isFieldAccessExpr.isMethod().isFieldAccessExpr) {
                        for (TrkSegment isVariable : isNameExpr.isFieldAccessExpr) {
                            if (isNameExpr.isFieldAccessExpr.isMethod() > isIntegerConstant && isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
                                isNameExpr = isNameExpr;
                                break;
                            }
                        }
                        if (isNameExpr != null) {
                            break;
                        }
                    }
                    if (isNameExpr != null) {
                        OrderedLineDataSet isVariable = (OrderedLineDataSet) isNameExpr.isMethod(isIntegerConstant);
                        float isVariable = isNameExpr.isFieldAccessExpr * isNameExpr.isMethod();
                        for (WptPt isVariable : isNameExpr.isFieldAccessExpr) {
                            if (isNameExpr.isFieldAccessExpr >= isNameExpr) {
                                isNameExpr = isNameExpr;
                                break;
                            }
                        }
                        if (isNameExpr != null) {
                            isNameExpr = new LatLon(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                        }
                    }
                }
            }
            if (isNameExpr == null) {
                isNameExpr = new LatLon(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            if (isNameExpr != null) {
                isNameExpr.isFieldAccessExpr = isNameExpr;
            } else {
                isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            }
            GPXFile isVariable = isMethod();
            GPXFile isVariable = isNameExpr.isFieldAccessExpr.isMethod();
            if (isNameExpr != null && isNameExpr != null) {
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr) == null;
                isNameExpr.isMethod().isMethod(isNameExpr);
            }
            final OsmandSettings isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), new PointDescription(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr), true, isNameExpr);
            isNameExpr.isMethod(isMethod());
        }
    }

    void isMethod() {
        TrackActivity isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private static class isClassOrIsInterface extends AsyncTask<Void, Void, Void> {

        private final GPXFile isVariable;

        private final SelectedGpxFile isVariable;

        private OsmandApplication isVariable;

        private final WeakReference<TrackActivity> isVariable;

        private final WeakReference<TrackSegmentFragment> isVariable;

        isConstructor(@NonNull TrackActivity isParameter, @NonNull TrackSegmentFragment isParameter, @NonNull GPXFile isParameter, @Nullable SelectedGpxFile isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            isNameExpr = new WeakReference<>(isNameExpr);
            isNameExpr = new WeakReference<>(isNameExpr);
            isNameExpr = isNameExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        protected void isMethod() {
            TrackActivity isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(true);
            }
        }

        @Override
        protected Void isMethod(Void... isParameter) {
            isNameExpr.isMethod(new File(isNameExpr.isFieldAccessExpr), isNameExpr, isNameExpr);
            return null;
        }

        @Override
        protected void isMethod(Void isParameter) {
            TrackActivity isVariable = isNameExpr.isMethod();
            TrackSegmentFragment isVariable = isNameExpr.isMethod();
            if (isNameExpr != null && isNameExpr != null) {
                if (isNameExpr != null) {
                    List<GpxDisplayGroup> isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null) {
                        isNameExpr.isMethod(isNameExpr);
                        isNameExpr.isMethod();
                    }
                }
                isNameExpr.isMethod();
                if (!isNameExpr.isMethod()) {
                    isNameExpr.isMethod(true);
                }
            }
        }
    }
}
