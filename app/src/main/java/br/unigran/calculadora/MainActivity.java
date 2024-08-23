package br.unigran.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button mais;
    Button menos;
    Button divsao;
    Button multi;
    Button igual;
    Button apagar;*/
    Button[] buttons;
    TextView t1;

    Double n1 = null;
    Double n2 = null;
    String operacao = null;
    Double resultado = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Só depois do setContentView() você pode encontrar as views
        /*b1 = findViewById(R.id.um);
        b2 = findViewById(R.id.dois);
        b3 = findViewById(R.id.tres);
        b4 = findViewById(R.id.quatro);
        b5 = findViewById(R.id.cinco);
        b6 = findViewById(R.id.seis);
        b7 = findViewById(R.id.sete);
        b8 = findViewById(R.id.oito);
        b9 = findViewById(R.id.nove);
        mais = findViewById(R.id.soma);
        menos = findViewById(R.id.menos);
        divsao = findViewById(R.id.divsao);
        multi = findViewById(R.id.multi);
        igual = findViewById(R.id.igual);*/
        t1 = findViewById(R.id.resposta);

        buttons = new Button[] {
                findViewById(R.id.um),
                findViewById(R.id.dois),
                findViewById(R.id.tres),
                findViewById(R.id.quatro),
                findViewById(R.id.cinco),
                findViewById(R.id.seis),
                findViewById(R.id.sete),
                findViewById(R.id.oito),
                findViewById(R.id.nove),
                findViewById(R.id.soma),
                findViewById(R.id.menos),
                findViewById(R.id.divsao),
                findViewById(R.id.multi),
                findViewById(R.id.igual),
                findViewById(R.id.apagar)
        };

        // Configurando o OnClickListener para todos os botões
        for (Button button : buttons) {
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.um){
            t1.append("1");
            int a = 1;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        }else if (v.getId() == R.id.dois){
            t1.append("2");
            int a = 2;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        }else if (v.getId() == R.id.tres) {
            t1.append("3");
            int a = 3;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        } else if (v.getId() == R.id.quatro) {
            t1.append("4");
            int a = 4;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        } else if (v.getId() == R.id.cinco) {
            t1.append("5");
            int a = 5;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        } else if (v.getId() == R.id.seis) {
            t1.append("6");
            int a = 6;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        } else if (v.getId() == R.id.sete) {
            t1.append("7");
            int a = 7;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        } else if (v.getId() == R.id.oito) {
            t1.append("8");
            int a = 8;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        } else if (v.getId() == R.id.nove) {
            t1.append("9");
            int a = 9;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        }else if (v.getId() == R.id.zero) {
            t1.append("0");
            int a = 0;
            if (n1 == null){
                int numDigits = (int) Math.log10(a) + 1;
                n1 = n1 * (int) Math.pow(10, numDigits) + a;
            }else{
                int numDigits = (int) Math.log10(a) + 1;
                n2 = n2 * (int) Math.pow(10, numDigits) + a;
            }
        }
        else if (v.getId() == R.id.soma) {
            t1.append("+");
        }else if (v.getId() == R.id.menos) {
            t1.append("-");
        }else if (v.getId() == R.id.divsao) {
            t1.append("/");
        }else if (v.getId() == R.id.multi) {
            t1.append("X");
        } else if (v.getId() == R.id.igual) {
            Calculadora calc = new Calculadora();
            switch (operacao){
                case "+":
                   resultado = calc.soma(n1, n2);

                    break;
                case "-":
                    resultado = calc.subtrai(n1, n2);

                    break;
                case "X":
                    resultado = calc.multiplica(n1, n2);

                    break;
                case "/":
                    resultado = calc.divide(n1, n2);
                    break;
            }
            t1.setText("");
            t1.setText(resultado.toString());
            n1 = resultado;
            n2 = null;
            operacao = null;
        }else if (v.getId() == R.id.apagar) {
            t1.setText("");
            n1 = null;
            n2 = null;
            operacao = null;
        }
    }
}
