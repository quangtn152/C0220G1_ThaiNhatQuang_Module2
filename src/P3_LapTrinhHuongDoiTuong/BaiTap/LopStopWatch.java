package P3_LapTrinhHuongDoiTuong.BaiTap;

public class LopStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        SelectionSort arr = new SelectionSort();
        stopWatch.start();
        arr.Sort(arr.creatRandom(100000));
        System.out.println(stopWatch.getStartTime());
        stopWatch.end();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
