package Package1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageDemo {
	static int x,y;
	static int count;

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:\\Users\\Clement\\Desktop\\Smaple.png");
		File file2 = new File("C:\\Users\\Clement\\Desktop\\Smaple2.png");
		File file3 = new File("C:\\Users\\Clement\\Desktop\\sample2.png");
		
		File file4 = new File("C:\\Users\\Clement\\Desktop\\JavaImg.png");
		
		BufferedImage image1 = ImageIO.read(file1);
		BufferedImage image2 = ImageIO.read(file2);
		//BufferedImage image3 = ImageIO.read(file3);
		//BufferedImage image4 = ImageIO.cre
		
		int hA = image1.getHeight();
		int wA = image1.getWidth();
		System.out.println(image2.getHeight() + " , "+ image2.getWidth());
		
		//System.out.println(image1.getRGB(10, 10));
		//System.out.println(image2.getRGB(10, 10));
		//System.out.println(image3.getRGB(50, 100));
		
		System.out.println(hA+" , "+wA);
		
		BufferedImage bi = new BufferedImage(wA, hA, BufferedImage.TYPE_INT_ARGB);
		
		for (int i=0; i< image1.getWidth(); i++) {
			for (int j=0; j< image1.getHeight(); j++) {
				//try {
					System.out.println(image1.getRGB(i, j) + ":" + image2.getRGB(i, j));
					x=i;y=j;
					
					if(image1.getRGB(i, j) == image2.getRGB(i, j)) {
						count++;
					}
					else {
						bi.setRGB(i, j, -16711163);
					}
				//} catch (ArrayIndexOutOfBoundsException e) {
				//	System.out.println("Coordiantes out of bound: " + x +":"+ y);
				//}
			}
		}
		
		ImageIO.write(bi, "PNG", file4);
		
		int area = image2.getHeight() * image2.getWidth();
		System.out.println("Area is :"+ area);
		int Matches = count;
		
		System.out.println("Total Matches: "+ Matches);
		
		double percentMatch = count/area;
		System.out.println("Percents: "+percentMatch);
		
	}

}
