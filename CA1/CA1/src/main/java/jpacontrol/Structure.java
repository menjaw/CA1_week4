package jpacontrol;

import java.util.HashMap;
import javax.persistence.Persistence;

public class Structure {

    public static void main(String[] args) {
        HashMap puproperties = new HashMap();
        HashMap puproperties2 = new HashMap();
        HashMap puproperties3 = new HashMap();
        
        puproperties.put("javax.persistence.sql-load-script-source", "scripts/ClearDB.sql");
        Persistence.generateSchema("PU", puproperties);
        puproperties.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("PU", puproperties);
        
        puproperties2.put("javax.persistence.sql-load-script-source", "scripts/populate.sql");
        Persistence.generateSchema("PU", puproperties2);
        puproperties2.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("PU", puproperties2);
        
        puproperties3.put("javax.persistence.sql-load-script-source", "scripts/DummyData.sql");
        Persistence.generateSchema("PU", puproperties3);
        puproperties3.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("PU", puproperties3);
    }
}
