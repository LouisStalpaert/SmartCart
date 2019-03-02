package rita.smartcart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MijnBoodschappenlijstje extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list = new ArrayList();
    Button btnAdd;
    EditText editText;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mijn_boodschappenlijstje);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.listview);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        editText = (EditText)findViewById(R.id.et_name);

        list = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<String>(MijnBoodschappenlijstje.this, android.R.layout.simple_list_item_1, list);
        if (btnAdd != null){
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = editText.getText().toString();

                list.add(names);
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });
/*
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });};*/
    }
}}
