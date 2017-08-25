package com.yc.mdemos.mydemos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yc.mdemos.mydemos.EasyRecycleView.EasyRecycleViewActivity;
import com.yc.mdemos.mydemos.RenYiXingZhuang.EveryImagesActivity;
import com.yc.mdemos.mydemos.baiduditu.BMapApiDemoMain;
import com.yc.mdemos.mydemos.chenjinshiZhuangTaiLan.ChenJinShiActivity;
import com.yc.mdemos.mydemos.chuipaopao.ChuiPaoPaoActivity;
import com.yc.mdemos.mydemos.dianzanview.DianZanViewActivity;
import com.yc.mdemos.mydemos.dibutablayoutxiaoguo.DiBuTabActivity;
import com.yc.mdemos.mydemos.dongtaixuanzeqi.DongTaiXuanZeQiActivity;
import com.yc.mdemos.mydemos.duotiaojieshaixuan.DuoTiaoJieShaiXuanActivity;
import com.yc.mdemos.mydemos.fangbaiduwaimaixiala.BaiduXiaLaActivity;
import com.yc.mdemos.mydemos.fangchuizishijiandeview.ChuiZiTimeViewActivity;
import com.yc.mdemos.mydemos.fangelema.HomeActivity;
import com.yc.mdemos.mydemos.fangmeituanpaowuxiandonghua.MeiTuanActivity;
import com.yc.mdemos.mydemos.fengwotu.FengWoTuActivity;
import com.yc.mdemos.mydemos.firstItemLaSheng.FirstItemLaShengActivity;
import com.yc.mdemos.mydemos.fragmentQieHuanDongHua.FragmentChangeActivity;
import com.yc.mdemos.mydemos.gouwucheTeXiao.com.nianxin.github.animation.GouWuCheActivity;
import com.yc.mdemos.mydemos.hengxiangshuxiangdeviewpager.view.ShuangXiangViewPagerActivity;
import com.yc.mdemos.mydemos.huadongguanbiActivity.HuaDongCloseActivity;
import com.yc.mdemos.mydemos.huduShiTu.HuDuShiTuActivity;
import com.yc.mdemos.mydemos.jiazaidonghua1.JiaZaiDongHua1Activity;
import com.yc.mdemos.mydemos.jiazaidonghua2.JiaZaiDongHua2Activity;
import com.yc.mdemos.mydemos.jiazaidonghua3.loadingviewlib.JiaZaiDongHua3Activity;
import com.yc.mdemos.mydemos.jiazaidonghua4.JiaZaiDongHua4Activity;
import com.yc.mdemos.mydemos.jiazaidonghua5.JiaZaiDongHua5Activity;
import com.yc.mdemos.mydemos.jiazaidonghua6.JiaZaiDongHua6Activity;
import com.yc.mdemos.mydemos.jiazaidonghua7.JiaZaiDongHua7Activity;
import com.yc.mdemos.mydemos.loadToast.LoadToastActivity;
import com.yc.mdemos.mydemos.luyin.LuYinActivity;
import com.yc.mdemos.mydemos.mojiXiaxuedonghua.MoJiXiaXueActivity;
import com.yc.mdemos.mydemos.phoneXinXi.DangQianShoujiXinXiActivity;
import com.yc.mdemos.mydemos.searchsousuo.SearchAnimationActivity;
import com.yc.mdemos.mydemos.shipinpaishe.ShiPinPaiSheActivity;
import com.yc.mdemos.mydemos.shituliandong.UserGuideActivity;
import com.yc.mdemos.mydemos.shuangxiangViewpager.screens.MyHengShuViewpagerActivity;
import com.yc.mdemos.mydemos.shuibowenxiaoguo.WaveActivity;
import com.yc.mdemos.mydemos.shuidixiala.ShuiDiXiaLaActivity;
import com.yc.mdemos.mydemos.tanmu.TanMuActivity;
import com.yc.mdemos.mydemos.textviewduozhongyanse.TextViewsActivity;
import com.yc.mdemos.mydemos.textviewmaxline.TextViewMaxLineActivity;
import com.yc.mdemos.mydemos.tianchongjindu.TianChongJinDuActivity;
import com.yc.mdemos.mydemos.toubuhedibuderecycleview.TouBuJiaoBuRecycleActivity;
import com.yc.mdemos.mydemos.wannengxialashuaxin.demo.OpenProjectRefreshActivity;
import com.yc.mdemos.mydemos.xialadonghua.XiaLaDongHuaActivity;
import com.yc.mdemos.mydemos.xialaxuanze.XiaLaXuanZeActivity;
import com.yc.mdemos.mydemos.yanshenfangda.YanShenFangDaActivity;
import com.yc.mdemos.mydemos.yindaoview.YinDaoActivity;
import com.yc.mdemos.mydemos.yonghuzhiyin.UserGuideTestActivity;
import com.yc.mdemos.mydemos.yuanhejuxingImg.YuanHeJuXingActivity;
import com.yc.mdemos.mydemos.yuanxingcaidan.YuanXingCaiDanActivity;
import com.yc.mdemos.mydemos.yuanxinghekekongyuanjiao.RoundImageActivity;
import com.yc.mdemos.mydemos.yuanxingxuanzhuancandan.YuanXingXuanZhuanActivity;
import com.yc.mdemos.mydemos.yuyinshibie.xunfei.YuYinShiBieActivity;
import com.yc.mdemos.mydemos.zhifubaoYiBiaoPan.ZhiFuBaoYiBiaoPanActivity;
import com.yc.mdemos.mydemos.zhuwangpingfen.ZhuWangPingFenActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_fragment_change)
    Button btnFragmentChange;
    @Bind(R.id.btn_load_toast)
    Button btnLoadToast;
    @Bind(R.id.btn_zhifubao_yibiaopan)
    Button btnZhifubaoYibiaopan;
    @Bind(R.id.btn_xiala_donghua)
    Button btnXialaDonghua;
    @Bind(R.id.btn_shuangxiang_viewpager)
    Button btnShuangxiangViewpager;
    @Bind(R.id.btn_every_images)
    Button btnEveryImages;
    @Bind(R.id.btn_dianzan)
    Button btnDianzan;
    @Bind(R.id.btn_item_lasheng)
    Button btnItemLasheng;
    @Bind(R.id.btn_chenjin)
    Button btnChenjin;
    @Bind(R.id.btn_gouwuche)
    Button btnGouwuche;
    @Bind(R.id.btn_mijixiaxue)
    Button btnMijixiaxue;
    @Bind(R.id.btn_tanmu)
    Button btnTanmu;
    @Bind(R.id.btn_shuibo)
    Button btnShuibo;
    @Bind(R.id.btn_yuanjiao)
    Button btnYuanjiao;
    @Bind(R.id.btn_yuanhejuxingo)
    Button btnYuanhejuxingo;
    @Bind(R.id.btn_yanshenfangda)
    Button btnYanshenfangda;
    @Bind(R.id.btn_toubujiaoburecycle)
    Button btnToubujiaoburecycle;
    @Bind(R.id.btn_yonghuzhiyin)
    Button btnYonghuzhiyin;
    @Bind(R.id.btn_tianchong)
    Button btnTianchong;
    @Bind(R.id.btn_shuidixiala)
    Button btnShuidixiala;
    @Bind(R.id.btn_meituan_donghua)
    Button btnMeituanDonghua;
    @Bind(R.id.btn_luyin)
    Button btnLuyin;
    @Bind(R.id.btn_chuiziview)
    Button btnChuiziview;
    @Bind(R.id.btn_huoqushoujixinxi)
    Button btnHuoqushoujixinxi;
    @Bind(R.id.btn_yuanxingcaidan)
    Button btnYuanxingcaidan;
    @Bind(R.id.btn_wannengxiala)
    Button btnWannengxiala;
    @Bind(R.id.btn_shipingluzhi)
    Button btnShipingluzhi;
    @Bind(R.id.btn_huadongcloseactivity)
    Button btnHuadongcloseactivity;
    @Bind(R.id.btn_EasyRecycle)
    Button btnEasyRecycle;
    @Bind(R.id.btn_hudushitu)
    Button btnHudushitu;
    @Bind(R.id.btn_dibutab)
    Button btnDibutab;
    @Bind(R.id.btn_dongtaixuanzeqi)
    Button btnDongtaixuanzeqi;
    @Bind(R.id.btn_yuanxingxuanzhuancaidan)
    Button btnYuanxingxuanzhuancaidan;
    @Bind(R.id.btn_zhuwangpingfen)
    Button btnZhuwangpingfen;
    @Bind(R.id.btn_shituliandong)
    Button btnShituliandong;
    @Bind(R.id.btn_chuipaopao)
    Button btnChuipaopao;
    @Bind(R.id.btn_yindaoqingliang)
    Button btnYindaoqingliang;
    @Bind(R.id.btn_sousuodonghua)
    Button btnSousuodonghua;
    @Bind(R.id.btn_duotiaojiesousuo)
    Button btnDuotiaojiesousuo;
    @Bind(R.id.btn_yuyinshibie)
    Button btnYuyinshibie;
    @Bind(R.id.btn_jiazaidonghua1)
    Button btnJiazaidonghua1;
    @Bind(R.id.btn_jiazaidonghua2)
    Button btnJiazaidonghua2;
    @Bind(R.id.btn_jiazaidonghua3)
    Button btnJiazaidonghua3;
    @Bind(R.id.btn_fengwotu)
    Button btnFengwotu;
    @Bind(R.id.btn_fangbaiduwaimaixiala)
    Button btnFangbaiduwaimaixiala;
    @Bind(R.id.btn_baiduditu)
    Button btnBaiduditu;
    @Bind(R.id.btn_tv_color)
    Button btnTvColor;
    @Bind(R.id.btn_xialaxuanze)
    Button btnXialaxuanze;
    @Bind(R.id.btn_fangelm)
    Button btnFangelm;
    @Bind(R.id.btn_textview_zhankai)
    Button btnTextviewZhankai;
    @Bind(R.id.btn_shuangxiang_viewpagers)
    Button btnShuangxiangViewpagers;
    @Bind(R.id.btn_jiazaidonghua4)
    Button btnJiazaidonghua4;
    @Bind(R.id.btn_jiazaidonghua5)
    Button btnJiazaidonghua5;
    @Bind(R.id.btn_jiazaidonghua6)
    Button btnJiazaidonghua6;
    @Bind(R.id.btn_jiazaidonghua7)
    Button btnJiazaidonghua7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_jiazaidonghua6, R.id.btn_jiazaidonghua7, R.id.btn_jiazaidonghua5, R.id.btn_jiazaidonghua4, R.id.btn_shuangxiang_viewpagers, R.id.btn_textview_zhankai, R.id.btn_fangelm, R.id.btn_xialaxuanze, R.id.btn_tv_color, R.id.btn_baiduditu, R.id.btn_fangbaiduwaimaixiala, R.id.btn_fengwotu, R.id.btn_jiazaidonghua3, R.id.btn_jiazaidonghua2, R.id.btn_jiazaidonghua1, R.id.btn_yuyinshibie, R.id.btn_duotiaojiesousuo, R.id.btn_sousuodonghua, R.id.btn_yindaoqingliang, R.id.btn_chuipaopao, R.id.btn_shituliandong, R.id.btn_zhuwangpingfen, R.id.btn_yuanxingxuanzhuancaidan, R.id.btn_dongtaixuanzeqi, R.id.btn_dibutab, R.id.btn_hudushitu, R.id.btn_EasyRecycle, R.id.btn_huadongcloseactivity, R.id.btn_shipingluzhi, R.id.btn_wannengxiala, R.id.btn_yuanxingcaidan, R.id.btn_huoqushoujixinxi, R.id.btn_chuiziview, R.id.btn_luyin, R.id.btn_meituan_donghua, R.id.btn_shuidixiala, R.id.btn_tianchong, R.id.btn_yonghuzhiyin, R.id.btn_toubujiaoburecycle, R.id.btn_yanshenfangda, R.id.btn_yuanhejuxingo, R.id.btn_yuanjiao, R.id.btn_shuibo, R.id.btn_tanmu, R.id.btn_mijixiaxue, R.id.btn_gouwuche, R.id.btn_chenjin, R.id.btn_item_lasheng, R.id.btn_dianzan, R.id.btn_fragment_change, R.id.btn_load_toast, R.id.btn_zhifubao_yibiaopan, R.id.btn_xiala_donghua, R.id.btn_shuangxiang_viewpager, R.id.btn_every_images})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_fragment_change:
                startActivity(new Intent(MainActivity.this, FragmentChangeActivity.class));
                break;
            case R.id.btn_load_toast:
                startActivity(new Intent(MainActivity.this, LoadToastActivity.class));
                break;
            case R.id.btn_zhifubao_yibiaopan:
                startActivity(new Intent(MainActivity.this, ZhiFuBaoYiBiaoPanActivity.class));
                break;
            case R.id.btn_textview_zhankai:
                startActivity(new Intent(MainActivity.this, TextViewMaxLineActivity.class));
                break;
            case R.id.btn_xiala_donghua:
                startActivity(new Intent(MainActivity.this, XiaLaDongHuaActivity.class));
                break;
            case R.id.btn_jiazaidonghua5:
                startActivity(new Intent(MainActivity.this, JiaZaiDongHua5Activity.class));
                break;

            case R.id.btn_shuangxiang_viewpager:
                startActivity(new Intent(MainActivity.this, MyHengShuViewpagerActivity.class));
                break;
            case R.id.btn_every_images:
                startActivity(new Intent(MainActivity.this, EveryImagesActivity.class));
                break;
            case R.id.btn_jiazaidonghua4:
                startActivity(new Intent(MainActivity.this, JiaZaiDongHua4Activity.class));
                break;
            case R.id.btn_dianzan:
                startActivity(new Intent(MainActivity.this, DianZanViewActivity.class));
                break;
            case R.id.btn_item_lasheng:
                startActivity(new Intent(MainActivity.this, FirstItemLaShengActivity.class));
                break;
            case R.id.btn_chenjin:
                startActivity(new Intent(MainActivity.this, ChenJinShiActivity.class));
                break;
            case R.id.btn_gouwuche:
                startActivity(new Intent(MainActivity.this, GouWuCheActivity.class));
                break;
            case R.id.btn_mijixiaxue:
                startActivity(new Intent(MainActivity.this, MoJiXiaXueActivity.class));
                break;
            case R.id.btn_tanmu:
                startActivity(new Intent(MainActivity.this, TanMuActivity.class));
                break;
            case R.id.btn_shuibo:
                startActivity(new Intent(MainActivity.this, WaveActivity.class));
                break;
            case R.id.btn_yuanjiao:
                startActivity(new Intent(MainActivity.this, RoundImageActivity.class));
                break;
            case R.id.btn_yuanhejuxingo:
                startActivity(new Intent(MainActivity.this, YuanHeJuXingActivity.class));
                break;
            case R.id.btn_yanshenfangda:
                startActivity(new Intent(MainActivity.this, YanShenFangDaActivity.class));
                break;
            case R.id.btn_toubujiaoburecycle:
                startActivity(new Intent(MainActivity.this, TouBuJiaoBuRecycleActivity.class));
                break;
            case R.id.btn_yonghuzhiyin:
                startActivity(new Intent(MainActivity.this, UserGuideTestActivity.class));
                break;
            case R.id.btn_tianchong:
                startActivity(new Intent(MainActivity.this, TianChongJinDuActivity.class));
                break;
            case R.id.btn_shuidixiala:
                startActivity(new Intent(MainActivity.this, ShuiDiXiaLaActivity.class));
                break;
            case R.id.btn_meituan_donghua:
                startActivity(new Intent(MainActivity.this, MeiTuanActivity.class));
                break;
            case R.id.btn_shuangxiang_viewpagers:
                startActivity(new Intent(MainActivity.this, ShuangXiangViewPagerActivity.class));
                break;
            case R.id.btn_luyin:
                startActivity(new Intent(MainActivity.this, LuYinActivity.class));
                break;
            case R.id.btn_chuiziview:
                startActivity(new Intent(MainActivity.this, ChuiZiTimeViewActivity.class));
                break;
            case R.id.btn_huoqushoujixinxi:
                startActivity(new Intent(MainActivity.this, DangQianShoujiXinXiActivity.class));
                break;
            case R.id.btn_yuanxingcaidan:
                startActivity(new Intent(MainActivity.this, YuanXingCaiDanActivity.class));
                break;
            case R.id.btn_wannengxiala:
                startActivity(new Intent(MainActivity.this, OpenProjectRefreshActivity.class));
                break;
            case R.id.btn_shipingluzhi:
                startActivity(new Intent(MainActivity.this, ShiPinPaiSheActivity.class));
                break;
            case R.id.btn_huadongcloseactivity:
                startActivity(new Intent(MainActivity.this, HuaDongCloseActivity.class));
                break;
            case R.id.btn_EasyRecycle:
                startActivity(new Intent(MainActivity.this, EasyRecycleViewActivity.class));
                break;
            case R.id.btn_hudushitu:
                startActivity(new Intent(MainActivity.this, HuDuShiTuActivity.class));
                break;
            case R.id.btn_dibutab:
                startActivity(new Intent(MainActivity.this, DiBuTabActivity.class));
                break;
            case R.id.btn_dongtaixuanzeqi:
                startActivity(new Intent(MainActivity.this, DongTaiXuanZeQiActivity.class));
                break;
            case R.id.btn_yuanxingxuanzhuancaidan:
                startActivity(new Intent(MainActivity.this, YuanXingXuanZhuanActivity.class));
                break;
            case R.id.btn_zhuwangpingfen:
                startActivity(new Intent(MainActivity.this, ZhuWangPingFenActivity.class));
                break;
            case R.id.btn_shituliandong:
                startActivity(new Intent(MainActivity.this, UserGuideActivity.class));
                break;
            case R.id.btn_chuipaopao:
                startActivity(new Intent(MainActivity.this, ChuiPaoPaoActivity.class));
                break;
            case R.id.btn_yindaoqingliang:
                startActivity(new Intent(MainActivity.this, YinDaoActivity.class));
                break;
            case R.id.btn_sousuodonghua:
                startActivity(new Intent(MainActivity.this, SearchAnimationActivity.class));
                break;
            case R.id.btn_duotiaojiesousuo:
                startActivity(new Intent(MainActivity.this, DuoTiaoJieShaiXuanActivity.class));
                break;
            case R.id.btn_yuyinshibie:
                startActivity(new Intent(MainActivity.this, YuYinShiBieActivity.class));
                break;
            case R.id.btn_jiazaidonghua1:
                startActivity(new Intent(MainActivity.this, JiaZaiDongHua1Activity.class));
                break;
            case R.id.btn_jiazaidonghua2:
                startActivity(new Intent(MainActivity.this, JiaZaiDongHua2Activity.class));
                break;
            case R.id.btn_jiazaidonghua3:
                startActivity(new Intent(MainActivity.this, JiaZaiDongHua3Activity.class));
                break;
            case R.id.btn_jiazaidonghua6:
                startActivity(new Intent(MainActivity.this, JiaZaiDongHua6Activity.class));
                break;
            case R.id.btn_jiazaidonghua7:
                startActivity(new Intent(MainActivity.this, JiaZaiDongHua7Activity.class));
                break;
            case R.id.btn_fengwotu:
                startActivity(new Intent(MainActivity.this, FengWoTuActivity.class));
                break;
            case R.id.btn_fangbaiduwaimaixiala:
                startActivity(new Intent(MainActivity.this, BaiduXiaLaActivity.class));
                break;
            case R.id.btn_baiduditu:
                startActivity(new Intent(MainActivity.this, BMapApiDemoMain.class));
                break;
            case R.id.btn_tv_color:
                startActivity(new Intent(MainActivity.this, TextViewsActivity.class));
                break;
            case R.id.btn_xialaxuanze:
                startActivity(new Intent(MainActivity.this, XiaLaXuanZeActivity.class));
                break;
            case R.id.btn_fangelm:
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                break;
        }
    }

}
