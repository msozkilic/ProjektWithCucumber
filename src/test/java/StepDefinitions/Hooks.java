package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before(){
        System.out.println("Senaryo basladi");
    }
    @After
    public void after(){
        //todo ekran görüntüsü burada al,senaryo hatali ise.
        GWD.quitDriver();
    }
}
