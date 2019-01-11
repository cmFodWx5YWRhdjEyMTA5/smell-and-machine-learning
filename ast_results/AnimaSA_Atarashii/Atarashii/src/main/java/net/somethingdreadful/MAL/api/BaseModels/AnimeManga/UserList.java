// isComment
package net.somethingdreadful.MAL.api.BaseModels.AnimeManga;

import java.io.Serializable;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

public class isClassOrIsInterface implements Serializable {

    @Getter
    @Setter
    private ArrayList<Anime> isVariable;

    @Getter
    @Setter
    private ArrayList<Manga> isVariable;
}
