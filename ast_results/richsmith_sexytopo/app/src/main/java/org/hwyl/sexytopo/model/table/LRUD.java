// isComment
package org.hwyl.sexytopo.model.table;

import org.hwyl.sexytopo.control.util.CrossSectioner;
import org.hwyl.sexytopo.control.util.Space2DUtils;
import org.hwyl.sexytopo.model.survey.Leg;
import org.hwyl.sexytopo.model.survey.Station;
import org.hwyl.sexytopo.model.survey.Survey;

/**
 * isComment
 */
public enum LRUD {

    LEFT {

        public Leg isMethod(Survey isParameter, Station isParameter, double isParameter) {
            double isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr), -isDoubleConstant);
            return new Leg(isNameExpr, isNameExpr, isIntegerConstant);
        }
    }
    , RIGHT {

        public Leg isMethod(Survey isParameter, Station isParameter, double isParameter) {
            double isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr), isDoubleConstant);
            return new Leg(isNameExpr, isNameExpr, isIntegerConstant);
        }
    }
    , UP {

        public Leg isMethod(Survey isParameter, Station isParameter, double isParameter) {
            return new Leg(isNameExpr, isIntegerConstant, isDoubleConstant);
        }
    }
    , DOWN {

        public Leg isMethod(Survey isParameter, Station isParameter, double isParameter) {
            return new Leg(isNameExpr, isIntegerConstant, -isDoubleConstant);
        }
    }
    ;

    public abstract Leg isMethod(Survey isParameter, Station isParameter, double isParameter);
}
