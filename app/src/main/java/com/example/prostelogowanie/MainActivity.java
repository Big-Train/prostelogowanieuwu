package com.example.prostelogowanie;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Sprawdź, czy login i hasło są poprawne
                if (username.equals("MaciejBrzoza") && password.equals("haslo123")) {
                    // Jeśli są poprawne, przekieruj do ekranu zalogowanego
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else {
                    // Jeśli są niepoprawne, wyświetl komunikat
                    Toast.makeText(MainActivity.this, "Niepoprawny login lub hasło", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
