// isComment
package com.better.alarm;

import com.better.alarm.statemachine.HandlerFactory;
import com.better.alarm.statemachine.IHandler;
import com.better.alarm.statemachine.Message;
import com.better.alarm.statemachine.MessageHandler;
import io.reactivex.Scheduler;

/**
 * isComment
 */
class isClassOrIsInterface implements HandlerFactory {

    private Scheduler isVariable;

    public isConstructor(Scheduler isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public IHandler isMethod(final MessageHandler isParameter) {
        return new IHandler() {

            @Override
            public void isMethod(Message isParameter) {
                isMethod(isNameExpr);
            }

            @Override
            public void isMethod(final Message isParameter) {
                isNameExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr);
                    }
                });
            }

            @Override
            public Message isMethod(int isParameter, Object isParameter) {
                return new Message(isNameExpr, this, null, null, isNameExpr);
            }

            @Override
            public Message isMethod(int isParameter) {
                return new Message(isNameExpr, this, null, null, null);
            }
        };
    }
}
