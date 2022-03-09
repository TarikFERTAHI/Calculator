package ma.enset.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String op = "";
    boolean isOp = true;
    String oldNumber="";
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.InputNumbers);

    }

    public void numberEvent(View view) {
        if (isOp)
            editText.setText("");
            isOp = false;
        String number = editText.getText().toString();
        switch (view.getId()) {
            case R.id.button1:
                number += "1";
                break;
            case R.id.button2:
                number += "2";
                break;
            case R.id.button3:
                number += "3";
                break;
            case R.id.button4:
                number += "4";
                break;
            case R.id.button5:
                number += "5";
                break;
            case R.id.button6:
                number += "6";
                break;
            case R.id.button7:
                number += "7";
                break;
            case R.id.button8:
                number += "8";
                break;
            case R.id.button9:
                number += "9";
                break;
            case R.id.button0:
            number += "0";
                break;
            case R.id.buttonClear:
                number += "C";
                break;
        }
        editText.setText(number);

    }

    public void operatorEvent(View view) {
        isOp = true;
        oldNumber = editText.getText().toString();
        switch (view.getId()) {
            case R.id.buttonAdd:
                op = "+";
                break;
            case R.id.buttonSous:
                op = "-";
                break;
            case R.id.buttonDiv:
                op = "/";
                break;
            case R.id.buttonMul:
                op = "*";
                break;
        }
    }

    public void equalEvent(View view) {
        String newNumber = editText.getText().toString();
        int result = 0;
        switch (op) {
            case "+":
                result = Integer.parseInt(oldNumber) + Integer.parseInt(newNumber);
                break;
            case "-":
                result = Integer.parseInt(oldNumber) - Integer.parseInt(newNumber);
                break;
            case "/":
                result = Integer.parseInt(oldNumber) / Integer.parseInt(newNumber);
                break;
            case "*":
                result = Integer.parseInt(oldNumber) * Integer.parseInt(newNumber);
                break;
        }
        editText.setText(result+"");

    }

    public void CEvent(View view) {
        editText.setText("0");

    }
}