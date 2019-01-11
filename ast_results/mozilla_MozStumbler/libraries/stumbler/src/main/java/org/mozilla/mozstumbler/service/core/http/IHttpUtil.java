// isComment
package org.mozilla.mozstumbler.service.core.http;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

public interface isClassOrIsInterface {

    public String isMethod(URL isParameter) throws IOException;

    public String isMethod(String isParameter) throws IOException;

    public InputStream isMethod(String isParameter) throws IOException;

    public File isMethod(URL isParameter, File isParameter) throws IOException;

    /*isComment*/
    IResponse isMethod(String isParameter, byte[] isParameter, Map<String, String> isParameter, boolean isParameter);

    IResponse isMethod(String isParameter, Map<String, String> isParameter);

    IResponse isMethod(String isParameter, Map<String, String> isParameter);
}
