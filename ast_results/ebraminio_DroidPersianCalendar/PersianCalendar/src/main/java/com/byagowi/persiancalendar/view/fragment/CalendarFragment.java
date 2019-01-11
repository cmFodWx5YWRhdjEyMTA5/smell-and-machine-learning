// isComment
package com.byagowi.persiancalendar.view.fragment;

import android.Manifest;
import android.animation.LayoutTransition;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.byagowi.persiancalendar.Constants;
import com.byagowi.persiancalendar.R;
import com.byagowi.persiancalendar.adapter.CalendarAdapter;
import com.byagowi.persiancalendar.adapter.CardTabsAdapter;
import com.byagowi.persiancalendar.adapter.TimeItemAdapter;
import com.byagowi.persiancalendar.calendar.AbstractDate;
import com.byagowi.persiancalendar.calendar.CivilDate;
import com.byagowi.persiancalendar.databinding.EventsTabContentBinding;
import com.byagowi.persiancalendar.databinding.FragmentCalendarBinding;
import com.byagowi.persiancalendar.databinding.OwghatTabContentBinding;
import com.byagowi.persiancalendar.di.dependencies.AppDependency;
import com.byagowi.persiancalendar.di.dependencies.MainActivityDependency;
import com.byagowi.persiancalendar.entity.AbstractEvent;
import com.byagowi.persiancalendar.entity.DeviceCalendarEvent;
import com.byagowi.persiancalendar.praytimes.Coordinate;
import com.byagowi.persiancalendar.praytimes.PrayTimes;
import com.byagowi.persiancalendar.praytimes.PrayTimesCalculator;
import com.byagowi.persiancalendar.util.CalendarType;
import com.byagowi.persiancalendar.util.CalendarUtils;
import com.byagowi.persiancalendar.util.UIUtils;
import com.byagowi.persiancalendar.util.Utils;
import com.byagowi.persiancalendar.view.CalendarsView;
import com.byagowi.persiancalendar.view.activity.MainActivity;
import com.byagowi.persiancalendar.view.dialog.SelectDayDialog;
import com.cepmuvakkit.times.posAlgo.SunMoonPosition;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import dagger.android.support.DaggerFragment;
import static com.byagowi.persiancalendar.Constants.CALENDAR_EVENT_ADD_MODIFY_REQUEST_CODE;
import static com.byagowi.persiancalendar.Constants.PREF_HOLIDAY_TYPES;

public class isClassOrIsInterface extends DaggerFragment {

    @Inject
    AppDependency // isComment
    isVariable;

    @Inject
    MainActivityDependency // isComment
    isVariable;

    boolean isVariable = true;

    private Calendar isVariable = isNameExpr.isMethod();

    private Coordinate isVariable;

    private int isVariable;

    private FragmentCalendarBinding isVariable;

    private CalendarsView isVariable;

    private OwghatTabContentBinding isVariable;

    private EventsTabContentBinding isVariable;

    private long isVariable = -isIntegerConstant;

    private SearchView isVariable;

    private SearchView.SearchAutoComplete isVariable;

    private CalendarAdapter.CalendarAdapterHelper isVariable;

    private ViewPager.OnPageChangeListener isVariable = new ViewPager.SimpleOnPageChangeListener() {

        @Override
        public void isMethod(int isParameter) {
            isMethod(isNameExpr.isMethod(isNameExpr), true);
            isNameExpr.isFieldAccessExpr.isMethod();
        }
    };

    @Nullable
    @Override
    public View isMethod(@NonNull LayoutInflater isParameter, @Nullable ViewGroup isParameter, @Nullable Bundle isParameter) {
        Context isVariable = isNameExpr.isMethod();
        isMethod(true);
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isNameExpr = isIntegerConstant;
        List<String> isVariable = new ArrayList<>();
        List<View> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr = new CalendarsView(isNameExpr);
        isNameExpr.isMethod(() -> isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isParameter -> {
            if (isNameExpr)
                isNameExpr.isFieldAccessExpr.isMethod();
            else
                isNameExpr.isFieldAccessExpr.isMethod();
        });
        isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            LayoutTransition isVariable = new LayoutTransition();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        // isComment
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod().isMethod(this::onOwghatClick);
            isNameExpr.isFieldAccessExpr.isMethod(this::onOwghatClick);
            // isComment
            isNameExpr.isFieldAccessExpr.isMethod(isParameter -> {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                return true;
            });
            String isVariable = isNameExpr.isMethod(isNameExpr, true);
            if (!isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            }
            FlexboxLayoutManager isVariable = new FlexboxLayoutManager(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(new TimeItemAdapter());
        }
        isNameExpr.isFieldAccessExpr.isMethod(new CardTabsAdapter(isMethod(), isNameExpr, isNameExpr, isNameExpr));
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = new CalendarAdapter.CalendarAdapterHelper(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isFieldAccessExpr.isMethod(new CalendarAdapter(isMethod(), isNameExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        if (isNameExpr >= isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, true);
        AbstractDate isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr.isMethod()));
        return isNameExpr.isMethod();
    }

    void isMethod(int isParameter) {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod() + isNameExpr, true);
    }

    public void isMethod(long isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod() == isNameExpr);
        isMethod(isNameExpr);
    }

    public void isMethod(long isParameter) {
        MainActivity isVariable = isNameExpr.isMethod();
        CivilDate isVariable = new CivilDate(isNameExpr);
        Calendar isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod() - isIntegerConstant, isNameExpr.isMethod());
        if (isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) != isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            try {
                isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr))).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, true), isNameExpr);
            } catch (Exception isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
            }
        }
    }

    @Override
    public void isMethod(int isParameter, int isParameter, Intent isParameter) {
        MainActivity isVariable = isNameExpr.isMethod();
        if (isNameExpr == isNameExpr) {
            if (isNameExpr.isMethod()) {
                isMethod(isMethod(isNameExpr), true);
            } else {
                if (isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) != isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(isNameExpr);
                } else {
                    isNameExpr.isMethod(isNameExpr, true);
                    isNameExpr.isMethod();
                }
            }
        }
    }

    private void isMethod(int isParameter, boolean isParameter) {
        isNameExpr.isMethod().isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr));
    }

    private SpannableString isMethod(DeviceCalendarEvent isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr);
        SpannableString isVariable = new SpannableString(isNameExpr);
        ClickableSpan isVariable = new ClickableSpan() {

            @Override
            public void isMethod(@NonNull View isParameter) {
                try {
                    isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod())), isNameExpr);
                } catch (Exception isParameter) {
                    // isComment
                    isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
                }
            }

            @Override
            public void isMethod(@NonNull TextPaint isParameter) {
                super.isMethod(isNameExpr);
                String isVariable = isNameExpr.isMethod();
                if (!isNameExpr.isMethod(isNameExpr)) {
                    try {
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    } catch (Exception isParameter) {
                        isNameExpr.isMethod();
                    }
                }
            }
        };
        isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    private SpannableStringBuilder isMethod(List<AbstractEvent> isParameter) {
        SpannableStringBuilder isVariable = new SpannableStringBuilder();
        boolean isVariable = true;
        for (AbstractEvent isVariable : isNameExpr) if (isNameExpr instanceof DeviceCalendarEvent) {
            if (isNameExpr)
                isNameExpr = true;
            else
                isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isMethod((DeviceCalendarEvent) isNameExpr));
        }
        return isNameExpr;
    }

    private void isMethod(long isParameter) {
        List<AbstractEvent> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr));
        String isVariable = isNameExpr.isMethod(isNameExpr, true, true, true, true);
        String isVariable = isNameExpr.isMethod(isNameExpr, true, true, true, true);
        SpannableStringBuilder isVariable = isMethod(isNameExpr);
        StringBuilder isVariable = new StringBuilder();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            String isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr;
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        if (isNameExpr.isMethod() != isIntegerConstant) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        SpannableStringBuilder isVariable = new SpannableStringBuilder();
        Set<String> isVariable = isNameExpr.isMethod().isMethod(isNameExpr, new HashSet<>());
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (!isNameExpr.isMethod(isNameExpr))
                isNameExpr.isMethod("isStringConstant");
            String isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            SpannableString isVariable = new SpannableString(isNameExpr);
            ClickableSpan isVariable = new ClickableSpan() {

                @Override
                public void isMethod(@NonNull View isParameter) {
                    isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
            };
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr);
        }
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    private void isMethod(long isParameter, boolean isParameter) {
        if (isNameExpr == null) {
            return;
        }
        CivilDate isVariable = new CivilDate(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod() - isIntegerConstant, isNameExpr.isMethod());
        Date isVariable = isNameExpr.isMethod();
        PrayTimes isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr);
        RecyclerView.Adapter isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        if (isNameExpr instanceof TimeItemAdapter) {
            ((TimeItemAdapter) isNameExpr).isMethod(isNameExpr);
        }
        double isVariable = isIntegerConstant;
        try {
            isNameExpr = new SunMoonPosition(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isIntegerConstant, isIntegerConstant).isMethod();
        } catch (Exception isParameter) {
            isNameExpr.isMethod();
        }
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isFieldAccessExpr.isMethod(true);
            }
        } else {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod(View isParameter) {
        RecyclerView.Adapter isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        if (isNameExpr instanceof TimeItemAdapter) {
            TimeItemAdapter isVariable = (TimeItemAdapter) isNameExpr;
            boolean isVariable = !isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr == -isIntegerConstant)
            isNameExpr = isNameExpr.isMethod();
    }

    private void isMethod() {
        isNameExpr = -isIntegerConstant;
        isMethod(isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod());
    }

    public void isMethod(long isParameter) {
        Context isVariable = isMethod();
        if (isNameExpr == null)
            return;
        isNameExpr = isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr, true);
        if (isNameExpr.isMethod()) {
            long isVariable = isNameExpr.isMethod();
            if (isNameExpr != isNameExpr) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr, true, null, true, true, true), isNameExpr.isFieldAccessExpr).isMethod();
            }
        }
    }

    private int isMethod(long isParameter) {
        CalendarType isVariable = isNameExpr.isMethod();
        AbstractDate isVariable = isNameExpr.isMethod(isNameExpr);
        AbstractDate isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return (isNameExpr.isMethod() - isNameExpr.isMethod()) * isIntegerConstant + isNameExpr.isMethod() - isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = (SearchView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod(isParameter -> {
            if (isNameExpr != null)
                isNameExpr.isMethod(null);
            Context isVariable = isMethod();
            if (isNameExpr == null)
                return;
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            ArrayAdapter<AbstractEvent> isVariable = new ArrayAdapter<>(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod((isParameter, isParameter, isParameter, isParameter) -> {
                AbstractEvent isVariable = (AbstractEvent) isNameExpr.isMethod(isNameExpr);
                AbstractDate isVariable = isNameExpr.isMethod();
                CalendarType isVariable = isNameExpr.isMethod(isNameExpr);
                AbstractDate isVariable = isNameExpr.isMethod(isNameExpr);
                int isVariable = isNameExpr.isMethod();
                if (isNameExpr == -isIntegerConstant) {
                    isNameExpr = isNameExpr.isMethod() + (isNameExpr.isMethod() < isNameExpr.isMethod() ? isIntegerConstant : isIntegerConstant);
                }
                isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod());
                isNameExpr.isMethod();
            });
        });
    }

    private void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
            isNameExpr = null;
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
            isNameExpr.isMethod(null);
            isNameExpr = null;
        }
    }

    @Override
    public void isMethod() {
        isMethod();
        super.isMethod();
    }

    @Override
    public void isMethod() {
        isMethod();
        super.isMethod();
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr).isMethod(isMethod(), SelectDayDialog.class.isMethod());
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr == -isIntegerConstant)
                    isNameExpr = isNameExpr.isMethod();
                isMethod(isNameExpr);
                break;
            default:
                break;
        }
        return true;
    }

    int isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
            return true;
        }
        return true;
    }
}
