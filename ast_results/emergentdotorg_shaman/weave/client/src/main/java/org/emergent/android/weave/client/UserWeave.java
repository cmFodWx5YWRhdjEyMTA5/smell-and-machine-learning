// isComment
package org.emergent.android.weave.client;

import org.json.JSONObject;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.List;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    URI isMethod(String isParameter);

    URI isMethod(String isParameter) throws WeaveException;

    WeaveResponse isMethod(URI isParameter) throws WeaveException;

    WeaveResponse isMethod(URI isParameter, String isParameter) throws WeaveException;

    WeaveResponse isMethod(URI isParameter, String isParameter) throws WeaveException;

    WeaveResponse isMethod(URI isParameter) throws WeaveException;

    QueryResult<List<WeaveBasicObject>> isMethod(URI isParameter) throws WeaveException;

    void isMethod() throws WeaveException;

    JSONObject isMethod() throws WeaveException;

    BulkKeyCouplet isMethod(byte[] isParameter) throws GeneralSecurityException, WeaveException;

    void isMethod(char[] isParameter) throws WeaveException;

    QueryResult<JSONObject> isMethod(HashNode isParameter) throws WeaveException;

    BulkKeyTool isMethod(char[] isParameter) throws GeneralSecurityException, WeaveException;

    WeaveResponse isMethod(String isParameter, String isParameter) throws WeaveException;
}
