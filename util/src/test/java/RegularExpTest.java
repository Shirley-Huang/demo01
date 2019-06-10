import java.util.regex.Pattern;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/14
 * @Desciption :
 */
public class RegularExpTest {


    public static void main(String[] args) {

        String patternOne = RegularExpPattern.PATTERN_ONE;

        String str = "abc123ef893g3";

        System.out.println(str.matches(patternOne));
        System.out.println(str.matches(patternOne));

        Pattern pattern = Pattern.compile("");

    }

}
