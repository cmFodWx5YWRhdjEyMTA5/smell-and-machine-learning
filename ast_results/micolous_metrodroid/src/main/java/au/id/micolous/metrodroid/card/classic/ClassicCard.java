// isComment
package au.id.micolous.metrodroid.card.classic;

import android.content.SharedPreferences;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.util.Log;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.CardTransitFactory;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.MetrodroidApplication;
import au.id.micolous.metrodroid.card.Card;
import au.id.micolous.metrodroid.card.CardType;
import au.id.micolous.metrodroid.card.TagReaderFeedbackInterface;
import au.id.micolous.metrodroid.key.CardKeys;
import au.id.micolous.metrodroid.key.ClassicCardKeys;
import au.id.micolous.metrodroid.key.ClassicSectorKey;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.transit.bilhete_unico.BilheteUnicoSPTransitData;
import au.id.micolous.metrodroid.transit.charlie.CharlieCardTransitData;
import au.id.micolous.metrodroid.transit.chc_metrocard.ChcMetrocardTransitData;
import au.id.micolous.metrodroid.transit.easycard.EasyCardTransitData;
import au.id.micolous.metrodroid.transit.erg.ErgTransitData;
import au.id.micolous.metrodroid.transit.kiev.KievTransitData;
import au.id.micolous.metrodroid.transit.lax_tap.LaxTapTransitData;
import au.id.micolous.metrodroid.transit.manly_fast_ferry.ManlyFastFerryTransitData;
import au.id.micolous.metrodroid.transit.metroq.MetroQTransitData;
import au.id.micolous.metrodroid.transit.msp_goto.MspGotoTransitData;
import au.id.micolous.metrodroid.transit.nextfare.NextfareTransitData;
import au.id.micolous.metrodroid.transit.ovc.OVChipTransitData;
import au.id.micolous.metrodroid.transit.podorozhnik.PodorozhnikTransitData;
import au.id.micolous.metrodroid.transit.ricaricami.RicaricaMiTransitData;
import au.id.micolous.metrodroid.transit.selecta.SelectaFranceTransitData;
import au.id.micolous.metrodroid.transit.rkf.RkfTransitData;
import au.id.micolous.metrodroid.transit.seq_go.SeqGoTransitData;
import au.id.micolous.metrodroid.transit.serialonly.StrelkaTransitData;
import au.id.micolous.metrodroid.transit.serialonly.SunCardTransitData;
import au.id.micolous.metrodroid.transit.serialonly.TartuTransitFactory;
import au.id.micolous.metrodroid.transit.smartrider.SmartRiderTransitData;
import au.id.micolous.metrodroid.transit.troika.TroikaHybridTransitData;
import au.id.micolous.metrodroid.transit.unknown.BlankClassicTransitData;
import au.id.micolous.metrodroid.transit.unknown.UnauthorizedClassicTransitData;
import au.id.micolous.metrodroid.transit.zolotayakorona.ZolotayaKoronaTransitData;
import au.id.micolous.metrodroid.ui.ListItem;
import au.id.micolous.metrodroid.ui.ListItemRecursive;
import au.id.micolous.metrodroid.util.Utils;

@Root(name = "isStringConstant")
public class isClassOrIsInterface extends Card {

    public static final byte[] isVariable = { (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant };

    /**
     * isComment
     */
    private static final ClassicSectorKey[] isVariable = { isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) };

    private static final String isVariable = "isStringConstant";

    @ElementList(name = "isStringConstant")
    private List<ClassicSector> isVariable;

    private isConstructor() {
    /*isComment*/
    }

    public isConstructor(byte[] isParameter, Calendar isParameter, ClassicSector[] isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, true);
    }

    public isConstructor(byte[] isParameter, Calendar isParameter, ClassicSector[] isParameter, boolean isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, null, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    private static boolean isMethod(MifareClassic isParameter, int isParameter, ClassicSectorKey isParameter) throws IOException {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    private static ClassicSectorKey isMethod(MifareClassic isParameter, int isParameter, ClassicSectorKey isParameter) throws IOException {
        ClassicSectorKey isVariable = isNameExpr.isMethod();
        if (isMethod(isNameExpr, isNameExpr, isNameExpr)) {
            return isNameExpr;
        }
        isNameExpr.isMethod();
        if (isMethod(isNameExpr, isNameExpr, isNameExpr)) {
            return isNameExpr;
        }
        return null;
    }

    public static ClassicCard isMethod(byte[] isParameter, Tag isParameter, TagReaderFeedbackInterface isParameter) throws Exception {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(null);
        MifareClassic isVariable = null;
        final int isVariable = isNameExpr.isMethod();
        int isVariable;
        boolean isVariable = true;
        try {
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
            } catch (NullPointerException isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
                isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr));
            }
            isNameExpr.isMethod();
            ClassicCardKeys isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod();
            int isVariable = isNameExpr.isMethod();
            List<ClassicSector> isVariable = new ArrayList<>();
            final int isVariable = isNameExpr.isMethod() * isIntegerConstant;
            boolean isVariable = true;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                try {
                    ClassicSectorKey isVariable = null;
                    isNameExpr.isMethod(isNameExpr * isIntegerConstant, isNameExpr);
                    if (isNameExpr != null) {
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                    } else {
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                    }
                    // isComment
                    // isComment
                    isNameExpr = isNameExpr;
                    while (isNameExpr == null && isNameExpr-- > isIntegerConstant) {
                        // isComment
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
                        if (isNameExpr != null) {
                            List<? extends ClassicSectorKey> isVariable = isNameExpr.isMethod(isNameExpr);
                            for (ClassicSectorKey isVariable : isNameExpr) {
                                isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
                                if (isNameExpr != null)
                                    break;
                            }
                        }
                        if (isNameExpr != null)
                            break;
                        for (ClassicSectorKey isVariable : isNameExpr) {
                            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
                            if (isNameExpr != null)
                                break;
                        }
                    }
                    // isComment
                    isNameExpr = isNameExpr;
                    if (isNameExpr == null) {
                        isNameExpr.isMethod((isNameExpr * isIntegerConstant) + isIntegerConstant, isNameExpr);
                        while (isNameExpr == null && (isNameExpr-- > isIntegerConstant)) {
                            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
                            // isComment
                            if (isNameExpr != null) {
                                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                                // isComment
                                for (ClassicSectorKey isVariable : isNameExpr.isMethod()) {
                                    isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
                                    if (isNameExpr != null) {
                                        // isComment
                                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant" + "isStringConstant", isNameExpr));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    isNameExpr.isMethod((isNameExpr * isIntegerConstant) + isIntegerConstant, isNameExpr);
                    // isComment
                    if (isNameExpr != null) {
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                        List<ClassicBlock> isVariable = new ArrayList<>();
                        // isComment
                        int isVariable = isNameExpr.isMethod(isNameExpr);
                        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(isNameExpr); isNameExpr++) {
                            byte[] isVariable = isNameExpr.isMethod(isNameExpr + isNameExpr);
                            // isComment
                            String isVariable = isNameExpr.isFieldAccessExpr;
                            // isComment
                            if (isNameExpr.isFieldAccessExpr < isIntegerConstant) {
                                isMethod(isNameExpr, isNameExpr, isNameExpr);
                                isNameExpr = isNameExpr.isMethod(isNameExpr + isNameExpr);
                            }
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr));
                        }
                        isNameExpr.isMethod(new ClassicSector(isNameExpr, isNameExpr.isMethod(new ClassicBlock[isIntegerConstant]), isNameExpr));
                        if (!isNameExpr)
                            isNameExpr = isMethod(isNameExpr, isNameExpr);
                        isNameExpr.isMethod((isNameExpr * isIntegerConstant) + isIntegerConstant, isNameExpr);
                    } else {
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant");
                        isNameExpr.isMethod(new UnauthorizedClassicSector(isNameExpr));
                    }
                } catch (TagLostException isParameter) {
                    isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
                    isNameExpr.isMethod(new InvalidClassicSector(isNameExpr, isNameExpr.isMethod(isNameExpr)));
                    isNameExpr = true;
                    break;
                } catch (IOException isParameter) {
                    isNameExpr.isMethod(new InvalidClassicSector(isNameExpr, isNameExpr.isMethod(isNameExpr)));
                }
            }
            return new ClassicCard(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(new ClassicSector[isIntegerConstant]), isNameExpr);
        } finally {
            if (isNameExpr != null && isNameExpr.isMethod()) {
                isNameExpr.isMethod();
            }
        }
    }

    /**
     * isComment
     */
    private static Tag isMethod(Tag isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        String[] isVariable = isNameExpr.isMethod();
        Parcel isVariable;
        Parcel isVariable;
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
        int isVariable = isNameExpr.isMethod();
        byte[] isVariable = new byte[isIntegerConstant];
        if (isNameExpr >= isIntegerConstant) {
            isNameExpr = new byte[isNameExpr];
            isNameExpr.isMethod(isNameExpr);
        }
        int[] isVariable = new int[isNameExpr.isMethod()];
        isNameExpr.isMethod(isNameExpr);
        Bundle[] isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        int isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod();
        IBinder isVariable;
        if (isNameExpr == isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod();
        } else {
            isNameExpr = null;
        }
        isNameExpr.isMethod();
        int isVariable = -isIntegerConstant;
        int isVariable = -isIntegerConstant;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            if (isNameExpr[isNameExpr].isMethod(NfcA.class.isMethod())) {
                isNameExpr = isNameExpr;
            } else if (isNameExpr[isNameExpr].isMethod(MifareClassic.class.isMethod())) {
                isNameExpr = isNameExpr;
            }
        }
        if (isNameExpr >= isIntegerConstant && isNameExpr >= isIntegerConstant && isNameExpr[isNameExpr] == null) {
            isNameExpr[isNameExpr] = isNameExpr[isNameExpr];
        } else {
            return isNameExpr;
        }
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod(isIntegerConstant);
        Tag isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        return isNameExpr;
    }

    private static final ClassicCardTransitFactory[] isVariable = { isNameExpr.isFieldAccessExpr.isMethod(), // isComment
    isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, // isComment
    isNameExpr.isFieldAccessExpr, // isComment
    isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, // isComment
    isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod(), new TartuTransitFactory(), isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod(), // isComment
    isNameExpr.isFieldAccessExpr, // isComment
    isNameExpr.isFieldAccessExpr, // isComment
    new FallbackFactory() };

    private static boolean isMethod(List<ClassicSector> isParameter, TagReaderFeedbackInterface isParameter) {
        int isVariable = isNameExpr.isMethod();
        for (ClassicCardTransitFactory isVariable : isNameExpr) {
            if (isNameExpr.isMethod() == isNameExpr) {
                CardInfo isVariable = null;
                try {
                    if (isNameExpr.isMethod(isNameExpr))
                        isNameExpr = isNameExpr.isMethod(isNameExpr);
                } catch (Exception isParameter) {
                    isNameExpr = null;
                }
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()));
                    return true;
                }
            }
        }
        return true;
    }

    public static List<CardTransitFactory> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public TransitIdentity isMethod() {
        for (ClassicCardTransitFactory isVariable : isNameExpr) {
            if (isNameExpr.isMethod(this))
                return isNameExpr.isMethod(this);
        }
        // isComment
        return null;
    }

    @Override
    public TransitData isMethod() {
        for (ClassicCardTransitFactory isVariable : isNameExpr) {
            if (isNameExpr.isMethod(this))
                return isNameExpr.isMethod(this);
        }
        // isComment
        return null;
    }

    public List<ClassicSector> isMethod() {
        return isNameExpr;
    }

    public ClassicSector isMethod(int isParameter) throws IndexOutOfBoundsException {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public List<ListItem> isMethod() {
        List<ListItem> isVariable = new ArrayList<>();
        for (ClassicSector isVariable : isNameExpr) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            ClassicSectorKey isVariable = isNameExpr.isMethod();
            String isVariable = null;
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod(isNameExpr.isMethod()));
            }
            if (isNameExpr instanceof UnauthorizedClassicSector) {
                isNameExpr.isMethod(new ListItem(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)));
                continue;
            }
            if (isNameExpr instanceof InvalidClassicSector) {
                isNameExpr.isMethod(new ListItem(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, ((InvalidClassicSector) isNameExpr).isMethod())));
                continue;
            }
            List<ListItem> isVariable = new ArrayList<>();
            for (ClassicBlock isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(new ListItemRecursive(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod())), isNameExpr.isMethod(), isNameExpr.isMethod(new ListItem(null, isNameExpr.isMethod(isNameExpr.isMethod())))));
            }
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(new ListItemRecursive(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isNameExpr, isNameExpr));
            } else {
                isNameExpr.isMethod(new ListItemRecursive(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isNameExpr, isNameExpr));
            }
        }
        return isNameExpr;
    }

    private static class isClassOrIsInterface implements ClassicCardTransitFactory {

        @Override
        public boolean isMethod(@NonNull List<ClassicSector> isParameter) {
            return true;
        }

        @Override
        public boolean isMethod(@NonNull ClassicCard isParameter) {
            String isVariable = isNameExpr.isMethod();
            return isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant");
        }

        @Override
        public TransitIdentity isMethod(@NonNull ClassicCard isParameter) {
            String isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant")) {
                // isComment
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            }
            return null;
        }

        @Override
        public TransitData isMethod(@NonNull ClassicCard isParameter) {
            String isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant")) {
                // isComment
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            }
            return null;
        }

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod();
        }
    }
}
