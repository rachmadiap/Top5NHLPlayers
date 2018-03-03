package com.fanbasenhl.android.a5topnhlplayers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayerInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_interface);
    }

    public void nhl_link(View view)
    {
        goToUrl("http://nhl.com/");
    }

    public void setRedirectToCrosbyWiki(View view){
        Intent intent=new Intent(this, CrosbyWiki.class);
        startActivity(intent);
    }

    public void setRedirectToPriceWiki(View view){
        Intent intent=new Intent(this, PriceWiki.class);
        startActivity(intent);
    }

    public void setRedirectToOvechkinWiki(View view){
        Intent intent=new Intent(this, OvechkinWiki.class);
        startActivity(intent);
    }

    public void setRedirectToStamkosWiki(View view){
        Intent intent=new Intent(this, StamkosWiki.class);
        startActivity(intent);
    }

    public void setRedirectToTavaresWiki(View view){
        Intent intent=new Intent(this, TavaresWiki.class);
        startActivity(intent);
    }

    private void goToUrl(String url)
    {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
