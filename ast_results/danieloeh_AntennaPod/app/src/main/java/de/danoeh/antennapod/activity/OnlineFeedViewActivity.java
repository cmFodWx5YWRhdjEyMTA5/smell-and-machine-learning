// isComment
package de.danoeh.antennapod.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.UiThread;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import de.danoeh.antennapod.R;
import de.danoeh.antennapod.adapter.FeedItemlistDescriptionAdapter;
import de.danoeh.antennapod.core.dialog.DownloadRequestErrorDialogCreator;
import de.danoeh.antennapod.core.event.DownloadEvent;
import de.danoeh.antennapod.core.feed.EventDistributor;
import de.danoeh.antennapod.core.feed.Feed;
import de.danoeh.antennapod.core.feed.FeedItem;
import de.danoeh.antennapod.core.feed.FeedPreferences;
import de.danoeh.antennapod.core.glide.ApGlideSettings;
import de.danoeh.antennapod.core.preferences.UserPreferences;
import de.danoeh.antennapod.core.service.download.DownloadRequest;
import de.danoeh.antennapod.core.service.download.DownloadStatus;
import de.danoeh.antennapod.core.service.download.Downloader;
import de.danoeh.antennapod.core.service.download.HttpDownloader;
import de.danoeh.antennapod.core.storage.DBReader;
import de.danoeh.antennapod.core.storage.DownloadRequestException;
import de.danoeh.antennapod.core.storage.DownloadRequester;
import de.danoeh.antennapod.core.syndication.handler.FeedHandler;
import de.danoeh.antennapod.core.syndication.handler.UnsupportedFeedtypeException;
import de.danoeh.antennapod.core.util.DownloadError;
import de.danoeh.antennapod.core.util.FileNameGenerator;
import de.danoeh.antennapod.core.util.StorageUtils;
import de.danoeh.antennapod.core.util.URLChecker;
import de.danoeh.antennapod.core.util.syndication.FeedDiscoverer;
import de.danoeh.antennapod.core.util.syndication.HtmlToPlainText;
import de.danoeh.antennapod.dialog.AuthenticationDialog;
import de.greenrobot.event.EventBus;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppCompatActivity {

    public static final String isVariable = "isStringConstant";

    // isComment
    public static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private static final int isVariable = isNameExpr.isFieldAccessExpr;

    private volatile List<Feed> isVariable;

    private Feed isVariable;

    private String isVariable;

    private Downloader isVariable;

    private boolean isVariable;

    private Dialog isVariable;

    private Button isVariable;

    private Subscription isVariable;

    private Subscription isVariable;

    private Subscription isVariable;

    private final EventDistributor.EventListener isVariable = new EventDistributor.EventListener() {

        @Override
        public void isMethod(EventDistributor isParameter, Integer isParameter) {
            if ((isNameExpr & isNameExpr.isFieldAccessExpr) != isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(DBReader::getFeedList).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(isParameter -> {
                    isNameExpr.this.isFieldAccessExpr = isNameExpr;
                    isMethod(isNameExpr);
                }, isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr)));
            } else if ((isNameExpr & isNameExpr) != isIntegerConstant) {
                isMethod(isNameExpr);
            }
        }
    };

    public void isMethod(DownloadEvent isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant");
        isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        isMethod(isNameExpr.isMethod());
        super.isMethod(isNameExpr);
        ActionBar isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
        }
        if (isNameExpr != null && isMethod() != null && isMethod().isMethod(isNameExpr)) {
            isNameExpr.isMethod(isMethod().isMethod(isNameExpr));
        }
        isNameExpr.isMethod(this);
        final String isVariable;
        if (isMethod().isMethod(isNameExpr)) {
            isNameExpr = isMethod().isMethod(isNameExpr);
        } else if (isNameExpr.isMethod(isMethod().isMethod(), isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isMethod().isMethod(), isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isMethod(isMethod().isMethod(), isNameExpr.isFieldAccessExpr) ? isMethod().isMethod(isNameExpr.isFieldAccessExpr) : isMethod().isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        } else {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        isMethod();
        if (isNameExpr == null) {
            isMethod(isNameExpr, null, null);
        } else {
            isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"));
        }
    }

    /**
     * isComment
     */
    private void isMethod() {
        RelativeLayout isVariable = new RelativeLayout(this);
        RelativeLayout.LayoutParams isVariable = new RelativeLayout.LayoutParams(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ProgressBar isVariable = new ProgressBar(this);
        isNameExpr.isMethod(true);
        RelativeLayout.LayoutParams isVariable = new RelativeLayout.LayoutParams(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = true;
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(this);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = true;
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(this);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
        if (isNameExpr != null && isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr.isMethod() != null) {
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        }
    }

    private void isMethod(String isParameter, String isParameter) {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                Intent isVariable = new Intent(this, MainActivity.class);
                if (isNameExpr.isMethod(this, isNameExpr)) {
                    isMethod(isNameExpr);
                } else {
                    isNameExpr.isMethod(this);
                }
                return true;
        }
        return super.isMethod(isNameExpr);
    }

    private void isMethod(String isParameter, String isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr = new Feed(isNameExpr, null);
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(new FeedPreferences(isIntegerConstant, true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr));
        }
        String isVariable = new File(isMethod(), isNameExpr.isMethod(isNameExpr.isMethod())).isMethod();
        isNameExpr.isMethod(isNameExpr);
        final DownloadRequest isVariable = new DownloadRequest(isNameExpr.isMethod(), isNameExpr.isMethod(), "isStringConstant", isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, true, null);
        isNameExpr = isNameExpr.isMethod(() -> {
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = new HttpDownloader(isNameExpr);
            isNameExpr.isMethod();
            return isNameExpr.isMethod();
        }).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(this::checkDownloadResult, isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr)));
    }

    private void isMethod(DownloadStatus isParameter) {
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            isMethod();
            return;
        }
        if (isNameExpr.isMethod()) {
            return;
        }
        if (isNameExpr.isMethod()) {
            isMethod();
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            if (!isMethod() && !isNameExpr) {
                isNameExpr = new FeedViewAuthenticationDialog(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
                isNameExpr.isMethod();
            }
        } else {
            String isVariable = isNameExpr.isMethod().isMethod(isNameExpr.this);
            if (isNameExpr.isMethod() != null) {
                isNameExpr += "isStringConstant" + isNameExpr.isMethod() + "isStringConstant";
            }
            isMethod(isNameExpr);
        }
    }

    private void isMethod() {
        if (isNameExpr == null || (isNameExpr.isMethod() == null && isNameExpr.isMethod())) {
            throw new IllegalStateException("isStringConstant");
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr = isNameExpr.isMethod(() -> {
            FeedHandler isVariable = new FeedHandler();
            try {
                return isNameExpr.isMethod(isNameExpr);
            } catch (UnsupportedFeedtypeException isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
                    isMethod(new File(isNameExpr.isMethod()), isNameExpr.isMethod());
                    return null;
                } else {
                    throw isNameExpr;
                }
            } catch (Exception isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
                throw isNameExpr;
            } finally {
                boolean isVariable = new File(isNameExpr.isMethod()).isMethod();
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(isParameter -> {
            if (isNameExpr != null) {
                isMethod(isNameExpr.isFieldAccessExpr);
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            }
        }, isParameter -> {
            String isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.this) + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant";
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr));
        });
    }

    /**
     * isComment
     */
    private void isMethod(Feed isParameter) {
        final HtmlToPlainText isVariable = new HtmlToPlainText();
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()) && isNameExpr.isMethod() != null) {
            // isComment
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            Document isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isNameExpr.isMethod() != null) {
            for (FeedItem isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isMethod() != null) {
                    Document isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
                }
            }
        }
    }

    /**
     * isComment
     */
    private void isMethod(final Feed isParameter, Map<String, String> isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr);
        ListView isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        LayoutInflater isVariable = isNameExpr.isMethod(this);
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(new FeedItemlistDescriptionAdapter(this, isIntegerConstant, isNameExpr.isMethod()));
        ImageView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Spinner isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(this).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod().isMethod().isMethod(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isParameter -> {
            if (isMethod(isNameExpr)) {
                Intent isVariable = new Intent(isNameExpr.this, MainActivity.class);
                // isComment
                // isComment
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr));
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isMethod(isNameExpr);
            } else {
                Feed isVariable = new Feed(isNameExpr, null, isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr.isMethod());
                this.isFieldAccessExpr = isNameExpr;
                try {
                    isNameExpr.isMethod().isMethod(this, isNameExpr);
                } catch (DownloadRequestException isParameter) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(this, isNameExpr.isMethod());
                }
                isMethod(isNameExpr);
            }
        });
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            final List<String> isVariable = new ArrayList<>();
            final List<String> isVariable = new ArrayList<>();
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
            for (String isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            }
            ArrayAdapter<String> isVariable = new ArrayAdapter<>(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(new AdapterView.OnItemSelectedListener() {

                @Override
                public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                }

                @Override
                public void isMethod(AdapterView<?> isParameter) {
                }
            });
        }
        isMethod(isNameExpr);
    }

    private void isMethod(Feed isParameter) {
        if (isNameExpr != null && isNameExpr != null) {
            if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod(true);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else if (isMethod(isNameExpr)) {
                isNameExpr.isMethod(true);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(true);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
    }

    private boolean isMethod(Feed isParameter) {
        if (isNameExpr == null || isNameExpr == null) {
            return true;
        }
        for (Feed isVariable : isNameExpr) {
            if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
                return true;
            }
        }
        return true;
    }

    private long isMethod(Feed isParameter) {
        if (isNameExpr == null || isNameExpr == null) {
            return isIntegerConstant;
        }
        for (Feed isVariable : isNameExpr) {
            if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
                return isNameExpr.isMethod();
            }
        }
        return isIntegerConstant;
    }

    @UiThread
    private void isMethod(String isParameter) {
        if (!isMethod() && !isNameExpr) {
            AlertDialog.Builder isVariable = new AlertDialog.Builder(this);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, (isParameter, isParameter) -> isNameExpr.isMethod());
            isNameExpr.isMethod(isParameter -> {
                isMethod(isNameExpr);
                isMethod();
            });
            if (isNameExpr != null && isNameExpr.isMethod()) {
                isNameExpr.isMethod();
            }
            isNameExpr = isNameExpr.isMethod();
        }
    }

    private void isMethod(File isParameter, String isParameter) {
        FeedDiscoverer isVariable = new FeedDiscoverer();
        final Map<String, String> isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr == null || isNameExpr.isMethod()) {
                return;
            }
        } catch (IOException isParameter) {
            isNameExpr.isMethod();
            return;
        }
        if (isNameExpr || isMethod()) {
            return;
        }
        final List<String> isVariable = new ArrayList<>();
        final List<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr.isMethod());
        for (String isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        }
        final ArrayAdapter<String> isVariable = new ArrayAdapter<>(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        DialogInterface.OnClickListener isVariable = (isParameter, isParameter) -> {
            String isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            FeedPreferences isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
            } else {
                isMethod(isNameExpr, null, null);
            }
        };
        AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr.this).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isParameter -> isMethod()).isMethod(isNameExpr, isNameExpr);
        isMethod(() -> {
            if (isNameExpr != null && isNameExpr.isMethod()) {
                isNameExpr.isMethod();
            }
            isNameExpr = isNameExpr.isMethod();
        });
    }

    private class isClassOrIsInterface extends AuthenticationDialog {

        private final String isVariable;

        isConstructor(Context isParameter, int isParameter, String isParameter) {
            super(isNameExpr, isNameExpr, true, true, null, null);
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        protected void isMethod() {
            super.isMethod();
            isMethod();
        }

        @Override
        protected void isMethod(String isParameter, String isParameter, boolean isParameter) {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }
}
