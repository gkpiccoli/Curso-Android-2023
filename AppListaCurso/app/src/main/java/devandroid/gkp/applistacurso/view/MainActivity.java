package devandroid.gkp.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.gkp.applistacurso.R;
import devandroid.gkp.applistacurso.controller.PessoaController;
import devandroid.gkp.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor listaInscricao;
    public static final String NOME_PREFERENCES = "pref_lista";

    PessoaController controller;
    Pessoa pessoa;
    EditText editNome;
    EditText editSobrenome;
    EditText editTelefone;
    EditText editCursoDesejado;


    Button btnSalvar;
    Button btnFinalizar;
    Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NOME_PREFERENCES,0);
        listaInscricao = preferences.edit();

        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();

        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editTelefone = findViewById(R.id.editTelefone);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        
        btnLimpar.setOnClickListener(v -> {
            editNome.setText("");
            editSobrenome.setText("");
            editTelefone.setText("");
            editCursoDesejado.setText("");

            listaInscricao.clear();
            listaInscricao.apply();
        });

        btnFinalizar.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,"Volte Sempre", Toast.LENGTH_LONG).show();
            finish();
        });

        btnSalvar.setOnClickListener(v -> {
            pessoa.setPrimeiroNome(editNome.getText().toString());
            pessoa.setSobreNome(editSobrenome.getText().toString());
            pessoa.setTelefoneContato(editTelefone.getText().toString());
            pessoa.setCursoDesejado(editCursoDesejado.getText().toString());
            Toast.makeText(MainActivity.this,"Salvo "+pessoa.toString(), Toast.LENGTH_LONG).show();


            listaInscricao.putString("Nome", pessoa.getPrimeiroNome());
            listaInscricao.putString("Sobrenome", pessoa.getSobreNome());
            listaInscricao.putString("Telefone", pessoa.getTelefoneContato());
            listaInscricao.putString("Curso", pessoa.getCursoDesejado());
            listaInscricao.apply();

            controller.salvar(pessoa);
        });


        Log.i("POOAndroid","Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto Teste" + pessoa.getClass());
    }
}