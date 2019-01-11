// isComment
package org.wheelmap.android.net;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.wheelmap.android.app.WheelmapApp;
import org.wheelmap.android.model.AutoValueGson_AutoValueAdapterFactory;
import org.wheelmap.android.modules.UserCredentials;
import org.wheelmap.android.online.BuildConfig;
import org.wheelmap.android.utils.Constants;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class isClassOrIsInterface {

    private static ApiModule isVariable;

    public static ApiModule isMethod() {
        if (isNameExpr == null) {
            synchronized (ApiModule.class) {
                if (isNameExpr == null) {
                    isNameExpr = new ApiModule();
                }
            }
        }
        return isNameExpr;
    }

    private WheelmapApi isVariable;

    private Gson isVariable;

    private isConstructor() {
    }

    public WheelmapApi isMethod() {
        if (isNameExpr == null) {
            Retrofit isVariable = new Retrofit.Builder().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod())).isMethod(isNameExpr.isMethod()).isMethod();
            WheelmapRestService isVariable = isNameExpr.isMethod(WheelmapRestService.class);
            isNameExpr = new WheelmapApi(isNameExpr);
        }
        return isNameExpr;
    }

    private OkHttpClient isMethod() {
        OkHttpClient.Builder isVariable = new OkHttpClient.Builder().isMethod(new HttpLoggingInterceptor().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new Interceptor() {

            @Override
            public Response isMethod(Chain isParameter) throws IOException {
                UserCredentials isVariable = new UserCredentials(isNameExpr.isMethod());
                Request isVariable = isNameExpr.isMethod();
                HttpUrl isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()).isMethod();
                isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
                return isNameExpr.isMethod(isNameExpr);
            }
        });
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(new StethoInterceptor());
        }
        return isNameExpr.isMethod();
    }

    public Gson isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new GsonBuilder().isMethod(isNameExpr.isMethod()).isMethod();
        }
        return isNameExpr;
    }
}
