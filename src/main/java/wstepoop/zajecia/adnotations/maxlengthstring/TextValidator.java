package wstepoop.zajecia.adnotations.maxlengthstring;

import java.lang.reflect.Field;

public class TextValidator {

    public static boolean validate(TextParser textParser) throws IllegalAccessException {
        Field[] fields = textParser.getClass().getDeclaredFields();
        for (Field field : fields) {
            MaxLength annotation = field.getAnnotation(MaxLength.class);
            if (annotation!=null){
                field.setAccessible(true);
                String text = (String) field.get(textParser);
                if (text.length() > annotation.maxLength()){
                    return false;
                }
                field.setAccessible(false);
            }
        }
        return true;
    }

}
