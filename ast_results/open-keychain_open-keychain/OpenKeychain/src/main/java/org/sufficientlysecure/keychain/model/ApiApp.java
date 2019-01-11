// isComment
package org.sufficientlysecure.keychain.model;

import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.ApiAppsModel;

@AutoValue
public abstract class isClassOrIsInterface implements ApiAppsModel {

    public static final ApiAppsModel.Factory<ApiApp> isVariable = new ApiAppsModel.Factory<ApiApp>(AutoValue_ApiApp::new);

    public static ApiApp isMethod(String isParameter, byte[] isParameter) {
        return new AutoValue_ApiApp(null, isNameExpr, isNameExpr);
    }
}
