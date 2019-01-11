// isComment
package li.klass.fhem.graph.backend.gplot;

import android.app.Application;
import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.Collections;
import li.klass.fhem.testutil.MockitoRule;
import li.klass.fhem.update.backend.command.execution.Command;
import li.klass.fhem.update.backend.command.execution.CommandExecutionService;
import static li.klass.fhem.graph.backend.gplot.GPlotDefinitionTestdataBuilder.defaultGPlotDefinition;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class isClassOrIsInterface {

    @Rule
    public MockitoRule isVariable = new MockitoRule();

    @InjectMocks
    private GPlotHolder isVariable;

    @Mock
    private GPlotParser isVariable;

    @Mock
    private Application isVariable;

    @Mock
    private Context isVariable;

    @Mock
    private CommandExecutionService isVariable;

    @Before
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        GPlotDefinition isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr));
        // isComment
        Optional<GPlotDefinition> isVariable = isNameExpr.isMethod("isStringConstant", true);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        GPlotDefinition isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.<String, GPlotDefinition>isMethod());
        String isVariable = "isStringConstant" + isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod(Context.class))).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
        // isComment
        Optional<GPlotDefinition> isVariable = isNameExpr.isMethod("isStringConstant", true);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.<String, GPlotDefinition>isMethod());
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod(Context.class))).isMethod(isNameExpr.<String>isMethod());
        // isComment
        Optional<GPlotDefinition> isVariable = isNameExpr.isMethod("isStringConstant", true);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr, isMethod()).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        GPlotDefinition isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.<String, GPlotDefinition>isMethod());
        String isVariable = "isStringConstant" + isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod(Context.class))).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod("isStringConstant", true);
        // isComment
        isNameExpr.isMethod("isStringConstant", true);
        // isComment
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        GPlotDefinition isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.<String, GPlotDefinition>isMethod());
        String isVariable = "isStringConstant" + isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod(Context.class))).isMethod(isNameExpr.<String>isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", true).isMethod()).isMethod();
        // isComment
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(), isMethod(Context.class));
        isMethod(isNameExpr, isMethod()).isMethod(isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        GPlotDefinition isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.<String, GPlotDefinition>isMethod());
        String isVariable = "isStringConstant" + isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isMethod(new Command("isStringConstant")))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod(isNameExpr));
        // isComment
        Optional<GPlotDefinition> isVariable = isNameExpr.isMethod("isStringConstant", true);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
