// isComment
package fr.ybo.transportscommun.donnees.modele;

import fr.ybo.database.annotation.Column;
import fr.ybo.database.annotation.Entity;
import fr.ybo.database.annotation.PrimaryKey;

@Entity
public class isClassOrIsInterface {

    @Column
    @PrimaryKey
    public String isVariable;
}
