// isComment
package es.usc.citius.servando.calendula.adapters;

import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.typeface.IIcon;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.fragments.DailyAgendaFragment;
import es.usc.citius.servando.calendula.fragments.MedicinesListFragment;
import es.usc.citius.servando.calendula.fragments.RoutinesListFragment;
import es.usc.citius.servando.calendula.fragments.ScheduleListFragment;

public enum HomePages {

    // isComment
    HOME(DailyAgendaFragment.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MEDICINES(MedicinesListFragment.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ROUTINES(RoutinesListFragment.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SCHEDULES(ScheduleListFragment.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    public String isVariable;

    public int isVariable;

    public IIcon isVariable;

    isConstructor(String isParameter, int isParameter, IIcon isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public static HomePages isMethod(final int isParameter) throws IndexOutOfBoundsException {
        return isMethod()[isNameExpr];
    }
}
