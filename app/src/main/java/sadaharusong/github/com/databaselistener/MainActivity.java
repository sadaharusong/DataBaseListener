package sadaharusong.github.com.databaselistener;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    DataBaseListener mDataBaseListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This Uri is a example,don't use it,use the uri you want listen
        mDataBaseListener = new DataBaseListener(this,Uri.EMPTY);
        mDataBaseListener.setOnDataBaseListener(new DataBaseListener.onDataBaseListener() {
            @Override
            public void onDataBaseChange() {
                // TODO: To Do Want You Want Do
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDataBaseListener.removeOnDataBaseListener();
    }
}
