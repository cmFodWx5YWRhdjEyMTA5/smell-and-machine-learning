// isComment
package jj2000.icc;

import java.io.InputStream;
import java.io.File;
import java.io.IOException;
import jj2000.colorspace.ColorSpace;
import jj2000.colorspace.ColorSpaceException;
import jj2000.j2k.io.RandomAccessIO;

public class isClassOrIsInterface extends ICCProfile {

    /**
     * isComment
     */
    public static ICCMatrixBasedInputProfile isMethod(ColorSpace isParameter) throws ColorSpaceException, ICCProfileInvalidException {
        return new ICCMatrixBasedInputProfile(isNameExpr);
    }

    /**
     * isComment
     */
    protected isConstructor(ColorSpace isParameter) throws ColorSpaceException, ICCProfileInvalidException {
        super(isNameExpr);
    }
}
