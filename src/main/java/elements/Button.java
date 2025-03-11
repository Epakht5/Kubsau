package elements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Button extends BaseElement{

    private static final Logger logger = LoggerFactory.getLogger(Button.class);

    public Button(String xpath, String elementName){
        super(xpath, elementName);
    }

    public void click(){
        logger.info("Click on {}", getElementName());
        getElement().click();
    }
}
