// isComment
package org.slf4j.impl;

import org.slf4j.IMarkerFactory;
import org.slf4j.MarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MarkerFactoryBinder;

/**
 * isComment
 */
public class isClassOrIsInterface implements MarkerFactoryBinder {

    /**
     * isComment
     */
    public static final StaticMarkerBinder isVariable = new StaticMarkerBinder();

    private final IMarkerFactory isVariable = new BasicMarkerFactory();

    private isConstructor() {
    }

    /**
     * isComment
     */
    public IMarkerFactory isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public String isMethod() {
        return BasicMarkerFactory.class.isMethod();
    }
}
