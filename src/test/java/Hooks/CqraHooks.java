package Hooks;

import Browser.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static Browser.BaseClass.intitialsetup;

public class CqraHooks extends BaseClass {
    @Before
    public void inisetup() throws IOException {
        intitialsetup();
    }
    @After
    public void quit(){
        closemethod();
    }
}
