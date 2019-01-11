// isComment
package de.westnordost.streetcomplete.quests;

import java.util.Arrays;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import de.westnordost.streetcomplete.data.QuestType;
import de.westnordost.streetcomplete.data.QuestTypeRegistry;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.data.osmnotes.OsmNoteQuestType;
import de.westnordost.streetcomplete.quests.baby_changing_table.AddBabyChangingTable;
import de.westnordost.streetcomplete.quests.bike_parking_capacity.AddBikeParkingCapacity;
import de.westnordost.streetcomplete.quests.bike_parking_cover.AddBikeParkingCover;
import de.westnordost.streetcomplete.quests.bike_parking_type.AddBikeParkingType;
import de.westnordost.streetcomplete.quests.bikeway.AddCycleway;
import de.westnordost.streetcomplete.quests.bridge_structure.AddBridgeStructure;
import de.westnordost.streetcomplete.quests.building_levels.AddBuildingLevels;
import de.westnordost.streetcomplete.quests.building_type.AddBuildingType;
import de.westnordost.streetcomplete.quests.building_underground.IsBuildingUnderground;
import de.westnordost.streetcomplete.quests.localized_name.AddBusStopName;
import de.westnordost.streetcomplete.quests.bus_stop_shelter.AddBusStopShelter;
import de.westnordost.streetcomplete.quests.car_wash_type.AddCarWashType;
import de.westnordost.streetcomplete.quests.construction.MarkCompletedBuildingConstruction;
import de.westnordost.streetcomplete.quests.construction.MarkCompletedHighwayConstruction;
import de.westnordost.streetcomplete.quests.crossing_type.AddCrossingType;
import de.westnordost.streetcomplete.quests.diet_type.AddVegan;
import de.westnordost.streetcomplete.quests.diet_type.AddVegetarian;
import de.westnordost.streetcomplete.quests.fire_hydrant.AddFireHydrantType;
import de.westnordost.streetcomplete.quests.internet_access.AddInternetAccess;
import de.westnordost.streetcomplete.quests.max_height.AddMaxHeight;
import de.westnordost.streetcomplete.quests.motorcycle_parking_capacity.AddMotorcycleParkingCapacity;
import de.westnordost.streetcomplete.quests.motorcycle_parking_cover.AddMotorcycleParkingCover;
import de.westnordost.streetcomplete.quests.oneway.AddOneway;
import de.westnordost.streetcomplete.quests.oneway.TrafficFlowSegmentsDao;
import de.westnordost.streetcomplete.quests.oneway.WayTrafficFlowDao;
import de.westnordost.streetcomplete.quests.parking_access.AddParkingAccess;
import de.westnordost.streetcomplete.quests.parking_fee.AddParkingFee;
import de.westnordost.streetcomplete.quests.parking_type.AddParkingType;
import de.westnordost.streetcomplete.quests.playground_access.AddPlaygroundAccess;
import de.westnordost.streetcomplete.quests.postbox_collection_times.AddPostboxCollectionTimes;
import de.westnordost.streetcomplete.quests.powerpoles_material.AddPowerPolesMaterial;
import de.westnordost.streetcomplete.quests.orchard_produce.AddOrchardProduce;
import de.westnordost.streetcomplete.quests.railway_crossing.AddRailwayCrossingBarrier;
import de.westnordost.streetcomplete.quests.recycling.AddRecyclingType;
import de.westnordost.streetcomplete.quests.religion.AddReligionToPlaceOfWorship;
import de.westnordost.streetcomplete.quests.religion.AddReligionToWaysideShrine;
import de.westnordost.streetcomplete.quests.localized_name.data.PutRoadNameSuggestionsHandler;
import de.westnordost.streetcomplete.quests.localized_name.data.RoadNameSuggestionsDao;
import de.westnordost.streetcomplete.quests.segregated.AddCyclewaySegregation;
import de.westnordost.streetcomplete.quests.surface.AddPathSurface;
import de.westnordost.streetcomplete.quests.tactile_paving.AddTactilePavingBusStop;
import de.westnordost.streetcomplete.quests.tactile_paving.AddTactilePavingCrosswalk;
import de.westnordost.streetcomplete.quests.toilet_availability.AddToiletAvailability;
import de.westnordost.streetcomplete.quests.toilets_fee.AddToiletsFee;
import de.westnordost.streetcomplete.quests.tracktype.AddTracktype;
import de.westnordost.streetcomplete.quests.housenumber.AddHousenumber;
import de.westnordost.streetcomplete.quests.max_speed.AddMaxSpeed;
import de.westnordost.streetcomplete.quests.opening_hours.AddOpeningHours;
import de.westnordost.streetcomplete.quests.localized_name.AddRoadName;
import de.westnordost.streetcomplete.quests.surface.AddRoadSurface;
import de.westnordost.streetcomplete.quests.roof_shape.AddRoofShape;
import de.westnordost.streetcomplete.quests.sport.AddSport;
import de.westnordost.streetcomplete.quests.traffic_signals_sound.AddTrafficSignalsSound;
import de.westnordost.streetcomplete.quests.traffic_signals_button.AddTrafficSignalsButton;
import de.westnordost.streetcomplete.quests.way_lit.AddWayLit;
import de.westnordost.streetcomplete.quests.wheelchair_access.AddWheelChairAccessPublicTransport;
import de.westnordost.streetcomplete.quests.wheelchair_access.AddWheelChairAccessToilets;
import de.westnordost.streetcomplete.quests.wheelchair_access.AddWheelchairAccessBusiness;
import de.westnordost.streetcomplete.quests.bench_backrest.AddBenchBackrest;
import de.westnordost.streetcomplete.quests.wheelchair_access.AddWheelchairAccessOutside;

@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    public static QuestTypeRegistry isMethod(OsmNoteQuestType isParameter, OverpassMapDataDao isParameter, RoadNameSuggestionsDao isParameter, PutRoadNameSuggestionsHandler isParameter, TrafficFlowSegmentsDao isParameter, WayTrafficFlowDao isParameter) {
        QuestType[] isVariable = { // isComment
        isNameExpr, // isComment
        new AddRoadName(isNameExpr, isNameExpr, isNameExpr), new AddOneway(isNameExpr, isNameExpr, isNameExpr), // isComment
        new IsBuildingUnderground(isNameExpr), new AddHousenumber(isNameExpr), new MarkCompletedHighwayConstruction(isNameExpr), // isComment
        new AddRecyclingType(isNameExpr), new AddRoadSurface(isNameExpr), // isComment
        new AddMaxSpeed(isNameExpr), new AddMaxHeight(isNameExpr), // isComment
        new AddRailwayCrossingBarrier(isNameExpr), // isComment
        new AddReligionToPlaceOfWorship(isNameExpr), new AddPostboxCollectionTimes(isNameExpr), new AddOpeningHours(isNameExpr), new AddSport(isNameExpr), // isComment
        new AddBikeParkingCapacity(isNameExpr), new AddOrchardProduce(isNameExpr), new AddCycleway(isNameExpr), new AddCrossingType(isNameExpr), new AddBuildingLevels(isNameExpr), // isComment
        new AddBusStopShelter(isNameExpr), new AddVegetarian(isNameExpr), new AddVegan(isNameExpr), new AddInternetAccess(isNameExpr), new AddParkingAccess(isNameExpr), new AddParkingFee(isNameExpr), new AddMotorcycleParkingCapacity(isNameExpr), new AddBusStopName(isNameExpr), new AddPathSurface(isNameExpr), new AddTracktype(isNameExpr), // isComment
        new AddBikeParkingType(isNameExpr), // isComment
        new AddPlaygroundAccess(isNameExpr), // isComment
        new AddBuildingType(isNameExpr), // isComment
        new AddTrafficSignalsSound(isNameExpr), new AddRoofShape(isNameExpr), new AddWheelChairAccessPublicTransport(isNameExpr), new AddWheelchairAccessOutside(isNameExpr), new AddTactilePavingBusStop(isNameExpr), new AddTactilePavingCrosswalk(isNameExpr), new AddWayLit(isNameExpr), new AddWheelchairAccessBusiness(isNameExpr), new AddToiletAvailability(isNameExpr), new AddBridgeStructure(isNameExpr), new AddWheelChairAccessToilets(isNameExpr), new AddReligionToWaysideShrine(isNameExpr), new AddCyclewaySegregation(isNameExpr), new MarkCompletedBuildingConstruction(isNameExpr), // isComment
        new AddBikeParkingCover(isNameExpr), new AddMotorcycleParkingCover(isNameExpr), new AddToiletsFee(isNameExpr), new AddBabyChangingTable(isNameExpr), new AddFireHydrantType(isNameExpr), new AddParkingType(isNameExpr), new AddPowerPolesMaterial(isNameExpr), new AddCarWashType(isNameExpr), new AddBenchBackrest(isNameExpr), new AddTrafficSignalsButton(isNameExpr) };
        return new QuestTypeRegistry(isNameExpr.isMethod(isNameExpr));
    }

    @Provides
    @Singleton
    public static OsmNoteQuestType isMethod() {
        return new OsmNoteQuestType();
    }
}
