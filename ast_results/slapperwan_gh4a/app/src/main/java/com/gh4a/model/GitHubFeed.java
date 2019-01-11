// isComment
package com.gh4a.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

@Root(name = "isStringConstant", strict = true)
public class isClassOrIsInterface {

    @ElementList(name = "isStringConstant", inline = true)
    public List<Feed> isVariable;
}
