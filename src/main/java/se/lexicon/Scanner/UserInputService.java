package se.lexicon.Scanner;

import org.springframework.stereotype.Component;

@Component
public interface UserInputService {
    String getString();
    int getInt();
}
