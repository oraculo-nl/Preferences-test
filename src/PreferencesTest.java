import java.util.prefs.Preferences;

public class PreferencesTest {
    private Preferences prefs;


    public void setPreference() {
        prefs = Preferences.userRoot().node(this.getClass().getName());
        var ID = "Test";
        System.out.println(prefs.get(ID, "pref wasnt set"));

        prefs.put(ID, "Hello Mars!");

        var getallen = new byte[]{1,2,3};
        prefs.putByteArray("geluksnummers", getallen);

    }

    public static void main(String[] args) {
        var test = new PreferencesTest();
        test.setPreference();
    }

}
