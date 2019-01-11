// isComment
package li.klass.fhem.service.intent;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.collect.ImmutableList;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import li.klass.fhem.connection.backend.ConnectionService;
import li.klass.fhem.testutil.MockitoRule;
import li.klass.fhem.update.backend.command.execution.CommandExecutionService;
import li.klass.fhem.util.preferences.SharedPreferencesService;
import static com.tngtech.java.junit.dataprovider.DataProviders.$;
import static com.tngtech.java.junit.dataprovider.DataProviders.$$;
import static li.klass.fhem.service.intent.SendCommandService.Companion;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(DataProviderRunner.class)
public class isClassOrIsInterface {

    @Mock
    ConnectionService isVariable;

    @Mock
    CommandExecutionService isVariable;

    @Mock
    SharedPreferencesService isVariable;

    @Mock
    SharedPreferences isVariable;

    @Mock
    SharedPreferences.Editor isVariable;

    @Mock
    Context isVariable;

    @InjectMocks
    SendCommandService isVariable;

    @Rule
    public MockitoRule isVariable = new MockitoRule();

    @DataProvider
    public static Object[][] isMethod() {
        return isMethod(isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), "isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant")), isMethod(null, isNameExpr.<String>isMethod()), isMethod("isStringConstant", isNameExpr.<String>isMethod()));
    }

    @Test
    @UseDataProvider("isStringConstant")
    public void isMethod(String isParameter, List<String> isParameter) {
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), null)).isMethod(isNameExpr);
        ArrayList<String> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
    }
}
