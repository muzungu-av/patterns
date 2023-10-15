from videoUtils.Video import Video

class CompressionCodecInterface:
    def convert (self, video: Video) -> None:
        """ Converts the video to the specified format.
        :param video: Video to be converted.
        :param format: Format to be converted to.
        :return: None.
        """
        pass
