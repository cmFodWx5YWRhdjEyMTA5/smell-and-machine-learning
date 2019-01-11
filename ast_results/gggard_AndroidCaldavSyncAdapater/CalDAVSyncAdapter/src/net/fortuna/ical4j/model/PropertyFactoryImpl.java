// isComment
package net.fortuna.ical4j.model;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import net.fortuna.ical4j.model.property.Action;
import net.fortuna.ical4j.model.property.Attach;
import net.fortuna.ical4j.model.property.Attendee;
import net.fortuna.ical4j.model.property.CalScale;
import net.fortuna.ical4j.model.property.Categories;
import net.fortuna.ical4j.model.property.Clazz;
import net.fortuna.ical4j.model.property.Comment;
import net.fortuna.ical4j.model.property.Completed;
import net.fortuna.ical4j.model.property.Contact;
import net.fortuna.ical4j.model.property.Country;
import net.fortuna.ical4j.model.property.Created;
import net.fortuna.ical4j.model.property.Description;
import net.fortuna.ical4j.model.property.DtEnd;
import net.fortuna.ical4j.model.property.DtStamp;
import net.fortuna.ical4j.model.property.DtStart;
import net.fortuna.ical4j.model.property.Due;
import net.fortuna.ical4j.model.property.Duration;
import net.fortuna.ical4j.model.property.ExDate;
import net.fortuna.ical4j.model.property.ExRule;
import net.fortuna.ical4j.model.property.ExtendedAddress;
import net.fortuna.ical4j.model.property.FreeBusy;
import net.fortuna.ical4j.model.property.Geo;
import net.fortuna.ical4j.model.property.LastModified;
import net.fortuna.ical4j.model.property.Locality;
import net.fortuna.ical4j.model.property.Location;
import net.fortuna.ical4j.model.property.LocationType;
import net.fortuna.ical4j.model.property.Method;
import net.fortuna.ical4j.model.property.Name;
import net.fortuna.ical4j.model.property.Organizer;
import net.fortuna.ical4j.model.property.PercentComplete;
import net.fortuna.ical4j.model.property.Postalcode;
import net.fortuna.ical4j.model.property.Priority;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.RDate;
import net.fortuna.ical4j.model.property.RRule;
import net.fortuna.ical4j.model.property.RecurrenceId;
import net.fortuna.ical4j.model.property.Region;
import net.fortuna.ical4j.model.property.RelatedTo;
import net.fortuna.ical4j.model.property.Repeat;
import net.fortuna.ical4j.model.property.RequestStatus;
import net.fortuna.ical4j.model.property.Resources;
import net.fortuna.ical4j.model.property.Sequence;
import net.fortuna.ical4j.model.property.Status;
import net.fortuna.ical4j.model.property.StreetAddress;
import net.fortuna.ical4j.model.property.Summary;
import net.fortuna.ical4j.model.property.Tel;
import net.fortuna.ical4j.model.property.Transp;
import net.fortuna.ical4j.model.property.Trigger;
import net.fortuna.ical4j.model.property.TzId;
import net.fortuna.ical4j.model.property.TzName;
import net.fortuna.ical4j.model.property.TzOffsetFrom;
import net.fortuna.ical4j.model.property.TzOffsetTo;
import net.fortuna.ical4j.model.property.TzUrl;
import net.fortuna.ical4j.model.property.Uid;
import net.fortuna.ical4j.model.property.Url;
import net.fortuna.ical4j.model.property.Version;
import net.fortuna.ical4j.model.property.XProperty;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractContentFactory implements PropertyFactory {

    private static final long isVariable = -isStringConstant;

    private static PropertyFactoryImpl isVariable = new PropertyFactoryImpl();

    /**
     * isComment
     */
    protected isConstructor() {
        isMethod(isNameExpr.isFieldAccessExpr, new ActionFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new AttachFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new AttendeeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CalScaleFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CategoriesFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ClazzFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CommentFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CompletedFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ContactFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CountryFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new CreatedFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DescriptionFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DtEndFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DtStampFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DtStartFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DueFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new DurationFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ExDateFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ExRuleFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ExtendedAddressFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new FreeBusyFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new GeoFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new LastModifiedFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new LocalityFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new LocationFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new LocationTypeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new MethodFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new NameFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new OrganizerFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new PercentCompleteFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new PostalcodeFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new PriorityFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ProdIdFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RDateFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RecurrenceIdFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RegionFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RelatedToFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RepeatFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RequestStatusFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new ResourcesFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new RRuleFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new SequenceFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new StatusFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new StreetAddressFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new SummaryFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TelFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TranspFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TriggerFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TzIdFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TzNameFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TzOffsetFromFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TzOffsetToFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new TzUrlFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new UidFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new UrlFactory());
        isMethod(isNameExpr.isFieldAccessExpr, new VersionFactory());
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Action(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Action();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Attach(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Attach();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Attendee(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Attendee();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new CalScale(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new CalScale();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Categories(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Categories();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Clazz(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Clazz();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Comment(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Comment();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Completed(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Completed();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Contact(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Contact();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Country(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Country();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Created(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Created();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Description(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Description();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new DtEnd(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new DtEnd();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new DtStamp(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new DtStamp();
        }
    }

    /**
     * isComment
     */
    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new DtStart(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new DtStart();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Due(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Due();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Duration(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Duration();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new ExDate(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new ExDate();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new ExRule(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new ExRule();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new ExtendedAddress(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new ExtendedAddress();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new FreeBusy(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new FreeBusy();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Geo(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Geo();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new LastModified(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new LastModified();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Locality(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Locality();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Location(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Location();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new LocationType(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new LocationType();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Method(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Method();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Name(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Name();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Organizer(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Organizer();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new PercentComplete(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new PercentComplete();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Postalcode(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Postalcode();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Priority(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Priority();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new ProdId(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new ProdId();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new RDate(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new RDate();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new RecurrenceId(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new RecurrenceId();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Region(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Region();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new RelatedTo(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new RelatedTo();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Repeat(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Repeat();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new RequestStatus(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new RequestStatus();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Resources(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Resources();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new RRule(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new RRule();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Sequence(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Sequence();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Status(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Status();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new StreetAddress(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new StreetAddress();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Summary(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Summary();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Tel(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Tel();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Transp(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Transp();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Trigger(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Trigger();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new TzId(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new TzId();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new TzName(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new TzName();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new TzOffsetFrom(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new TzOffsetFrom();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new TzOffsetTo(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new TzOffsetTo();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new TzUrl(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new TzUrl();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Uid(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Uid();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Url(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Url();
        }
    }

    private static class isClassOrIsInterface implements PropertyFactory {

        private static final long isVariable = isStringConstant;

        public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
            return new Version(isNameExpr, isNameExpr);
        }

        public Property isMethod(final String isParameter) {
            return new Version();
        }
    }

    /**
     * isComment
     */
    public static PropertyFactoryImpl isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Property isMethod(final String isParameter) {
        final PropertyFactory isVariable = (PropertyFactory) isMethod(isNameExpr);
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr);
        } else if (isMethod(isNameExpr)) {
            return new XProperty(isNameExpr);
        } else if (isMethod()) {
            return new XProperty(isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
    }

    /**
     * isComment
     */
    public Property isMethod(final String isParameter, final ParameterList isParameter, final String isParameter) throws IOException, URISyntaxException, ParseException {
        final PropertyFactory isVariable = (PropertyFactory) isMethod(isNameExpr);
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } else if (isMethod(isNameExpr)) {
            return new XProperty(isNameExpr, isNameExpr, isNameExpr);
        } else if (isMethod()) {
            return new XProperty(isNameExpr, isNameExpr, isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
    }

    /**
     * isComment
     */
    private boolean isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod() > isNameExpr.isFieldAccessExpr.isMethod();
    }
}
