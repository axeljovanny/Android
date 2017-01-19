package utng.edu.mx.unidad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ecuacion1Activity extends AppCompatActivity {
    private EditText edty;
    private Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion1);

        edty= (EditText)findViewById(R.id.edt_y);
        btnCalcular= (Button)findViewById(R.id.btn_calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ecuancion1 ecuancion1 = Ecuancion1.getEcuancion1();
                ecuancion1.setY(Integer.parseInt(edty.getText().toString()));



                Toast.makeText(Ecuacion1Activity.this,"Resultado de la Operacion"
                                +"\nValor Introducido: "+ ecuancion1.getY()
                                +"\nResultado: "+ ecuancion1.getResultado()
                                ,

                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
