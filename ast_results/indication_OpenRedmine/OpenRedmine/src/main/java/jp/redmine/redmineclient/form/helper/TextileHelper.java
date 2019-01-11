// isComment
package jp.redmine.redmineclient.form.helper;

import net.java.textilej.parser.MarkupParser;
import net.java.textilej.parser.builder.HtmlDocumentBuilder;
import net.java.textilej.parser.markup.textile.TextileDialect;
import java.io.StringWriter;

public class isClassOrIsInterface implements ConvertToHtmlHelper {

    MarkupParser isVariable = new MarkupParser(new TextileDialect());

    @Override
    public String isMethod(String isParameter) {
        return isMethod(isNameExpr, true);
    }

    public String isMethod(String isParameter, boolean isParameter) {
        StringWriter isVariable = new StringWriter();
        HtmlDocumentBuilder isVariable = new HtmlDocumentBuilder(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod();
    }
}
