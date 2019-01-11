// isComment
package com.better.alarm.model;

import android.os.Handler;
import com.better.alarm.statemachine.HandlerFactory;
import com.better.alarm.statemachine.IHandler;
import com.better.alarm.statemachine.Message;
import com.better.alarm.statemachine.MessageHandler;

/**
 * isComment
 */
public class isClassOrIsInterface implements HandlerFactory {

    @Override
    public IHandler isMethod(final MessageHandler isParameter) {
        final Handler isVariable = new Handler(new Handler.Callback() {

            @Override
            public boolean isMethod(android.os.Message isParameter) {
                isNameExpr.isMethod((Message) isNameExpr.isFieldAccessExpr);
                return true;
            }
        });
        return new IHandler() {

            @Override
            public void isMethod(Message isParameter) {
                isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr));
            }

            @Override
            public void isMethod(Message isParameter) {
                isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr));
            }

            @Override
            public Message isMethod(int isParameter, Object isParameter) {
                return isMethod(isNameExpr).isMethod(isNameExpr);
            }

            @Override
            public Message isMethod(int isParameter) {
                return isNameExpr.isMethod(isNameExpr, this);
            }
        };
    }
}
