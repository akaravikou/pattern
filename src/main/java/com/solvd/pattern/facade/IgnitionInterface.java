package com.solvd.pattern.facade;

public class IgnitionInterface {

    private final Ignition ignition;
    private final EnginePrepare enginePrepare;
    private final HeadLampSwitch headLampSwitch;

    public IgnitionInterface(Ignition ignition, EnginePrepare enginePrepare, HeadLampSwitch headLampSwitch) {
        this.ignition = ignition;
        this.enginePrepare = enginePrepare;
        this.headLampSwitch = headLampSwitch;
    }

    public void ignitionInterfaceOn(){
        ignition.on();
        enginePrepare.checkEngine();
        headLampSwitch.LightOn();
    }

    public void ignitionInterfaceOff(){
        ignition.off();
        System.out.println("All systems are disabled.");
    }
}
