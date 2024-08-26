package br.unigran.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, mais, menos, divsao, multi, igual, apagar;
    TextView t1;

    String n1 = "", n2 = "", operacao = "";
    String resultado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.zero);
        b1 = findViewById(R.id.um);
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
        igual = findViewById(R.id.igual);
        apagar = findViewById(R.id.apagar);
        t1 = findViewById(R.id.resposta);

        // Definindo os listeners
        definirListeners(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, mais, menos, divsao, multi, igual, apagar);
    }

    private void definirListeners(Button... buttons) {
        for (Button button : buttons) {
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.um || id == R.id.dois || id == R.id.tres || id == R.id.quatro || id == R.id.cinco ||
                id == R.id.seis || id == R.id.sete || id == R.id.oito || id == R.id.nove || id == R.id.zero) {
            tratarNumero(((Button) v).getText().toString());
        } else if (id == R.id.soma || id == R.id.menos || id == R.id.divsao || id == R.id.multi) {
            tratarOperacao(((Button) v).getText().toString());
        } else if (id == R.id.igual) {
            calcularResultado();
        } else if (id == R.id.apagar) {
            limparTudo();
        }
    }

    private void tratarNumero(String numero) {
        t1.append(numero);

        if (operacao.isEmpty()) {
            n1 += numero;
        } else {
            n2 += numero;
        }
    }

    private void tratarOperacao(String operacaoEscolhida) {
        if (!n1.isEmpty()) {
            t1.append(operacaoEscolhida);
            operacao = operacaoEscolhida;
        }
    }

    private void calcularResultado() {
        if (!n1.isEmpty() && !n2.isEmpty() && !operacao.isEmpty()) {
            Calculadora calc = new Calculadora();
            switch (operacao) {
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
            t1.setText(resultado);
            n1 = resultado;
            n2 = "";
            operacao = "";
        }
    }

    private void limparTudo() {
        t1.setText("");
        n1 = "";
        n2 = "";
        operacao = "";
    }
}
