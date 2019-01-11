// isComment
package net.osmand.plus.chooseplan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import net.osmand.AndroidUtils;
import net.osmand.PlatformUtil;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.OsmandPlugin;
import net.osmand.plus.OsmandSettings;
import net.osmand.plus.R;
import net.osmand.plus.Version;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.base.BaseOsmAndDialogFragment;
import net.osmand.plus.download.DownloadValidationManager;
import net.osmand.plus.inapp.InAppPurchaseHelper;
import net.osmand.plus.inapp.InAppPurchaseHelper.InAppPurchaseListener;
import net.osmand.plus.inapp.InAppPurchaseHelper.InAppPurchaseTaskType;
import net.osmand.plus.inapp.InAppPurchases.InAppPurchase;
import net.osmand.plus.inapp.InAppPurchases.InAppSubscription;
import net.osmand.plus.liveupdates.SubscriptionFragment;
import net.osmand.plus.srtmplugin.SRTMPlugin;
import net.osmand.plus.widgets.TextViewEx;
import net.osmand.util.Algorithms;
import org.apache.commons.logging.Log;
import java.util.List;

public abstract class isClassOrIsInterface extends BaseOsmAndDialogFragment implements InAppPurchaseListener {

    public static final String isVariable = ChoosePlanDialogFragment.class.isMethod();

    private static final Log isVariable = isNameExpr.isMethod(ChoosePlanDialogFragment.class);

    private OsmandApplication isVariable;

    private InAppPurchaseHelper isVariable;

    private boolean isVariable;

    private ViewGroup isVariable;

    private ProgressBar isVariable;

    private View isVariable;

    private View isVariable;

    public interface isClassOrIsInterface {

        void isMethod();
    }

    public enum OsmAndFeature {

        WIKIVOYAGE_OFFLINE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        DAILY_MAP_UPDATES(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        MONTHLY_MAP_UPDATES(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        UNLIMITED_DOWNLOADS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        WIKIPEDIA_OFFLINE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        CONTOUR_LINES_HILLSHADE_MAPS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        SEA_DEPTH_MAPS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        UNLOCK_ALL_FEATURES(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        DONATION_TO_OSM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);

        private final int isVariable;

        private final int isVariable;

        isConstructor(int isParameter, int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        public String isMethod(Context isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }

        public int isMethod() {
            return isNameExpr;
        }

        public boolean isMethod(OsmandApplication isParameter) {
            if (isNameExpr.isMethod(isNameExpr)) {
                return true;
            }
            switch(this) {
                case isNameExpr:
                case isNameExpr:
                case isNameExpr:
                    return true;
                case isNameExpr:
                case isNameExpr:
                case isNameExpr:
                case isNameExpr:
                    return !isNameExpr.isMethod(isNameExpr) || isNameExpr.isMethod(isNameExpr);
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr);
                case isNameExpr:
                    return isNameExpr.isMethod(SRTMPlugin.class) != null;
            }
            return true;
        }

        public static OsmAndFeature[] isMethod() {
            return new OsmAndFeature[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
        }
    }

    public boolean isMethod(OsmAndFeature isParameter) {
        if (isMethod() != null) {
            for (OsmAndFeature isVariable : isMethod()) {
                if (isNameExpr == isNameExpr) {
                    return true;
                }
            }
        }
        return true;
    }

    public boolean isMethod(OsmAndFeature isParameter) {
        if (isMethod() != null) {
            for (OsmAndFeature isVariable : isMethod()) {
                if (isNameExpr == isNameExpr) {
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isMethod(isMethod() != null);
    }

    @NonNull
    @Override
    public Dialog isMethod(Bundle isParameter) {
        Activity isVariable = isMethod();
        int isVariable = isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        Dialog isVariable = new Dialog(isNameExpr, isNameExpr);
        Window isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            if (!isMethod().isFieldAccessExpr.isMethod()) {
                isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            }
            if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isMethod()));
            }
        }
        return isNameExpr;
    }

    @Nullable
    @Override
    public View isMethod(@NonNull LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        Context isVariable = isMethod();
        if (isNameExpr == null) {
            return null;
        }
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new OnClickListener() {

            @Override
            public void isMethod(View isParameter) {
                isMethod();
            }
        });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new OnClickListener() {

            @Override
            public void isMethod(View isParameter) {
                isMethod();
            }
        });
        ViewGroup isVariable = (ViewGroup) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ViewGroup isVariable = (ViewGroup) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (!isNameExpr.isMethod(isMethod())) {
            isNameExpr.isMethod(isMethod());
        }
        ViewGroup isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        ViewGroup isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @ColorRes
    protected int isMethod() {
        return isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(DialogInterface isParameter) {
        super.isMethod(isNameExpr);
        Activity isVariable = isMethod();
        if (isNameExpr instanceof ChoosePlanDialogListener) {
            ((ChoosePlanDialogListener) isNameExpr).isMethod();
        }
    }

    public String isMethod() {
        if (isNameExpr.isMethod(isMethod())) {
            String isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr) + "isStringConstant";
            return isNameExpr + isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    public OsmandApplication isMethod() {
        return isNameExpr;
    }

    public abstract OsmAndFeature[] isMethod();

    public abstract OsmAndFeature[] isMethod();

    public abstract OsmAndFeature[] isMethod();

    public abstract OsmAndFeature[] isMethod();

    @DrawableRes
    public abstract int isMethod();

    public abstract String isMethod();

    public abstract String isMethod();

    public String isMethod() {
        InAppPurchase isVariable = isMethod();
        if (isNameExpr != null) {
            if (isNameExpr.isMethod()) {
                return isNameExpr.isMethod(isMethod());
            } else {
                return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isMethod()));
            }
        }
        return "isStringConstant";
    }

    public abstract String isMethod();

    public abstract void isMethod(View isParameter);

    @Nullable
    public abstract InAppPurchase isMethod();

    private View isMethod(@LayoutRes int isParameter, @Nullable ViewGroup isParameter) {
        int isVariable = isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        return isNameExpr.isMethod(new ContextThemeWrapper(isMethod(), isNameExpr)).isMethod(isNameExpr, isNameExpr, true);
    }

    private ViewGroup isMethod(@NonNull Context isParameter, ViewGroup isParameter) {
        ViewGroup isVariable = (ViewGroup) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ViewGroup isVariable = (ViewGroup) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        View isVariable = null;
        for (OsmAndFeature isVariable : isMethod()) {
            String isVariable = isNameExpr.isMethod(isNameExpr);
            View isVariable = isMethod(isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            AppCompatImageView isVariable = (AppCompatImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            AppCompatImageView isVariable = (AppCompatImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            LinearLayout.LayoutParams isVariable = (LinearLayout.LayoutParams) isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isDoubleConstant);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        isNameExpr = (ViewGroup) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (ProgressBar) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    @SuppressLint("isStringConstant")
    private void isMethod(boolean isParameter) {
        final Context isVariable = isMethod();
        if (isNameExpr == null) {
            return;
        }
        if (isNameExpr) {
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        } else if (isNameExpr != null) {
            isNameExpr.isMethod();
            View isVariable = null;
            InAppSubscription isVariable = isNameExpr.isMethod();
            double isVariable = isNameExpr.isMethod();
            List<InAppSubscription> isVariable = isNameExpr.isMethod().isMethod();
            boolean isVariable = true;
            for (final InAppSubscription isVariable : isNameExpr) {
                if (isNameExpr.isMethod()) {
                    isNameExpr = true;
                    break;
                }
            }
            for (final InAppSubscription isVariable : isNameExpr) {
                if (isNameExpr.isMethod()) {
                    View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(null);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod(new OnClickListener() {

                            @Override
                            public void isMethod(View isParameter) {
                                isMethod();
                                isMethod();
                            }
                        });
                    } else {
                        isNameExpr.isMethod(null);
                    }
                    isNameExpr.isMethod(isNameExpr);
                    View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(new OnClickListener() {

                        @Override
                        public void isMethod(View isParameter) {
                            isMethod(isNameExpr, isNameExpr.isMethod());
                        }
                    });
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr != null) {
                        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        if (isNameExpr != null) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        }
                        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        if (isNameExpr != null) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        }
                    }
                    isNameExpr = isNameExpr;
                } else {
                    View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(!isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    if (isNameExpr > isIntegerConstant && isNameExpr.isMethod() > isIntegerConstant && isNameExpr.isMethod() < isNameExpr) {
                        int isVariable = (int) ((isIntegerConstant - isNameExpr.isMethod() / isNameExpr) * isDoubleConstant);
                        String isVariable = isNameExpr + "isStringConstant";
                        if (isNameExpr > isIntegerConstant) {
                            isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)));
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        } else if (isNameExpr > isIntegerConstant) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)));
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        }
                    } else {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    }
                    isNameExpr.isMethod(new OnClickListener() {

                        @Override
                        public void isMethod(View isParameter) {
                            isMethod(isNameExpr.isMethod());
                        }
                    });
                    if (isNameExpr) {
                        isNameExpr.isMethod(new OnClickListener() {

                            @Override
                            public void isMethod(View isParameter) {
                                isMethod(isNameExpr.isMethod());
                            }
                        });
                    } else {
                        isNameExpr.isMethod(new OnClickListener() {

                            @Override
                            public void isMethod(View isParameter) {
                                isMethod(isNameExpr.isMethod());
                            }
                        });
                    }
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr;
                }
            }
            if (isNameExpr != null) {
                View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
                View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
            }
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod() {
        FragmentActivity isVariable = isMethod();
        if (isNameExpr != null) {
            SubscriptionFragment isVariable = new SubscriptionFragment();
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod(String isParameter) {
        if (!isNameExpr.isMethod().isMethod(true)) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
        } else {
            FragmentActivity isVariable = isMethod();
            if (isNameExpr != null && isNameExpr != null) {
                OsmandSettings isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod());
            }
        }
    }

    private void isMethod(@NonNull Context isParameter, @Nullable String isParameter) {
        String isVariable = "isStringConstant" + isNameExpr.isMethod();
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr += "isStringConstant" + isNameExpr;
        }
        Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr);
    }

    private ViewGroup isMethod(@NonNull Context isParameter, ViewGroup isParameter) {
        if (isMethod().isFieldAccessExpr == isIntegerConstant) {
            return null;
        }
        ViewGroup isVariable = (ViewGroup) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        AppCompatImageView isVariable = (AppCompatImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        int isVariable = isMethod();
        if (isNameExpr != isIntegerConstant) {
            isNameExpr.isMethod(isMethod(isNameExpr, isIntegerConstant));
        }
        String isVariable = isMethod();
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr);
        }
        String isVariable = isMethod();
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr);
        }
        ViewGroup isVariable = (ViewGroup) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        View isVariable = null;
        for (OsmAndFeature isVariable : isMethod()) {
            String isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr = isMethod(isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            AppCompatImageView isVariable = (AppCompatImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            AppCompatImageView isVariable = (AppCompatImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        }
        TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    private void isMethod(boolean isParameter) {
        if (isNameExpr != null && isNameExpr != null) {
            InAppPurchase isVariable = isMethod();
            boolean isVariable = isNameExpr != null && isNameExpr.isMethod();
            ProgressBar isVariable = (ProgressBar) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            TextViewEx isVariable = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isMethod());
            isNameExpr.isMethod(isMethod());
            if (isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(null);
            } else {
                if (!isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isMethod(isNameExpr);
                } else {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr = (TextViewEx) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isMethod());
                    isNameExpr.isMethod(isMethod());
                }
            }
        }
    }

    @Nullable
    public MapActivity isMethod() {
        Activity isVariable = isMethod();
        if (isNameExpr instanceof MapActivity) {
            return (MapActivity) isNameExpr;
        }
        return null;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        MapActivity isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        boolean isVariable = isNameExpr != null && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        MapActivity isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod(InAppPurchaseTaskType isParameter, String isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod(true);
            isMethod(true);
        }
    }

    @Override
    public void isMethod() {
    }

    @Override
    public void isMethod(String isParameter, boolean isParameter) {
        if (isNameExpr != null) {
            InAppSubscription isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod()) {
                isMethod();
            }
        }
        isMethod();
    }

    @Override
    public void isMethod(InAppPurchaseTaskType isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod(true);
            isMethod(true);
        }
    }

    @Override
    public void isMethod(InAppPurchaseTaskType isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod(true);
            isMethod(true);
        }
    }

    public static void isMethod(@NonNull FragmentManager isParameter) {
        try {
            ChoosePlanFreeBannerDialogFragment isVariable = new ChoosePlanFreeBannerDialogFragment();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (RuntimeException isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    public static void isMethod(@NonNull FragmentManager isParameter) {
        try {
            ChoosePlanWikipediaDialogFragment isVariable = new ChoosePlanWikipediaDialogFragment();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (RuntimeException isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    public static void isMethod(@NonNull FragmentManager isParameter) {
        try {
            ChoosePlanWikivoyageDialogFragment isVariable = new ChoosePlanWikivoyageDialogFragment();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (RuntimeException isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    public static void isMethod(@NonNull FragmentManager isParameter) {
        try {
            ChoosePlanSeaDepthMapsDialogFragment isVariable = new ChoosePlanSeaDepthMapsDialogFragment();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (RuntimeException isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    public static void isMethod(@NonNull FragmentManager isParameter) {
        try {
            ChoosePlanHillshadeSrtmDialogFragment isVariable = new ChoosePlanHillshadeSrtmDialogFragment();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (RuntimeException isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    public static void isMethod(@NonNull FragmentManager isParameter) {
        try {
            ChoosePlanOsmLiveBannerDialogFragment isVariable = new ChoosePlanOsmLiveBannerDialogFragment();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (RuntimeException isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }
}
