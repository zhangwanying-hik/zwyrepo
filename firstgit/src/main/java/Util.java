/**
 * Created by zhangwanying6 on 2020/7/24.
 */
public class Util {
    /**

     * 统计某个字符串某个字符出现次数的函数

     * @param string 某个字符串

     * @param character 某个字符串

     * @return int 数字

     * */

    public static int countCharacter(String string,char character){

        char[] chars = string.toCharArray();

        int count = 0;

        for (char c:chars){

            if (c == character){

                count = count + 1;

            }

        }

        return count;

    }
}
