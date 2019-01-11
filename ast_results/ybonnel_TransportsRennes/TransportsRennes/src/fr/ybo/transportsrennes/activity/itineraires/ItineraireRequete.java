// isComment
package fr.ybo.transportsrennes.activity.itineraires;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderGeometry;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;
import com.google.code.geocoder.model.GeocoderStatus;
import com.google.code.geocoder.model.LatLng;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import fr.ybo.opentripplanner.client.OpenTripPlannerException;
import fr.ybo.opentripplanner.client.modele.Message;
import fr.ybo.opentripplanner.client.modele.Request;
import fr.ybo.opentripplanner.client.modele.Response;
import fr.ybo.transportscommun.activity.commun.BaseActivity.BaseSimpleActivity;
import fr.ybo.transportscommun.donnees.modele.Arret;
import fr.ybo.transportscommun.util.LocationUtil;
import fr.ybo.transportscommun.util.LocationUtil.UpdateLocationListenner;
import fr.ybo.transportscommun.util.LogYbo;
import fr.ybo.transportscommun.util.StringOperation;
import fr.ybo.transportsrennes.R;
import fr.ybo.transportsrennes.application.TransportsRennesApplication;
import fr.ybo.transportsrennes.itineraires.ItineraireReponse;
import fr.ybo.transportsrennes.util.AdresseAdapter;
import fr.ybo.transportsrennes.util.CalculItineraires;
import fr.ybo.transportsrennes.util.TransportsRennesException;

public class isClassOrIsInterface extends BaseSimpleActivity implements UpdateLocationListenner {

    private static final LogYbo isVariable = new LogYbo(ItineraireRequete.class);

    private LocationUtil isVariable;

    /**
     * isComment
     */
    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        super.isMethod();
    }

    private Calendar isVariable;

    private TextView isVariable;

    private TextView isVariable;

    private List<Arret> isVariable = new ArrayList<Arret>();

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = new LocationUtil(this, this);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = (TextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (TextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        AutoCompleteTextView isVariable = (AutoCompleteTextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        AdresseAdapter isVariable = new AdresseAdapter(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(this));
        AutoCompleteTextView isVariable = (AutoCompleteTextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        AdresseAdapter isVariable = new AdresseAdapter(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(this));
        isNameExpr.isMethod(new TextView.OnEditorActionListener() {

            public boolean isMethod(TextView isParameter, int isParameter, KeyEvent isParameter) {
                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    isMethod();
                    return true;
                }
                return true;
            }
        });
        isMethod();
        isNameExpr.isMethod(new View.OnClickListener() {

            public void isMethod(View isParameter) {
                isMethod(isNameExpr);
            }
        });
        isNameExpr.isMethod(new View.OnClickListener() {

            public void isMethod(View isParameter) {
                isMethod(isNameExpr);
            }
        });
        Button isVariable = (Button) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new View.OnClickListener() {

            public void isMethod(View isParameter) {
                isMethod();
            }
        });
        if (!isNameExpr.isMethod()) {
            isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr).isMethod();
        }
        new AsyncTask<Void, Void, Void>() {

            ProgressDialog isVariable;

            @Override
            protected void isMethod() {
                super.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr.this, "isStringConstant", isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
            }

            @Override
            protected Void isMethod(Void... isParameter) {
                isMethod();
                return null;
            }

            @Override
            protected void isMethod(Void isParameter) {
                try {
                    isNameExpr.isMethod();
                } catch (IllegalArgumentException isParameter) {
                }
                super.isMethod(isNameExpr);
            }
        }.isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod();
        Map<String, Arret> isVariable = new HashMap<String, Arret>();
        for (Arret isVariable : isNameExpr.isMethod().isMethod(Arret.class)) {
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    private void isMethod() {
        String isVariable = null;
        Editable isVariable = ((EditText) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        if (isNameExpr.isMethod() > isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod();
        }
        Editable isVariable = ((EditText) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        String isVariable = null;
        if (isNameExpr.isMethod() > isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod();
        }
        if ((isNameExpr == null || isNameExpr == null) && (isNameExpr.isMethod() == null || isNameExpr.isMethod().isMethod() > isIntegerConstant)) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
        } else {
            isMethod(isNameExpr, isNameExpr);
        }
    }

    private void isMethod(final String isParameter, final String isParameter) {
        new AsyncTask<Void, Void, Void>() {

            private ProgressDialog isVariable;

            private boolean isVariable = true;

            private boolean isVariable = true;

            private GeocodeResponse isVariable;

            private GeocodeResponse isVariable;

            @Override
            protected void isMethod() {
                super.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr.this, "isStringConstant", isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
            }

            private GeocodeResponse isMethod(Arret isParameter) {
                GeocodeResponse isVariable = new GeocodeResponse();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(new ArrayList<GeocoderResult>());
                GeocoderResult isVariable = new GeocoderResult();
                isNameExpr.isMethod(new GeocoderGeometry());
                isNameExpr.isMethod().isMethod(new LatLng(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod())));
                isNameExpr.isMethod().isMethod(isNameExpr);
                return isNameExpr;
            }

            @Override
            protected Void isMethod(Void... isParameter) {
                if (isNameExpr != null) {
                    // isComment
                    isNameExpr = null;
                    String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    for (Arret isVariable : isNameExpr) {
                        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                            isNameExpr = isMethod(isNameExpr);
                            break;
                        }
                    }
                    if (isNameExpr == null) {
                        GeocoderRequest isVariable = new GeocoderRequestBuilder().isMethod(isNameExpr).isMethod("isStringConstant").isMethod(isNameExpr.isMethod()).isMethod();
                        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
                        if (isNameExpr != null && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            isNameExpr = true;
                        } else if (isNameExpr == null || isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
                            isNameExpr = true;
                            return null;
                        }
                    }
                }
                if (isNameExpr != null) {
                    isMethod(new Runnable() {

                        public void isMethod() {
                            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        }
                    });
                    isNameExpr = null;
                    String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    for (Arret isVariable : isNameExpr) {
                        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                            isNameExpr = isMethod(isNameExpr);
                            break;
                        }
                    }
                    if (isNameExpr == null) {
                        GeocoderRequest isVariable = new GeocoderRequestBuilder().isMethod(isNameExpr).isMethod("isStringConstant").isMethod(isNameExpr.isMethod()).isMethod();
                        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
                        if (isNameExpr != null && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            isNameExpr = true;
                        } else if (isNameExpr == null || isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
                            isNameExpr = true;
                            return null;
                        }
                    }
                }
                return null;
            }

            @Override
            protected void isMethod(Void isParameter) {
                super.isMethod(isNameExpr);
                isNameExpr.isMethod();
                if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
                } else if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
                } else {
                    isMethod(isNameExpr, isNameExpr);
                }
            }
        }.isMethod((Void) null);
    }

    private void isMethod(GeocodeResponse isParameter, GeocodeResponse isParameter) {
        StringBuilder isVariable = new StringBuilder();
        boolean isVariable = true;
        if (isNameExpr != null && isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr.isMethod('isStringConstant');
            isNameExpr = true;
        }
        if (isNameExpr != null && isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr = true;
        }
        if (isNameExpr) {
            isNameExpr.isMethod(this, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr).isMethod();
        } else {
            if (isNameExpr != null && isNameExpr.isMethod().isMethod() > isIntegerConstant || isNameExpr != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
                isMethod(isNameExpr, isNameExpr);
            } else {
                isMethod(isNameExpr == null ? null : isNameExpr.isMethod().isMethod(isIntegerConstant), isNameExpr == null ? null : isNameExpr.isMethod().isMethod(isIntegerConstant));
            }
        }
    }

    private void isMethod(GeocodeResponse isParameter, GeocodeResponse isParameter) {
        final GeocodeResponse isVariable = isNameExpr;
        final GeocodeResponse isVariable = isNameExpr;
        if (isNameExpr != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
            // isComment
            List<String> isVariable = new ArrayList<String>(isNameExpr.isMethod().isMethod());
            for (GeocoderResult isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            AlertDialog.Builder isVariable = new AlertDialog.Builder(this);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(new String[isNameExpr.isMethod()]), new DialogInterface.OnClickListener() {

                public void isMethod(DialogInterface isParameter, int isParameter) {
                    if (isNameExpr != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
                        GeocoderResult isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
                        isNameExpr.isMethod().isMethod();
                        isNameExpr.isMethod().isMethod(isNameExpr);
                        isMethod(isNameExpr, isNameExpr);
                    } else {
                        isMethod(isNameExpr.isMethod().isMethod(isNameExpr), isNameExpr == null ? null : isNameExpr.isMethod().isMethod(isIntegerConstant));
                    }
                }
            });
            isNameExpr.isMethod().isMethod();
        } else {
            // isComment
            List<String> isVariable = new ArrayList<String>(isNameExpr.isMethod().isMethod());
            for (GeocoderResult isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            AlertDialog.Builder isVariable = new AlertDialog.Builder(this);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(new String[isNameExpr.isMethod()]), new DialogInterface.OnClickListener() {

                public void isMethod(DialogInterface isParameter, int isParameter) {
                    isMethod(isNameExpr == null ? null : isNameExpr.isMethod().isMethod(isIntegerConstant), isNameExpr.isMethod().isMethod(isNameExpr));
                }
            });
            isNameExpr.isMethod().isMethod();
        }
    }

    private void isMethod(final GeocoderResult isParameter, final GeocoderResult isParameter) {
        double isVariable;
        double isVariable;
        double isVariable;
        double isVariable;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        } else {
            isNameExpr = isNameExpr.isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod().isMethod();
        }
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        } else {
            isNameExpr = isNameExpr.isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod().isMethod();
        }
        final Request isVariable = new Request(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isDoubleConstant);
        new AsyncTask<Void, Void, Response>() {

            private ProgressDialog isVariable;

            @Override
            protected void isMethod() {
                super.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr.this, "isStringConstant", isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
            }

            @Override
            protected Response isMethod(Void... isParameter) {
                try {
                    return isNameExpr.isMethod().isMethod(isNameExpr);
                } catch (OpenTripPlannerException isParameter) {
                    if (isNameExpr.isMethod() != null && (isNameExpr.isMethod() instanceof SocketException || isNameExpr.isMethod() instanceof FileNotFoundException || isNameExpr.isMethod() instanceof UnknownHostException || isNameExpr.isMethod() instanceof JsonIOException || isNameExpr.isMethod() instanceof SocketTimeoutException || isNameExpr.isMethod() instanceof JsonParseException)) {
                        return null;
                    } else {
                        throw new TransportsRennesException(isNameExpr);
                    }
                }
            }

            @Override
            protected void isMethod(Response isParameter) {
                super.isMethod(isNameExpr);
                isNameExpr.isMethod();
                if (isNameExpr == null) {
                    isNameExpr.isMethod(isNameExpr.this, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr).isMethod();
                } else if (isNameExpr.isMethod() != null) {
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
                    int isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    switch(isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
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
                            break;
                    }
                    isNameExpr.isMethod(isNameExpr.this, isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
                } else {
                    Intent isVariable = new Intent(isNameExpr.this, Itineraires.class);
                    isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
                    int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) * isIntegerConstant + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                    isMethod(isNameExpr);
                }
            }
        }.isMethod((Void) null);
    }

    private static final SimpleDateFormat isVariable = new SimpleDateFormat("isStringConstant");

    private static final SimpleDateFormat isVariable = new SimpleDateFormat("isStringConstant");

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private DatePickerDialog.OnDateSetListener isVariable = new DatePickerDialog.OnDateSetListener() {

        public void isMethod(DatePicker isParameter, int isParameter, int isParameter, int isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isMethod();
        }
    };

    private TimePickerDialog.OnTimeSetListener isVariable = new TimePickerDialog.OnTimeSetListener() {

        public void isMethod(TimePicker isParameter, int isParameter, int isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isMethod();
        }
    };

    @Override
    protected Dialog isMethod(int isParameter) {
        if (isNameExpr == isNameExpr) {
            return new DatePickerDialog(this, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        } else if (isNameExpr == isNameExpr) {
            return new TimePickerDialog(this, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), true);
        }
        return null;
    }

    public void isMethod(Location isParameter) {
    }
}
