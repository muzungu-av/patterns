from videoUtils.AudioMixer import AudioMixer
from videoUtils.BitrateReader import BitrateReader
from videoUtils.CompressionCodecInterface import CompressionCodecInterface
from videoUtils.Format import Format
from videoUtils.MPEG4CompressionCodec import MPEG4CompressionCodec
from videoUtils.OggCompressionCodec import OggCompressionCodec
from videoUtils.Video import Video


class VideoConverterFacade:
    def conver(self, video: Video, format: Format) -> Video:
        destination_codec: CompressionCodecInterface
        if format == Format.MP4:
            destination_codec = MPEG4CompressionCodec()
        elif format == Format.OGG:
            destination_codec = OggCompressionCodec()

        destination_codec.convert(video)

        reader:BitrateReader = BitrateReader()
        reader.read(video)

        audioMixer:AudioMixer = AudioMixer()
        audioMixer.mix(video)

        return video