from videoUtils.Video import Video


class BitrateReader:
    def read (self, video: Video) -> None:
        video.getTasks().append("Bitrate Reader Done")
