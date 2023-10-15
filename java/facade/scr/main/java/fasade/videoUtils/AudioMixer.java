package fasade.videoUtils;

public class AudioMixer {
    public void mix(Video video) {
        video.getTasks().add("Audio Mixer Done");
    }
}
