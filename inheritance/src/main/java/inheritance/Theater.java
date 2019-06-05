package inheritance;

import java.util.List;
import java.util.Set;

public class Theater {
    protected String name;
    protected Set<String> nowPlaying;
    protected List<Review> reviews;

public Theater(String name){
    this.name = name;
    this.nowPlaying = null;
    this.reviews = null;
    }

    // Now inorder to
    public String toString(){
    if(nowPlaying == null){
        return this.name + " is not playing any movies right now";
    }
        return this.name + "is playing "  + this.nowPlaying + " and has rating" + this.reviews;
    }

}
