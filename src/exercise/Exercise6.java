package exercise;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * Created by yexinyan on 2017/11/14.
 */
public class Exercise6 {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.print(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (high > low) {
            int mid = (high + low) / 2;
            if (array[mid] > array[high]) {
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return 0;
    }
}
