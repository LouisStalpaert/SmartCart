package rita.smartcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //Listener for bt_MijnScanner
        button = findViewById(R.id.bt_MijnScanner);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityMijnScanner();
            }
        });

        // Listener for bt_MijnGerechten
        button1 = findViewById(R.id.bt_MijnGerechten);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityMijnGerechten();
            }
        });

        // Listener for bt_MijnBoodschappen
        button2 = findViewById(R.id.bt_MijnBoodschappenLijstje);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityMijnBoodschappenlijstje();
            }
        });

        // Listener for bt_MijnGroep
        button3 = findViewById(R.id.bt_MijnGroep);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityMijnGroep();
            }
        });
    }

    public void openActivityMijnScanner(){
        Intent intent = new Intent(this,MijnScanner.class);
        startActivity(intent);
    }

    public void openActivityMijnGerechten(){
        Intent intent = new Intent(this,MijnGerechten.class);
        startActivity(intent);
    }
    public void openActivityMijnBoodschappenlijstje(){
        Intent intent = new Intent(this,MijnBoodschappenlijstje.class);
        startActivity(intent);
    }
    public void openActivityMijnGroep(){
        Intent intent = new Intent(this,MijnGroep.class);
        startActivity(intent);
    }


    public Boolean Testclass(){
        return true;
    }
}
