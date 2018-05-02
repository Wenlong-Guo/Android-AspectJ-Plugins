package me.guowenlong.gradlepluginsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.aspectj.lang.annotation.Aspect;

/**
 * 测试页面
 */
@Aspect
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Animals().fly();
    }
}