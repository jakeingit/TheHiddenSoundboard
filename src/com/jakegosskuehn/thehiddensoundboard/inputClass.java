package com.jakegosskuehn.thehiddensoundboard;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class inputClass extends Fragment {
    
    private SoundPool soundPool;
    boolean loaded = false;
    boolean songloaded = false;
    
    private int _honk;
    private int soundID1;
    private int soundID2;
    private int soundID3;
    private int soundID4;
    private int soundID5;
    private int soundID6;
    private int soundID7;
    private int soundID8;
    private int soundID9;
    private int soundID10;
    private int soundID11;
    private int soundID12;
    private int soundID13;
    private int soundID14;
    private int soundID15;
    private int soundID16;
    private int soundID17;
    private int soundID18;
    private int soundID19;
    private int soundID20;
    private int soundID21;
    private int soundID22;
    private int soundID23;
    private int soundID24;
    private int soundID25;
    private int soundID26;
    private int soundID27;
    private int soundID28;
    private int soundID29;
    private int soundID30;
    private int soundID31;
    private int soundID32;
    private int soundID33;
    private int soundID34;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.input_xml, container, false);
        setMedia(); 
        
        ////////////
        final Button button1 = (Button) rootView.findViewById(R.id.button1);
        button1.setText("Behind you");
        button1.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
//                Toast.makeText(getActivity(), "test", Toast.LENGTH_LONG).show();
                soundboardswitch(getActivity(), 1);
                }
            });
         //////////////
        
        ////////////
      final Button button2 = (Button) rootView.findViewById(R.id.button2);
      button2.setText("You're next");
      button2.setOnClickListener(new OnClickListener(){
         
         
          public void onClick(View view) {          
//              Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
              soundboardswitch(getActivity(), 2);
              }
          });
           //////////////
      
      ////////////
    final Button button3 = (Button) rootView.findViewById(R.id.button3);
    button3.setText("I'm coming");
    button3.setOnClickListener(new OnClickListener(){
       
       
        public void onClick(View view) {          
//            Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
            soundboardswitch(getActivity(), 3);
            }
        });
         //////////////
    
    ////////////
  final Button button4 = (Button) rootView.findViewById(R.id.button4);
  button4.setText("I see you");
  button4.setOnClickListener(new OnClickListener(){
     
     
      public void onClick(View view) {          
//          Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
          soundboardswitch(getActivity(), 4);
          }
      });
       //////////////
  
  ////////////
final Button button5 = (Button) rootView.findViewById(R.id.button5);
button5.setText("Over here");
button5.setOnClickListener(new OnClickListener(){
   
   
    public void onClick(View view) {          
//        Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
        soundboardswitch(getActivity(), 5);
        }
    });
     //////////////

////////////
final Button button6 = (Button) rootView.findViewById(R.id.button6);
button6.setText("I'm here");
button6.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 6);
      }
  });
   //////////////

////////////
final Button button7 = (Button) rootView.findViewById(R.id.button7);
button7.setText("Look up");
button7.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 7);
      }
  });
   //////////////

////////////
final Button button8 = (Button) rootView.findViewById(R.id.button8);
button8.setText("Fresh meat");
button8.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 8);
      }
  });
   //////////////

////////////
final Button button9 = (Button) rootView.findViewById(R.id.button9);
button9.setText("I'll be back");
button9.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 9);
      }
  });
   //////////////

////////////
final Button button10 = (Button) rootView.findViewById(R.id.button10);
button10.setText("Growl");
button10.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 10);
      }
  });
   //////////////

////////////
final Button button11 = (Button) rootView.findViewById(R.id.button11);
button11.setText("Pain");
button11.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 11);
      }
  });
   //////////////

////////////
final Button button12 = (Button) rootView.findViewById(R.id.button12);
button12.setText("Pain 2");
button12.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 12);
      }
  });
   //////////////

////////////
final Button button13 = (Button) rootView.findViewById(R.id.button13);
button13.setText("Death");
button13.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
//      Toast.makeText(getActivity(), "test2", Toast.LENGTH_LONG).show();
      soundboardswitch(getActivity(), 13);
      }
  });
   //////////////

////////////
final Button button617stop = (Button) rootView.findViewById(R.id.button617stop);
button617stop.setText("STOP SOUNDS");
button617stop.setOnClickListener(new OnClickListener(){
 
 
  public void onClick(View view) {          
      Toast.makeText(getActivity(), "all scary sound stopped", Toast.LENGTH_SHORT).show();
//      soundboardswitch(getActivity(), 14);
//      SoundPool.this.autoPause();
      soundPool.autoPause();
      }
  });
   //////////////
//
//SET TEXTBUTTONS TO BE ALL WHITE TEXT
button1.setTextColor(Color.parseColor("#FFFFFF"));
button2.setTextColor(Color.parseColor("#FFFFFF"));
button3.setTextColor(Color.parseColor("#FFFFFF"));
button4.setTextColor(Color.parseColor("#FFFFFF"));
button5.setTextColor(Color.parseColor("#FFFFFF"));
button6.setTextColor(Color.parseColor("#FFFFFF"));
button7.setTextColor(Color.parseColor("#FFFFFF"));
button8.setTextColor(Color.parseColor("#FFFFFF"));
button9.setTextColor(Color.parseColor("#FFFFFF"));
button10.setTextColor(Color.parseColor("#FFFFFF"));
button11.setTextColor(Color.parseColor("#FFFFFF"));
button12.setTextColor(Color.parseColor("#FFFFFF"));
button13.setTextColor(Color.parseColor("#FFFFFF"));
button617stop.setTextColor(Color.parseColor("#FFFFFF"));
        
        return rootView;
    }

    public void soundboardswitch(Context context, int soundtype) {
        
        AudioManager audioManager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
        float actualVolume = (float) audioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC);
        float maxVolume = (float) audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        float volume = actualVolume / maxVolume;
        
        switch(soundtype){
            case 1: soundPool.play(soundID1, volume, volume, 1, 0, 1f);
                break;
            case 2: soundPool.play(soundID2, volume, volume, 1, 0, 1f);
                break;
            case 3:  soundPool.play(soundID3, volume, volume, 1, 0, 1f);
                break;
            case 4: soundPool.play(soundID4, volume, volume, 1, 0, 1f);
                break;
            case 5: soundPool.play(soundID5, volume, volume, 1, 0, 1f);
                break;
            case 6: soundPool.play(soundID6, volume, volume, 1, 0, 1f);
                break;
            case 7: soundPool.play(soundID7, volume, volume, 1, 0, 1f);
                break;
            case 8: soundPool.play(soundID8, volume, volume, 1, 0, 1f);
                break;
            case 9: soundPool.play(soundID9, volume, volume, 1, 0, 1f);
                break;
            case 10:  soundPool.play(soundID10, volume, volume, 1, 0, 1f);
                break;
            case 11: soundPool.play(soundID11, volume, volume, 1, 0, 1f);
                break;
            case 12: soundPool.play(soundID12, volume, volume, 1, 0, 1f);
                break;
            case 13: soundPool.play(soundID13, volume, volume, 1, 0, 1f);
                break;
            case 14: soundPool.play(soundID14, volume, volume, 1, 0, 1f);
                break;
            case 15: soundPool.play(soundID15, volume, volume, 1, 0, 1f);
                break;
            case 16: soundPool.play(soundID16, volume, volume, 1, 0, 1f);
                break;
            case 17: soundPool.play(soundID17, volume, volume, 1, 0, 1f);
                break;
            case 18: soundPool.play(soundID18, volume, volume, 1, 0, 1f);
                break;
            case 19: soundPool.play(soundID19, volume, volume, 1, 0, 1f);
                break;
            case 20: soundPool.play(soundID20, volume, volume, 1, 0, 1f);
                break;
            case 21: soundPool.play(soundID21, volume, volume, 1, 0, 1f);
                break;
            case 22: soundPool.play(soundID22, volume, volume, 1, 0, 1f);
            break;
            case 23: soundPool.play(soundID23, volume, volume, 1, 0, 1f);
            break;
            case 24: soundPool.play(soundID24, volume, volume, 1, 0, 1f);
            break;
            case 25: soundPool.play(soundID25, volume, volume, 1, 0, 1f);
            break;
            case 26: soundPool.play(soundID26, volume, volume, 1, 0, 1f);
            break;
            case 27: soundPool.play(soundID27, volume, volume, 1, 0, 1f);
            break;
            case 28: soundPool.play(soundID28, volume, volume, 1, 0, 1f);
            break;
            case 29: soundPool.play(soundID29, volume, volume, 1, 0, 1f);
            break;
            case 30: soundPool.play(soundID30, volume, volume, 1, 0, 1f);
            break;
            case 31: soundPool.play(soundID31, volume, volume, 1, 0, 1f);
            break;
            case 32: soundPool.play(soundID32, volume, volume, 1, 0, 1f);
            break;
            case 33: soundPool.play(soundID33, volume, volume, 1, 0, 1f);
            break;
            case 34: soundPool.play(soundID34, volume, volume, 1, 0, 1f);
            break;
                default://IF NONE OF THESE WORK, HONKS MUST FLOW
                    soundPool.play(_honk, volume, volume, 1, 0, 1f);
        }
        
    }
    
    private void setMedia() {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                    int status) {
                loaded = true;
            }
        });
        soundID1 = soundPool.load(getActivity(), R.raw.behindyou617, 1);
        soundID2 = soundPool.load(getActivity(), R.raw.yourenext, 1);
        soundID3 = soundPool.load(getActivity(), R.raw.comingforyou617, 1);
        soundID4 = soundPool.load(getActivity(), R.raw.iseeyou01617, 1);
        soundID5 = soundPool.load(getActivity(), R.raw.overhere02617, 1);
        soundID6 = soundPool.load(getActivity(), R.raw.imhere03617, 1);
        soundID7 = soundPool.load(getActivity(), R.raw.lookup02617, 1);
        soundID8 = soundPool.load(getActivity(), R.raw.freshmeat617, 1);
        soundID9 = soundPool.load(getActivity(), R.raw.illbeback617, 1);
        soundID10 = soundPool.load(getActivity(), R.raw.pain617, 1);
        soundID11 = soundPool.load(getActivity(), R.raw.pain02617, 1);
        soundID12 = soundPool.load(getActivity(), R.raw.pain01617, 1);
        soundID13 = soundPool.load(getActivity(), R.raw.death02617, 1);//UP TO HERE IS 617 SOUNDS
        
//        soundID14 = soundPool.load(getActivity(), R.raw.sighted03, 1);
//        soundID15 = soundPool.load(getActivity(), R.raw.bringit, 1);
//        soundID16 = soundPool.load(getActivity(), R.raw.affirmative03, 1);
//        soundID17 = soundPool.load(getActivity(), R.raw.negative04, 1);
//        soundID18 = soundPool.load(getActivity(), R.raw.ifitbleeds, 1);
//        soundID19 = soundPool.load(getActivity(), R.raw.statusreport, 1);
//        soundID20 = soundPool.load(getActivity(), R.raw.uglymotherfucker, 1);
//        soundID21 = soundPool.load(getActivity(), R.raw.targetappearstobehostile, 1);
//        soundID22 = soundPool.load(getActivity(), R.raw.reportingin02, 1);
//        soundID23 = soundPool.load(getActivity(), R.raw.ceasefire, 1);
//        soundID24 = soundPool.load(getActivity(), R.raw.holyshitdidyouhearthat, 1);
//        soundID25 = soundPool.load(getActivity(), R.raw.keepthempeeled, 1);
//        soundID26 = soundPool.load(getActivity(), R.raw.getastartyousunsabitches, 1);
//        soundID27 = soundPool.load(getActivity(), R.raw.movein, 1);
//        soundID28 = soundPool.load(getActivity(), R.raw.alarm01, 1);
//        soundID29 = soundPool.load(getActivity(), R.raw.securearea02, 1);
//        soundID30 = soundPool.load(getActivity(), R.raw.pain07, 1);
//        soundID31 = soundPool.load(getActivity(), R.raw.pain8, 1);
//        soundID32 = soundPool.load(getActivity(), R.raw.agentdown04, 1);
//        soundID33 = soundPool.load(getActivity(), R.raw.roundend03, 1);
//        soundID34 = soundPool.load(getActivity(), R.raw.death04, 1); //UP TO HERE IS IRIS SOUNDS
        
        
//        _honk = soundPool.load(getActivity(), R.raw.bikehorn, 1); //DEFAULT. DONT LET 617 HONK
        
        
        Toast.makeText(getActivity(),
                "Look behind you.", Toast.LENGTH_SHORT).show();
    }
    
    
    
}
