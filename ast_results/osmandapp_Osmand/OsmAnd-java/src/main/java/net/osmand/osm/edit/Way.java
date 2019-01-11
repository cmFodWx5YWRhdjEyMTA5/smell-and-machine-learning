// isComment
package net.osmand.osm.edit;

import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.osmand.data.LatLon;
import net.osmand.data.QuadRect;

public class isClassOrIsInterface extends Entity {

    // isComment
    private TLongArrayList isVariable = null;

    private List<Node> isVariable = null;

    public isConstructor(long isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Way isParameter) {
        super(isNameExpr.isMethod());
        if (isNameExpr.isFieldAccessExpr != null) {
            isNameExpr = new TLongArrayList(isNameExpr.isFieldAccessExpr);
        }
        if (isNameExpr.isFieldAccessExpr != null) {
            isNameExpr = new ArrayList<Node>(isNameExpr.isFieldAccessExpr);
        }
    }

    public isConstructor(long isParameter, List<Node> isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = new ArrayList<Node>(isNameExpr);
        isNameExpr = new TLongArrayList(isNameExpr.isMethod());
        for (Node isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    public isConstructor(long isParameter, TLongArrayList isParameter, double isParameter, double isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(long isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new TLongArrayList();
        }
        isNameExpr.isMethod(isNameExpr);
    }

    public long isMethod() {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        }
        return isNameExpr.isMethod(isIntegerConstant);
    }

    public long isMethod() {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        }
        return isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
    }

    public Node isMethod() {
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            return null;
        }
        return isNameExpr.isMethod(isIntegerConstant);
    }

    public Node isMethod() {
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            return null;
        }
        return isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
    }

    public void isMethod(Node isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new TLongArrayList();
        }
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<Node>();
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(Node isParameter, int isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new TLongArrayList();
        }
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<Node>();
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public long isMethod(int isParameter) {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        }
        long isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr.isMethod() > isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    public TLongArrayList isMethod() {
        if (isNameExpr == null) {
            return new TLongArrayList(isIntegerConstant);
        }
        return isNameExpr;
    }

    public List<EntityId> isMethod() {
        if (isNameExpr == null) {
            return isNameExpr.isMethod();
        }
        List<EntityId> isVariable = new ArrayList<EntityId>();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            isNameExpr.isMethod(new EntityId(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr)));
        }
        return isNameExpr;
    }

    public List<Node> isMethod() {
        if (isNameExpr == null) {
            return isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    @Override
    public void isMethod(Map<EntityId, Entity> isParameter) {
        if (isNameExpr != null) {
            if (isNameExpr == null) {
                isNameExpr = new ArrayList<Node>();
            } else {
                isNameExpr.isMethod();
            }
            int isVariable = isNameExpr.isMethod();
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                isNameExpr.isMethod((Node) isNameExpr.isMethod(new EntityId(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr))));
            }
        }
    }

    // isComment
    public QuadRect isMethod() {
        QuadRect isVariable = null;
        if (isNameExpr != null) {
            for (Node isVariable : isNameExpr) {
                if (isNameExpr == null) {
                    isNameExpr = new QuadRect();
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                }
                if (isNameExpr.isMethod() < isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                } else if (isNameExpr.isMethod() > isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                }
                if (isNameExpr.isMethod() > isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                } else if (isNameExpr.isMethod() < isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isFieldAccessExpr = (float) isNameExpr.isMethod();
                }
            }
        }
        return isNameExpr;
    }

    @Override
    public LatLon isMethod() {
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod(this);
    }

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }
}
