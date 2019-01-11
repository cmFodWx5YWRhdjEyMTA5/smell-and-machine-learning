// isComment
package openfoodfacts.github.scrachx.openfood.network;

import openfoodfacts.github.scrachx.openfood.BuildConfig;
import openfoodfacts.github.scrachx.openfood.utils.Utils;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class isClassOrIsInterface implements ICommonApiManager {

    private static CommonApiManager isVariable;

    private ProductApiService isVariable;

    private OpenFoodAPIService isVariable;

    private JacksonConverterFactory isVariable;

    public static ICommonApiManager isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new CommonApiManager();
        }
        return isNameExpr;
    }

    private isConstructor() {
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public ProductApiService isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isMethod();
        }
        return isNameExpr;
    }

    @Override
    public OpenFoodAPIService isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isMethod();
        }
        return isNameExpr;
    }

    private ProductApiService isMethod() {
        isNameExpr = new Retrofit.Builder().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr).isMethod(isNameExpr.isMethod()).isMethod().isMethod(ProductApiService.class);
        return isNameExpr;
    }

    private OpenFoodAPIService isMethod() {
        isNameExpr = new Retrofit.Builder().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr).isMethod(isNameExpr.isMethod()).isMethod().isMethod(OpenFoodAPIService.class);
        return isNameExpr;
    }
}
