package org.example.design.pattern;

/*
       Properties
        - Structural Design pattern
        - when object offering same feature but has different interface : I.E Cha
* */

interface WebDriver {
    void getElement();

    void selectElement();
}

class ChromeDriver implements WebDriver {

    @Override
    public void getElement() {
        System.out.println("Get Element form chrome driver");
    }

    @Override
    public void selectElement() {
        System.out.println("select Element form Chrome driver");
    }
}

class IEDriver {
    public void findElement() {
        System.out.println("Find element form IE Driver");
    }

    public void clickElement() {
        System.out.println("click element form IE Driver");
    }
}

class WebAdaptor implements WebDriver {

    IEDriver ieDriver;

    public WebAdaptor(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}

public class AdapterDesignPattern {
    public static void main(String[] args) {
        ChromeDriver ch = new ChromeDriver();
        ch.getElement();
        ch.selectElement();

        IEDriver ieDriver = new IEDriver();
        ieDriver.findElement();
        ieDriver.clickElement();

        WebAdaptor adaptor = new WebAdaptor(ieDriver);
        adaptor.getElement();
        adaptor.selectElement();
    }
}
