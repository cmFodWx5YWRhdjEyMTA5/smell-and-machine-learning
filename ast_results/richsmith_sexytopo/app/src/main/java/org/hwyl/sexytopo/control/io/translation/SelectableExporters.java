// isComment
package org.hwyl.sexytopo.control.io.translation;

import org.hwyl.sexytopo.control.io.thirdparty.compass.CompassExporter;
import org.hwyl.sexytopo.control.io.thirdparty.pockettopo.PocketTopoTxtExporter;
import org.hwyl.sexytopo.control.io.thirdparty.survex.SurvexExporter;
import org.hwyl.sexytopo.control.io.thirdparty.therion.TherionExporter;
import java.util.Arrays;
import java.util.List;

public class isClassOrIsInterface {

    public static final List<? extends Exporter> isVariable = isNameExpr.isMethod(new TherionExporter(), new SurvexExporter(), new PocketTopoTxtExporter(), new CompassExporter());
}
