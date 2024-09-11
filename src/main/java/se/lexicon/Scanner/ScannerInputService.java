package se.lexicon.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ScannerInputService implements UserInputService{

    @Autowired
    private Scanner scanner;

    @Bean
 public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Override
    public String getString() {
        return "";
    }

    @Override
    public int getInt() {
        return 0;
    }
}
