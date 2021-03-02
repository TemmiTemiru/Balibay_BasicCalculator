package mcm.edu.ph.balibay_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addition, subtraction, multiplication, division, modulo;

        addition = findViewById(R.id.btnAddition);
        subtraction = findViewById(R.id.btnSubtraction);
        multiplication = findViewById(R.id.btnMultiplication);
        division = findViewById(R.id.btnDivision);
        modulo = findViewById(R.id.btnModulo);

        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
        modulo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        EditText txtOp1, txtOp2;
        TextView txtResult;

        txtResult = findViewById(R.id.txtResult);

        txtOp1 = findViewById(R.id.txtOperand1);
        txtOp2 = findViewById(R.id.editTextTextPersonName2);

        Double txtOperand1 = 0.0;
        Double txtOperand2 = 0.0;
        Double result = 0.0;

        txtOperand1 = Double.parseDouble(txtOp1.getText().toString());
        txtOperand2 = Double.parseDouble(txtOp2.getText().toString());

        switch(v.getId()){
            case R.id.btnAddition:
                result = txtOperand1 + txtOperand2;
                txtResult.setText(Double.toString(result));
                break;
            case R.id.btnSubtraction:
                result = txtOperand1 - txtOperand2;
                txtResult.setText(Double.toString(result));
                break;
            case R.id.btnMultiplication:
                result = txtOperand1 * txtOperand2;
                txtResult.setText(Double.toString(result));
                break;
            case R.id.btnDivision:
                result = txtOperand1 / txtOperand2;
                txtResult.setText(Double.toString(result));
                break;

        }

    }
}