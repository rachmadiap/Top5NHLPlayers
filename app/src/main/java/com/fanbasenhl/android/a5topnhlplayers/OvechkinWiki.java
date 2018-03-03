package com.fanbasenhl.android.a5topnhlplayers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OvechkinWiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovechkin_wiki);
    }

    public void nhl_link(View view)
    {
        goToUrl("http://nhl.com/");
    }
    public void capitals_link(View view){goToUrl("http://www.nhl.com/capitals");}

    private void goToUrl(String url)
    {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
