package com.company;

import javax.swing.JOptionPane;

public class RandomSongPicker {
    public static void main(String[] args) {
        String userOption = JOptionPane.showInputDialog("Choose a random number from 0 to 4");
        int x = Integer.parseInt(userOption);

        String song = randomSong(x);
        JOptionPane.showMessageDialog(null, "Your song is: " + song);
    }

    public static String randomSong (int option) {
        String[] songs = {
                "Breezeblocks - Alt-J",
                "New Rules - Dua Lipa",
                "Rather be - Clean Bandit",
                "Havana - Camila Cabello",
                "Vai malandra - Anitta"
        };

        return songs[option];
    }
}
