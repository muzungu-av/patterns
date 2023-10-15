package fasade;

import fasade.videoUtils.*;

public class VideoConverterFasade {
    public String convert(Video video, Format format) {
        CompressionCodec destinationCodec;
        if ("mp4".equalsIgnoreCase(format.name())) {
            destinationCodec = new MPEG4CompressionCodec();
        } else if ("ogg".equalsIgnoreCase(format.name())) {
            destinationCodec = new OggCompressionCodec();
        } else return "";
        destinationCodec.convert(video);

        BitrateReader reader = new BitrateReader();
        reader.read(video);

        AudioMixer audioMixer = new AudioMixer();
        audioMixer.mix(video);
        return video.toString();
    }
}
