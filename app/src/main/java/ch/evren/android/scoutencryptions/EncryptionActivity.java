package ch.evren.android.scoutencryptions;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;


public class EncryptionActivity extends ActionBarActivity {

    private Morse morse;
    private Nokia nokia;
    private Caesar caesar;

    EditText klarTextEdit;
    EditText outputTextEdit;
    EditText keyEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encryption);

        klarTextEdit = (EditText) findViewById(R.id.KlarTextEdit);
        outputTextEdit = (EditText) findViewById(R.id.OutputText);
        keyEditText = (EditText) findViewById(R.id.KeyEditText);

        morse = new Morse();
        nokia = new Nokia();
        caesar = new Caesar(12);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_encryption, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void morse(View view) {
        String message = klarTextEdit.getText().toString();
        outputTextEdit.setText(morse.convertToMorse(message));
    }

    public void nokia(View view) {
        String message = klarTextEdit.getText().toString();
        outputTextEdit.setText(nokia.convertToNokia(message));
    }

    public void caesar(View view) {
        String message = klarTextEdit.getText().toString();
        caesar.setKey(Integer.parseInt(keyEditText.getText().toString())); //Key setzen
        outputTextEdit.setText(caesar.encryptCaesar(message));
    }
}
