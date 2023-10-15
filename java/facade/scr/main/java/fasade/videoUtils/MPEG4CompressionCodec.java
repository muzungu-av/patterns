package fasade.videoUtils;

public class MPEG4CompressionCodec implements CompressionCodec {
    @Override
    public void convert (Video video) {
        video.getTasks().add("MPEG4 Compression Done");
    }
}
