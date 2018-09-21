package jp.techacademy.hiroko.ando.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");

        Human human = new Human("はなこ",10,"お絵描き");
        human.say();
        human.think();

    }


    private int total(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++)  {
            sum = sum + i;
        }

        return sum;
    }
}
