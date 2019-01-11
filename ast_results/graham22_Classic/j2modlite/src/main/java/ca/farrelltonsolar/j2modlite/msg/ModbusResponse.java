// isComment
/**
 * isComment
 */
package ca.farrelltonsolar.j2modlite.msg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import ca.farrelltonsolar.j2modlite.Modbus;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ModbusMessageImpl {

    /**
     * isComment
     */
    protected void isMethod(byte[] isParameter) {
        try {
            isMethod(new DataInputStream(new ByteArrayInputStream(isNameExpr)));
        } catch (IOException isParameter) {
        }
    }

    // isComment
    /**
     * isComment
     */
    public static ModbusResponse isMethod(int isParameter) {
        ModbusResponse isVariable = null;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadMultipleRegistersResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadInputRegistersResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadExceptionStatusResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadCommEventCounterResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadCommEventLogResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReportSlaveIDResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadFileRecordResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadFileTransferResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadFIFOQueueResponse();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr = new ReadMEIResponse();
                break;
            default:
                if ((isNameExpr & isIntegerConstant) != isIntegerConstant) {
                    isNameExpr = new ExceptionResponse(isNameExpr);
                } else {
                    isNameExpr = new ExceptionResponse();
                }
                break;
        }
        return isNameExpr;
    }
}
