from videoUtils.Video import Video


class AudioMixer:
    def mix (self, video: Video) -> None:
        video.getTasks().append("Audio Mixer Done")

