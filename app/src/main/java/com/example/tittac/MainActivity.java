package com.example.tittac;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_0, btn_1,btn_2, btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,new_game;
    EditText game_status;
    int player;
    int count=1;
    String[] mBoard = new String[9];

    public void isGameOver() {
        mBoard[0] = btn_0.getText().toString();
        mBoard[1] = btn_1.getText().toString();
        mBoard[2] = btn_2.getText().toString();
        mBoard[3] = btn_3.getText().toString();
        mBoard[4] = btn_4.getText().toString();
        mBoard[5] = btn_5.getText().toString();
        mBoard[6] = btn_6.getText().toString();
        mBoard[7] = btn_7.getText().toString();
        mBoard[8] = btn_8.getText().toString();

        if ( mBoard[0].equals(mBoard[1]) && mBoard[0].equals(mBoard[2]) && mBoard[0].equals("X")){
            game_status.setText("Player1 won");
        }
        else if ( mBoard[0].equals(mBoard[3]) && mBoard[0].equals(mBoard[6]) && mBoard[0].equals("X")){
            game_status.setText("Player1 won");
        }
        else if ( mBoard[0].equals(mBoard[4]) && mBoard[0].equals(mBoard[8]) && mBoard[0].equals("X")){
            game_status.setText("Player1 won");
        }
        else if ( mBoard[1].equals(mBoard[4]) && mBoard[1].equals(mBoard[7]) && mBoard[1].equals("X")){
            game_status.setText("Player1 won");
        }
        else if ( mBoard[2].equals(mBoard[5]) && mBoard[2].equals(mBoard[8]) && mBoard[2].equals("X")){
            game_status.setText("Player1 won");
        }
        else if ( mBoard[2].equals(mBoard[4]) && mBoard[2].equals(mBoard[6]) && mBoard[2].equals("X")){
            game_status.setText("Player1 won");
        }
        else if ( mBoard[6].equals(mBoard[7]) && mBoard[6].equals(mBoard[8]) && mBoard[6].equals("X")){
            game_status.setText("Player1 won");
        }
        else if ( mBoard[3].equals(mBoard[4]) && mBoard[3].equals(mBoard[5]) && mBoard[3].equals("X")){
            game_status.setText("Player1 won");
        }
        //done with player1
        else if ( mBoard[0].equals(mBoard[1]) && mBoard[0].equals(mBoard[2]) && mBoard[0].equals("O")){
            game_status.setText("Player2 won");
        }
        else if ( mBoard[0].equals(mBoard[3]) && mBoard[0].equals(mBoard[6]) && mBoard[0].equals("O")){
            game_status.setText("Player2 won");
        }
        else if ( mBoard[0].equals(mBoard[4]) && mBoard[0].equals(mBoard[8]) && mBoard[0].equals("O")){
            game_status.setText("Player2 won");
        }
        else if ( mBoard[1].equals(mBoard[4]) && mBoard[1].equals(mBoard[7]) && mBoard[1].equals("O")){
            game_status.setText("Player2 won");
        }
        else if ( mBoard[2].equals(mBoard[5]) && mBoard[2].equals(mBoard[8]) && mBoard[2].equals("O")){
            game_status.setText("Player2 won");
        }
        else if ( mBoard[2].equals(mBoard[4]) && mBoard[2].equals(mBoard[6]) && mBoard[2].equals("O")){
            game_status.setText("Player2 won");
        }
        else if ( mBoard[6].equals(mBoard[7]) && mBoard[6].equals(mBoard[8]) && mBoard[6].equals("O")){
            game_status.setText("Player2 won");
        }
        else if ( mBoard[3].equals(mBoard[4]) && mBoard[3].equals(mBoard[5]) && mBoard[3].equals("O")){
            game_status.setText("Player2 won");
        }
        else if (count ==9 ){
            game_status.setText("Draw");
        }
        else{
            game_status.setText("Playing the board");
        }

    }
    public void newGame(){
        mBoard = new String[9];
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        game_status = (EditText)findViewById(R.id.game_status);
        new_game = (Button)findViewById(R.id.new_game);
        player = 1;

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_0.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_0.setText("X");
                        btn_0.setTextColor(getResources().getColor(R.color.RED));

                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_0.setText("O");
                        btn_0.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_1.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_1.setText("X");
                        btn_1.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_1.setText("O");
                        btn_1.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_2.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_2.setText("X");
                        btn_2.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_2.setText("O");
                        btn_2.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_3.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_3.setText("X");
                        btn_3.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_3.setText("O");
                        btn_3.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_4.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_4.setText("X");
                        btn_4.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_4.setText("O");
                        btn_4.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_5.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_5.setText("X");
                        btn_5.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_5.setText("O");
                        btn_5.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });

        

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_6.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_6.setText("X");
                        btn_6.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_6.setText("O");
                        btn_6.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_7.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_7.setText("X");
                        btn_7.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_7.setText("O");
                        btn_7.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_8.getText().toString().equals("")){
                    if (player == 1 ){
                        player = 2;
                        btn_8.setText("X");
                        btn_8.setTextColor(getResources().getColor(R.color.RED));
                    }
                    else if (player == 2 ){
                        player = 1;
                        btn_8.setText("O");
                        btn_8.setTextColor(getResources().getColor(R.color.BLUE));
                    }
                }
                isGameOver();
                count++;
            }
        });
        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_0.setText("");
                btn_1.setText("");
                btn_2.setText("");
                btn_3.setText("");
                btn_4.setText("");
                btn_5.setText("");
                btn_6.setText("");
                btn_7.setText("");
                btn_8.setText("");
                player = 1;
                game_status.setText("");
            }
        });
    }

}
