from videoUtils.CompressionCodecInterface import CompressionCodecInterface
from videoUtils.Video import Video


class MPEG4CompressionCodec(CompressionCodecInterface):
    def convert (self, video: Video) -> None:
        video.getTasks().append("MPEG4 Compression Done")
