package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4,1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {


        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        if (area < (areaPerBucket * extraBuckets)) {
            return 0;
        } else {
            area -= areaPerBucket * extraBuckets; //7.14 = 7.14 - 3 = 4.14 4.14/1.5 = 2.76 = 2
            double remainingArea = area / areaPerBucket;
            int roundArea = (int) Math.ceil(remainingArea);
            return roundArea;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double numberBuckets = area / areaPerBucket;
        int roundBuckets = (int) Math.ceil(numberBuckets);
        return roundBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberBuckets = area/areaPerBucket;
        int roundBuckets = (int) Math.ceil(numberBuckets);
        return roundBuckets;
    }
}
