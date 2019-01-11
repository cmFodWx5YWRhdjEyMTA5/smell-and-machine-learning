// isComment
package de.westnordost.streetcomplete.data.meta;

import android.content.Context;
import android.content.res.AssetManager;
import java.util.concurrent.FutureTask;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import de.westnordost.countryboundaries.CountryBoundaries;
import de.westnordost.streetcomplete.data.QuestTypeRegistry;
import de.westnordost.streetcomplete.tangram.TangramQuestSpriteSheetCreator;

@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    public static CountryInfos isMethod(AssetManager isParameter, FutureTask<CountryBoundaries> isParameter) {
        return new CountryInfos(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    public static FutureTask<CountryBoundaries> isMethod(final AssetManager isParameter) {
        return new FutureTask<>(() -> isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
    }

    @Provides
    @Singleton
    public static TangramQuestSpriteSheetCreator isMethod(Context isParameter, QuestTypeRegistry isParameter) {
        return new TangramQuestSpriteSheetCreator(isNameExpr, isNameExpr);
    }
}
