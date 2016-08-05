package TemplatePattern;

/**
 * Created by ahmetatalay on 05/08/16.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
