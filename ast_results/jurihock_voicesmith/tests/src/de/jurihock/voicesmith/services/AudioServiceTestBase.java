// isComment
package de.jurihock.voicesmith.services;

import android.content.Intent;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;
import de.jurihock.voicesmith.audio.AudioDeviceManager;
import de.jurihock.voicesmith.audio.HeadsetManager;
import de.jurihock.voicesmith.audio.HeadsetMode;
import de.jurihock.voicesmith.io.AudioDevice;
import de.jurihock.voicesmith.io.dummy.DummyInDevice;
import de.jurihock.voicesmith.io.dummy.DummyOutDevice;
import org.mockito.Mock;
import java.io.IOException;
import static org.mockito.Mockito.*;

public abstract class isClassOrIsInterface<T extends AudioService> extends MockableServiceTestCase<T> implements ServiceListener {

    private ServiceFailureReason isVariable;

    @Mock
    private HeadsetManager isVariable;

    @Mock
    private AudioDeviceManager isVariable;

    public isConstructor(Class<T> isParameter) {
        super(isNameExpr);
    }

    private static void isMethod(double isParameter) {
        try {
            long isVariable = (long) (isNameExpr * isDoubleConstant);
            isNameExpr.isMethod(isNameExpr);
        } catch (InterruptedException isParameter) {
            return;
        }
    }

    @Override
    public void isMethod(ServiceFailureReason isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = null;
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod().isMethod(this);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod().isMethod(isNameExpr).isMethod(isMethod(HeadsetMode.class));
        isMethod().isMethod(isNameExpr).isMethod(isMethod(boolean.class));
        isMethod().isMethod(isNameExpr).isMethod();
        isMethod().isMethod(isNameExpr).isMethod();
        try {
            AudioDevice isVariable = new DummyInDevice(isMethod());
            AudioDevice isVariable = new DummyOutDevice(isMethod());
            isMethod(isNameExpr.isMethod(isMethod(HeadsetMode.class))).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod(isMethod(HeadsetMode.class))).isMethod(isNameExpr);
        } catch (IOException isParameter) {
            isMethod("isStringConstant");
        }
    }

    @SmallTest
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isMethod(), isMethod());
        isMethod(isNameExpr);
    }

    @SmallTest
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isMethod(), isMethod());
        isMethod(isNameExpr);
    }

    @LargeTest
    public void isMethod() throws IOException {
        isMethod();
        isMethod();
        T isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod(isMethod(HeadsetMode.class))).isMethod(new IOException());
        isMethod(isNameExpr.isMethod(isMethod(HeadsetMode.class))).isMethod(new IOException());
        isNameExpr.isMethod(true);
        {
            isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod(), true);
            isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @LargeTest
    public void isMethod() {
        isMethod();
        isMethod();
        T isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod(true);
        {
            isNameExpr.isMethod();
            isMethod(isIntegerConstant);
            isMethod(isNameExpr.isMethod(), true);
            isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, null);
        }
        isNameExpr.isMethod(true);
        {
            isNameExpr.isMethod();
            isMethod(isIntegerConstant);
            isMethod(isNameExpr.isMethod(), true);
            isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, null);
        }
    }

    @LargeTest
    public void isMethod() {
        isMethod();
        isMethod();
        T isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod(true);
        {
            isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod(), true);
            isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod(true);
        {
            isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod(), true);
            isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }
}
