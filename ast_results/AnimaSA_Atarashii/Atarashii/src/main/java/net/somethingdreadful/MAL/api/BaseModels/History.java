// isComment
package net.somethingdreadful.MAL.api.BaseModels;

import net.somethingdreadful.MAL.DateTools;
import net.somethingdreadful.MAL.api.BaseModels.AnimeManga.Anime;
import net.somethingdreadful.MAL.api.BaseModels.AnimeManga.GenericRecord;
import net.somethingdreadful.MAL.api.BaseModels.AnimeManga.Manga;
import java.io.Serializable;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

public class isClassOrIsInterface implements Serializable {

    @Setter
    @Getter
    private int isVariable;

    @Setter
    @Getter
    private int isVariable;

    @Setter
    @Getter
    private int isVariable;

    @Getter
    private String isVariable;

    @Setter
    @Getter
    private String isVariable;

    @Setter
    @Getter
    private String isVariable;

    /**
     * isComment
     */
    @Setter
    @Getter
    private String isVariable = "isStringConstant";

    @Setter
    @Getter
    private String isVariable;

    @Setter
    @Getter
    private ArrayList<Profile> isVariable;

    @Setter
    @Getter
    private Anime isVariable;

    @Setter
    @Getter
    private Manga isVariable;

    public boolean isMethod() {
        return isNameExpr != null;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, true);
    }

    public GenericRecord isMethod() {
        return isMethod() ? isNameExpr : isNameExpr;
    }
}
