from videoUtils.CompressionCodecInterface import CompressionCodecInterface
from videoUtils.Video import Video


class OggCompressionCodec(CompressionCodecInterface):
    def convert (self, video: Video) -> None:
        video.getTasks().append("Ogg Compression Done")