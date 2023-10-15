from VideoConverterFasade import VideoConverterFacade
from videoUtils.Video import Video
from videoUtils.Format import Format


if __name__ == '__main__':
    video = Video("0000")
    video_converter: VideoConverterFacade = VideoConverterFacade()
    video_converter.conver(video, Format.MP4)
    print(video.toString())
