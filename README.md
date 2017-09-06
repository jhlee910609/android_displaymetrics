# DisplayMetrics

### 1. DisplayMetrics란

- 안드로이드 공식 API 문서에 따르면 사용자 Device에 대한 정보를 주는 객체로 설명하고 있다.

![](https://ws4.sinaimg.cn/large/006tNc79gy1fj9n2g1wzdj31i00l042b.jpg)

### 2. 활용
```java
public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        // 1.1. 사용자의 Device 스크린 정보를 가져올 수 있는 default 객체이다.
     	// 1.2. 리소스에서 꺼내 쓸 수 있다. 
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();

        // 2. DisplayMetrics 내부 멤버베변수들을 TextView에 뿌려본다.
        tv.setText("density : " + displayMetrics.density + "\n"
                + "densitiyDpi : " + displayMetrics.densityDpi + "\n"
                + "widthPixels : " + displayMetrics.widthPixels + "\n"
                + "heightPixels : " + displayMetrics.heightPixels + "\n"
                + "scaledDensity : " + displayMetrics.scaledDensity + "\n");
    }
}
```



### 3. 결과

- Nexus 6P의 display 정보는 다음과 같았다. 

![](https://ws1.sinaimg.cn/large/006tNc79gy1fj9n8mgux7j30dw0op3zh.jpg)

