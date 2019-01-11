// isComment
package com.zegoggles.smssync.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import static com.google.common.truth.Truth.assertThat;
import static com.zegoggles.smssync.mail.Attachment.encodeRFC2231;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod("isStringConstant", "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod("isStringConstant", "isStringConstant")).isMethod("isStringConstant");
    }
}
