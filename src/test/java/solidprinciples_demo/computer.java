package solidprinciples_demo;

public class computer {
    // dependecy inversion -  easy testing and mocking
    private keyboard keyboard;

    // construtctor in jection
    // dependecy keyboard class is injected to the constructor
    computer(keyboard keyboard){
        this.keyboard = keyboard;
    }

    // realt ime keyboard is a interface - webdriver obj = new Chromedriver
    // AppiumDriver obj = new AndoridDriver()
    // AppiumDriver obj = new IOSDriver()
    keyboard obj = new WiredKeyboard();
    computer obj2 = new computer(keyboard);
}
