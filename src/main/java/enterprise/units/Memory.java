
package enterprise.units;

import enterprise.enums.MemoryEnum;

public class Memory {

    private MemoryEnum memoryEnum;

    public Memory(MemoryEnum memoryEnum) {
        this.memoryEnum = memoryEnum;
    }

    public MemoryEnum getMemoryEnum() {
        return memoryEnum;
    }

    public String toString() {
        return "Memory: " + memoryEnum;
    }
}
