// isComment
package com.wangdaye.mysplash.common.data.service.network;

import com.google.gson.GsonBuilder;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.common.basic.TLSCompactService;
import com.wangdaye.mysplash.common.data.api.StatusApi;
import com.wangdaye.mysplash.common.data.entity.unsplash.Total;
import com.wangdaye.mysplash.common.utils.widget.interceptor.AuthInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class isClassOrIsInterface extends TLSCompactService {

    private Call isVariable;

    public static StatusService isMethod() {
        return new StatusService();
    }

    private OkHttpClient isMethod() {
        return isMethod().isMethod(new AuthInterceptor()).isMethod();
    }

    private StatusApi isMethod(OkHttpClient isParameter) {
        return new Retrofit.Builder().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr).isMethod(isNameExpr.isMethod(new GsonBuilder().isMethod(isNameExpr.isFieldAccessExpr).isMethod())).isMethod().isMethod((StatusApi.class));
    }

    public void isMethod(final OnRequestTotalListener isParameter) {
        Call<Total> isVariable = isMethod(isMethod()).isMethod();
        isNameExpr.isMethod(new Callback<Total>() {

            @Override
            public void isMethod(Call<Total> isParameter, retrofit2.Response<Total> isParameter) {
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
            }

            @Override
            public void isMethod(Call<Total> isParameter, Throwable isParameter) {
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
            }
        });
        isNameExpr = isNameExpr;
    }

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    public interface isClassOrIsInterface {

        void isMethod(Call<Total> isParameter, retrofit2.Response<Total> isParameter);

        void isMethod(Call<Total> isParameter, Throwable isParameter);
    }
}
