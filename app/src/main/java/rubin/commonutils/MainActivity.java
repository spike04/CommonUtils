package rubin.commonutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.helperutils.Utils;

public class MainActivity extends AppCompatActivity {

    private Button btnCheckStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheckStatus = findViewById(R.id.btnCheckStatus);
        btnCheckStatus.setOnClickListener(view -> {
            Boolean status = Utils.isNetworkAvailable(this);
            Utils.showToast(this, (status) ? "Network Enabled" : "Network Disabled");
        });
    }
}
