// isComment
package com.github.pires.obd.reader.config;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.commands.SpeedCommand;
import com.github.pires.obd.commands.control.DistanceMILOnCommand;
import com.github.pires.obd.commands.control.DtcNumberCommand;
import com.github.pires.obd.commands.control.EquivalentRatioCommand;
import com.github.pires.obd.commands.control.ModuleVoltageCommand;
import com.github.pires.obd.commands.control.TimingAdvanceCommand;
import com.github.pires.obd.commands.control.TroubleCodesCommand;
import com.github.pires.obd.commands.control.VinCommand;
import com.github.pires.obd.commands.engine.LoadCommand;
import com.github.pires.obd.commands.engine.MassAirFlowCommand;
import com.github.pires.obd.commands.engine.OilTempCommand;
import com.github.pires.obd.commands.engine.RPMCommand;
import com.github.pires.obd.commands.engine.RuntimeCommand;
import com.github.pires.obd.commands.engine.ThrottlePositionCommand;
import com.github.pires.obd.commands.fuel.AirFuelRatioCommand;
import com.github.pires.obd.commands.fuel.ConsumptionRateCommand;
import com.github.pires.obd.commands.fuel.FindFuelTypeCommand;
import com.github.pires.obd.commands.fuel.FuelLevelCommand;
import com.github.pires.obd.commands.fuel.FuelTrimCommand;
import com.github.pires.obd.commands.fuel.WidebandAirFuelRatioCommand;
import com.github.pires.obd.commands.pressure.BarometricPressureCommand;
import com.github.pires.obd.commands.pressure.FuelPressureCommand;
import com.github.pires.obd.commands.pressure.FuelRailPressureCommand;
import com.github.pires.obd.commands.pressure.IntakeManifoldPressureCommand;
import com.github.pires.obd.commands.temperature.AirIntakeTemperatureCommand;
import com.github.pires.obd.commands.temperature.AmbientAirTemperatureCommand;
import com.github.pires.obd.commands.temperature.EngineCoolantTemperatureCommand;
import com.github.pires.obd.enums.FuelTrim;
import java.util.ArrayList;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    public static ArrayList<ObdCommand> isMethod() {
        ArrayList<ObdCommand> isVariable = new ArrayList<>();
        // isComment
        isNameExpr.isMethod(new ModuleVoltageCommand());
        isNameExpr.isMethod(new EquivalentRatioCommand());
        isNameExpr.isMethod(new DistanceMILOnCommand());
        isNameExpr.isMethod(new DtcNumberCommand());
        isNameExpr.isMethod(new TimingAdvanceCommand());
        isNameExpr.isMethod(new TroubleCodesCommand());
        isNameExpr.isMethod(new VinCommand());
        // isComment
        isNameExpr.isMethod(new LoadCommand());
        isNameExpr.isMethod(new RPMCommand());
        isNameExpr.isMethod(new RuntimeCommand());
        isNameExpr.isMethod(new MassAirFlowCommand());
        isNameExpr.isMethod(new ThrottlePositionCommand());
        // isComment
        isNameExpr.isMethod(new FindFuelTypeCommand());
        isNameExpr.isMethod(new ConsumptionRateCommand());
        // isComment
        // isComment
        isNameExpr.isMethod(new FuelLevelCommand());
        // isComment
        // isComment
        isNameExpr.isMethod(new FuelTrimCommand(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new FuelTrimCommand(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new FuelTrimCommand(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new FuelTrimCommand(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new AirFuelRatioCommand());
        isNameExpr.isMethod(new WidebandAirFuelRatioCommand());
        isNameExpr.isMethod(new OilTempCommand());
        // isComment
        isNameExpr.isMethod(new BarometricPressureCommand());
        isNameExpr.isMethod(new FuelPressureCommand());
        isNameExpr.isMethod(new FuelRailPressureCommand());
        isNameExpr.isMethod(new IntakeManifoldPressureCommand());
        // isComment
        isNameExpr.isMethod(new AirIntakeTemperatureCommand());
        isNameExpr.isMethod(new AmbientAirTemperatureCommand());
        isNameExpr.isMethod(new EngineCoolantTemperatureCommand());
        // isComment
        isNameExpr.isMethod(new SpeedCommand());
        return isNameExpr;
    }
}
