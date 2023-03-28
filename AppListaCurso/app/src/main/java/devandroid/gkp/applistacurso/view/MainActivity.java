package devandroid.gkp.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import devandroid.gkp.applistacurso.R;
import devandroid.gkp.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    Pessoa pessoa;

   // String dadosPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Gustavo");
        pessoa.setSobreNome("Kureck");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("49-9900112233");


        EditText editNome;
        EditText editSobrenome;
        EditText editTelefone;


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