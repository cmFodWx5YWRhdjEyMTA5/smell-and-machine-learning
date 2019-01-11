// isComment
package cgeo.geocaching.staticmaps;

import cgeo.geocaching.Intents;
import cgeo.geocaching.R;
import cgeo.geocaching.activity.AbstractListActivity;
import cgeo.geocaching.enumerations.LoadFlags;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Waypoint;
import cgeo.geocaching.storage.DataStore;
import cgeo.geocaching.ui.dialog.Dialogs;
import cgeo.geocaching.utils.Log;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import java.util.concurrent.Callable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.OptionsItem;

@EActivity
public class isClassOrIsInterface extends AbstractListActivity {

    @Extra(isNameExpr.isFieldAccessExpr)
    boolean isVariable = true;

    @Extra(isNameExpr.isFieldAccessExpr)
    Integer isVariable = null;

    @Extra(isNameExpr.isFieldAccessExpr)
    String isVariable = null;

    private Geocache isVariable;

    private ProgressDialog isVariable = null;

    private StaticMapsAdapter isVariable;

    private MenuItem isVariable;

    private CompositeDisposable isVariable = new CompositeDisposable();

    @Override
    public void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr);
            isMethod();
            return;
        }
        isMethod(isNameExpr);
        isNameExpr = new StaticMapsAdapter(this);
        isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(final Menu isParameter) {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
        final Disposable isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(this, null, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new DialogInterface.OnCancelListener() {

            @Override
            public void isMethod(final DialogInterface isParameter) {
                isNameExpr.isMethod();
            }
        });
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
        super.isMethod();
    }

    @NonNull
    private Disposable isMethod() {
        return isMethod().isMethod(isNameExpr.isMethod()).isMethod(new Function<Bitmap, Bitmap>() {

            @Override
            public Bitmap isMethod(final Bitmap isParameter) throws Exception {
                isNameExpr.isMethod(isNameExpr);
                return isNameExpr;
            }
        }).isMethod().isMethod(new Action() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod()) {
                    if (isNameExpr) {
                        isNameExpr.isMethod(isMethod().isMethod(new Consumer<Boolean>() {

                            @Override
                            public void isMethod(final Boolean isParameter) throws Exception {
                                if (isNameExpr) {
                                    // isComment
                                    isNameExpr.isMethod().isMethod(new Runnable() {

                                        @Override
                                        public void isMethod() {
                                            isNameExpr.isMethod();
                                            isNameExpr.isMethod(isMethod());
                                        }
                                    });
                                } else {
                                    isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                }
                            }
                        }));
                    } else {
                        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        isMethod();
                    }
                } else if (isNameExpr != null) {
                    isNameExpr.isMethod(true);
                }
            }
        });
    }

    private Observable<Bitmap> isMethod() {
        return isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr).isMethod(new Function<Integer, Observable<Bitmap>>() {

            @Override
            public Observable<Bitmap> isMethod(final Integer isParameter) throws Exception {
                return isNameExpr.isMethod(new Callable<Bitmap>() {

                    @Override
                    public Bitmap isMethod() throws Exception {
                        return isNameExpr != null ? isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr) : isNameExpr.isMethod(isNameExpr, isNameExpr);
                    }
                }).isMethod().isMethod(isNameExpr.isMethod());
            }
        });
    }

    @OptionsItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isNameExpr.isMethod(true);
        isMethod().isMethod().isMethod(isNameExpr.isMethod()).isMethod(new Action() {

            @Override
            public void isMethod() throws Exception {
                isNameExpr.isMethod(true);
                isMethod();
            }
        });
    }

    private Single<Boolean> isMethod() {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod(new Callable<Boolean>() {

                @Override
                public Boolean isMethod() throws Exception {
                    return isNameExpr.isMethod();
                }
            }));
        }
        final Waypoint isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(isNameExpr.isMethod(new Callable<Boolean>() {

                @Override
                public Boolean isMethod() throws Exception {
                    return isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
            }));
        }
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        return isNameExpr.isMethod(true);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr);
        super.isMethod();
    }
}
