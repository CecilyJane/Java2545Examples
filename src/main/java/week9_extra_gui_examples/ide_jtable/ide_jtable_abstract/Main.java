package week9_extra_gui_examples.ide_jtable.ide_jtable_abstract;

import java.util.HashMap;

/**
 * Created by clara on 4/18/18.
 */
public class Main {
    public static void main(String[] args) {
    
        HashMap<String, String> languages = new HashMap<>();
        languages.put("Java", "IntelliJ");
        languages.put("Swift", "XCode");
        languages.put("Python", "PyCharm");
        languages.put("C#", "Visual Studio");
        
        IdeTableGUI gui = new IdeTableGUI(languages);
    }
}

