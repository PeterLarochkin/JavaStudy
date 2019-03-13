package com.company;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;


public class MusicTest1 {
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            System.out.println("Successfull");
        } catch (MidiUnavailableException ex) {
            System.out.println("UnSuccessfull");
        }

    }
}

