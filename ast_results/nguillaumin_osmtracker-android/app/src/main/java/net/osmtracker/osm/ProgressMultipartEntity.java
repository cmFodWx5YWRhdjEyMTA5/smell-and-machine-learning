// isComment
package net.osmtracker.osm;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;

public class isClassOrIsInterface extends MultipartEntity {

    private final ProgressListener isVariable;

    public isConstructor(final HttpMultipartMode isParameter, Charset isParameter, final ProgressListener isParameter) {
        super(isNameExpr, null, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(final OutputStream isParameter) throws IOException {
        super.isMethod(new CountingOutputStream(isNameExpr, this.isFieldAccessExpr));
    }

    public static interface isClassOrIsInterface {

        void isMethod(long isParameter);
    }

    public static class isClassOrIsInterface extends FilterOutputStream {

        private final ProgressListener isVariable;

        private long isVariable;

        public isConstructor(final OutputStream isParameter, final ProgressListener isParameter) {
            super(isNameExpr);
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isIntegerConstant;
        }

        public void isMethod(byte[] isParameter, int isParameter, int isParameter) throws IOException {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            this.isFieldAccessExpr += isNameExpr;
            this.isFieldAccessExpr.isMethod(this.isFieldAccessExpr);
        }

        public void isMethod(int isParameter) throws IOException {
            isNameExpr.isMethod(isNameExpr);
            this.isFieldAccessExpr++;
            this.isFieldAccessExpr.isMethod(this.isFieldAccessExpr);
        }
    }
}
