// isComment
package net.dahanne.gallery3.client.model;

import java.util.Collection;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class isClassOrIsInterface {

    private String isVariable;

    private final Collection<String> isVariable = new HashSet<String>();

    public Collection<String> isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
