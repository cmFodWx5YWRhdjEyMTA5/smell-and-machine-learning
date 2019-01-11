// isComment
package jp.redmine.redmineclient.task;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jp.redmine.redmineclient.entity.IPostingRecord;

public abstract class isClassOrIsInterface<X, Y extends IPostingRecord> extends SelectDataTask<X, Y> {

    protected SelectDataTaskPutHandler isMethod(final Y isParameter) {
        return new SelectDataTaskPutHandler() {

            @Override
            public void isMethod(HttpURLConnection isParameter) throws ParserConfigurationException, TransformerException, IOException {
                DocumentBuilderFactory isVariable = isNameExpr.isMethod();
                DocumentBuilder isVariable = isNameExpr.isMethod();
                Document isVariable = isNameExpr.isMethod();
                Element isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                TransformerFactory isVariable = isNameExpr.isMethod();
                Transformer isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
                isNameExpr.isMethod(new DOMSource(isNameExpr), new StreamResult(isNameExpr.isMethod()));
            }
        };
    }
}
