package com.solvd.pattern.facade;

public class Main {

    public static void main(String[] args) {
        Ignition ignition = new Ignition();
        EnginePrepare enginePrepare = new EnginePrepare();
        HeadLampSwitch headLampSwitch = new HeadLampSwitch();

        IgnitionInterface ignitionInterface = new IgnitionInterface(ignition, enginePrepare, headLampSwitch);
        ignitionInterface.ignitionInterfaceOn();
        ignitionInterface.ignitionInterfaceOff();
    }
}

/*
 Facade представляет шаблон проектирования, который позволяет скрыть сложность системы с помощью предоставления
упрощенного интерфейса для взаимодействия с ней.
 В данном случае клиент(IgnitionInterface) управляет компонентами системы.
 */
