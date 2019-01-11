// isComment
package org.wheelmap.android.net;

import retrofit2.Response;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

class isClassOrIsInterface {

    private static class isClassOrIsInterface extends Exception {

        isConstructor(Response isParameter) {
            super(isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
        }
    }

    static <T> Observable.Transformer<Response<T>, T> isMethod() {
        return new Observable.Transformer<Response<T>, T>() {

            @Override
            public Observable<T> isMethod(Observable<Response<T>> isParameter) {
                return isNameExpr.isMethod(new Func1<Response<T>, Observable<T>>() {

                    @Override
                    public Observable<T> isMethod(Response<T> isParameter) {
                        if (isNameExpr.isMethod()) {
                            return isNameExpr.isMethod(isNameExpr.isMethod());
                        } else {
                            return isNameExpr.isMethod(new ApiException(isNameExpr));
                        }
                    }
                });
            }
        };
    }

    static <T> Single.Transformer<Response<T>, T> isMethod() {
        return new Single.Transformer<Response<T>, T>() {

            @Override
            public Single<T> isMethod(Single<Response<T>> isParameter) {
                return isNameExpr.isMethod(new Func1<Response<T>, Single<T>>() {

                    @Override
                    public Single<T> isMethod(Response<T> isParameter) {
                        if (isNameExpr.isMethod()) {
                            return isNameExpr.isMethod(isNameExpr.isMethod());
                        } else {
                            return isNameExpr.isMethod(new ApiException(isNameExpr));
                        }
                    }
                });
            }
        };
    }
}
