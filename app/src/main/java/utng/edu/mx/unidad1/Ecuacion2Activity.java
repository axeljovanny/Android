package utng.edu.mx.unidad1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ecuacion2Activity extends AppCompatActivity {
    private EditText edtx;
    private Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion2);

        edtx= (EditText)findViewById(R.id.edt_x);
        btnCalcular= (Button)findViewById(R.id.btn_calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ecuacion2 ecuacion2 = Ecuacion2.getEcuancion2();
                ecuacion2.setX(Integer.parseInt(edtx.getText().toString()));



                Toast.makeText(Ecuacion2Activity.this,"Resultado de la Operacion"
                                +"\nValor Introducido: "+ ecuacion2.getX()
                                +"\nResultado: "+ ecuacion2.getResultado()
                        ,

                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}