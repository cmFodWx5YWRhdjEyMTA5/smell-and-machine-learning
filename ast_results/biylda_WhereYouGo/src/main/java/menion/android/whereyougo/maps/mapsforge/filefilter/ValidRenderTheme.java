// isComment
package menion.android.whereyougo.maps.mapsforge.filefilter;

import org.mapsforge.graphics.android.AndroidGraphics;
import org.mapsforge.map.reader.header.FileOpenResult;
import org.mapsforge.map.rendertheme.ExternalRenderTheme;
import org.mapsforge.map.rendertheme.XmlRenderTheme;
import org.mapsforge.map.rendertheme.rule.RenderThemeHandler;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

/**
 * isComment
 */
public final class isClassOrIsInterface implements ValidFileFilter {

    private FileOpenResult isVariable;

    @Override
    public boolean isMethod(File isParameter) {
        try {
            XmlRenderTheme isVariable = new ExternalRenderTheme(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        } catch (ParserConfigurationException isParameter) {
            this.isFieldAccessExpr = new FileOpenResult(isNameExpr.isMethod());
        } catch (SAXException isParameter) {
            this.isFieldAccessExpr = new FileOpenResult(isNameExpr.isMethod());
        } catch (IOException isParameter) {
            this.isFieldAccessExpr = new FileOpenResult(isNameExpr.isMethod());
        }
        return this.isFieldAccessExpr.isMethod();
    }

    @Override
    public FileOpenResult isMethod() {
        return this.isFieldAccessExpr;
    }
}
