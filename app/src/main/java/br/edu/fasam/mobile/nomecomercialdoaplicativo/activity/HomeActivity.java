package br.edu.fasam.mobile.nomecomercialdoaplicativo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.fasam.mobile.nomecomercialdoaplicativo.R;
import br.edu.fasam.mobile.nomecomercialdoaplicativo.debug.DebugActivity;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibir(View view) {

        //Pegar a opção da tela passada por parâmetro
        int opcao = view.getId();

        Intent intent = null;

        switch(opcao){
            case R.id.btnAddress:

                intent = new Intent(this, AddressActivity.class);
                startActivity(intent);

                break;

            case R.id.btnPessoa:

                intent = new Intent(this, PessoaActivity.class);
                startActivity(intent);
                break;

            case R.id.btnUser:

                intent = new Intent(this, UserActivity.class);
                startActivity(intent);
                break;

            case R.id.btnPost:

                intent = new Intent(this, PostActivity.class);
                startActivity(intent);
                break;

            case R.id.btnComments:

                intent = new Intent(this, CommentsActivity.class);
                startActivity(intent);
                break;

            default:
                Toast.makeText(this,"Opção inválida.",Toast.LENGTH_LONG).show();
                break;
        }
    }
}