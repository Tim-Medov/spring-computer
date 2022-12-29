
package enterprise.units;

import enterprise.enums.MonitorEnum;

public class Monitor {

    private MonitorEnum monitorEnum;

    public Monitor(MonitorEnum monitorEnum) {
        this.monitorEnum = monitorEnum;
    }

    public MonitorEnum getMonitorEnum() {
        return monitorEnum;
    }

    public String toString() {
        return "Monitor: " + monitorEnum;
    }
}
