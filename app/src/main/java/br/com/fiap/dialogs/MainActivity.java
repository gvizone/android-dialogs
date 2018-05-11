    package br.com.fiap.dialogs;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void abrirAlertDialog(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.importante);
            builder.setMessage(R.string.deseja_extrair);
            builder.setPositiveButton(getString(R.string.sim), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Registro excluido com sucesso!", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton(getString(R.string.nao), null);
            builder.show();
        }

        public void abrirDatePickerDialog(View view) {
            DatePickerDialog dpd = new DatePickerDialog(
                    this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            Toast.makeText(MainActivity.this, dayOfMonth+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();
                        }
                    },
                    2018,
                    4,
                    10
            );

            dpd.show();
        }
    }
