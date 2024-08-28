package com.aurora.learning.opencv;

import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.opencv.global.opencv_imgproc;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Point;
import org.bytedeco.opencv.opencv_core.Scalar;

public class Test{


    public void test(){
        OpenCVFrameConverter.ToMat converterMat = new OpenCVFrameConverter.ToMat();
        Point point = new Point(10,10);    // 水印文字位置
        Scalar scalar = new Scalar(255, 255, 255, 0);  // 颜色，使用
        double alpha = 0.5;// 图像透明权重值
//        Mat mat = converterMat.convertToMat(f);
//        opencv_imgproc.putText(mat, txt, point, opencv_imgproc.CV_FONT_VECTOR0, alpha, scalar);
//        Frame frame = converterMat.convert(mat);
//        recorder.record(frame);
    }
}