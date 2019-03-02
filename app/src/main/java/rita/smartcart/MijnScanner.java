package rita.smartcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MijnScanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mijn_scanner);

    }

    String[] product = {"tomaat","mozarella", "basilicum"};
    double[] prijs = {1.20,2.99, 2.49};
    int[] barcode = {0,1,2};





}
