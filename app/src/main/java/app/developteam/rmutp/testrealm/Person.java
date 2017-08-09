package app.developteam.rmutp.testrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by barbie on 8/9/2017.
 */

public class Person extends RealmObject{
    @PrimaryKey
    private int id;

    @Required
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
