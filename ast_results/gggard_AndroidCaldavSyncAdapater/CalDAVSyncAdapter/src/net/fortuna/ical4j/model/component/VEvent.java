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
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Dur;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.Period;
import net.fortuna.ical4j.model.PeriodList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyList;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.Validator;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.model.property.Clazz;
import net.fortuna.ical4j.model.property.Created;
import net.fortuna.ical4j.model.property.Description;
import net.fortuna.ical4j.model.property.DtEnd;
import net.fortuna.ical4j.model.property.DtStamp;
import net.fortuna.ical4j.model.property.DtStart;
import net.fortuna.ical4j.model.property.Duration;
import net.fortuna.ical4j.model.property.Geo;
import net.fortuna.ical4j.model.property.LastModified;
import net.fortuna.ical4j.model.property.Location;
import net.fortuna.ical4j.model.property.Method;
import net.fortuna.ical4j.model.property.Organizer;
import net.fortuna.ical4j.model.property.Priority;
import net.fortuna.ical4j.model.property.RecurrenceId;
import net.fortuna.ical4j.model.property.Sequence;
import net.fortuna.ical4j.model.property.Status;
import net.fortuna.ical4j.model.property.Summary;
import net.fortuna.ical4j.model.property.Transp;
import net.fortuna.ical4j.model.property.Uid;
import net.fortuna.ical4j.model.property.Url;
import net.fortuna.ical4j.util.CompatibilityHints;
import net.fortuna.ical4j.util.ComponentValidator;
import net.fortuna.ical4j.util.Dates;
import net.fortuna.ical4j.util.PropertyValidator;
import net.fortuna.ical4j.util.Strings;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * isComment
 */
public class isClassOrIsInterface extends CalendarComponent {

    private static final long isVariable = isStringConstant;

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

    private ComponentList isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr);
        this.isFieldAccessExpr = new ComponentList();
        isMethod().isMethod(new DtStamp());
    }

    /**
     * isComment
     */
    public isConstructor(final PropertyList isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = new ComponentList();
    }

    /**
     * isComment
     */
    public isConstructor(final PropertyList isParameter, final ComponentList isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
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
        isMethod().isMethod(new DtEnd(isNameExpr));
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
        final Status isVariable = (Status) isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()) && !isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()) && !isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod())) {
            throw new ValidationException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        }
        /*isComment*/
        try {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        } catch (ValidationException isParameter) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
        if (isMethod(isNameExpr.isFieldAccessExpr) != null) {
            /*isComment*/
            final DtStart isVariable = (DtStart) isMethod(isNameExpr.isFieldAccessExpr);
            final DtEnd isVariable = (DtEnd) isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                final Parameter isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                final Parameter isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                boolean isVariable = true;
                if (isNameExpr != null) {
                    if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr)) {
                        // isComment
                        isNameExpr = true;
                    } else if (isNameExpr == null && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                        // isComment
                        isNameExpr = true;
                    }
                } else if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                    // isComment
                    isNameExpr = true;
                }
                if (isNameExpr) {
                    throw new ValidationException("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
                }
            }
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

        public final void isMethod() throws ValidationException {
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
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            }
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
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            }
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
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            }
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
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            }
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
    public final PeriodList isMethod(final Date isParameter, final Date isParameter) {
        return isMethod(isNameExpr, isNameExpr, true);
    }

    /**
     * isComment
     */
    public final PeriodList isMethod(final Date isParameter, final Date isParameter, final boolean isParameter) {
        PeriodList isVariable = new PeriodList();
        // isComment
        if (!isNameExpr.isFieldAccessExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr))) {
            // isComment
            isNameExpr = isMethod(new Period(new DateTime(isNameExpr), new DateTime(isNameExpr)));
            // isComment
            if (!isNameExpr.isMethod() && isNameExpr) {
                isNameExpr = isNameExpr.isMethod();
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final VEvent isMethod(final Date isParameter) throws IOException, URISyntaxException, ParseException {
        final PeriodList isVariable = isMethod(isNameExpr, isNameExpr);
        for (final Iterator isVariable = isNameExpr.isMethod(); isNameExpr.isMethod(); ) {
            final Period isVariable = (Period) isNameExpr.isMethod();
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                final VEvent isVariable = (VEvent) this.isMethod();
                isNameExpr.isMethod().isMethod(new RecurrenceId(isNameExpr));
                return isNameExpr;
            }
        }
        return null;
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
    public final Transp isMethod() {
        return (Transp) isMethod(isNameExpr.isFieldAccessExpr);
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
    public final DtEnd isMethod() {
        return isMethod(true);
    }

    /**
     * isComment
     */
    public final DtEnd isMethod(final boolean isParameter) {
        DtEnd isVariable = (DtEnd) isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        if (isNameExpr == null && isNameExpr && isMethod() != null) {
            final DtStart isVariable = isMethod();
            final Duration isVariable = isMethod();
            isNameExpr = new DtEnd(isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isMethod()), (Value) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)));
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(true);
            }
        }
        return isNameExpr;
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
    public final Uid isMethod() {
        return (Uid) isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public boolean isMethod(final Object isParameter) {
        if (isNameExpr instanceof VEvent) {
            return super.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr, ((VEvent) isNameExpr).isMethod());
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
        final VEvent isVariable = (VEvent) super.isMethod();
        isNameExpr.isFieldAccessExpr = new ComponentList(isNameExpr);
        return isNameExpr;
    }
}
