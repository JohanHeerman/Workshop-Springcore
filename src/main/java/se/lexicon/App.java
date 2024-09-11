package se.lexicon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.Config.ComponentScanConfig;
import se.lexicon.Config.ScannerConfig;
import se.lexicon.Data_access.StudentDao;
import se.lexicon.Scanner.UserInputService;

public class App
{
    public static void main( String[] args ) {

        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        //StudentDao studentDao = context.getBean(StudentDao.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScannerConfig.class);
        UserInputService userInputService = context.getBean(UserInputService.class);

    }
}
