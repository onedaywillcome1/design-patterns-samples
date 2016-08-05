package AdapterPattern;

import AdapterPattern.advancedMedia.AdvancedMediaPlayer;
import AdapterPattern.advancedMedia.Mp4Player;
import AdapterPattern.advancedMedia.VlcPlayer;
import AdapterPattern.classicalMedia.MediaPlayer;

/**
 * Created by ahmetatalay on 04/08/16.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
