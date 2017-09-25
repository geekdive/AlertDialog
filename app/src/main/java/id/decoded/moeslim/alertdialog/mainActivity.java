package id.decoded.moeslim.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    Button btAlert1;
    Button btAlert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAlert1 = (Button)findViewById(R.id.btnAlert1);
        btAlert2 = (Button)findViewById(R.id.btnAlert2);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        btAlert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder
                        .setMessage(R.string.dialog_message)
                        .setTitle(R.string.dialog_title);

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        btAlert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder
                        .setMessage(R.string.dialog_message)
                        .setTitle(R.string.dialog_title)
                        .setPositiveButton("POSITIVE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(mainActivity.this, "This POSITIVE button!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("NEGATIVE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(mainActivity.this, "This NEGATIVE button!", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


    }
}
