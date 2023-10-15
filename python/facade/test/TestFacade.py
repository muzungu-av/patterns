import unittest

from VideoConverterFasade import VideoConverterFacade
from videoUtils.Format import Format
from videoUtils.Video import Video


class MyTestCase(unittest.TestCase):
    """
    для запуска тестов выполните:
    python -m unittest -v test/TestFacade.py
    """
    def setUp(self):
        super(MyTestCase, self).setUp()
        self.addTypeEqualityFunc(str, self.assertMultiLineEqual)

    def test_MP4_converter(self):
        video = Video("Titanic")
        video_converter: VideoConverterFacade = VideoConverterFacade()
        video_converter.conver(video, Format.MP4)
        print(video.toString())
        self.assertEqual(video.toString(), "Titanic\nMPEG4 Compression Done\nBitrate Reader Done\nAudio Mixer Done")

    def test_Ogg_converter(self):
        video = Video("Photodrama Creation")
        video_converter: VideoConverterFacade = VideoConverterFacade()
        video_converter.conver(video, Format.OGG)
        print(video.toString())
        self.assertEqual(video.toString(), "Photodrama Creation\nOgg Compression Done\nBitrate Reader Done\nAudio Mixer Done")


if __name__ == '__main__':
    unittest.main()
