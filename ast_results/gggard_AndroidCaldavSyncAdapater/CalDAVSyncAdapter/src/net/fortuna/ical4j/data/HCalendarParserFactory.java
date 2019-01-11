// isComment
package net.fortuna.ical4j.data;

/**
 * isComment
 */
public class isClassOrIsInterface extends CalendarParserFactory {

    /**
     * isComment
     */
    public CalendarParser isMethod() {
        return new HCalendarParser();
    }
}
