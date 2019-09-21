package com.example.childexpress;

        import android.app.Activity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class MainActivity extends Activity {

    String[] names = { "Medovik", "Zebra", "Praga", "Napoleon", "Tri shokolada", "Tiramisu",
            "Snikers", "Mikado", "Krasnii Barhat", "Brauni", "Pafaello" };
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lvMain = (ListView) findViewById(R.id.lvMain);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.my_list_item,
                names);


        lvMain.setAdapter(adapter);
    }
}
