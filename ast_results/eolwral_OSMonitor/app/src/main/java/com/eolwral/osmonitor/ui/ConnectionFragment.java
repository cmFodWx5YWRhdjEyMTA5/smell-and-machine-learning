// isComment
package com.eolwral.osmonitor.ui;

import java.io.File;
import java.io.FileWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.SimpleArrayMap;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.eolwral.osmonitor.R;
import com.eolwral.osmonitor.core.connectionInfo;
import com.eolwral.osmonitor.core.connectionInfoList;
import com.eolwral.osmonitor.core.processInfo;
import com.eolwral.osmonitor.core.processInfoList;
import com.eolwral.osmonitor.ipc.IpcService;
import com.eolwral.osmonitor.ipc.IpcService.ipcClientListener;
import com.eolwral.osmonitor.ipc.ipcCategory;
import com.eolwral.osmonitor.ipc.ipcData;
import com.eolwral.osmonitor.ipc.ipcMessage;
import com.eolwral.osmonitor.preference.OSMPreference;
import com.eolwral.osmonitor.settings.Settings;
import com.eolwral.osmonitor.util.ProcessUtil;
import com.eolwral.osmonitor.util.HttpUtil;
import com.eolwral.osmonitor.util.UserInterfaceUtil;

public class isClassOrIsInterface extends ListFragment implements ipcClientListener {

    // isComment
    private IpcService isVariable = isNameExpr.isMethod();

    private boolean isVariable = true;

    // isComment
    private ArrayList<connectionInfo> isVariable = new ArrayList<connectionInfo>();

    private Settings isVariable = null;

    private ProcessUtil isVariable = null;

    @SuppressLint("isStringConstant")
    private SimpleArrayMap<Integer, String> isVariable = new SimpleArrayMap<Integer, String>();

    // isComment
    private boolean isVariable = true;

    private Fragment isVariable = null;

    private ProgressDialog isVariable = null;

    // isComment
    private boolean isVariable = true;

    private MenuItem isVariable = null;

    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isMethod().isMethod());
        isNameExpr = isNameExpr.isMethod(isMethod().isMethod(), true);
        isMethod(new ConnectionListAdapter(isMethod().isMethod()));
    }

    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        // isComment
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) != null)
            isNameExpr = true;
        else
            isNameExpr = true;
        // isComment
        isMethod(true);
        return isNameExpr;
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        super.isMethod(isNameExpr, isNameExpr);
        // isComment
        isNameExpr = (MenuItem) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr)
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        else
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return;
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
        }
        return super.isMethod(isNameExpr);
    }

    private void isMethod() {
        final Resources isVariable = isMethod().isMethod();
        final Calendar isVariable = isNameExpr.isMethod();
        final SimpleDateFormat isVariable = new SimpleDateFormat("isStringConstant", isNameExpr.isMethod());
        Builder isVariable = new AlertDialog.Builder(isMethod());
        View isVariable = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new DialogInterface.OnClickListener() {

            public void isMethod(DialogInterface isParameter, int isParameter) {
                String isVariable = ((EditText) ((AlertDialog) isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod();
                isMethod(isNameExpr);
            }
        });
        isNameExpr.isMethod().isMethod();
        return;
    }

    private void isMethod(String isParameter) {
        if (isNameExpr.isMethod().isMethod("isStringConstant"))
            return;
        if (!isNameExpr.isMethod("isStringConstant"))
            isNameExpr += "isStringConstant";
        try {
            File isVariable = new File(isNameExpr.isMethod().isMethod() + "isStringConstant" + isNameExpr);
            if (isNameExpr.isMethod()) {
                new AlertDialog.Builder(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

                    public void isMethod(DialogInterface isParameter, int isParameter) {
                    }
                }).isMethod().isMethod();
                return;
            }
            isNameExpr.isMethod();
            FileWriter isVariable = new FileWriter(isNameExpr);
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                StringBuilder isVariable = new StringBuilder();
                // isComment
                connectionInfo isVariable = isNameExpr.isMethod(isNameExpr);
                // isComment
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
                isNameExpr.isMethod("isStringConstant");
                if (isNameExpr.isMethod() == isIntegerConstant)
                    isNameExpr.isMethod("isStringConstant");
                else if (isNameExpr.isMethod(isNameExpr.isMethod()))
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod())));
                else
                    isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            isNameExpr.isMethod();
        } catch (Exception isParameter) {
            new AlertDialog.Builder(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

                public void isMethod(DialogInterface isParameter, int isParameter) {
                }
            }).isMethod().isMethod();
            return;
        }
        new AlertDialog.Builder(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

            public void isMethod(DialogInterface isParameter, int isParameter) {
            }
        }).isMethod().isMethod();
    }

    private void isMethod(MenuItem isParameter) {
        isNameExpr = !isNameExpr;
        if (isNameExpr)
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        else
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return;
    }

    private void isMethod() {
        isNameExpr.isMethod(isMethod()).isMethod(new Intent("isStringConstant"));
        return;
    }

    private void isMethod() {
        Intent isVariable = new Intent(isMethod(), OSMPreference.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        return;
    }

    @SuppressLint("isStringConstant")
    @Override
    public void isMethod(ListView isParameter, View isParameter, int isParameter, long isParameter) {
        // isComment
        try {
            InetAddress isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
            if (isNameExpr.isMethod() || isNameExpr.isMethod() || isNameExpr.isMethod())
                return;
        } catch (Exception isParameter) {
        }
        // isComment
        String isVariable = isNameExpr.isMethod(isNameExpr).isMethod().isMethod("isStringConstant", "isStringConstant");
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
            new PrepareQuery().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        else
            new PrepareQuery().isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        isNameExpr = !isNameExpr;
        if (isNameExpr == true) {
            byte[] isVariable = { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, this);
        }
    }

    @Override
    public void isMethod(byte[] isParameter) {
        // isComment
        if (isNameExpr == true)
            return;
        if (isNameExpr == true || isNameExpr == null) {
            byte[] isVariable = { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), this);
            return;
        }
        // isComment
        while (!isNameExpr.isMethod()) isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        // isComment
        ipcMessage isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        try {
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                ipcData isVariable = isNameExpr.isMethod(isNameExpr);
                // isComment
                if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr)
                    isMethod(isNameExpr);
                else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr)
                    isMethod(isNameExpr);
            }
        } catch (Exception isParameter) {
            // isComment
            isNameExpr.isMethod();
        }
        ((ConnectionListAdapter) isMethod()).isMethod();
        // isComment
        byte[] isVariable = { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), this);
    }

    private void isMethod(ipcData isParameter) {
        // isComment
        connectionInfoList isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            connectionInfo isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private void isMethod(ipcData isParameter) {
        processInfoList isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            processInfo isVariable = isNameExpr.isMethod(isNameExpr);
            if (!isNameExpr.isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            }
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface {

        // isComment
        ImageView isVariable;

        TextView isVariable;

        TextView isVariable;

        TextView isVariable;

        TextView isVariable;

        TextView isVariable;
    }

    private class isClassOrIsInterface extends BaseAdapter {

        private LayoutInflater isVariable = null;

        private ViewHolder isVariable = null;

        public isConstructor(Context isParameter) {
            isNameExpr = (LayoutInflater) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }

        public int isMethod() {
            return isNameExpr.isMethod();
        }

        public Object isMethod(int isParameter) {
            return isNameExpr;
        }

        public long isMethod(int isParameter) {
            return isNameExpr;
        }

        public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
            View isVariable = null;
            // isComment
            connectionInfo isVariable = isNameExpr.isMethod(isNameExpr);
            // isComment
            if (isNameExpr == null) {
                isNameExpr = (View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                isNameExpr = new ViewHolder();
                isNameExpr.isFieldAccessExpr = ((ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isFieldAccessExpr = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isFieldAccessExpr = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isFieldAccessExpr = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isFieldAccessExpr = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isFieldAccessExpr = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr = (View) isNameExpr;
                isNameExpr = (ViewHolder) isNameExpr.isMethod();
            }
            // isComment
            if (isNameExpr % isIntegerConstant == isIntegerConstant)
                isNameExpr.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            else
                isNameExpr.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            // isComment
            if (isNameExpr.isFieldAccessExpr != null) {
                if (isNameExpr.isMethod() == isIntegerConstant)
                    isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
                else
                    isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod())));
            }
            // isComment
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
            if (isNameExpr.isMethod() == isIntegerConstant)
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            else if (isNameExpr.isMethod(isNameExpr.isMethod()))
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod())));
            else
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod() + "isStringConstant");
            return isNameExpr;
        }

        public void isMethod() {
            this.isMethod();
        }
    }

    private void isMethod() {
        isMethod().isMethod(new Runnable() {

            public void isMethod() {
                // isComment
                isNameExpr = isNameExpr.isMethod(isMethod(), "isStringConstant", isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
                isNameExpr.isMethod(new OnCancelListener() {

                    @Override
                    public void isMethod(DialogInterface isParameter) {
                        isNameExpr.isMethod(isMethod().isMethod()).isMethod();
                    }
                });
                isNameExpr.isMethod(true);
            }
        });
    }

    private void isMethod() {
        // isComment
        if (isMethod() == null)
            return;
        isMethod().isMethod(new Runnable() {

            public void isMethod() {
                if (isNameExpr != null)
                    isNameExpr.isMethod();
                isNameExpr = null;
            }
        });
    }

    private void isMethod(CacheQuery isParameter) {
        // isComment
        // isComment
        // isComment
        ConnectionStaticMapFragment isVariable = new ConnectionStaticMapFragment();
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        if (isMethod() == null)
            return;
        final FragmentManager isVariable = isMethod().isMethod();
        final FragmentTransaction isVariable = isNameExpr.isMethod();
        if (isNameExpr) {
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, "isStringConstant");
            isNameExpr.isMethod();
            isNameExpr = isNameExpr;
        } else {
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, "isStringConstant");
            isNameExpr.isMethod(null);
            isNameExpr.isMethod();
        }
    }

    private void isMethod() {
        final FragmentTransaction isVariable = isMethod().isMethod().isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr).isMethod();
            isNameExpr = null;
        }
    }

    class isClassOrIsInterface {

        public String isVariable;

        public float isVariable;

        public float isVariable;
    }

    private final SimpleArrayMap<String, CacheQuery> isVariable = new SimpleArrayMap<String, CacheQuery>();

    class isClassOrIsInterface extends AsyncTask<String, Void, Void> {

        @Override
        protected Void isMethod(String... isParameter) {
            String isVariable = isNameExpr[isIntegerConstant];
            if (isNameExpr != null)
                new QueryWhois(isNameExpr);
            return null;
        }
    }

    class isClassOrIsInterface {

        public isConstructor(String isParameter) {
            // isComment
            if (isNameExpr.isMethod(isNameExpr) != null) {
                isMethod(isNameExpr.isMethod(isNameExpr));
                return;
            }
            // isComment
            isMethod();
            // isComment
            isMethod();
            String isVariable = "isStringConstant" + isNameExpr;
            JsonObjectRequest isVariable = new JsonObjectRequest(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, null, new Response(isNameExpr), new ResponseError());
            isNameExpr.isMethod(isMethod().isMethod()).isMethod(isNameExpr);
        }

        private String isMethod(String isParameter) {
            // isComment
            String isVariable = isNameExpr;
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod();
            } catch (UnknownHostException isParameter) {
            }
            return isNameExpr;
        }

        private class isClassOrIsInterface implements Listener<JSONObject> {

            private String isVariable;

            private String isVariable;

            public isConstructor(String isParameter) {
                this.isFieldAccessExpr = isNameExpr;
                this.isFieldAccessExpr = isMethod(isNameExpr);
            }

            @Override
            public void isMethod(JSONObject isParameter) {
                CacheQuery isVariable = new CacheQuery();
                StringBuilder isVariable = new StringBuilder();
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
                try {
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant");
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant");
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant");
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant");
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant");
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant");
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant"));
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod("isStringConstant");
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod("isStringConstant");
                } catch (JSONException isParameter) {
                }
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                isMethod();
                isMethod(isNameExpr);
            }
        }

        private class isClassOrIsInterface implements ErrorListener {

            @Override
            public void isMethod(VolleyError isParameter) {
                isMethod();
            }
        }
    }
}
