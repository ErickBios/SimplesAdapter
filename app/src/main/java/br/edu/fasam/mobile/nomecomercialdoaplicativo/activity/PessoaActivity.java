package br.edu.fasam.mobile.nomecomercialdoaplicativo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.fasam.mobile.nomecomercialdoaplicativo.R;
import br.edu.fasam.mobile.nomecomercialdoaplicativo.debug.DebugActivity;

public class PessoaActivity extends DebugActivity {

    EditText txtNome;
    EditText txtSobrenome;
    EditText txtEmail;
    EditText txtFone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);
    }

    public void exibir(View view) {
        //ENTRADA
        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtEmail = findViewById(R.id.txtEmail);
        txtFone = findViewById(R.id.txtFone);

        //PROCESSAMENTO
        String nome,sobrenome,email,telefone;

        nome = txtNome.getText().toString();
        sobrenome = txtSobrenome.getText().toString();
        email = txtEmail.getText().toString();
        telefone = txtFone.getText().toString();

        //SAIDA

        String dados;
        dados = String.format("Os valores informados foram: \n%s\n%s\n%s\n%s",
                nome,sobrenome,email,telefone);

        //EXIBIR DADOS PARA O USUÁRIO
        Toast.makeText(getApplication(),dados,Toast.LENGTH_LONG).show();
    }
}