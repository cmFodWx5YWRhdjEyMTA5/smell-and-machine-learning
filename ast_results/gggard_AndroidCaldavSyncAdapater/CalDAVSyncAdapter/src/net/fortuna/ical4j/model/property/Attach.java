// isComment
package net.fortuna.ical4j.model.property;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.parameter.Encoding;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.util.DecoderFactory;
import net.fortuna.ical4j.util.EncoderFactory;
import net.fortuna.ical4j.util.ParameterValidator;
import net.fortuna.ical4j.util.Strings;
import net.fortuna.ical4j.util.Uris;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = isStringConstant;

    private URI isVariable;

    private byte[] isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final byte[] isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        // isComment
        isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final byte[] isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final URI isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final URI isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        /*isComment*/
        if (isNameExpr.isFieldAccessExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr))) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            if (!isNameExpr.isFieldAccessExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr))) {
                throw new ValidationException("isStringConstant" + "isStringConstant");
            }
        }
    }

    /**
     * isComment
     */
    public final byte[] isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final URI isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) throws IOException, URISyntaxException {
        // isComment
        if (isMethod(isNameExpr.isFieldAccessExpr) != null) {
            // isComment
            try {
                final BinaryDecoder isVariable = isNameExpr.isMethod().isMethod((Encoding) isMethod(isNameExpr.isFieldAccessExpr));
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (UnsupportedEncodingException isParameter) {
                Log isVariable = isNameExpr.isMethod(Attach.class);
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            } catch (DecoderException isParameter) {
                Log isVariable = isNameExpr.isMethod(Attach.class);
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
        } else // isComment
        {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public final String isMethod() {
        if (isMethod() != null) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if (isMethod() != null) {
            // isComment
            try {
                final BinaryEncoder isVariable = isNameExpr.isMethod().isMethod((Encoding) isMethod(isNameExpr.isFieldAccessExpr));
                return new String(isNameExpr.isMethod(isMethod()));
            } catch (UnsupportedEncodingException isParameter) {
                Log isVariable = isNameExpr.isMethod(Attach.class);
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            } catch (EncoderException isParameter) {
                Log isVariable = isNameExpr.isMethod(Attach.class);
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
        }
        return null;
    }

    /**
     * isComment
     */
    public final void isMethod(final byte[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        // isComment
        this.isFieldAccessExpr = null;
    }

    /**
     * isComment
     */
    public final void isMethod(final URI isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        // isComment
        this.isFieldAccessExpr = null;
    }
}
