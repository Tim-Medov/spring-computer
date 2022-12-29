
package enterprise.units;

import enterprise.enums.ComputerEnum;

public class Computer {

    private ComputerEnum computer;
    private Processor processor;
    private Ram ram;
    private Memory memory;
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer(ComputerEnum computer, Processor processor, Ram ram, Memory memory,
                    Monitor monitor, Keyboard keyboard) {

        this.computer = computer;
        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public ComputerEnum getComputer() {
        return computer;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String toString() {
        return "--Computer " + computer + "--\n" +
                processor.toString() + "\n" +
                ram.toString() + "\n" +
                memory.toString() + "\n" +
                monitor.toString() + "\n" +
                keyboard.toString() + "\n";
    }
}
