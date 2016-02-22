package com.lifeistech.android.basutomo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nifty.cloud.mb.core.DoneCallback;
import com.nifty.cloud.mb.core.FetchCallback;
import com.nifty.cloud.mb.core.NCMB;
import com.nifty.cloud.mb.core.NCMBException;
import com.nifty.cloud.mb.core.NCMBObject;

public class MainActivity extends AppCompatActivity {

    static final String App_key = "a0d546a9a5f9f48d13fec2b29b1d559b4479995b569987ec63a1296334def3e4";
    static final String Client_key = "928c3a9fd94c1cbdc8b1f8913827189c008d5d1f7d362630487fada22fe52d89";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NCMB.initialize(this, App_key, Client_key);

        NCMBObject obj = new NCMBObject("SaveObjectTest");
        obj.put("key", "value");
        obj.saveInBackground(new DoneCallback() {
            @Override
            public void done(NCMBException e) {
                if (e != null) {

                    //エラー発生時の処理
                } else {

                    //成功時の処理
                }
            }
        });

        obj.setObjectId("getTestObjectId");
        obj.fetchInBackground(new FetchCallback<NCMBObject>() {

            @Override
            public void done(NCMBObject object, NCMBException e) {
                if (e != null) {
                    //エラー時の処理
                } else {
                    //取得成功時の処理
                }
            }
        });
    }

}
