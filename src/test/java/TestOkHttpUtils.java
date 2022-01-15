import com.taowenkeji.utils.OkHttpUtils;
import okhttp3.Call;

public class TestOkHttpUtils {
    public static void main(String[] args) {
        String fileUrl = "http://www.baidu.com?a=1234";
        int index = fileUrl.lastIndexOf("?");
        if (index != -1) {
            fileUrl = fileUrl.substring(index);
            String query = "";
        }
        System.out.println(fileUrl);
//        // get请求，方法顺序按照这种方式，切记选择post/get一定要放在倒数第二，同步或者异步倒数第一，才会正确执行
//        String res =  OkHttpUtils.builder().url("http://www.baidu.com")
//                // 有参数的话添加参数，可多个
////                .addParam("参数名", "参数值")
////                .addParam("参数名", "参数值")
//                // 也可以添加多个
////                .addHeader("Content-Type", "application/json; charset=utf-8")
//                .get()
//                // 可选择是同步请求还是异步请求
//                //.async();
//                .sync();
//        System.out.println(res);
    }

}
