# final-project
## Justice Chase

### Image Processing
For this project I implemented multiple image filters in openCV using Java so I could compare the execution times.  I used a bilateral filter, color map filter, morph gradient filter, filter 2D, and an edge detection filter.

Here is an example of an image being ran through the filters

![Photo 1](/ProcessedPhotos/project.jpg)

**original image**

![Photo 2](/ProcessedPhotos/bilateral.jpg)

**bilateral filter**

![Photo 3](/ProcessedPhotos/colorMap.jpg)

**color map filter**

![Photo 4](/ProcessedPhotos/morphGradient.jpg)

**morph gradient filter**

![Photo 5](/ProcessedPhotos/filter2d.jpg)

**filter 2D**

![Photo 6](/ProcessedPhotos/edge.jpg)

**edge detection filter**

### Overview

Overall my project went very poorly.  It began as a webgl project where I would process an image by changing a certain region of color (such as the sky) to another color.  After a lot of research and trying to understand I was just too unfamiliar to pull anything together.  I thought it would come together with enough time, but after many attempts I had to scrap that and try something else. It was hard to work on my own and I didn't leave myself enough time to learn another framework.  I tried to find a framework for image processing that I could understand and implement which led me to openCV.  I understand that it is very simple but I wanted to submit a project. I explored a few different filtering algorithms and recorded the time they took to run and compared the average times.  I was surprised that color map, morph gradient, filter2d, and edge detection filters all ran at about the same speed.  The bilateral filter was the only one I implemented that ran with a different execution time.  I adjusted the diameter of each pixel neighborhood in the bilateral filter to record  how it influenced the execution time.  As expected, increasing the diameter caused the execution time to increase since it needed to take more pixels into account. When I brought the diameter down to 1 it executed at the same speed as the other algorithms. This made of sense since the bilateral filter is the only one I implemented which takes a pixel neighborhood into account.  Looking back, a team would've helped a lot for this project. I felt very lost since I came into the project so late and on my own. Trying to learn an entire framework in such a short time was overwhelming but I am glad I was able to produce something.
