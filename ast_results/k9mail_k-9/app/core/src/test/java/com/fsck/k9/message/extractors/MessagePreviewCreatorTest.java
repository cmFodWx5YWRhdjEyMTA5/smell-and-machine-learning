// isComment
package com.fsck.k9.message.extractors;

import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.Part;
import com.fsck.k9.mail.internet.MimeMessage;
import com.fsck.k9.message.extractors.PreviewResult.PreviewType;
import org.junit.Before;
import org.junit.Test;
import static com.fsck.k9.message.MessageCreationHelper.createEmptyPart;
import static com.fsck.k9.message.MessageCreationHelper.createTextPart;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class isClassOrIsInterface {

    private TextPartFinder isVariable;

    private PreviewTextExtractor isVariable;

    private MessagePreviewCreator isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(TextPartFinder.class);
        isNameExpr = isMethod(PreviewTextExtractor.class);
        isNameExpr = new MessagePreviewCreator(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        Message isVariable = isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(null);
        PreviewResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod();
        Part isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        PreviewResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod();
        Part isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod("isStringConstant");
        PreviewResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod();
        Part isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(new PreviewExtractionException("isStringConstant"));
        PreviewResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }

    private Message isMethod() {
        return new MimeMessage();
    }
}
