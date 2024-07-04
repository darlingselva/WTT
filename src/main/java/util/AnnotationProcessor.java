package util;

import pageobjectconfiguration.ElementName;
import pages.AdminPortalElements.Admin_login_page_Elements;

import java.lang.reflect.Field;

public class AnnotationProcessor {

    public static void main(String[] args) {
        Admin_login_page_Elements loginPage = new Admin_login_page_Elements();

        Field[] fields = loginPage.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ElementName.class)) {
                ElementName pageElementAnnotation = field.getAnnotation(ElementName.class);
                String elementName = pageElementAnnotation.value();
                System.out.println("Field: " + field.getGenericType()+ ", Element Name: " + elementName);
            }
        }
    }
}
