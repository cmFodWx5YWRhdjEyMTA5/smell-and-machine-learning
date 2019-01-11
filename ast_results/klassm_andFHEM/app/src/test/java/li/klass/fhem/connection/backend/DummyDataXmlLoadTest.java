// isComment
package li.klass.fhem.connection.backend;

import android.annotation.TargetApi;
import android.os.Build;
import org.assertj.core.util.Files;
import org.junit.Test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    public void isMethod() {
        for (FhemDevice isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod()).isMethod();
        }
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() throws IOException {
        File isVariable = isNameExpr.isMethod();
        try (ObjectOutputStream isVariable = new ObjectOutputStream(new FileOutputStream(isNameExpr))) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected Class<?> isMethod() {
        return DummyDataConnection.class;
    }
}
