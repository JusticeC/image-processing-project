import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ImageProcessing {
    public static void main(String args[]) {       
        // Loading OpenCV core library
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );

        // Reading Image from file
        String file ="C:/Users/Lydia/Pictures/project.jpg";
        Mat src = Imgcodecs.imread(file);

        // Creating matrix to store result
        Mat dst = new Mat();

        /*******************************Bilateral Filter*************************************/
        // To track execution time
        long startTime = System.currentTimeMillis();
        Imgproc.bilateralFilter(src, dst, 15, 80, 80, Core.BORDER_DEFAULT);

        // Writing image
        Imgcodecs.imwrite("C:/Users/Lydia/Pictures/Processed_Images/bilateral.jpg", dst);

        System.out.println("Image Processed");
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time of Bilateral Filter: " + (endTime - startTime));
      
        
        /***********************************Color Map****************************************/
        startTime = System.currentTimeMillis();
        Imgproc.applyColorMap(src, dst, Imgproc.COLORMAP_COOL);

        // Writing image
        Imgcodecs.imwrite("C:/Users/Lydia/Pictures/Processed_Images/colorMap.jpg", dst);
        System.out.println("Image processed");
      
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time of Color Map: " + (endTime - startTime));
        
        
        /********************************Morph Gradient**************************************/
        // Creating kernel matrix
        startTime = System.currentTimeMillis();
        Mat kernel = Mat.ones(5,5, CvType.CV_32F);

        // Applying Blur effect to Image 
        Imgproc.morphologyEx(src, dst, Imgproc.MORPH_GRADIENT, kernel);

        // Writing image
        Imgcodecs.imwrite("C:/Users/Lydia/Pictures/Processed_Images/morphGradient.jpg", dst);
        System.out.println("Image Processed");
        
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time of Morph Gradient: " + (endTime - startTime));
        
        
        /********************************Filter 2D******************************************/
        startTime = System.currentTimeMillis();
        //Initializing kernel matrix
        kernel = Mat.ones(2,2, CvType.CV_32F);
      
        for(int i = 0; i<kernel.rows(); i++) {
            for(int j = 0; j<kernel.cols(); j++) {
                double[] m = kernel.get(i, j);

            for(int k = 1; k<m.length; k++) {
                m[k] = m[k]/(2 * 2);
            }
            kernel.put(i,j, m);
            }
        }
        Imgproc.filter2D(src, dst, -1, kernel);
        // Writing image
        Imgcodecs.imwrite("C:/Users/Lydia/Pictures/Processed_Images/filter2d.jpg", dst);
        System.out.println("Image Processed");
        
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time Filter 2D: " + (endTime - startTime));        
        
        
        /*******************************Edge Detection*************************************/
        startTime = System.currentTimeMillis();
        // Creating empty matrix to store result
        Mat gray = new Mat();

        // Converting image from color->Gray
        Imgproc.cvtColor(src, gray, Imgproc.COLOR_BGR2GRAY);
        Mat edges = new Mat();

        // Detecting edges
        Imgproc.Canny(gray, edges, 60, 60);

        // Writing image
        Imgcodecs.imwrite("C:/Users/Lydia/Pictures/Processed_Images/edge.jpg", edges);
        System.out.println("Image Processed");
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time of Edge Detection: " + (endTime - startTime));
   }
}