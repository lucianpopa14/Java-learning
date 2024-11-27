package codecademy;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Low");
        desertIslandPlaylist.add("DGAF");
        desertIslandPlaylist.add("Bailamos");
        desertIslandPlaylist.add("Blank Space");
        desertIslandPlaylist.add("All Too Well");
        desertIslandPlaylist.add("Anti-Hero");
        System.out.println(desertIslandPlaylist);
        int numberOfSongs = desertIslandPlaylist.size();
        // System.out.println(numberOfSongs);
        desertIslandPlaylist.remove(4);
        // System.out.println("The remaining songs: "+desertIslandPlaylist);
        int indexA = desertIslandPlaylist.indexOf("Bailamos");
        int indexB = desertIslandPlaylist.indexOf("Low");
        String temporaryVariable = "Bailamos";
        desertIslandPlaylist.set(indexA, "Low");
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, temporaryVariable);
        System.out.println(desertIslandPlaylist);
    }

}