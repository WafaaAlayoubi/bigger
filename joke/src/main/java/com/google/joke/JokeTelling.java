package com.google.joke;

import java.util.Random;

public class JokeTelling {

    private String[] jokes;
    private Random random;

    public JokeTelling() {
        String jokes[] = {
                "Eight bytes walk into a bar.  The bartender asks 'Can I get you anything'\n" +
                        "'Yeah,' reply the bytes.  Make us a double.",
                "Q. How did the programmer die in the shower?\n" +
                        "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.",
                "How many programmers does it take to change a light bulb?\n" +
                        "None – It’s a hardware problem",
                "Why do programmers always mix up Halloween and Christmas?\n" +
                        "Because Oct 31 equals Dec 25.",
                "Q: Why was the computer cold? A: It left it's Windows open!",
                "Q: Why was there a bug in the computer? A: Because it was looking for a byte to eat?",
                "Q: Why did the computer squeak? A: Because someone stepped on it's mouse!",
                "Q: What do you get when you cross a computer and a life guard? A: A screensaver!",
                "Q: Where do all the cool mice live? A: In their mousepads",
                "There are only 10 kinds of people in this world: those who know binary and those who don’t.",
                "A programmer walks to the butcher shop and buys a kilo of meat.  An hour later he comes back upset that the butcher shortchanged him by 24 grams.",
                "All programmers are playwrights, and all computers are lousy actors.",
                "Have you heard about the new Cray super computer?  It’s so fast, it executes an infinite loop in 6 seconds.",
                "The generation of random numbers is too important to be left to chance.",
                "If we were to code yo momma in a C++ function she would look like this: double mom (double fat){ mom(fat);return mom;}; //your mom is recursively fat.",
                "The computer is mightier than the pen, the sword, and usually, the programmer."
        };
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
