package fasade.videoUtils;

public class OggCompressionCodec implements CompressionCodec {
    @Override
    public void convert (Video video) {
        video.getTasks().add("Ogg Compression Done");
    }
}
