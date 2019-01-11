// isComment
/**
 * isComment
 */
package ca.farrelltonsolar.j2modlite.msg;

import ca.farrelltonsolar.j2modlite.Modbus;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ModbusMessageImpl {

    /**
     * isComment
     */
    public abstract ModbusResponse isMethod();

    /**
     * isComment
     */
    public abstract ModbusResponse isMethod();

    /**
     * isComment
     */
    public ModbusResponse isMethod(int isParameter) {
        ExceptionResponse isVariable = new ExceptionResponse(isMethod(), isNameExpr);
        if (!isMethod()) {
            isNameExpr.isMethod(isMethod());
            isNameExpr.isMethod(isMethod());
        } else {
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static ModbusRequest isMethod(int isParameter) {
        ModbusRequest isVariable = null;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadMultipleRegistersRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadInputRegistersRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadExceptionStatusRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadCommEventCounterRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadCommEventLogRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReportSlaveIDRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadFileRecordRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadFIFOQueueRequest();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadMEIRequest();
                break;
            default:
                isNameExpr = new IllegalFunctionRequest(isNameExpr);
                break;
        }
        return isNameExpr;
    }
}
