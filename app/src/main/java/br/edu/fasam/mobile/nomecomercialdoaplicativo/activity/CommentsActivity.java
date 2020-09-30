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

public class CommentsActivity extends DebugActivity {

    EditText txtPostId;
    EditText txtName;
    EditText txtEmail;
    EditText txtBody;
    ListView listViewComments;
    List<HashMap<String,String>> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
    }

    public void adicionarComments(View view) {

        //ENTRADA
        txtPostId = findViewById(R.id.txtPostId);
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtBody = findViewById(R.id.txtBody);

        //PROCESSAMENTO
        String postId, name, email, body;

        postId = txtPostId.getText().toString();
        name = txtName.getText().toString();
        email = txtEmail.getText().toString();
        body = txtBody.getText().toString();

       HashMap<String,String> map = new HashMap<>();
        map.put("postId",postId);
        map.put("name",name);
        map.put("email",email);
        map.put("body",body);

        lista.add(map);

        //SAIDA
        String[] from = {"postId","name","email", "body" };
        int[] to = {R.id.txtItemPostId, R.id.txtItemName, R.id.txtItemEmail, R.id.txtItemBody};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,lista,R.layout.item_comments,from,to);

        listViewComments = findViewById(R.id.listViewComments);
        listViewComments.setAdapter(simpleAdapter);

    }
}