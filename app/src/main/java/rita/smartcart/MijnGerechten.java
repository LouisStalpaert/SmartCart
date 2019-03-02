package rita.smartcart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MijnGerechten extends AppCompatActivity {
    private ArrayList<String> gerechten;
    LinearLayout gallery = findViewById(R.id.LL_PopGer1);
    LayoutInflater inflater = LayoutInflater.from(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mijn_gerechten);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        gerechten = new ArrayList();
        gerechten.add("Spaghetti");
        gerechten.add("Spaghetti");
        gerechten.add("Spaghetti");
        gerechten.add("Spaghetti");
        gerechten.add("Spaghetti");
        gerechten.add("Spaghetti");

        for (String g : gerechten){
            View view = inflater.inflate(R.layout.activity_mijn_gerechten,gallery, false);

            ImageView imageView = view.findViewById(R.id.imageView7);
            imageView.setImageResource(R.mipmap.ic_launcher);

            gallery.addView(view);
        }
    }

}
