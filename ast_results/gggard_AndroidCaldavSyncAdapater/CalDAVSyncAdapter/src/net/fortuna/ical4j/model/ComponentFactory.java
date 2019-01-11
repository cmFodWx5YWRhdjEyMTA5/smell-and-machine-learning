// isComment
package net.fortuna.ical4j.model;

import net.fortuna.ical4j.model.component.Available;
import net.fortuna.ical4j.model.component.Daylight;
import net.fortuna.ical4j.model.component.Observance;
import net.fortuna.ical4j.model.component.Standard;
import net.fortuna.ical4j.model.component.VAlarm;
import net.fortuna.ical4j.model.component.VAvailability;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.component.VFreeBusy;
import net.fortuna.ical4j.model.component.VJournal;
import net.fortuna.ical4j.model.component.VTimeZone;
import net.fortuna.ical4j.model.component.VToDo;
import net.fortuna.ical4j.model.component.VVenue;
import net.fortuna.ical4j.model.component.XComponent;
import net.fortuna.ical4j.util.CompatibilityHints;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    private static ComponentFactory isVariable = new ComponentFactory();

    /**
     * isComment
     */
    private isConstructor() {
    }

    /**
     * isComment
     */
    public static ComponentFactory isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Component isMethod(final String isParameter) {
        return isMethod(isNameExpr, new PropertyList());
    }

    /**
     * isComment
     */
    public Component isMethod(final String isParameter, final PropertyList isParameter) {
        Component isVariable = null;
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VAlarm(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VEvent(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VFreeBusy(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VJournal(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VToDo(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new Standard(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new Daylight(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VTimeZone(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VVenue(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new VAvailability(isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = new Available(isNameExpr);
        } else if (isMethod(isNameExpr)) {
            isNameExpr = new XComponent(isNameExpr, isNameExpr);
        } else if (isMethod()) {
            isNameExpr = new XComponent(isNameExpr, isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Component isMethod(final String isParameter, final PropertyList isParameter, final ComponentList isParameter) {
        if (isNameExpr != null) {
            Component isVariable = null;
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = new VTimeZone(isNameExpr, isNameExpr);
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = new VEvent(isNameExpr, isNameExpr);
            } else {
                throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
            }
            return isNameExpr;
        }
        return isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    private boolean isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod() > isNameExpr.isFieldAccessExpr.isMethod();
    }

    /**
     * isComment
     */
    protected boolean isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}
