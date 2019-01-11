// isComment
package net.fortuna.ical4j.util;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import net.fortuna.ical4j.model.parameter.Encoding;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.QuotedPrintableCodec;

/**
 * isComment
 */
public class isClassOrIsInterface extends DecoderFactory {

    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    public BinaryDecoder isMethod(final Encoding isParameter) throws UnsupportedEncodingException {
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return new QuotedPrintableCodec();
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return new Base64();
        }
        throw new UnsupportedEncodingException(isNameExpr.isMethod(isNameExpr, new Object[] { isNameExpr }));
    }

    /**
     * isComment
     */
    public StringDecoder isMethod(final Encoding isParameter) throws UnsupportedEncodingException {
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return new QuotedPrintableCodec();
        }
        throw new UnsupportedEncodingException(isNameExpr.isMethod(isNameExpr, new Object[] { isNameExpr }));
    }
}
