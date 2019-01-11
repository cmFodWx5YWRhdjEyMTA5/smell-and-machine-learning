// isComment
package nitezh.ministock.mocks;

import java.util.HashMap;
import nitezh.ministock.Storage;

public class isClassOrIsInterface implements Storage {

    @Override
    public HashMap<String, ?> isMethod() {
        return new HashMap<>();
    }

    @Override
    public int isMethod(String isParameter, int isParameter) {
        return isIntegerConstant;
    }

    @Override
    public String isMethod(String isParameter, String isParameter) {
        return "isStringConstant";
    }

    @Override
    public boolean isMethod(String isParameter, boolean isParameter) {
        return true;
    }

    @Override
    public void isMethod(String isParameter, int isParameter) {
    }

    @Override
    public Storage isMethod(String isParameter, String isParameter) {
        return this;
    }

    @Override
    public void isMethod(String isParameter, Boolean isParameter) {
    }

    @Override
    public void isMethod(String isParameter, Float isParameter) {
    }

    @Override
    public void isMethod(String isParameter, Long isParameter) {
    }

    @Override
    public void isMethod() {
    }
}
