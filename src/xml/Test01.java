package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader=new SAXReader();
        Document document=reader.read(Cat.class.getResourceAsStream("xml/Hello.xml"));
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        List<Cat> cats=new ArrayList<>();
        for (Element element : elements) {
            Cat cat=new Cat();
            cat.setAge(Integer.parseInt(element.attributeValue("age")));
            cat.setArray(element.attributeValue("Array"));
            cat.setArray(element.attributeValue("name"));
            cats.add(cat);
        }
        System.out.println(cats);

    }
}
