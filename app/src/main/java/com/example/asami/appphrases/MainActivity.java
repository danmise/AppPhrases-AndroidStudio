package com.example.asami.appphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //my way (maybe true) is to create oe mediaplayer and i ontialize to differnt sounds depending on the button clicked
    //recall that mediaplayer is used for playback stuff like start, pause, stop and seek
    MediaPlayer player;

       //longer way
        public void translateFunction(View view)
           {
               if (view.getId()==R.id.b1)
                  {
                        player = MediaPlayer.create(this,R.raw.doyouspeakenglish);
                        player.start();
                  }else if(view.getId() == R.id.b2)
                            {
                                player = MediaPlayer.create(this,R.raw.goodevening);
                                player.start();
                            }else if (view.getId() == R.id.b3)
                                       {
                                           player = MediaPlayer.create(this,R.raw.hello);
                                           player.start();
                                       }else if (view.getId() == R.id.b4)
                                                    {
                                                        player = MediaPlayer.create(this,R.raw.howareyou);
                                                        player.start();
                                                     }else if(view.getId() == R.id.b5)
                                                                      {
                                                                          player = MediaPlayer.create(this,R.raw.ilivein);
                                                                          player.start();
                                                                      }else if(view.getId() == R.id.b6)
                                                                                    {
                                                                                        player = MediaPlayer.create(this,R.raw.mynameis);
                                                                                        player.start();
                                                                                    }else if(view.getId() == R.id.b7)
                                                                                              {
                                                                                                  player = MediaPlayer.create(this,R.raw.please);
                                                                                                  player.start();
                                                                                              }else if(view.getId() == R.id.b8)
                                                                                                         {
                                                                                                             player = MediaPlayer.create(this,R.raw.welcome);
                                                                                                             player.start();
                                                                                                         }



           }


/*
     public void  translateFunction(View view)
        {
            //shorter way (rob's way)
            //getId return not the id we gave the button but the one it sets for it
            //to get the id we gave we need to use function get resourses but we need the id the computer gave first
            int id = view.getId();

            //this contains our id

            String ourId = getResources().getResourceEntryName(id);

             //now create mediaPlayer

            //you need to give the buttons id the same as sound files
            //this will gave sound name which match ourId
            int resourseId= getResources().getIdentifier(ourId,"raw","com.example.asami.appphrases");
            MediaPlayer player2 =MediaPlayer.create(this,resourseId);

            player2.start();

        }
        */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
