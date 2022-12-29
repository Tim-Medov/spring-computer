
package enterprise.config;

import enterprise.enums.*;
import enterprise.units.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    // Computer DELL ------------------------------------------------------------------------------------------------//

    @Bean
    public ComputerEnum dell() {
        return ComputerEnum.DELL;
    }

    @Bean
    public Processor processorIntel() {
        return new Processor(ProcessorEnum.INTEL);
    }

    @Bean
    public Ram ramDdr4() {
        return new Ram(RamEnum.DDR4);
    }

    @Bean
    public Memory memorySsd() {
        return new Memory(MemoryEnum.SSD);
    }

    @Bean
    public Monitor monitorLg() {
        return new Monitor(MonitorEnum.LG);
    }

    @Bean
    public Keyboard keyboardLogitech() {
        return new Keyboard(KeyboardEnum.LOGITECH);
    }

    @Bean
    public Computer computerDell() {
        return new Computer(dell(), processorIntel(), ramDdr4(), memorySsd(), monitorLg(), keyboardLogitech());
    }

    // Computer HP --------------------------------------------------------------------------------------------------//

    @Bean
    public ComputerEnum hp() {
        return ComputerEnum.HP;
    }

    @Bean
    public Processor processorAmd() {
        return new Processor(ProcessorEnum.AMD);
    }

    @Bean
    public Ram ramDdr3() {
        return new Ram(RamEnum.DDR3);
    }

    @Bean
    public Memory memoryHdd() {
        return new Memory(MemoryEnum.HDD);
    }

    @Bean
    public Monitor monitorSamsung() {
        return new Monitor(MonitorEnum.SAMSUNG);
    }

    @Bean
    public Keyboard keyboardGenius() {
        return new Keyboard(KeyboardEnum.GENIUS);
    }

    @Bean
    public Computer computerHp() {
        return new Computer(hp(), processorAmd(), ramDdr3(), memoryHdd(), monitorSamsung(), keyboardGenius());
    }
}
