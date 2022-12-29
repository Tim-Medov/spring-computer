
package enterprise.units;

import enterprise.enums.ProcessorEnum;

public class Processor {

    private ProcessorEnum processorEnum;

    public Processor(ProcessorEnum processorEnum) {
        this.processorEnum = processorEnum;
    }

    public ProcessorEnum getProcessorEnum() {
        return processorEnum;
    }

    public String toString() {
        return "Processor: " + processorEnum;
    }
}
