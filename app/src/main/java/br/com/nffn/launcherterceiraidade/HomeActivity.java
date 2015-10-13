package br.com.nffn.launcherterceiraidade;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        contatosFavoritos(R.layout.activity_home);
    }

    public void aplicativos(View v){
        Intent i = new Intent(this, AppsListActivity.class);
        startActivity(i);
    }

    public void contatos(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI);
        startActivity(intent);
    }

    public void ligar(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    public void sos(View v) {
        Uri uri = Uri.parse("tel:" + "199");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void mensagem(View v){
        Intent enviarSMS = new Intent(Intent.ACTION_VIEW);
        enviarSMS.putExtra("texto da mensagem", "default content");
        enviarSMS.setType("vnd.android-dir/mms-sms");
        startActivity(enviarSMS);
    }

    public void contatosFavoritos(int v){

    }

}

