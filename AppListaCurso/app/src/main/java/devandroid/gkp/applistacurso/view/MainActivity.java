package devandroid.gkp.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.gkp.applistacurso.R;
import devandroid.gkp.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    Pessoa pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}