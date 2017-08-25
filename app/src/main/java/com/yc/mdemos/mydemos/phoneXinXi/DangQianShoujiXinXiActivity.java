package com.yc.mdemos.mydemos.phoneXinXi;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yc.mdemos.mydemos.R;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DangQianShoujiXinXiActivity extends AppCompatActivity {
    private TextView textView;
    private Button refresh;
    String str = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_qian_shouji_xin_xi);
        textView = (TextView) findViewById(R.id.textview);
        refresh = (Button) findViewById(R.id.refresh);

        refresh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textView.setText(getHeightAndWidth() + "\n" + getInfo() + "\n"
                        + getCpuInfo() + "\n" + getTotalMemory() + "\n"
                        + getAvailMemory() + "\n" + getMacAddress() + "\n"
                        + getAllApp() + "\n" + batteryLevel());
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    /**
     * 获取android当前可用内存大小
     */
    private String getAvailMemory() {// 获取android当前可用内存大小

        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo mi = new ActivityManager.MemoryInfo();
        am.getMemoryInfo(mi);
        // mi.availMem; 当前系统的可用内存
        String availMem = "可用内存："
                + Formatter.formatFileSize(getBaseContext(), mi.availMem);

        return availMem;// 将获取的内存大小规格化
    }

    /**
     * 获得系统总内存
     */
    private String getTotalMemory() {
        String str1 = "/proc/meminfo";// 系统内存信息文件
        String str2;
        String totalMem = null;
        String[] arrayOfString;
        long initial_memory = 0;

        try {
            FileReader localFileReader = new FileReader(str1);
            BufferedReader localBufferedReader = new BufferedReader(
                    localFileReader, 8192);
            str2 = localBufferedReader.readLine();// 读取meminfo第一行，系统总内存大小

            arrayOfString = str2.split("\\s+");
            for (String num : arrayOfString) {
                Log.i(str2, num + "\t");
            }

            initial_memory = Integer.valueOf(arrayOfString[1]).intValue() * 1024;// 获得系统总内存，单位是KB，乘以1024转换为Byte
            localBufferedReader.close();

            totalMem = "系统总内存："
                    + Formatter
                    .formatFileSize(getBaseContext(), initial_memory);// Byte转换为KB或者MB，内存大小规格化

        } catch (IOException e) {
        }
        return totalMem;
    }

    /**
     * 获得手机屏幕宽高
     *
     * @return
     */
    public String getHeightAndWidth() {
        int width = getWindowManager().getDefaultDisplay().getWidth();
        int heigth = getWindowManager().getDefaultDisplay().getHeight();
        String str = "屏幕宽度：" + width + "  屏幕高度：" + heigth + "";
        return str;
    }

    /**
     * 获取IMEI号，IESI号，手机型号
     */
    private String getInfo() {
        TelephonyManager mTm = (TelephonyManager) this
                .getSystemService(TELEPHONY_SERVICE);
        String imei = mTm.getDeviceId();
        String imsi = mTm.getSubscriberId();
        String mtype = android.os.Build.MODEL; // 手机型号
        String mtyb = android.os.Build.BRAND;// 手机品牌
        String version = android.os.Build.VERSION.RELEASE;// 手机Android版本号
        String numer = mTm.getLine1Number(); // 手机号码，有的可得，有的不可得
        if (imsi == null || numer == null) {
            imsi = "未获取到IESI号";
            numer = "未获取到手机号码";
        }
        String str = "手机IMEI号：" + imei + "\n手机IESI号：" + imsi + "\n手机型号："
                + mtype + "\n手机品牌：" + mtyb + "\n手机号码：" + numer + "\n手机系统版本号："
                + version;
        return str;
    }

    /**
     * .获取手机MAC地址 只有手机开启wifi才能获取到mac地址
     */
    private String getMacAddress() {
        String result = null;
        WifiManager wifiManager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        result = "手机MAC地址：" + wifiInfo.getMacAddress();
        Log.i("text", "手机macAdd:" + result);
        if (result == null) {
            result = "手机没有开启wifi";
        }
        return result;
    }

    /**
     * 手机CPU信息
     */
    private String getCpuInfo() {
        String str1 = "/proc/cpuinfo";
        String str2 = "";
        String[] cpuInfo = { "", "" }; // 1-cpu型号 //2-cpu频率
        String[] arrayOfString;
        try {
            FileReader fr = new FileReader(str1);
            BufferedReader localBufferedReader = new BufferedReader(fr, 8192);
            str2 = localBufferedReader.readLine();
            arrayOfString = str2.split("\\s+");
            for (int i = 2; i < arrayOfString.length; i++) {
                cpuInfo[0] = cpuInfo[0] + arrayOfString[i] + " ";
            }
            str2 = localBufferedReader.readLine();
            arrayOfString = str2.split("\\s+");
            cpuInfo[1] += arrayOfString[2];
            localBufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String phonecup = "手机CUP型号：" + cpuInfo[0] + "\n手机CUP频率：" + cpuInfo[1];
        return phonecup;
    }

    /*
     * 获取手机安装的应用信息
     */
    public String getAllApp() {
        String result = "";
        List<PackageInfo> packages = getPackageManager()
                .getInstalledPackages(0);
        for (PackageInfo i : packages) {
            if ((i.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                result += "   "
                        + i.applicationInfo.loadLabel(getPackageManager())
                        .toString() + "\n";
            }
        }
        String allapp = "手机app信息：\n" + result.substring(0, result.length() - 1);
        return allapp;
    }

    /**
     * 获取手机电量
     *
     * @return
     */
    public String batteryLevel() {
        BroadcastReceiver batteryLevelReceiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                context.unregisterReceiver(this);
                int rawlevel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,
                        -1);// 获得当前电量

                int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);// 获得总电量

                int level = -1;
                if (rawlevel >= 0 && scale > 0) {
                    level = (rawlevel * 100) / scale;
                }
                System.out.println("当前手机电量：" + level + "%");
                str = "当前手机电量：" + level + "%";
            }
        };
        IntentFilter batteryLevelFilter = new IntentFilter(
                Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(batteryLevelReceiver, batteryLevelFilter);
        return str;
    }

}

