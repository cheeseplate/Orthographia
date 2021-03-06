package com.orth.admir.orthographia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameModeActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_actvity);
        Button button=(Button) findViewById(R.id.practice_btn);
        Button button2=(Button) findViewById(R.id.arcade_btn);
        Button button3=(Button) findViewById(R.id.multiple_choice_btn);
        Button button4=(Button) findViewById(R.id.hidden_word_mode_btn);
        final MediaPlayer click = MediaPlayer.create(this, R.raw.click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
click.start();
                startVoiceActivity();



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.start();
                startGamePlayer();



            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.start();
                startMultipleChoice();



            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.start();
                startKremala();



            }
        });
    }

    public void startVoiceActivity() {
        Intent intent = new Intent(this, VoiceListening.class);
        startActivity(intent);

    }
    public void startGamePlayer() {
        Intent intent = new Intent(this, GamePlayer.class);
        startActivity(intent);

    }
    public void startMultipleChoice() {
        Intent intent = new Intent(this, MultipleChoice.class);
        startActivity(intent);

    }  public void startKremala() {
        Intent intent = new Intent(this, Kremala.class);
        startActivity(intent);

    }
}
