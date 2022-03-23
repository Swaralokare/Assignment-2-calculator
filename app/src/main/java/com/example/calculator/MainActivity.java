package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextView txtInput;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btnequal,btnclear;
    private Float num1,num2;
    private boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInput=findViewById(R.id.txtinput);
        btn1=findViewById(R.id.btn1);
        btn1=findViewById(R.id.btn2);
        btn1=findViewById(R.id.btn3);
        btn1=findViewById(R.id.btn4);
        btn1=findViewById(R.id.btn5);
        btn1=findViewById(R.id.btn6);
        btn1=findViewById(R.id.btn7);
        btn1=findViewById(R.id.btn8);
        btn1=findViewById(R.id.btn9);
        btn1=findViewById(R.id.btn0);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnequal=findViewById(R.id.btnequal);
        btnclear=findViewById(R.id.btnclear);

        btn1.setOnClickListener(new btn1clicklistner());
        btn2.setOnClickListener(new btn2clicklistner());
        btn3.setOnClickListener(new btn3clicklistner());
        btn4.setOnClickListener(new btn4clicklistner());
        btn5.setOnClickListener(new btn5clicklistner());
        btn6.setOnClickListener(new btn6clicklistner());
        btn7.setOnClickListener(new btn7clicklistner());
        btn8.setOnClickListener(new btn8clicklistner());
        btn9.setOnClickListener(new btn9clicklistner());
        btn0.setOnClickListener(new btn0clicklistner());
        btnadd.setOnClickListener(new btnaddClickListener());
        btnmul.setOnClickListener(new btnmulClickListener());
        btndiv.setOnClickListener(new btndivClickListener());
        btnequal.setOnClickListener(new btnequalClicklistener());
        btnclear.setOnClickListener(new btnclearClickListener());

    }
    private class btn1clicklistner implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText()+"1");
        }
    }

    private class btn2clicklistner implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "2");
        }
    }


    private class btn3clicklistner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText()+"3");
        }
    }

    private class btn4clicklistner implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "4");
        }
}
    private class btn5clicklistner implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "5");
        }
    }

    private class btn6clicklistner implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "5");
        }
    }

    private class btn7clicklistner implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "7");
        }
    }

    private class btn8clicklistner implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "8");
        }
    }
    private class btn9clicklistner implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "9");
        }
    }
    private class btn0clicklistner implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            txtInput.setText(txtInput.getText() + "0");
        }
    }

    private class btnaddClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (txtInput == null) {
                txtInput.setText("");
            } else {
                num1 = Float.parseFloat(txtInput.getText() + "");
                add = true;
                txtInput.setText(null);
            }
        }
    }
    private class btnsubClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        if (txtInput== null) {
            txtInput.setText("");
        } else {
            num1 = Float.parseFloat(txtInput.getText() + "");
            sub = true;
            txtInput.setText(null);
        }
    }
}
    private class btnmulClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (txtInput == null) {
                txtInput.setText("");
            } else {
                num1 = Float.parseFloat(txtInput.getText() + "");
                mul = true;
                txtInput.setText(null);
            }
        }
    }

    private class btndivClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if (txtInput == null) {
                txtInput.setText("");
            } else {
                num1 = Float.parseFloat(txtInput.getText() + "");
                div = true;
                txtInput.setText(null);
            }
        }
    }

    private class btnequalClicklistener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Float num = Float.parseFloat(txtInput.getText() + "");

            if (add == true) {
                txtInput.setText(num1 + num2 + "");
                add = false;
            }
            if (sub == true) {
                txtInput.setText(num1 - num2 + "");
                sub = false;
            }
            if (mul == true) {
                txtInput.setText(num1 - num2 + "");
                mul = false;
            }

            if (div == true) {
                txtInput.setText(num1 - num2 + "");
                div = false;
            }
        }
    }
private class btnclearClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        txtInput.setText("");
    }
    }
}


