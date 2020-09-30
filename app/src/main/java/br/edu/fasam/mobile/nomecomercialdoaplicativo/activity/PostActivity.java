package br.edu.fasam.mobile.nomecomercialdoaplicativo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.edu.fasam.mobile.nomecomercialdoaplicativo.R;
import br.edu.fasam.mobile.nomecomercialdoaplicativo.debug.DebugActivity;

public class PostActivity extends DebugActivity {

    EditText txtUserId;
    EditText txtTitle;
    EditText txtBody;
    ListView listViewPost;

    List<HashMap<String,String>> lista = new ArrayList<>(); //pega a lista de dados enviada pelo usuário

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }

    public void adicionarPost(View view) {

        //ENTRADA
        txtUserId = findViewById(R.id.txtUserId);
        txtTitle = findViewById(R.id.txtTitle);
        txtBody = findViewById(R.id.txtBody);

        //PROCESSAMENTO
        String userId,title,body;
        userId = txtUserId.getText().toString();
        title = txtTitle.getText().toString();
        body = txtBody.getText().toString();
        simpleAdapter(userId, title, body);

    }

    private void simpleAdapter(String userId, String title, String body) {
        //Agora vamos iniciar os trabalhos para o SimpleAdapter
        //SimpleAdapter precisa de um List<? extends Map<Sring,?>>

        /*List<String> bla = new ArrayList<>(); //List trabalha com índice NÚMERICO
        bla.add(""); //0
        bla.add(""); //1
        bla.add(""); //2
        bla.add(""); //3
        bla.add(""); //4

        HashMap<String,String> mapExemplo = new HashMap<>(); //HasMap trabalha com índice "associativo", geralmente
        mapExemplo.put("index1","valor1");
        mapExemplo.put("index2","valor2");
        mapExemplo.put("index3","valor3");
        mapExemplo.put("index4","valor4");

        mapExemplo.get("index3");//retorna "valor3"

         */

        HashMap<String,String> map = new HashMap<>(); //Armazena as informações do usuário num map (mapa de valores)
        map.put("userId",userId);
        map.put("title",title);
        map.put("body",body);

        lista.add(map);

        //SimpleAdapter(Context context, List<? extends Map<String, ?>> data,
        // int resource, String[] from, int[] to)
        //Mapear o layout do tipo "item" com os dados contidos dentro do List<HashMap<String,String>>


        //SAIDA
        String[] from = {"userId","title","body"}; //chaves do seu Map
        int[] to = {R.id.txtItemUserId, R.id.txtItemTitle, R.id.txtItemBody}; //ids do layout do tipo "Item"

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,lista,R.layout.item_post,from,to);

        //Procurar a referência da listView para que essa possa imprimir dos dados utilizando o padrão ADAPTER
        listViewPost = findViewById(R.id.listViewPost);
        listViewPost.setAdapter(simpleAdapter);
    }
}