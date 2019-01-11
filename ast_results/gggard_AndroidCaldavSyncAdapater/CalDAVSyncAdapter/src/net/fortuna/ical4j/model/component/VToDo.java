// isComment
package net.fortuna.ical4j.model.component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.ComponentList;
import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.Dur;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyList;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.Validator;
import net.fortuna.ical4j.model.property.Clazz;
import net.fortuna.ical4j.model.property.Completed;
import net.fortuna.ical4j.model.property.Created;
import net.fortuna.ical4j.model.property.Description;
import net.fortuna.ical4j.model.property.DtStamp;
import net.fortuna.ical4j.model.property.DtStart;
import net.fortuna.ical4j.model.property.Due;
import net.fortuna.ical4j.model.property.Duration;
import net.fortuna.ical4j.model.property.Geo;
import net.fortuna.ical4j.model.property.LastModified;
import net.fortuna.ical4j.model.property.Location;
import net.fortuna.ical4j.model.property.Method;
import net.fortuna.ical4j.model.property.Organizer;
import net.fortuna.ical4j.model.property.PercentComplete;
import net.fortuna.ical4j.model.property.Priority;
import net.fortuna.ical4j.model.property.RecurrenceId;
import net.fortuna.ical4j.model.property.Sequence;
import net.fortuna.ical4j.model.property.Status;
import net.fortuna.ical4j.model.property.Summary;
import net.fortuna.ical4j.model.property.Uid;
import net.fortuna.ical4j.model.property.Url;
import net.fortuna.ical4j.util.CompatibilityHints;
import net.fortuna.ical4j.util.ComponentValidator;
import net.fortuna.ical4j.util.PropertyValidator;
import net.fortuna.ical4j.util.Strings;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * isComment
 */
public class isClassOrIsInterface extends CalendarComponent {

    private static final long isVariable = -isStringConstant;

    private final Map isVariable = new HashMap();

    {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new AddValidator());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new CancelValidator());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new CounterValidator());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new DeclineCounterValidator());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new PublishValidator());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new RefreshValidator());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new ReplyValidator());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new RequestValidator());
    }

    private ComponentList isVariable = new ComponentList();

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr);
        isMethod().isMethod(new DtStamp());
    }

    /**
     * isComment
     */
    public isConstructor(final PropertyList isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final Date isParameter, final String isParameter) {
        this();
        isMethod().isMethod(new DtStart(isNameExpr));
        isMethod().isMethod(new Summary(isNameExpr));
    }

    /**
     * isComment
     */
    public isConstructor(final Date isParameter, final Date isParameter, final String isParameter) {
        this();
        isMethod().isMethod(new DtStart(isNameExpr));
        isMethod().isMethod(new Due(isNameExpr));
        isMethod().isMethod(new Summary(isNameExpr));
    }

    /**
     * isComment
     */
    public isConstructor(final Date isParameter, final Dur isParameter, final String isParameter) {
        this();
        isMethod().isMethod(new DtStart(isNameExpr));
        isMethod().isMethod(new Duration(isNameExpr));
        isMethod().isMethod(new Summary(isNameExpr));
    }

    /**
     * isComment
     */
    public final ComponentList isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final String isMethod() {
        final StringBuffer isVariable = new StringBuffer();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod('isStringConstant');
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod('isStringConstant');
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public final void isMethod(final boolean isParameter) throws ValidationException {
        // isComment
        final Iterator isVariable = isMethod().isMethod();
        while (isNameExpr.isMethod()) {
            final Component isVariable = (Component) isNameExpr.isMethod();
            if (!(isNameExpr instanceof VAlarm)) {
                throw new ValidationException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
            }
            ((VAlarm) isNameExpr).isMethod(isNameExpr);
        }
        if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            // isComment
            // isComment
            // isComment
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            // isComment
            // isComment
            // isComment
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        final Status isVariable = (Status) isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()) && !isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()) && !isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()) && !isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod())) {
            throw new ValidationException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        }
        /*isComment*/
        try {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        } catch (ValidationException isParameter) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
        if (isNameExpr) {
            isMethod();
        }
    }

    /**
     * isComment
     */
    protected Validator isMethod(Method isParameter) {
        return (Validator) isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            for (final Iterator isVariable = isMethod().isMethod(); isNameExpr.isMethod(); ) {
                final VAlarm isVariable = (VAlarm) isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            for (final Iterator isVariable = isMethod().isMethod(); isNameExpr.isMethod(); ) {
                final VAlarm isVariable = (VAlarm) isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            }
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            // isComment
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            for (final Iterator isVariable = isMethod().isMethod(); isNameExpr.isMethod(); ) {
                final VAlarm isVariable = (VAlarm) isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Validator {

        private static final long isVariable = isStringConstant;

        public void isMethod() throws ValidationException {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            for (final Iterator isVariable = isMethod().isMethod(); isNameExpr.isMethod(); ) {
                final VAlarm isVariable = (VAlarm) isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
    }

    /**
     * isComment
     */
    public final Clazz isMethod() {
        return (Clazz) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Completed isMethod() {
        return (Completed) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Created isMethod() {
        return (Created) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Description isMethod() {
        return (Description) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final DtStart isMethod() {
        return (DtStart) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Geo isMethod() {
        return (Geo) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final LastModified isMethod() {
        return (LastModified) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Location isMethod() {
        return (Location) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Organizer isMethod() {
        return (Organizer) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final PercentComplete isMethod() {
        return (PercentComplete) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Priority isMethod() {
        return (Priority) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final DtStamp isMethod() {
        return (DtStamp) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Sequence isMethod() {
        return (Sequence) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Status isMethod() {
        return (Status) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Summary isMethod() {
        return (Summary) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Url isMethod() {
        return (Url) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final RecurrenceId isMethod() {
        return (RecurrenceId) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Duration isMethod() {
        return (Duration) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Due isMethod() {
        return (Due) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final Uid isMethod() {
        return (Uid) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public boolean isMethod(final Object isParameter) {
        if (isNameExpr instanceof VToDo) {
            return super.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr, ((VToDo) isNameExpr).isMethod());
        }
        return super.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return new HashCodeBuilder().isMethod(isMethod()).isMethod(isMethod()).isMethod(isMethod()).isMethod();
    }

    /**
     * isComment
     */
    public Component isMethod() throws ParseException, IOException, URISyntaxException {
        final VToDo isVariable = (VToDo) super.isMethod();
        isNameExpr.isFieldAccessExpr = new ComponentList(isNameExpr);
        return isNameExpr;
    }
}
