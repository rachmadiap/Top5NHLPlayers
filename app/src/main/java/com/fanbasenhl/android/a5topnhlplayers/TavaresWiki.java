package com.fanbasenhl.android.a5topnhlplayers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TavaresWiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tavares_wiki);
    }

    public void nhl_link(View view)
    {
        goToUrl("http://nhl.com/");
    }
    public void islanders_link(View view){goToUrl("http://www.nhl.com/islanders");}

    private void goToUrl(String url)
    {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
