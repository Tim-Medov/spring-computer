
package enterprise;

import enterprise.config.SpringConfig;
import enterprise.units.Computer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computerDell = context.getBean("computerDell", Computer.class);
        Computer computerHp = context.getBean("computerHp", Computer.class);

        System.out.println(computerDell);
        System.out.println(computerHp);
    }
}
