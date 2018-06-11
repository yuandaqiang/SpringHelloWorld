package text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TextEditor {
    List list;
    Set set;
    Map map;
    Properties properties;
@Autowired
    SpellChecker spellChecker;
    @Autowired
    String string;

    public Properties getProperties() {
        System.out.println(properties);
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List getList() {
        System.out.println(list);
        return list;
    }
@Required
    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        System.out.println(set);
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        System.out.println(map);
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

/*    public TextEditor(SpellChecker spellChecker,String string)
    {
        System.out.println("TextEditor constructor");
        this.spellChecker=spellChecker;
        this.string=string;
    }*/
    public  void checkSpellChecker()
    {
        System.out.println("spellchecker and string"+spellChecker+""+string);
        spellChecker.check();
    }
}
