// isComment
package net.fortuna.ical4j.model;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.text.ParseException;

/**
 * isComment
 */
public interface isClassOrIsInterface extends Serializable {

    /**
     * isComment
     */
    Property isMethod(String isParameter);

    /**
     * isComment
     */
    Property isMethod(String isParameter, ParameterList isParameter, String isParameter) throws IOException, URISyntaxException, ParseException;
}
