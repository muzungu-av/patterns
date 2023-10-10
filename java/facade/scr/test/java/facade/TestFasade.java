package facade;

import fasade.VideoConverterFasade;
import fasade.videoUtils.Format;
import fasade.videoUtils.Video;
import org.junit.Test;
import org.junit.Assert;

public class TestFasade {

    @Test
    public void testMp4() {
        VideoConverterFasade vc = new VideoConverterFasade();
        Video video = new Video("Some Video");
        String result = vc.convert(video, Format.mp4);
        Assert.assertEquals(result, "Some Video : {\n" +
                "MPEG4 Compression Done\n" +
                "Bitrate Reader Done\n" +
                "Audio Mixer Done\n" +
                "}");
    }

    @Test
    public void testOgg() {
        VideoConverterFasade vc = new VideoConverterFasade();
        Video video = new Video("Another Video");
        String result = vc.convert(video, Format.ogg);
        Assert.assertEquals(result, "Another Video : {\n" +
                "Ogg Compression Done\n" +
                "Bitrate Reader Done\n" +
                "Audio Mixer Done\n" +
                "}");
    }
}
