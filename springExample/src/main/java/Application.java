import com.Harsh.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args)
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
        samsung s20=factory.getBean(samsung.class);
        samsungS20FE s20fe=factory.getBean(samsungS20FE.class);
        samsungS21 s21=factory.getBean(samsungS21.class);
        System.out.println("Which Samsung phone and processor configuration you want we have information of \nS20 \nS20 FE\nS21");
        Scanner sc=new Scanner(System.in);
        String phoneName=sc.nextLine();
        if(phoneName.equals("S20")){
            s20.config();
        }
        else if(phoneName.equals("S21")){
            s21.config();
        }
        else if(phoneName.equals("S20 FE")){
            s20fe.config();
        }
        else {
            System.out.println("Sorry you are not selected correct one please try after some times");
        }

    }
}
