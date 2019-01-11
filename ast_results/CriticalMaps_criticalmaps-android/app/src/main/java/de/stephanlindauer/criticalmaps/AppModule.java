// isComment
package de.stephanlindauer.criticalmaps;

import android.content.Context;
import android.content.SharedPreferences;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import dagger.Reusable;
import okhttp3.OkHttpClient;

@Module
abstract class isClassOrIsInterface {

    @Provides
    @Singleton
    static OkHttpClient isMethod() {
        return new OkHttpClient.Builder().isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr).isMethod();
    }

    @Provides
    @Singleton
    static Picasso isMethod(App isParameter, OkHttpClient isParameter) {
        return new Picasso.Builder(isNameExpr).isMethod(new OkHttp3Downloader(isNameExpr)).isMethod();
    }

    @Provides
    @Reusable
    static SharedPreferences isMethod(App isParameter) {
        return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }
}
