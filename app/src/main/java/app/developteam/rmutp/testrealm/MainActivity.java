package app.developteam.rmutp.testrealm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realm=Realm.getDefaultInstance();



    }


    public RealmResults<Person> getAllPerson(){
        RealmResults<Person> results=realm.where(Person.class).findAll();
        return results;
    }


    private void insertStudent(){
        realm.beginTransaction();
        Person person=realm.createObject(Person.class);
        person.setId(1);
        person.setName("Yumi");
        realm.commitTransaction();
    }

    private void deleteAllPerson(){
        realm.beginTransaction();
        realm.delete(Person.class);
        realm.commitTransaction();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
