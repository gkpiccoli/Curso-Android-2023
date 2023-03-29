package devandroid.gkp.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import devandroid.gkp.applistacurso.R;
import devandroid.gkp.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    Pessoa pessoa;

   // String dadosPessoa;

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

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Gustavo");
        pessoa.setSobreNome("Kureck");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("49-9900112233");

        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editTelefone = findViewById(R.id.editTelefone);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editTelefone.setText(pessoa.getTelefoneContato());
        editCursoDesejado.setText(pessoa.getCursoDesejado());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNome.setText("");
                editSobrenome.setText("");
                editTelefone.setText("");
                editCursoDesejado.setText("");
            }
        });


       /* dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += "Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();
*/

        Log.i("POOAndroid","Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto Teste" + pessoa.getClass());
    }
}