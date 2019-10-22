## Benchmark

1. Compare the average execution times of Bilateral Filter, Color Map, Morph Gradient, Filter 2D, and Edge Detection
2. Test execution time when tweaking diameter of each pixel neighborhood in bilateral filter
3. Generate graphs to represent data

#### Filter Execution Times

To compare the average execution times I wrote a very simple timer based on the systems current time, with the code:

```
long startTime = System.currentTimeMillis();
*/             SOME CODE HERE            */
long endTime = System.currentTimeMillis();
System.out.println("Total execution time: " + (endTime - startTime));
```

![Execution Chart 1](/Graphs/AveExeBi.png)

Since the bilateral filter had such a drastic difference I tried to compare just the other algorithms

![Execution Chart 2](/Graphs/AveExeNoBi.png)
![Execution Chart 3](/Graphs/ExePerAttemptNoBi.png)

Filter2D and Edge Detection turned out to run the fastest on average but all of the times were very close.

#### Tweaking bilateral filter

To test execution time when tweaking the diameter of each pixel neighborhood in a bilateral filter, I executed the program while inputting different values into the third parameter of the bilateral filter function.

```
Imgproc.bilateralFilter(src, dst, 15, 80, 80, Core.BORDER_DEFAULT);
```
![Execution Chart 4](/Graphs/BilateralChart.png)

As the pixel area increased the execution time increased significantly.  Below are the processed images to see the difference

![Execution Chart 5](/ProcessedPhotos/project.jpg)

**Original Photo**

![Execution Chart 6](/ProcessedPhotos/bilateral.jpg)

**Bilateral with smaller diameter**

![Execution Chart 7](/ProcessedPhotos/bilateral200.jpg)

**Bilateral with larger diameter**
