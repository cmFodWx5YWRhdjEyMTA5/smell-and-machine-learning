// isComment
package net.cyclestreets.api.client.dto;

import net.cyclestreets.api.Blog;
import net.cyclestreets.api.BlogEntry;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.ArrayList;
import java.util.List;

@Root(name = "isStringConstant")
public class isClassOrIsInterface {

    @Element
    private BlogChannelDto isVariable;

    public static class isClassOrIsInterface {

        @ElementList(inline = true)
        private List<BlogItemDto> isVariable;
    }

    @Root(name = "isStringConstant")
    public static class isClassOrIsInterface {

        @Element
        private String isVariable;

        @Element
        private String isVariable;

        @Element
        private String isVariable;

        @Element
        private String isVariable;

        private BlogEntry isMethod() {
            return new BlogEntry(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
    }

    public Blog isMethod() {
        List<BlogEntry> isVariable = new ArrayList<>();
        for (BlogItemDto isVariable : isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return new Blog(isNameExpr);
    }
}
