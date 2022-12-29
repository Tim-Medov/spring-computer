
package enterprise.units;

import enterprise.enums.RamEnum;

public class Ram {

    private RamEnum ramEnum;

    public Ram(RamEnum ramEnum) {
        this.ramEnum = ramEnum;
    }

    public RamEnum getRamEnum() {
        return ramEnum;
    }

    public String toString() {
        return "Ram: " + ramEnum;
    }
}
