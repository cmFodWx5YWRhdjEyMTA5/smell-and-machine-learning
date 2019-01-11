// isComment
package net.fortuna.ical4j.model;

import java.net.URISyntaxException;
import net.fortuna.ical4j.model.parameter.Abbrev;
import net.fortuna.ical4j.model.parameter.AltRep;
import net.fortuna.ical4j.model.parameter.Cn;
import net.fortuna.ical4j.model.parameter.CuType;
import net.fortuna.ical4j.model.parameter.DelegatedFrom;
import net.fortuna.ical4j.model.parameter.DelegatedTo;
import net.fortuna.ical4j.model.parameter.Dir;
import net.fortuna.ical4j.model.parameter.Encoding;
import net.fortuna.ical4j.model.parameter.FbType;
import net.fortuna.ical4j.model.parameter.FmtType;
import net.fortuna.ical4j.model.parameter.Language;
import net.fortuna.ical4j.model.parameter.Member;
import net.fortuna.ical4j.model.parameter.PartStat;
import net.fortuna.ical4j.model.parameter.Range;
import net.fortuna.ical4j.model.parameter.RelType;
import net.fortuna.ical4j.model.parameter.Related;
import net.fortuna.ical4j.model.parameter.Role;
import net.fortuna.ical4j.model.parameter.Rsvp;
import net.fortuna.ical4j.model.parameter.ScheduleAgent;
import net.fortuna.ical4j.model.parameter.ScheduleStatus;
import net.fortuna.ical4j.model.parameter.SentBy;
import net.fortuna.ical4j.model.parameter.Type;
import net.fortuna.ical4j.model.parameter.TzId;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.model.parameter.Vvenue;
import net.fortuna.ical4j.model.parameter.XParameter;
import net.fortuna.ical4j.util.Strings;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractContentFactory implements ParameterFactory {

    private static final long isVariable = -isStringConstant;

    private static ParameterFactoryImpl isVariable = new ParameterFactoryImpl();

    protected isConstructor() {
        isMethod(isNameExpr.isFieldAccessExpr, new AbbrevFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new AltRepFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CnFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CuTypeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DelegatedFromFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DelegatedToFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DirFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new EncodingFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new FmtTypeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new FbTypeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new LanguageFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new MemberFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new PartStatFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RangeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RelatedFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RelTypeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RoleFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RsvpFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ScheduleAgentFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ScheduleStatusFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new SentByFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TypeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TzIdFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ValueFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new VvenueFactory());
    }

    /**
     * isComment
     */
    public static ParameterFactoryImpl isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
        final ParameterFactory isVariable = (ParameterFactory) isMethod(isNameExpr);
        Parameter isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else if (isMethod(isNameExpr)) {
            isNameExpr = new XParameter(isNameExpr, isNameExpr);
        } else if (isMethod()) {
            isNameExpr = new XParameter(isNameExpr, isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private boolean isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod() > isNameExpr.isFieldAccessExpr.isMethod();
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new Abbrev(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new AltRep(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new Cn(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            CuType isVariable = new CuType(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new DelegatedFrom(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new DelegatedTo(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new Dir(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            Encoding isVariable = new Encoding(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new FmtType(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            FbType isVariable = new FbType(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new Language(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new Member(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            PartStat isVariable = new PartStat(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            Range isVariable = new Range(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            Related isVariable = new Related(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            RelType isVariable = new RelType(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            Role isVariable = new Role(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            Rsvp isVariable = new Rsvp(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            final ScheduleAgent isVariable = new ScheduleAgent(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new ScheduleStatus(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new SentBy(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new Vvenue(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new Type(isNameExpr);
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            return new TzId(isNameExpr.isMethod(isNameExpr));
        }
    }

    private static class isClassOrIsInterface implements ParameterFactory {

        private static final long isVariable = isStringConstant;

        public Parameter isMethod(final String isParameter, final String isParameter) throws URISyntaxException {
            Value isVariable = new Value(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr;
        }
    }
}
