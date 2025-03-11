package elements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextBox extends BaseElement{

    private static final Logger logger = LoggerFactory.getLogger(TextBox.class);

    public TextBox(String xpath){
        super(xpath);
    }

    public void sendKeys(String text){
        logger.info("Send text to textBox");
        getElement().sendKeys(text);
    }

}
