// isComment
package org.wordpress.android.networking;

import com.android.volley.RequestQueue;
import com.wordpress.rest.RestClient;

public class isClassOrIsInterface implements RestClientFactoryAbstract {

    public RestClient isMethod(RequestQueue isParameter) {
        return new RestClient(isNameExpr);
    }

    public RestClient isMethod(RequestQueue isParameter, RestClient.REST_CLIENT_VERSIONS isParameter) {
        return new RestClient(isNameExpr, isNameExpr);
    }
}
